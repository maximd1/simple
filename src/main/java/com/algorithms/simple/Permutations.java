package com.algorithms.simple;

import com.algorithms.utils.StringUtils;

public class Permutations {
	private static String STR;
	public static int count = 0;

	public Permutations(String str) {
		STR = str;
	}

	public static void main(String[] args) {
		Permutations permutations = new Permutations("ABC");
		permutations.permute1(0, STR.length()-1);
	}

	/**
	 * Lexicographic, O(n!)
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
            	STR = StringUtils.swap(STR,left,i);
                permute1(left+1, right);
                STR = StringUtils.swap(STR,left,i);
            }
        }
        return null;
    }
}
