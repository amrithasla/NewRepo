package org.programs;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		
		//Without Scanner
		
//		for (int i = 0; i <= 10; i++) {
//			
//			if (i%2==0) {
//				
//				System.out.println(i);
//			}
		
		//With Scanner
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = s.nextInt();
		for (int i = 0; i <= num; i++) {
			
			if (i%2==0) {
				
				System.out.println(i);
			}
			
	}
	}
}
