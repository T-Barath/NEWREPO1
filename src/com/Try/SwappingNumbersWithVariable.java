package com.Try;

import java.util.Scanner;

public class SwappingNumbersWithVariable {
	public static void main(String[] args) {
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		c=a;
		a=b;
		b=c;
//		int c = sc.nextInt();
//		d=a;
//		a=b;
//		b=c;
//		c=d;
		System.out.println("Swapped numbers are:");
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
	}
}
