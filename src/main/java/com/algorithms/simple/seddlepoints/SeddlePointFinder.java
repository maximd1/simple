package com.algorithms.simple.seddlepoints;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Random;

public class SeddlePointFinder {
	private static int MAXRANDOM = 100;
	private static int SIZE = 3;
	private static int[][] matrix;
	
	public SeddlePointFinder(int[][] matrix) {
		SeddlePointFinder.matrix = matrix;
	}
	
	public static void main(String[] args) {
		SeddlePointFinder seddlePointsFinder = new SeddlePointFinder(generateRandomMatrix());
		
		System.out.println();
		List<SeddlePoint> seddlePoints = seddlePointsFinder.findSeddlePoints();
		if (seddlePoints.size() == 0) {
			System.out.println("No seddle points found.");
		} else {
			seddlePoints.forEach(x -> {
				System.out.println("Seddle point found at: " + x.getI() + ":" + x.getJ() + ", value: " + x.getValue());
			});
		}
	}
	
	private static int[][] generateRandomMatrix() {
		int[][] a = new int[SIZE][SIZE];
		PrimitiveIterator.OfInt r = new Random().ints(0, MAXRANDOM+1).iterator();
		for (int i = 0; i<SIZE; i++) {
			for (int j = 0; j<SIZE; j++) {
				a[i][j] = r.nextInt();
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		return a;
	}
	
	public List<SeddlePoint> findSeddlePoints() {
		List<SeddlePoint> seddlePoints = new ArrayList<>();
		for (int i = 0; i<SIZE; i++) {
			int max = matrix[0][i];
			for (int j = 0; j<SIZE; j++) {
				if (matrix[j][i] > max) {
					max = matrix[j][i];
				}
			}
			int j = findMinInRow(i, max);
			if (j > 0) {
				seddlePoints.add(new SeddlePoint(i, j, max));
			}
		}
		return seddlePoints;
	}
	
	private static int findMinInRow(int column, int max) {
		int min = 0;
		for (int i = 0; i<SIZE; i++) {
			if (matrix[column][i] < max) {
				return 0;
			} else if (matrix[column][i] == max) {
				min = i;
			}
		}
		return min;
	}
}
