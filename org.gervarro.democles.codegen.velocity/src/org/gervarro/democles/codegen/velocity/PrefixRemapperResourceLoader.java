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

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import org.apache.commons.collections.ExtendedProperties;
import org.apache.velocity.exception.ResourceNotFoundException;

public class PrefixRemapperResourceLoader extends URLResourceLoader {
	public static final String LOADER_ID = "remapper";
	public static final String MAPPING_ID = "mapping";
	public static final String MAPPING_KEY = "remapper.resource.loader.mapping";

	private Map<String, String> prefixToURL = new HashMap<String, String>();

	@Override
	public void init(ExtendedProperties configuration) {
		if (log.isTraceEnabled()) {
			log.trace("PrefixRemapperResourceLoader : initialization complete.");
		}
		@SuppressWarnings("unchecked")
		Vector<String> mappings = configuration.getVector(MAPPING_ID);
		for (String mapping : mappings) {
			int index = mapping.indexOf("->");
			if (index > 0) {
				String key = mapping.substring(0, index);
				String value = mapping.substring(index + 2);
				prefixToURL.put(key, value);
			}
		}
	}

	public synchronized final InputStream getResourceStream(String name) throws ResourceNotFoundException {
		String localName = name;
		if (localName.startsWith("/")) {
			localName = localName.substring(1);
		}
		final int index = localName.indexOf("/");
		if (index > 0) {
			String prefix = localName.substring(0, index);
			String urlPrefix = prefixToURL.get(prefix);
			if (urlPrefix != null) {
				final StringBuilder builder = new StringBuilder(urlPrefix);
				builder.append(name.substring(index + 1));
				return super.getResourceStream(builder.toString());
			}
		}
		throw new ResourceNotFoundException("PrefixRemapperResourceLoader : cannot find " + name);
	}
}
