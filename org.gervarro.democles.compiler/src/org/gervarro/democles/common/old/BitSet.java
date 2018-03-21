/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.gervarro.democles.common.old;

/**
 * The {@code BitSet} class implements a bit field. Each element in a
 * {@code BitSet} can be on(1) or off(0). A {@code BitSet} is created with a
 * given size and grows if this size is exceeded. Growth is always rounded to a
 * 64 bit boundary.
 */
public class BitSet {
	public static final boolean BOUND = false;
	public static final boolean FREE = true;
	public static final BitSet BOUND_BOUND = new BitSet(new boolean[] { BOUND, BOUND });
	public static final BitSet FREE_BOUND = new BitSet(new boolean[] { FREE, BOUND });
	public static final BitSet BOUND_FREE = new BitSet(new boolean[] { BOUND, FREE });
	public static final BitSet FREE_FREE = new BitSet(new boolean[] { FREE, FREE });

	private static final int OFFSET = 6;

	private static final int ELM_SIZE = 1 << OFFSET;

	private static final int RIGHT_BITS = ELM_SIZE - 1;

	private static final long[] TWO_N_ARRAY = new long[] { 0x1L, 0x2L, 0x4L, 0x8L, 0x10L, 0x20L, 0x40L, 0x80L, 0x100L,
			0x200L, 0x400L, 0x800L, 0x1000L, 0x2000L, 0x4000L, 0x8000L, 0x10000L, 0x20000L, 0x40000L, 0x80000L,
			0x100000L, 0x200000L, 0x400000L, 0x800000L, 0x1000000L, 0x2000000L, 0x4000000L, 0x8000000L, 0x10000000L,
			0x20000000L, 0x40000000L, 0x80000000L, 0x100000000L, 0x200000000L, 0x400000000L, 0x800000000L,
			0x1000000000L, 0x2000000000L, 0x4000000000L, 0x8000000000L, 0x10000000000L, 0x20000000000L, 0x40000000000L,
			0x80000000000L, 0x100000000000L, 0x200000000000L, 0x400000000000L, 0x800000000000L, 0x1000000000000L,
			0x2000000000000L, 0x4000000000000L, 0x8000000000000L, 0x10000000000000L, 0x20000000000000L,
			0x40000000000000L, 0x80000000000000L, 0x100000000000000L, 0x200000000000000L, 0x400000000000000L,
			0x800000000000000L, 0x1000000000000000L, 0x2000000000000000L, 0x4000000000000000L, 0x8000000000000000L };

	private final long[] bits;
	private final int length;

	/**
	 * Create a new {@code BitSet} with size equal to nbits. If nbits is not a
	 * multiple of 64, then create a {@code BitSet} with size nbits rounded to the
	 * next closest multiple of 64.
	 * 
	 * @param nbits
	 *            the size of the bit set.
	 * @throws NegativeArraySizeException
	 *             if {@code nbits} is negative.
	 * @see #clear(int)
	 * @see #set(int)
	 * @see #clear()
	 * @see #clear(int, int)
	 * @see #set(int, boolean)
	 * @see #set(int, int)
	 * @see #set(int, int, boolean)
	 */
	public BitSet(int nbits) {
		if (nbits < 0) {
			throw new NegativeArraySizeException();
		}
		bits = new long[(nbits >> OFFSET) + ((nbits & RIGHT_BITS) > 0 ? 1 : 0)];
		length = nbits;
	}

	/**
	 * Private constructor called from get(int, int) method
	 * 
	 * @param bits
	 *            the size of the bit set
	 */
	private BitSet(long[] bits, int length) {
		this.bits = bits;
		this.length = length;
	}

	BitSet(boolean[] bits) {
		this(bits.length);
		for (int i = 0; i < bits.length; i++) {
			set(i, bits[i]);
		}
	}

	BitSet(BitSet bitSet) {
		this.bits = new long[bitSet.bits.length];
		System.arraycopy(bitSet.bits, 0, bits, 0, bitSet.bits.length);
		this.length = bitSet.length;
	}

	/**
	 * Compares the argument to this {@code BitSet} and returns whether they are
	 * equal. The object must be an instance of {@code BitSet} with the same bits
	 * set.
	 * 
	 * @param obj
	 *            the {@code BitSet} object to compare.
	 * @return a {@code boolean} indicating whether or not this {@code BitSet} and
	 *         {@code obj} are equal.
	 * @see #hashCode
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof BitSet) {
			BitSet other = (BitSet) obj;
			if (length != other.length) {
				return false;
			}
			long[] bsBits = other.bits;
			assert bits.length == bsBits.length;
			for (int i = 0; i < bits.length; i++) {
				if (bits[i] != bsBits[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * Computes the hash code for this {@code BitSet}. If two {@code BitSet}s are
	 * equal the have to return the same result for {@code hashCode()}.
	 * 
	 * @return the {@code int} representing the hash code for this bit set.
	 * @see #equals
	 * @see java.util.Hashtable
	 */
	@Override
	public int hashCode() {
		long x = 1234;
		for (int i = 0; i < bits.length; i++) {
			x ^= bits[i] * (i + 1);
		}
		return (int) ((x >> 32) ^ x);
	}

	/**
	 * Retrieves the bit at index {@code pos}. Grows the {@code BitSet} if
	 * {@code pos > size}.
	 * 
	 * @param pos
	 *            the index of the bit to be retrieved.
	 * @return {@code true} if the bit at {@code pos} is set, {@code false}
	 *         otherwise.
	 * @throws IndexOutOfBoundsException
	 *             if {@code pos} is negative.
	 * @see #clear(int)
	 * @see #set(int)
	 * @see #clear()
	 * @see #clear(int, int)
	 * @see #set(int, boolean)
	 * @see #set(int, int)
	 * @see #set(int, int, boolean)
	 */
	public boolean get(int pos) {
		if (pos < 0 || pos > length) {
			throw new IndexOutOfBoundsException();
		}
		return (bits[pos >> OFFSET] & TWO_N_ARRAY[pos & RIGHT_BITS]) != 0;
	}

	/**
	 * Retrieves the bits starting from {@code pos1} to {@code pos2} and returns
	 * back a new bitset made of these bits. Grows the {@code BitSet} if
	 * {@code pos2 > size}.
	 * 
	 * @param pos1
	 *            beginning position.
	 * @param pos2
	 *            ending position.
	 * @return new bitset of the range specified.
	 * @throws IndexOutOfBoundsException
	 *             if {@code pos1} or {@code pos2} is negative, or if {@code pos2}
	 *             is smaller than {@code pos1}.
	 * @see #get(int)
	 */
	// TODO check
	public BitSet get(int pos1, int pos2) {
		if (pos1 < 0 || pos2 < 0 || pos2 < pos1 || pos1 > length || pos2 > length) {
			throw new IndexOutOfBoundsException();
		}

		int last = bits.length << OFFSET;
		if (pos1 >= last || pos1 == pos2) {
			return new BitSet(0);
		}
		if (pos2 > last) {
			pos2 = last;
		}

		int idx1 = pos1 >> OFFSET;
		int idx2 = (pos2 - 1) >> OFFSET;
		long factor1 = (~0L) << (pos1 & RIGHT_BITS);
		long factor2 = (~0L) >>> (ELM_SIZE - (pos2 & RIGHT_BITS));

		if (idx1 == idx2) {
			long result = (bits[idx1] & (factor1 & factor2)) >>> (pos1 % ELM_SIZE);
			if (result == 0) {
				return new BitSet(0);
			}
			// TODO return new BitSet(new long[] { result });
		}
		long[] newbits = new long[idx2 - idx1 + 1];
		// first fill in the first and last indexes in the new bitset
		newbits[0] = bits[idx1] & factor1;
		newbits[newbits.length - 1] = bits[idx2] & factor2;

		// fill in the in between elements of the new bitset
		for (int i = 1; i < idx2 - idx1; i++) {
			newbits[i] = bits[idx1 + i];
		}

		// shift all the elements in the new bitset to the right by pos1
		// % ELM_SIZE
		int numBitsToShift = pos1 & RIGHT_BITS;
		if (numBitsToShift != 0) {
			for (int i = 0; i < newbits.length; i++) {
				// shift the current element to the right regardless of
				// sign
				newbits[i] = newbits[i] >>> (numBitsToShift);

				// apply the last x bits of newbits[i+1] to the current
				// element
				if (i != newbits.length - 1) {
					newbits[i] |= newbits[i + 1] << (ELM_SIZE - (numBitsToShift));
				}
			}
		}
		// TODO return new BitSet(newbits);
		return null;
	}

	/**
	 * Sets the bit at index {@code pos} to 1. Grows the {@code BitSet} if
	 * {@code pos > size}.
	 * 
	 * @param pos
	 *            the index of the bit to set.
	 * @throws IndexOutOfBoundsException
	 *             if {@code pos} is negative.
	 * @see #clear(int)
	 * @see #clear()
	 * @see #clear(int, int)
	 */
	public void set(int pos) {
		if (pos < 0 || pos > length) {
			throw new IndexOutOfBoundsException();
		}
		bits[pos >> OFFSET] |= TWO_N_ARRAY[pos & RIGHT_BITS];
	}

	/**
	 * Sets the bit at index {@code pos} to {@code val}. Grows the {@code BitSet} if
	 * {@code pos > size}.
	 * 
	 * @param pos
	 *            the index of the bit to set.
	 * @param val
	 *            value to set the bit.
	 * @throws IndexOutOfBoundsException
	 *             if {@code pos} is negative.
	 * @see #set(int)
	 */
	public void set(int pos, boolean val) {
		if (val) {
			set(pos);
		} else {
			clear(pos);
		}
	}

	/**
	 * Clears all the bits in this {@code BitSet}.
	 * 
	 * @see #clear(int)
	 * @see #clear(int, int)
	 */
	public void clear() {
		for (int i = 0; i < bits.length; i++) {
			bits[i] = 0L;
		}
	}

	/**
	 * Clears the bit at index {@code pos}. Grows the {@code BitSet} if
	 * {@code pos > size}.
	 * 
	 * @param pos
	 *            the index of the bit to clear.
	 * @throws IndexOutOfBoundsException
	 *             if {@code pos} is negative.
	 * @see #clear(int, int)
	 */
	public void clear(int pos) {
		if (pos < 0 || pos > length) {
			throw new IndexOutOfBoundsException();
		}
		bits[pos >> OFFSET] &= ~(TWO_N_ARRAY[pos & RIGHT_BITS]);
	}

	/**
	 * Clears the bits starting from {@code pos1} to {@code pos2}. Grows the
	 * {@code BitSet} if {@code pos2 > size}.
	 * 
	 * @param pos1
	 *            beginning position.
	 * @param pos2
	 *            ending position.
	 * @throws IndexOutOfBoundsException
	 *             if {@code pos1} or {@code pos2} is negative, or if {@code pos2}
	 *             is smaller than {@code pos1}.
	 * @see #clear(int)
	 */
	// TODO check
	public void clear(int pos1, int pos2) {
		if (pos1 < 0 || pos2 < 0 || pos2 < pos1) {
			throw new IndexOutOfBoundsException();
		}

		int last = (bits.length << OFFSET);
		if (pos1 >= last || pos1 == pos2) {
			return;
		}
		if (pos2 > last) {
			pos2 = last;
		}

		int idx1 = pos1 >> OFFSET;
		int idx2 = (pos2 - 1) >> OFFSET;
		long factor1 = (~0L) << (pos1 & RIGHT_BITS);
		long factor2 = (~0L) >>> (ELM_SIZE - (pos2 & RIGHT_BITS));

		if (idx1 == idx2) {
			bits[idx1] &= ~(factor1 & factor2);
		} else {
			bits[idx1] &= ~factor1;
			bits[idx2] &= ~factor2;
			for (int i = idx1 + 1; i < idx2; i++) {
				bits[i] = 0L;
			}
		}
	}

	/**
	 * Flips the bit at index {@code pos}. Grows the {@code BitSet} if
	 * {@code pos > size}.
	 * 
	 * @param pos
	 *            the index of the bit to flip.
	 * @throws IndexOutOfBoundsException
	 *             if {@code pos} is negative.
	 * @see #flip(int, int)
	 */
	public void flip(int pos) {
		if (pos < 0 || pos > length) {
			throw new IndexOutOfBoundsException();
		}
		bits[pos >> OFFSET] ^= TWO_N_ARRAY[pos & RIGHT_BITS];
	}

	/**
	 * Flips the bits starting from {@code pos1} to {@code pos2}. Grows the
	 * {@code BitSet} if {@code pos2 > size}.
	 * 
	 * @param pos1
	 *            beginning position.
	 * @param pos2
	 *            ending position.
	 * @throws IndexOutOfBoundsException
	 *             if {@code pos1} or {@code pos2} is negative, or if {@code pos2}
	 *             is smaller than {@code pos1}.
	 * @see #flip(int)
	 */
	// TODO check
	public void flip(int pos1, int pos2) {
		if (pos1 < 0 || pos2 < 0 || pos2 < pos1) {
			throw new IndexOutOfBoundsException();
		}

		if (pos1 == pos2) {
			return;
		}
		int len2 = ((pos2 - 1) >> OFFSET) + 1;
		if (len2 > bits.length) {
			throw new IndexOutOfBoundsException();
		}

		int idx1 = pos1 >> OFFSET;
		int idx2 = (pos2 - 1) >> OFFSET;
		long factor1 = (~0L) << (pos1 & RIGHT_BITS);
		long factor2 = (~0L) >>> (ELM_SIZE - (pos2 & RIGHT_BITS));

		if (idx1 == idx2) {
			bits[idx1] ^= (factor1 & factor2);
		} else {
			bits[idx1] ^= factor1;
			bits[idx2] ^= factor2;
			for (int i = idx1 + 1; i < idx2; i++) {
				bits[i] ^= (~0L);
			}
		}
	}

	/**
	 * Returns the number of bits this {@code BitSet} has.
	 * 
	 * @return the number of bits contained in this {@code BitSet}.
	 * @see #length
	 */
	public int size() {
		return length;
	}

	/**
	 * Returns a string containing a concise, human-readable description of the
	 * receiver.
	 * 
	 * @return a comma delimited list of the indices of all bits that are set.
	 */
	@Override
	public String toString() {
		/*
		 * StringBuilder sb = new StringBuilder(bits.length / 2); int bitCount = 0;
		 * sb.append('{'); boolean comma = false; for (int i = 0; i < bits.length; i++)
		 * { if (bits[i] == 0) { bitCount += ELM_SIZE; continue; } for (int j = 0; j <
		 * ELM_SIZE; j++) { if (((bits[i] & (TWO_N_ARRAY[j])) != 0)) { if (comma) {
		 * sb.append(", "); //$NON-NLS-1$ } sb.append(bitCount); comma = true; }
		 * bitCount++; } } sb.append('}');
		 */
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < bits.length; i++) {
			for (int j = 0; j < ELM_SIZE; j++) {
				sb.append(((bits[i] & (TWO_N_ARRAY[j])) != 0) ? "1" : "0");
			}
		}
		return sb.toString();
	}

	/**
	 * Returns the position of the first bit that is {@code true} on or after
	 * {@code pos}.
	 * 
	 * @param pos
	 *            the starting position (inclusive).
	 * @return -1 if there is no bits that are set to {@code true} on or after
	 *         {@code pos}.
	 */
	public int nextSetBit(int pos) {
		if (pos < 0 || pos > length) {
			throw new IndexOutOfBoundsException();
		}

		if (pos >= bits.length << OFFSET) {
			return -1;
		}

		int idx = pos >> OFFSET;
		// first check in the same bit set element
		if (bits[idx] != 0L) {
			for (int j = pos & RIGHT_BITS; j < ELM_SIZE; j++) {
				if (((bits[idx] & (TWO_N_ARRAY[j])) != 0)) {
					return (idx << OFFSET) + j;
				}
			}

		}
		idx++;
		while (idx < bits.length && bits[idx] == 0L) {
			idx++;
		}
		if (idx == bits.length) {
			return -1;
		}

		// we know for sure there is a bit set to true in this element
		// since the bitset value is not 0L
		for (int j = 0; j < ELM_SIZE; j++) {
			if (((bits[idx] & (TWO_N_ARRAY[j])) != 0)) {
				return (idx << OFFSET) + j;
			}
		}

		return -1;
	}

	/**
	 * Returns the position of the first bit that is {@code false} on or after
	 * {@code pos}.
	 * 
	 * @param pos
	 *            the starting position (inclusive).
	 * @return the position of the next bit set to {@code false}, even if it is
	 *         further than this {@code BitSet}'s size.
	 */
	public int nextClearBit(int pos) {
		if (pos < 0 || pos > length) {
			throw new IndexOutOfBoundsException();
		}

		if (pos >= bits.length << OFFSET) {
			return -1;
		}

		int idx = pos >> OFFSET;
		// first check in the same bit set element
		if (bits[idx] != (~0L)) {
			for (int j = pos & RIGHT_BITS; j < ELM_SIZE; j++) {
				if (((bits[idx] & (TWO_N_ARRAY[j])) == 0)) {
					return (idx << OFFSET) + j;
				}
			}
		}
		idx++;
		while (idx < bits.length && bits[idx] == (~0L)) {
			idx++;
		}
		if (idx == bits.length) {
			return -1;
		}

		// we know for sure there is a bit set to true in this element
		// since the bitset value is not 0L
		for (int j = 0; j < ELM_SIZE; j++) {
			if (((bits[idx] & (TWO_N_ARRAY[j])) == 0)) {
				return (idx << OFFSET) + j;
			}
		}

		return -1;
	}

	/**
	 * Returns true if all the bits in this {@code BitSet} are set to false.
	 * 
	 * @return {@code true} if the {@code BitSet} is empty, {@code false} otherwise.
	 */
	public boolean isEmpty() {
		for (int idx = 0; idx < bits.length; idx++) {
			if (bits[idx] != 0L) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns the number of bits that are {@code true} in this {@code BitSet}.
	 * 
	 * @return the number of {@code true} bits in the set.
	 */
	public int cardinality() {
		int count = 0;
		// FIXME: need to test performance, if still not satisfied, change it to
		// 256-bits table based
		for (int idx = 0; idx < bits.length; idx++) {
			count += pop(bits[idx] & 0xffffffffL);
			count += pop(bits[idx] >>> 32);
		}
		return count;
	}

	private final int pop(long x) {
		x = x - ((x >>> 1) & 0x55555555);
		x = (x & 0x33333333) + ((x >>> 2) & 0x33333333);
		x = (x + (x >>> 4)) & 0x0f0f0f0f;
		x = x + (x >>> 8);
		x = x + (x >>> 16);
		return (int) x & 0x0000003f;
	}
}