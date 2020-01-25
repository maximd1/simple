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

	public String permute1(int l, int r) {
        if (l == r) {
        	count++;
        	System.out.println(STR);
            return STR;
        } else {
            for( int i = l; i <= r; i++ ) {
            	STR = StringUtils.swap(STR,l,i);
                permute1(l+1, r);
                STR = StringUtils.swap(STR,l,i);
            }
        }
        return null;
    }
}
