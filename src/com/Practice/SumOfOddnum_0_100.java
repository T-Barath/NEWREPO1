package com.Practice;

public class SumOfOddnum_0_100 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i%2==1) {
				count = count +i;
			}
		}
		System.out.println("Sum of odd numbers from 0 to 100 is "+ count);
	}

}
