package com.capg.Examples;

public class Example1 {

	public static void main(String[] args) {
		
		String s = "Welcome to my Java Training monday myu  ";
		
		System.out.println(s);
		System.out.println(s.charAt(8));
		System.out.println(s.contains("z"));
		System.out.println(s.contains("Java"));
		System.out.println(s.length());
		System.out.println(s.indexOf('J'));// finds the first occurence of the letter J
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		System.out.println(s.replace('m', 'o'));
		System.out.println(s.replaceAll("my", "mine"));
		System.out.println(s.indexOf("m",6));
		
		
		

	}

}
