package com.capg.loops;

import java.util.Scanner;

public class RangePrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Starting Number : ");
		int n = input.nextInt();
		if (n<=0) {
			System.out.println("Invalid Number");
			System.exit(0);
		}
		System.out.println("Enter The Starting Number : ");
		int n1 = input.nextInt();
		if (n1<=0) {
			System.out.println("Invalid Number");
			System.exit(0);
		}
		for (int i = n; i <= n1; i++) {
            if (i == 1 || i == 0)
                continue;
            int temp = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    temp  = 0;
                    break;
                }
            }
            if (temp == 1)
                System.out.println(i);
        }
	}

}


