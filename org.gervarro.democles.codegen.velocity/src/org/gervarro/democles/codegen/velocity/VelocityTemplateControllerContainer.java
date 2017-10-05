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

import java.util.Arrays;
import java.util.List;

import org.apache.velocity.Template;

public class VelocityTemplateControllerContainer extends
		VelocityTemplateController {
	public static final String CHILDREN = "children";
	private final List<VelocityTemplateController> children;
	
	public VelocityTemplateControllerContainer(Template template, List<VelocityTemplateController> children) {
		super(template);
		this.children = children;
	}

	public VelocityTemplateControllerContainer(Template template, VelocityTemplateController... children) {
		this(template, Arrays.asList(children));
	}
	
    public Object internalGet(String key) {
    	if (CHILDREN.equals(key)) {
    		return children;
    	}
    	return super.internalGet(key);
    }
}
