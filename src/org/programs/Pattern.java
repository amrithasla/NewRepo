package org.programs;

public class Pattern {
public static void main(String[] args) {
	for (int i = 0; i <=3; i++) {
		for (int j = 6; j >=i; j--) {
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	System.out.println("=======");
	for (int i = 0; i <=3; i++) {
		for (int j = 0; j <=i; j++) {
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	
	}
}

