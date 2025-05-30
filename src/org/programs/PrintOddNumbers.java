package org.programs;

import java.util.Scanner;

public class PrintOddNumbers {
public static void main(String[] args) {
//	for (int i = 0; i < 10; i++) {
//		if (i % 2 != 0) {
//			System.out.println(i);
//		}
//	}
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number: ");
int num = s.nextInt();
 for (int i = 0; i < num; i++) {
	if (i%2 !=0) {
		System.out.println(i);
	}
}

}
}
