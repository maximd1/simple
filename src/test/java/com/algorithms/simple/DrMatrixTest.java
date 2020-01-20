package com.algorithms.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DrMatrixTest {

	@Test
	public void shouldReturn111() {
		DrMatrix drm = new DrMatrix(2);
		int pyramid = drm.calculatePyramid();
		int result = drm.calculateSequence();
		assertEquals(12, pyramid);
		assertEquals(111, result);
	}

	@Test
	public void moreThan9() {
		DrMatrix drm = new DrMatrix(10);
		int result = drm.calculateSequence();
		assertEquals(-1773790777, result);
	}
}
