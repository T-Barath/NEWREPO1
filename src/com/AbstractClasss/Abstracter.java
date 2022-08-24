package com.AbstractClasss;

public class Abstracter extends Abstract11 {

	@Override
	public void student() {
		System.out.println("Student");
		
	}

	@Override
	public void studentName() {
		System.out.println("Name");
		
	}
	public static void main(String[] args) {
		Abstracter a = new Abstracter();
		a.student();
		a.studentName();
		a.StudentID();
	}

}
