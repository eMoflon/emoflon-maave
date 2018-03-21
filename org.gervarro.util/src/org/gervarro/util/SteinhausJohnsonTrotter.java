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

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Steinhaus-Johnson-Trotter algorithm for enumerating all the permutations
 * http://en.wikipedia.org/wiki/Steinhaus-Johnson-Trotter_algorithm
 * http://www.cut-the-knot.org/Curriculum/Combinatorics/JohnsonTrotter.shtml
 */
public class SteinhausJohnsonTrotter implements Iterator<Integer[]> {
	private int previousMobileIndex;
	private int largestMobileIndex;
	private final boolean[] direction;
	private final Integer[] numbers;

	public SteinhausJohnsonTrotter(final int n) {
		this.direction = new boolean[n];
		this.numbers = new Integer[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = i;
		}
		this.previousMobileIndex = 0;
		this.largestMobileIndex = n - 1;
	}

	@Override
	public final boolean hasNext() {
		return previousMobileIndex > -1;
	}

	@Override
	public final Integer[] next() {
		if (hasNext()) {
			final Integer[] result = Arrays.copyOf(numbers, numbers.length, Integer[].class);
			step();
			return result;
		} else {
			throw new NoSuchElementException();
		}
	}

	@Override
	public final void remove() {
		throw new UnsupportedOperationException();
	}

	public final int size() {
		return numbers.length;
	}

	protected final void reset() {
		step(0, 1);
		recalculateLargestMobileIndex();
		this.previousMobileIndex = 0;
	}

	protected final void step() {
		if (largestMobileIndex > -1) {
			final int neighbourIndex = direction[largestMobileIndex] ? largestMobileIndex + 1 : largestMobileIndex - 1;
			step(largestMobileIndex, neighbourIndex);
			recalculateLargestMobileIndex();
		} else {
			previousMobileIndex = largestMobileIndex;
		}
	}

	protected void swapPerformed(final int firstIndex, final int secondIndex) {
		// Do nothing
	}

	private final void swap(final int firstIndex, final int secondIndex) {
		final boolean tempDirection = direction[firstIndex];
		final int tempNumber = numbers[firstIndex];
		direction[firstIndex] = direction[secondIndex];
		numbers[firstIndex] = numbers[secondIndex];
		direction[secondIndex] = tempDirection;
		numbers[secondIndex] = tempNumber;
		swapPerformed(firstIndex, secondIndex);
	}

	private final void step(final int largestMobileIndex, final int neighbourIndex) {
		assert numbers.length == direction.length;
		final int largestMobileNumber = numbers[largestMobileIndex];
		// Swap values
		swap(largestMobileIndex, neighbourIndex);
		// Reverse the direction of all integers larger than k
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largestMobileNumber) {
				direction[i] = !direction[i];
			}
		}
	}

	private final void recalculateLargestMobileIndex() {
		previousMobileIndex = largestMobileIndex;
		largestMobileIndex = -1;
		for (int i = 0; i < numbers.length; i++) {
			// A directed integer is said to be mobile if it is greater than its immediate
			// neighbor in the direction it is looking at
			final boolean isMobileInteger = direction[i] ? (i < numbers.length - 1 && numbers[i] > numbers[i + 1])
					: (i > 0 && numbers[i] > numbers[i - 1]);
			if (isMobileInteger && (largestMobileIndex == -1 || numbers[i] > numbers[largestMobileIndex])) {
				largestMobileIndex = i;
			}
		}
	}
}
