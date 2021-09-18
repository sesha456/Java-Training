package com.capg.Datatype;

public class Test {
// global variable	
	// global variable can be uninitialized
	byte i;
	
	int h = 'e';
	
	char k = 99;
	
	public void focus() {
		
		// local variable
		// local variable must be initialized
		byte j = 21;
		System.out.println("i value : "+i);
		System.out.println("j value : "+j);
		System.out.println("h value : "+h);
		System.out.println("K value : "+k);
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		t.focus();
		System.out.println("Welcome to Java");

	}

}
