package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1{
	public static void main(String[] args) {
		List<String> ex = new ArrayList<String>();
		ex.add("hjsdhk");
		ex.add("20");
		ex.add("30");
		List<Integer> ex1 = new ArrayList<Integer>();
		ex1.add(20);
		ex1.add(50);
		ex1.add(60);
		System.out.println(ex);
		System.out.println(ex1);
		ex1.retainAll(ex);
		System.out.println(ex1);
		ex.add(1, "jsdjds");
		System.out.println(ex);
}
	
	
}
