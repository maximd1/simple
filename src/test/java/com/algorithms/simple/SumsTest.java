package com.algorithms.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.algorithms.common.Pair;

public class SumsTest {

	@Test
	public void shouldReturn0and2() {
		Sums sums = new Sums();
		int numbers[] = new int[] {-1, 0, 1};
		Pair pair = sums.findElementsWithSumEqualsZero(numbers, 0);
		assertEquals(pair.A, 0);
		assertEquals(pair.B, 2);
	}
}
