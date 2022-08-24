package com.Try;

public class SpecialCharacters {

	public static void main(String[] args) {
		String s = "Let's play the game @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@^&&^%$%(*&*&)(@ 2p.m?:";
		String s1 = s.replaceAll("[~!@#$%^&*()_/|\':><?/]", "");
		System.out.println(s1);

		int lc = 0;
		int uc = 0;
		int num = 0;
		int spcl = 0;
		
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				lc++;
			}else if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				uc++;
			}else if (s.charAt(i)>='1' && s.charAt(i)<='9') {
				num++;
			}else
				spcl++;
		}
		
		System.out.println(spcl);
		System.out.println(lc);
		System.out.println(uc);
		System.out.println(num);
	}

}
