package com.algorithms.simple;

import com.algorithms.common.Pair;

public class Sums {

	public static void main(String[] args) {
		Sums sums = new Sums();
		int numbers[] = new int[]{4, -1, -5, 0, 2, 4, 1, 4, 5, 6};
		int sortedNumbers[] = new int[]{-5, -1, -2, 0, 1, 2, 4, 5, 6};
		Pair pair = sums.findElementsWithSumEqualsZero(numbers, 0);
		System.out.println(pair);
		pair = sums.findElementsWithSumEqualsZeroBinary(sortedNumbers,  1);
		System.out.println(pair);
	}

	/**
	 * Find two first elements of array sum of which is equals to 0. O(n^2).
	 * @param numbers - array
	 * @param element - current element to sum with others
	 * @return Pair - pair of elements (positions in array)
	 */
	public Pair findElementsWithSumEqualsZero(int numbers[], int element) {
		int a = numbers[element];
		for( int i = element; i<numbers.length; i++ ) {
			if( a+numbers[i] == 0 ) {
				return new Pair(element, i);
			}
		}
		return findElementsWithSumEqualsZero(numbers, element+1);
	}

	/**
	 * Binary search. O(logN).
	 * @param numbers - sorted array
	 * @param element - current element to sum with others
	 * @return Pair - pair of elements (positions in array)
	 */
	public Pair findElementsWithSumEqualsZeroBinary(int numbers[], int element) {
		int start = 0;
		int end = numbers.length - 1;
		int current;
		while( true ) {
			current = (start + end) / 2;
			if( numbers[current] + numbers[element] == 0 ) {
				return new Pair(element, current);
			} else if( start > end ) {
				return null;
			} else {
				if( numbers[current] + numbers[element] < 0 ) {
					start = current + 1;
				} else {
					end = current - 1;
				}
			}
		}
	}
}
