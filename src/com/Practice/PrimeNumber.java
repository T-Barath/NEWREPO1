package com.Practice;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 365;
		boolean flag = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}else {
				flag = true;
				break;
			}
		}
		if (flag==true) {
			System.out.println("Entered number is not a prime number");
		}else {
			System.out.println("Entered number is a prime number");
		}
	}

}
