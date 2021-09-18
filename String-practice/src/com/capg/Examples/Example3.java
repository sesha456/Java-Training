package com.capg.Examples;

public class Example3 {

	public static void main(String[] args) {
		String s = new String("abc");
		int i;
		
		for (i = 0; i < 1000; i++) {
			s = s.concat("def");
		}
		
		System.out.println(s);

	}

}
