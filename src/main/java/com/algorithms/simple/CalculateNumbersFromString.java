package com.algorithms.simple;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CalculateNumbersFromString {
	private final static Logger LOG = LogManager.getRootLogger();
	private String number;
	
	public CalculateNumbersFromString(String number) {
		this.number = number;
	}

	public static void main(String[] args) {
		CalculateNumbersFromString cnfs = new CalculateNumbersFromString("2344545435243");
		System.out.println(cnfs.calculate());
	}
	
	public long calculate() {
		if( this.number.matches("^[0-9]*$") ) {
			char[] numbers = this.number.toCharArray();
			long sum = 0;
			for(int i = 0; i<number.length(); i++) {
				sum += Long.valueOf(Character.getNumericValue(numbers[i]));
			}
			return sum;
		} else {
			LOG.error("Incorrect number " + this.number);
			return -1;
		}
	}
}
