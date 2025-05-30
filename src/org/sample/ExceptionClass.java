package org.sample;

import java.util.Scanner;

public class ExceptionClass {

	public static void main(String[] args) {
		//NullPointerException
//		String s = null;
//		char charAt = s.charAt(2);
//		System.out.println(charAt);
		
		//Arithmetic Exception
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4/0);
//		System.out.println(5);
		
		
	//StringIndexOutofBoundsException
		
	String a = "ViratKholi";
	System.out.println(a.charAt(5));
	try {
		
	System.out.println(a.charAt(3));

	try {
		Scanner c = new Scanner (System.in);
		System.out.println("Enter Number");
		int nextInt = c.nextInt();
		System.out.println(nextInt);
	}
	catch (Exception e)
	{
		System.out.println("Enter number alone");
	}
	finally {
		System.out.println("Inner Finally");
	}
	}
	catch (StringIndexOutOfBoundsException e) {
System.out.println("Index should be with in 13");
}
	finally {
		System.out.println("Outer Final block");
	}
	
	System.out.println(a.charAt(3));
	
	//InputMismatch Exception
	
//	Scanner s = new Scanner(System.in);
//	
//	System.out.println("InputMismatch");
//	int nextInt = s.nextInt();
//	System.out.println(nextInt);
		
		//IndexOutofBoundException
		
		
	
	
	}
}
