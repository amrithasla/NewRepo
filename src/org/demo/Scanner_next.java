package org.demo;
import java.util.Scanner;
public class Scanner_next {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);    
	System.out.println("Enter the name:");
	String nextLine = a.nextLine();
	System.out.println(nextLine);
	
	System.out.println("Enter the city");
	String next = a.next();
	System.out.println(next);
	}

}
