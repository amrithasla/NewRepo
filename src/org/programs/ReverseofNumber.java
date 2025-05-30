package org.programs;

public class ReverseofNumber {
	public static void main(String[] args) {
		int num = 7865;
		int rev = 0;
		int rem = 0;
		
		while (num>0) {
			//fetch the last digit - %
			rem = num%10;
			//store the last digit and multiple 
			rev = (rev * 10) + rem;
			num = num/10;
		}
		System.out.println(rev);
	}
	
}
