/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010-2012  Gergely Varro
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.democles.codegen.velocity;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.Renderable;
import org.gervarro.democles.codegen.TemplateEngine;
import org.gervarro.democles.codegen.TemplateInvocation;

public final class VelocityModule extends VelocityEngine implements TemplateEngine {
	
	public static final VelocityModule createSession() {
		return new VelocityModule();
	}
	
	public static final String addMapping(String specification, 
			String key,
			String value) {
		if (specification == null) {
			specification = new String();
		}
		String[] entries = StringUtils.split(specification, ',');
		entries = Arrays.copyOf(entries, entries.length + 1);
		entries[entries.length - 1] = key + "->" + value;
		return StringUtils.join(entries, ',');
	}
	
	public final void loadModule(String prefix, String fileName) {
		final String oldSpec = (String) getProperty(PrefixRemapperResourceLoader.MAPPING_KEY);
		final String newSpec = addMapping(oldSpec, prefix, fileName);
		setProperty(PrefixRemapperResourceLoader.MAPPING_KEY, newSpec);
	}

	public final ParameterizedVelocityTemplate getTemplate(
			String templateName,
			String... parameterNames) {
		return new ParameterizedVelocityTemplate(this, templateName, parameterNames);
	}
	
	public final Renderable applyTemplate(TemplateInvocation template) {
		return new ParameterizedVelocityTemplateInvocation(this, template);
	}

	public final String apply(TemplateInvocation template) {
		return new ParameterizedVelocityTemplateInvocation(this, template).apply();
	}

	public static final String apply(VelocityEngine engine, TemplateInvocation template) {
		StringWriter writer = new StringWriter();
		apply(engine, writer, template);
		return writer.getBuffer().toString();
	}
	
	public final void apply(Writer writer, TemplateInvocation template) {
		apply(this, writer, template);
	}

	public static final void apply(VelocityEngine engine, Writer writer, TemplateInvocation template) {
		try {
			Template st = engine.getTemplate(template.getTemplateName());
			VelocityContext context = new VelocityContext();
			for (Entry<String, Object> entry : template.getAttributes().entrySet()) {
				context.put(entry.getKey(), entry.getValue());
			}
			st.merge(context, writer);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
