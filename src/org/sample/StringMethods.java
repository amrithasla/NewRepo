package org.sample;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "Java Programming Language";
		
		int length = s1.length();
		System.out.println("Length: " +length);
	
	System.out.println("Index: " +(s1.length() - 1));
	
	char charAt = s1.charAt(8);
		System.out.println(charAt);
		
		int indexOf = s1.indexOf("a");
		System.out.println(indexOf);
		
             int indexOf2 = s1.indexOf("g");
             System.out.println(indexOf2);
    
String upperCase = s1.toUpperCase();
System.out.println(upperCase);

String lowerCase = s1.toLowerCase();
System.out.println(lowerCase);

boolean empty = s1.isEmpty();
System.out.println(empty);

boolean startsWith = s1.startsWith("J");
System.out.println(startsWith);

boolean endsWith = s1.endsWith("ge");
System.out.println(endsWith);

boolean contains = s1.contains("amm");
System.out.println(contains);

String replace = s1.replace("Java", "Computer");
System.out.println(replace);

String substring = s1.substring(8);
System.out.println(substring);

String substring2 = s1.substring(5, 11);
System.out.println(substring2);

String s2 = "  J  A  V  A  ";
System.out.println(s2);

String trim = s2.trim();
System.out.println(trim);

String s3 = "WELCOME";
String s4 = "WELcome";
String s5 = "WEL";

boolean equals = s3.equals(s4);
System.out.println(equals);

boolean equalsIgnoreCase = s3.equalsIgnoreCase(s4);
System.out.println(equalsIgnoreCase);
	
int compareTo = s3.compareTo(s4);
System.out.println(compareTo);

int compareTo2 = s3.compareTo(s5);
System.out.println(compareTo2);
	}
}
