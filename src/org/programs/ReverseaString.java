package org.programs;

public class ReverseaString {
public static void main(String[] args) {
	String s = "MALAYALAM";
	String rev = "";
	System.out.println("Given String:" +s);
	for (int i = s.length()-1; i >=0 ; i--) {
		char ch = s.charAt(i);
		rev = rev + ch;
	}
	System.out.println("After Reverse: " +rev);
	
	if (s.equals(rev)) {
		System.out.println("Palindrome");
	} else {
		System.out.println("Not a Palindrome");

	}
}
}
