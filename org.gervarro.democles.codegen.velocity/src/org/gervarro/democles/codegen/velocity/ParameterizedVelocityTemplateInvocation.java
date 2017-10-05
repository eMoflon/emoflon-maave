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

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map.Entry;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.context.InternalContextAdapter;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.Renderable;
import org.gervarro.democles.codegen.TemplateInvocation;

public class ParameterizedVelocityTemplateInvocation implements Renderable {
	private final VelocityEngine engine;
	private final TemplateInvocation origin;

	public ParameterizedVelocityTemplateInvocation(VelocityEngine engine,
			TemplateInvocation origin) {
		this.engine = engine;
		this.origin = origin;
	}
	
	public ParameterizedVelocityTemplateInvocation(VelocityEngine engine,
			String template,
			String[] keys,
			Object[] values) {
		this(engine, new TemplateInvocation(template, keys, values));
	}

	@Override
	public final boolean render(InternalContextAdapter context, Writer writer)
			throws IOException, MethodInvocationException, ParseErrorException,
			ResourceNotFoundException {
		try {
			Template st = engine.getTemplate(origin.getTemplateName());
			VelocityContext newContext = new VelocityContext();
			for (Entry<String, Object> entry : origin.getAttributes().entrySet()) {
				newContext.put(entry.getKey(), entry.getValue());
			}
			st.merge(newContext, writer);
			return true;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
	
	public final String apply() {
		try {
			StringWriter writer = new StringWriter();
			VelocityContext newContext = new VelocityContext();
			Template st = engine.getTemplate(origin.getTemplateName());
			for (Entry<String, Object> entry : origin.getAttributes().entrySet()) {
				newContext.put(entry.getKey(), entry.getValue());
			}
			st.merge(newContext, writer);
			return writer.toString();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
