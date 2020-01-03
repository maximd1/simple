package com.algorithms.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathematicalInductionTest {

	/**
	 * First: proving that P(1) is right and equals 1
	 */
	@Test
	public void shouldReturnOne() {
		MathematicalInduction mathematicalInduction = new MathematicalInduction(1L);
		long result = mathematicalInduction.induction();
		assertEquals(1L, result);
	}

	/**
	 * Second: proving that P(n+1) is right too
	 */
	@Test
	public void shouldReturnSquareN() {
		long n = 10L;
		MathematicalInduction mathematicalInduction = new MathematicalInduction(10L);
		long result = mathematicalInduction.induction();
		assertEquals(n*n, result);
	}
}
