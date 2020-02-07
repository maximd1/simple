package com.algorithms.simple.searches;

import com.algorithms.common.Pair;

public class BinarySearch {

	/**
	 * Binary search. O(logN).
	 * @param numbers - sorted array
	 * @param element - current element to sum with others
	 * @return Pair - pair of elements (positions in array)
	 */
	public int findElement(int numbers[], int element) {
		int start = 0;
		int end = numbers.length - 1;
		int current;
		while( true ) {
			current = (start + end) / 2;
			if( numbers[current] == element ) {
				return current;
			} else if( start > end ) {
				return -1;
			} else {
				if( numbers[current] < 0 ) {
					start = current + 1;
				} else {
					end = current - 1;
				}
			}
		}
	}
}
