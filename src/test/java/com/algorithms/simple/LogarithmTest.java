package com.algorithms.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LogarithmTest {
	private static final double DELTA = 0.0000000001d;

	@Test
	public void shouldReturn8() {
		Logarithm log = new Logarithm();
		double result = log.fastLog(256);
		assertEquals(8.0, result);
	}

	@Test
	public void shouldReturn2() {
		Logarithm log = new Logarithm();
		double result = log.withShifts(1.5);
		assertEquals(0.584962, result, 0.000001);
		result = Math.pow(2, result);
		assertEquals(1.5d, result, DELTA);
	}
}
