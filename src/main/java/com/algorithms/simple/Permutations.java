package com.algorithms.simple;

import com.algorithms.utils.SwapUtils;
import com.algorithms.utils.ArrayUtils;

public class Permutations {
	private static String STR;
	private static int[] A;
	public static int count = 0;

	public Permutations(String str) {
		STR = str;
	}

	public Permutations(int[] numbers) {
		A = numbers;
	}

	public static void main(String[] args) {
		Permutations permutations1 = new Permutations("ABC");
		permutations1.permute1(0, STR.length()-1);
		Permutations permutations2 = new Permutations(new int[]{1, 2, 3});
		count = 0;
		do {
			ArrayUtils.printNumbers(A);
			count++;
		} while( permutations2.permute2() > 0 );
	}

	/**
	 * Remove, O(n!)
	 * @param int left: left element
	 * @param int right
	 * @return String: permutated string
	 */
	public String permute1(int left, int right) {
        if (left == right) {
        	count++;
        	System.out.println(STR);
            return STR;
        } else {
            for( int i = left; i <= right; i++ ) {
            	STR = SwapUtils.swap(STR,left,i);
                permute1(left+1, right);
                STR = SwapUtils.swap(STR,left,i);
            }
        }
        return null;
    }

	/**
	 * Narayana's algorithm
	 * @return
	 */
	public int permute2() {
		int k = 0;
		int t = 0;
		int n = A.length;
		int[] a = A;

		k = n-2; // penultimate element
		while( a[k] > a[k+1] && k>=0 ) {
			k--;
			if( k == -1 ) {
		        return 0;
		    }
		}
		t = n-1; // last element
		while( a[k] > a[t] && t >= k+1 ) {
			t--;
		}
		a = SwapUtils.swap(a, t, k);
		k = ArrayUtils.reverseNumbers(a, k+1, n+k);
		return k;
	}

	
}
