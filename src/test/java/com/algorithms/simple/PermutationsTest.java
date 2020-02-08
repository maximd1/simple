package com.algorithms.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PermutationsTest {

	@Test
	public void shouldReturnSix() {
		Permutations prm = new Permutations("123");
		prm.permute1(0, "123".length()-1);
		assertEquals(6, Permutations.count);
	}

	@Test
	public void shouldReturnSixNarayana() {
		int[] numbers = {1, 2, 3};
		Permutations prm = new Permutations(numbers);
		prm.permute2();
		assertEquals(6, Permutations.count);
	}
}
