package com.Practice;

import java.util.Iterator;

public class SumOfEvenNummbers_0_100 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				count = count + i;
			}
		}
		System.out.println("Sum of even numbers from 0 to 100 is "+count);
	}

}
