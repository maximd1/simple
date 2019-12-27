package com.algorithms.simple;

public class Euclid {
	private static long M;
	private static long N;

	public Euclid(long m, long n) {
		M = m;
		N = n;
	}

	public static void main(String[] args) {
		Euclid euclid = new Euclid(72, 512);
		if( M < N ) {
			long temp = M;
			M = N;
			N = temp;
		}
		long divider = euclid.calculate(N);
		System.out.println(divider);
	}
	
	public long calculate(long divider) {
		long r;
		do {
			r = M % N;
			if( r == 0 ) {
				return N;
			} else {
				M = N;
				N = r;
				calculate(N);
			}
		} while( r != 0 );
		return 0;
	}
}
