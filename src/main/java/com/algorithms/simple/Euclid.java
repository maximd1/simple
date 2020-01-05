package com.algorithms.simple;

import java.util.Arrays;

public class Euclid {
	private static long M;
	private static long N;
	
	private long a1 = 1, b1 = 0;
	private long a = 0, b = 1;
	private long r;
	private long[] result = {0L, 0L, 0L};

	public Euclid(long m, long n) {
		M = m;
		N = n;
	}

	public static void main(String[] args) {
		Euclid euclid = new Euclid(512, 72);
		if( M < N ) {
			long temp = M;
			M = N;
			N = temp;
		}
		long simpleDivider = euclid.calculate(N);
		System.out.println(simpleDivider);
		long[] divider = euclid.generic(N, 0);
		System.out.println(Arrays.toString(divider));
	}
	
	public long calculate(long divider) {
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
		return N;
	}

	/**
	 * Generic algorithm: maximum divider d and couple of a and b where am+bn=d
	 * If remainder (r) is not 0, then t = a1; a1 = a; a = t-qa. The same for b/b1: t = b1; b1 = b; b = t-qb.
	 * q is a quotient, r is a remainder. 
	 * @param divider
	 * @param remainder
	 * @return d, a, b as an array
	 */
	public long[] generic(long divider, long remainder) {
		long q;
		do {
			q = M / N;
			r = M % N;
			if( r == 0 ) {
				result[0] = N;
				result[1] = a;
				result[2] = b;
				return result;
			} else {
				M = N;
				N = r;
				long t = a1;
				a1 = a;
				a = t - q*a;
				t = b1;
				b1 = b;
				b = t - q*b;
				generic(q, r);
			}
		} while ( r != 0 );
		return result;
	}
}
