package org.sample;

public class ArrayClass {
	
	public static void main(String[] args) {
		
		int c[] = new int[5];
		
		c[0] = 10;
		c[1] = 20;
		c[2] = 30;
		c[3] = 40;
		c[4] = 50;
		
		System.out.println(c[3]);
		
		System.out.println("\n Print All Numbers");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			
		}
		
		System.out.println("\nEnhanced For Loop");
		int d[] = {12,13,14,15,16,17};
		
		for (int x : d){
System.out.println(x);
		}
		String s = "Java Programming Language 123";
		System.out.println("" +s);
		String[] split = s.split("a");
for(String y : split) {
System.out.println(y);

}
	}

}
