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
package org.gervarro.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/*
 * Bron�Kerbosch algorithm is an algorithm for finding maximal cliques in an undirected graph.
 * http://en.wikipedia.org/wiki/Bron-Kerbosch_algorithm
 */
public class BronKerbosch {
	ArrayList<TreeSet<Integer>> neighbours;
	LinkedList<TreeSet<Integer>> result = new LinkedList<TreeSet<Integer>>();

	public BronKerbosch(ArrayList<TreeSet<Integer>> neighbours) {
		this.neighbours = neighbours;
		TreeSet<Integer> p = new TreeSet<Integer>();
		for (int i = 0; i < this.neighbours.size(); i++) {
			p.add(i);
		}
		recursion(new TreeSet<Integer>(), p, new TreeSet<Integer>());
	}

	List<TreeSet<Integer>> getResult() {
		return result;
	}

	final void recursion(TreeSet<Integer> r, TreeSet<Integer> p, TreeSet<Integer> x) {
		if (p.isEmpty() && x.isEmpty()) {
			// r is a maximal clique
			result.add(new TreeSet<Integer>(r));
		} else {
			Integer pivot = p.isEmpty() ? x.iterator().next() : p.iterator().next();
			TreeSet<Integer> difference = new TreeSet<Integer>(p);
			difference.removeAll(neighbours.get(pivot));
			for (Integer node : difference) {
				// R union {node}
				TreeSet<Integer> rInternal = new TreeSet<Integer>(r);
				rInternal.add(node);
				// P intersect N(node)
				TreeSet<Integer> pInternal = new TreeSet<Integer>(p);
				pInternal.retainAll(neighbours.get(node));
				// X intersect N(node)
				TreeSet<Integer> xInternal = new TreeSet<Integer>(x);
				xInternal.retainAll(neighbours.get(node));

				// Recursive invocation
				recursion(rInternal, pInternal, xInternal);

				// P := P minus {node}
				p.remove(node);
				// X := X union {node}
				x.add(node);
			}
		}
	}
}
