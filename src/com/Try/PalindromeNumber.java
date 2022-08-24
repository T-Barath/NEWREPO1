package com.Try;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n = 123;
		int i, j=0;
		int a =n;
		while (a>0) {
			i= a%10;
			j = (j*10)+i;
			a=a/10;
		}
		if (n==j) {
			System.out.println("Entered number is a palindrome number");
		}else {
			System.out.println("Entered number is not a palindrome number");
		}

	}

}
