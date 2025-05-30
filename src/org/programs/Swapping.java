package org.programs;

import java.util.Scanner;

public class Swapping {
public static void main(String[] args) {
	//Using 3rd variable
//	int a = 10;
//	int b = 12;
//	int c;
//	System.out.println("Before Swapping, a = " +a);
//	System.out.println("Before Swapping, b = " +b);
//	
//	c = a; // c = 10
//	a = b;  // a = 12
//	b = c;
//	
//			System.out.println("After swapping, a = " +a);
//	System.out.println("After Swapping, b = " +b);
	
	//Without using 3rd variable
	
//	int a = 15;
//	int b = 10;
//	
//	System.out.println("Before Swapping, a = " +a);
//	
//	System.out.println("Before Swapping, b = " +b);
//	
//	a = a + b; // 25
//	b = a - b; // 25 - 10 = 15
//	a = a - b; // 25 - 15 = 10
//	
//	System.out.println("After Swapping, a = " +a);
//	System.out.println("After Swapping, b = " +b);
	
	//Using Scanner
	
	Scanner s = new Scanner(System.in);
	System.out.println("Before Swapping, a =");
	int a = s.nextInt();
	
	System.out.println("Before Swapping, b = ");
	int b = s.nextInt();
	
	a = a + b; 
	b = a - b; 
	a = a - b;
	
	System.out.println("After Swapping, a = " +a);
	System.out.println("After Swapping, b = " +b);
}
}
