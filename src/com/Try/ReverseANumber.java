package com.Try;

public class ReverseANumber {

	public static void main(String[] args) {
		int n = 1234;
		int i, j = 0;
		int a = n;
		while (a > 0) {
			i = a % 10;	// 3,5,1
			j=(j*10)+i;	// 30, 30+50, 90
			a = a / 10;	// 15,1,
		}
		System.out.println(j);
//		if (n == j) {
//
//			System.out.println("Amstong Number");
//
//		} else {
//			System.out.println("Not a Amstrong number");
//		}

	}

}
