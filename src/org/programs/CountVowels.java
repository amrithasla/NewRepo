package org.programs;

public class CountVowels {
public static void main(String[] args) {
	String s = "Programming Language";
	String[] split = s.split(" ");    // Split the word "s"
	String s2 = split[1];  //extracting the 2nd word
	System.out.println(s2);
	
	int vcount = 0;  
	for (int i = 0; i < s2.length(); i++) {
		
		char ch = s2.charAt(i);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			vcount++;
			
		}
		
	}
	
	System.out.println("The count of vowels in " +s2+ " is " +vcount);
}
}
