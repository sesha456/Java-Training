package com.capg.array;

public class ObjectStudent {

	public static void main(String[] args) {
		
		Student s1[] = new Student[3];
		
		s1[0] = new Student(1,"Sesha","CBE");
		s1[1] = new Student(2,"Ram","che");
		s1[2] = new Student(3,"Sunil","mum");
		
		for (int i = 0 ; i < s1.length; i++) {
			
			System.out.println("Roll Number of the Student "+(i+1)+" is "+s1[i].roll_no+" Name of the Student is "+s1[i].name+" Address of the Student is "+s1[i].address);
		}

	}

}
