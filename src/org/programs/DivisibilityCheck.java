package org.programs;

import java.util.Scanner;

public class DivisibilityCheck {
public static void main(String[] args) {
//	System.out.println(10+2);
//	System.out.println(10-2);
//	System.out.println(10*2);
//	System.out.println(10/2);
//	System.out.println(10%2);
	
	//divisibiltiy check - divisible by 12 or not
	
	//Without Scanner
	//int num = 1212;
	
	//With Scanner
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number: ");
	
	int num = s.nextInt();
	if (num%12 == 0) {
		System.out.println("divisible by 12");
	} else {
 System.out.println("not divisible by 12");
	}
	
}
}
