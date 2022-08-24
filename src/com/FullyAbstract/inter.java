package com.FullyAbstract;

public class inter implements StudentInfo {

	@Override
	public void name() {
		System.out.println("name");
		
	}

	@Override
	public void id() {
		System.out.println("id");
		
	}

	@Override
	public void age() {
		System.out.println("age");
		
	}
	public static void main(String[] args) {
		inter i = new inter();
		i.name();
		i.id();
		i.age();
		
	}
	

}
