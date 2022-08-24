package com.Try;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 35;
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				System.out.println("Entered number is not a prime number");
				break;
			}else {
				System.out.println("Entered number is a prime number");
				break;
			}
			
		}
	}
}
