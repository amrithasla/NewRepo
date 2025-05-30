package org.demo;
import java.util.Scanner;
public class Scanner_Class {                      //User defined class
public static void main(String[] args) {
	
	Scanner a = new Scanner(System.in);        //Scanner is a predefined class
	
	System.out.println("Enter the id: ");
	int nextInt = a.nextInt();  //ctrl+2 and press L  // datatype variable = value eg: int age = 10;
	System.out.println(nextInt);
	
	System.out.println("Enter the phone number:");
	long nextLong = a.nextLong();
	System.out.println(nextLong);
	
	System.out.println("Enter the average:");
	float nextFloat = a.nextFloat();
	System.out.println(nextFloat);
	
	System.out.println("Enter the lattitude:");
	double nextDouble = a.nextDouble();
	System.out.println(nextDouble);
	
	System.out.println("Enter the character:");
	char charAt = a.next().charAt(5);   // 5 represents which char or letter should show as o/p. In the word Amritha, 5th letter is "h"
	System.out.println(charAt);
	
	System.out.println("Enter the result:");
	boolean nextBoolean = a.nextBoolean();
	System.out.println(nextBoolean);
	
	System.out.println("Enter the name:");
	String nextLine = a.nextLine();
	System.out.println(nextLine);
	
	
}
}
