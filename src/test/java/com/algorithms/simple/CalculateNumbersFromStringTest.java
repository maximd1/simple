package com.algorithms.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculateNumbersFromStringTest {

	@Test
	public void shoudReturnSix() {
		CalculateNumbersFromString cnfs = new CalculateNumbersFromString("123");
		assertEquals(6, cnfs.calculate());
	}

	@Test
	public void shouldReturnMinusOne() {
		CalculateNumbersFromString cnfs = new CalculateNumbersFromString("abc");
		assertEquals(-1, cnfs.calculate());
	}
}
