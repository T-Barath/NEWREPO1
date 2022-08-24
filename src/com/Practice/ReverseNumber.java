package com.Practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 153;
		int i, j=0;
		int a =n;
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println(j);
	}

}
