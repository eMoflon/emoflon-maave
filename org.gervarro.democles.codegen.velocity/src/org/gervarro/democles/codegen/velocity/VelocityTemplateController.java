/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010  Gergely Varro
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
import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.context.InternalContextAdapter;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.Renderable;

public class VelocityTemplateController extends VelocityContext implements Renderable {
	public static final String IMPORT_MANAGER_KEY = "import"; 
	final Template template;

	public VelocityTemplateController(Template template) {
		this.template = template;
	}

	public final boolean render(InternalContextAdapter context, Writer writer)
			throws IOException, MethodInvocationException,
			ParseErrorException, ResourceNotFoundException {
		put(IMPORT_MANAGER_KEY, context.get(IMPORT_MANAGER_KEY));
		template.merge(this, writer);
		return true;
	}
	
    public final void generateCode(Writer writer) throws IOException {
    	template.merge(this, writer);
    }
}
