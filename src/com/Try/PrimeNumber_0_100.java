package com.Try;

public class PrimeNumber_0_100 {

	public static void main(String[] args) {
		int p;
		for (int i = 2; i < 100000000; i++) {
			p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					p++;
				}
				}
			if (p== 0) {
				System.out.println(i);

			}

		}

	}
}