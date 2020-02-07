package com.algorithms.simple.searches;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	
	@Test
	public void shouldReturn() {
		int[] numbers = {0, 1, 5, 8, 16, 23, 49, 96};
		BinarySearch bs = new BinarySearch();
		int result = bs.findElement(numbers, 8);
		assertEquals(3, result);
	}
}
