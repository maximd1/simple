package com.algorithms.simple;

import com.algorithms.common.Pair;

public class Sums {

	public static void main(String[] args) {
		Sums sums = new Sums();
		int numbers[] = new int[]{4, -1, -5, 0, 2, 4, 1, 4, 5, 6};
		//int numbers[] = new int[]{-1, 0, 1};
		Pair pair = sums.findElementsWithSumEqualsZero(numbers, 0);
		System.out.println(pair);
	}

	public Pair findElementsWithSumEqualsZero(int numbers[], int element) {
		int a = numbers[element];
		for( int i = element; i<numbers.length; i++ ) {
			if( a+numbers[i] == 0 ) {
				return new Pair(element, i);
			}
		}
		return findElementsWithSumEqualsZero(numbers, element+1);
	}
}
