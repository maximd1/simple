package com.algorithms.simple;

public class Logarithm {
	private static double x = 1.8;

	public static void main(String[] args) {
		Logarithm log = new Logarithm();
		double result = log.withShifts(x);
		System.out.println(result);
	}

	/**
	 * To find logarithm of any value, base 2, using only shifts (division), sum and difference
	 * @param value
	 * @return double
	 */
	public double withShifts(double x) {
		double z = x/2;
		long k = 1;
		double y = 0;
		while( x > 1 ) {
			if( x - z >= 1 ) {
				x = x - z;
				z = (double) (x / Math.pow(2, k));
				double temp = Math.pow(2, k)/(Math.pow(2, k)-1);
				y = y + Math.log(temp)/Math.log(2);
			} else {
				z = z/2;
				k++;
			}
		}
		return y;
	}

	/**
	 * This is a shortest variant to calculate the logarithm of any base 
	 * @param value
	 * @return double
	 */
	public double fastLog(long value) {
		return Math.log(value) / Math.log(2);
	}
}
