package com.algorithms.simple;

public class DrMatrix {
	private int n;
	private int NINE = 9;
	private int TEN = 10;

	public DrMatrix(int n) {
		this.n = n;
	}

	public static void main(String[] args) {
		DrMatrix drm = new DrMatrix(5);
		int result = drm.calculateSequence();
		System.out.println(result);
	}

	public int calculateSequence() {
		int result = 0;
		for( int i = 1; i < n+1; i++ ) {
			result = NINE*calculatePyramid() + (i+1);
		}
  	    
		return result;
	}
	
	public int calculatePyramid() {
		int s = 0;
		for( int i = 1; i <= n; i++ ) {
			s = s*TEN+i;
		}
		return s;
	}
}
