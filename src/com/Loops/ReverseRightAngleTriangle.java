package com.Loops;

import java.util.Iterator;

public class ReverseRightAngleTriangle {
	public static void main(String[] args) {
		for (int i = 3; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
