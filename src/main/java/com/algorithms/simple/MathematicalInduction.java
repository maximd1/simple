package com.algorithms.simple;

public class MathematicalInduction {
	private long n;

	public MathematicalInduction(long n) {
		this.n = n;
	}

	public static void main(String[] args) {
		MathematicalInduction mathematicalInduction = new MathematicalInduction(3L);
		long result = mathematicalInduction.induction();
		System.out.println(result);
//		result = mathematicalInduction.nicomachus();
//		System.out.println(result);
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
	 * Proving 1(3)+2(3)+3(3)+...n(3) = (1+2+3+...n)(2)
	 * @return
	 */
	public long nicomachus( long element, long power ) {
		long result_cube = 0;
		long result_square = 0;
		int cube = 3;
//		do {
//			
//		} while( nicomachus( i ) );
		
		for( long i = 1; i<=n; i++ ) {
			result_cube += Math.pow(i, cube);
		}
		for( long i = 1; i<=n; i++ ) {
			result_square += i;
		}
		result_square = result_square*result_square;
		if( result_cube == result_square ) {
			System.out.println(result_cube + " " + result_square);
		}
		return result_cube;
	}
}
