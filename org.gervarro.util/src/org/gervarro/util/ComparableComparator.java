package org.gervarro.util;

import java.util.Comparator;

public final class ComparableComparator<T extends Comparable<T>> implements Comparator<T> {
	
	public ComparableComparator() {
		// Do nothing
	}
	
	@Override
	public final int compare(T left, T right) {
		return left.compareTo(right);
	}
}
