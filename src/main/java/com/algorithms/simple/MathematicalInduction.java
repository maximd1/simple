package com.algorithms.simple;

public class MathematicalInduction {
	private long n;

	public MathematicalInduction(long n) {
		this.n = n;
	}

	public static void main(String[] args) {
		MathematicalInduction mathematicalInduction = new MathematicalInduction(10L);
		long result = mathematicalInduction.induction();
		System.out.println(result);
		result = mathematicalInduction.nicomachus();
		System.out.println(result);
	}

	/**
	 * Proving 1+3+...(2n-1) = n(2)
	 * @return long
	 */
	public long induction() {
		long result = 0;
		for( long i = 1; i<=n; i++ ) {
			result += (2*i-1);
		}
		return result;
	}

	/**
	 * Proving 1(3)+2(3)+3(3)+...n(3) = (1+2+3+...n)(2).
	 * n(3) = first element in a group n(2)-n+1. Group size is n.
	 * @return
	 */
	public long nicomachus() {
		final int CUBE = 3;
		long result_cube = 0;
		long result_square = 0;
		long cube = 0;

		for( long i = 1; i<=n; i++ ) {
			cube = (long) Math.pow(i, CUBE);
			if( calculate_cube(i) != cube ) {
				System.out.println("Error");
				return -1;
			};
			result_cube += cube;
			result_square += i;
		}
		result_square = result_square*result_square;
		if( result_cube == result_square ) {
			System.out.println(result_cube + " " + result_square);
		}
		return result_cube;
	}

	public long calculate_cube( long n ) {
		long start = n*n-n+1;
		long result = 0;
		for( long i = start; i<start+n*2; i+=2 ) {
			result+=i;
		}
		System.out.println(n + " " + result);
		return result;
	}
}
