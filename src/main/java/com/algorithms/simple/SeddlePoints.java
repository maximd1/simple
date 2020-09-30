package com.algorithms.simple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Random;

public class SeddlePoints {
	
	private int MAXRANDOM = 100;
	private static int SIZE = 10;
	private static int[][] matrix;
	private static List<Integer> maximums;
	private static List<Integer> minimums;
	
	public static void main(String[] args) {
		SeddlePoints seddlePoints = new SeddlePoints();
		matrix = seddlePoints.generateRandomMatrix();
		System.out.println();
		maximums = new ArrayList<>(findMaxInColumn());
		maximums.stream().forEach(i -> System.out.print(i + " "));
		System.out.println();
		minimums = new ArrayList<>(findMinInRow());
		minimums.stream().forEach(i -> System.out.print(i + " "));
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
	
	private static List<Integer> findMaxInColumn() {
		List<Integer> maximums = new ArrayList<>();
		for (int i = 0; i<SIZE; i++) {
			int max = matrix[0][i];
			for (int j = 0; j<SIZE; j++) {
				if (matrix[j][i] > max) {
					max = matrix[j][i];
				}
			}
			maximums.add(max);
		}
		return maximums;
	}
	
	private static List<Integer> findMinInRow() {
		List<Integer> minimums = new ArrayList<>();
		for (int i = 0; i<SIZE; i++) {
			int min = matrix[i][0];
			for (int j = 0; j<SIZE; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
			minimums.add(min);
		}
		return minimums;
	}
	
	private static List<Integer> findSeddlePoints() {
		List<Integer> seddles = new LinkedList<>();
		for (int i = 0; i<SIZE; i++) {
			if (maximums.get(i) == minimums.get(i)) {
				System.out.println("Seddle point found at: " + i + ":" + i + ", value: " + maximums.get(i));
				seddles.add(maximums.get(i));
			}
		}
		return seddles;
	}
}
