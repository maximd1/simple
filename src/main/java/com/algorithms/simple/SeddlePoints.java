package com.algorithms.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Random;

public class SeddlePoints {
	
	private int MAXRANDOM = 100;
	private static int SIZE = 5;
	private static int[][] matrix;
	
	public static void main(String[] args) {
		SeddlePoints seddlePoints = new SeddlePoints();
		matrix = seddlePoints.generateRandomMatrix();
		System.out.println();
		findSeddlePoints();
	}
	
	private int[][] generateRandomMatrix() {
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
	
	private static List<Integer> findSeddlePoints() {
		List<Integer> maximums = new ArrayList<>();
		for (int i = 0; i<SIZE; i++) {
			int max = matrix[0][i];
			for (int j = 0; j<SIZE; j++) {
				if (matrix[j][i] > max) {
					max = matrix[j][i];
				}
			}
			maximums.add(max);
			int seddlePoint = findMinInRow(i, max);
			if (seddlePoint > 0) {
				System.out.println("Seddle point found at: " + i + ":" + seddlePoint + ", value: " + max);
			}
		}
		return maximums;
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
