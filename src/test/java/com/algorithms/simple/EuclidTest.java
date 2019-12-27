package com.algorithms.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EuclidTest {

	@Test
	public void shouldReturn17() {
		Euclid euclid = new Euclid(544, 119);
		long divider = euclid.calculate(119);
		assertEquals(17, divider);
	}

	@Test
	public void shouldReturn1() {
		Euclid euclid = new Euclid(5443, 3119);
		long divider = euclid.calculate(3119);
		assertEquals(1, divider);
	}
}
