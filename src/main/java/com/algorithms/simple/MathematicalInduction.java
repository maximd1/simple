package com.algorithms.simple;

/**
 * Proving 1+3+...(2n-1) = n2
 * @param args
 */
public class MathematicalInduction {
	private long n;

	public MathematicalInduction(long n) {
		this.n = n;
	}

	public static void main(String[] args) {
		MathematicalInduction mathematicalInduction = new MathematicalInduction(10L);
		long result = mathematicalInduction.induction();
		System.out.println(result);
	}
	
	public long induction() {
		long result = 0;
		for( long i = 1; i<=n; i++ ) {
			result += (2*i-1);
		}
		return result;
	}
}
