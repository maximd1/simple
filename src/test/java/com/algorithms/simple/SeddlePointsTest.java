package com.algorithms.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.algorithms.simple.seddlepoints.SeddlePoint;
import com.algorithms.simple.seddlepoints.SeddlePointFinder;

public class SeddlePointsTest {

	@Test
	public void shouldReturn63() {
		int[][] matrix = {
					{13,16,6,33,62},
					{28,91,14,95,67},
					{69,96,63,66,100},
					{63,36,42,41,6},
					{18,20,59,95,51}
				};
		SeddlePointFinder seddlePointFinder = new SeddlePointFinder(matrix);
		List<SeddlePoint> seddlePoints = seddlePointFinder.findSeddlePoints();
		assertEquals(1, seddlePoints.size());
	}
}
