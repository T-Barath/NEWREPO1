package com.Try;

public class MethodOverloading {
	
	private static void student(int id) {
	System.out.println(id);

	}
	public static void student(String name) {
	System.out.println(name);
	}
	
	public static void main(String[] args) {
		MethodOverloading.student(4554);
		MethodOverloading.student("Barath");
	}
		
	
	
	

}
