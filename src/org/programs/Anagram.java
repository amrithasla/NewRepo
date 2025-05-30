package org.programs;

import java.util.Arrays;

public class Anagram {
	
public static void main(String[] args) {
	
	String s1 = "abcd";
	String s2 = "dcab";
	
	if (s1.length() == s2.length()) {
	char[] c1 = s1.toCharArray(); //a b c d
	char[] c2 = s2.toCharArray(); //d c a b
	
	Arrays.sort(c1); //a b c d
	Arrays.sort(c2); // a b c d
	
	if (Arrays.equals(c1, c2)) {
		System.out.println("Anagram");
	} else {
		System.out.println("Not an Anagram");
	}
	
	} else {
System.out.println("The length of s1 and s2 are not equal, so s1 and s2 are not anagram");
	}
}
}
