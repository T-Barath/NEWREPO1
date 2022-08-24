package com.Try;

public class ReverseAString {
	public static void main(String[] args) {
		String s = "Welcome to the world";
		String reverseSentence="";
		String[] allWords = s.split(" ");
		for (String words : allWords) {
			String reverse ="";
			for (int i = words.length()-1; i >=0; i--) {
				char ch = words.charAt(i);
				reverse = reverse+ch;
			}
			reverseSentence=reverseSentence+reverse+" ";
			
		}
		System.out.println(reverseSentence);
		
		
	}

}
