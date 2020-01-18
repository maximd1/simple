package com.algorithms.simple;

public class DrMatrix {
	private long n;
	
	public DrMatrix(long n) {
		this.n = n;
	}

	public static void main(String[] args) {
		DrMatrix drm = new DrMatrix(9);
		long result = drm.buildPyramid();
		System.out.println(result);
	}

	public long buildPyramid() {
		long s = 0, c;
  	    for( c = 1; c <= n; c++ ) {
			s = s * 10 + c;
		}
		return s;
	}
}
