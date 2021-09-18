package com.capg.loops;

import java.util.Scanner;

public class Check_Alphabet {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Alphabet : ");
		Scanner input = new Scanner(System.in);
		char s = input.next().charAt(0);
		
		switch(s){
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.println("The character is a Small Vowel");
			break;
			
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			
			System.out.println("The character is Big Vowel");
			break;
			
			default:
				System.out.println("It is a Consonant");
				break;
			
		}
		
		input.close();
	}

}
