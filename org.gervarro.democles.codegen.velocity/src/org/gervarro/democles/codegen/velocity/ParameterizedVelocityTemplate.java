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

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.apache.velocity.runtime.Renderable;

public class ParameterizedVelocityTemplate {
	private final VelocityEngine engine;
	private final String template;
	private final String[] keys;

	public ParameterizedVelocityTemplate(final VelocityEngine engine,
			final String template,
			final String... keys) {
		this.engine = engine;
		this.template = template;
		this.keys = keys.length > 0 ? keys : new String[] {};
	}

    public final Renderable apply(Object[] params) {
    	if (keys.length == params.length) {
    		params = params.length > 0 ? params : new Object[] {};
    		return new ParameterizedVelocityTemplateInvocation(engine, template, keys, params);
    	} else {
    		throw new VelocityException("Template " + template +
    				": " + keys.length + " parameters required, but invoked with " + params.length + " parameters");
    	}
    }
}
