package org.sample;

public class StringTypes {
	public static void main(String[] args) {
		System.out.println("Literal String");
		
		String s1 = "Chennai";
		String s2 = "Coimbatore";
		String s3 = "Chennai";
		
		System.out.println("S1 memory Address: " +System.identityHashCode(s1));
		System.out.println("s2 memory Address: " +System.identityHashCode(s2));
		System.out.println("S3 Memory Address: " +System.identityHashCode(s3));
	
	System.out.println("\nNon-Literal String");
	String s4 = new String ("Chennai");
	String s5 = new String ("Coimbatore");
	String s6= new String ("Chennai");
	
	System.out.println("s4 Memory Address: " +System.identityHashCode(s4) );
	System.out.println("s5 Memory Address: " +System.identityHashCode(s5));
	System.out.println("s6 Memory Address: " +System.identityHashCode(s6));
	
	System.out.println("\nImmutable String");
	String concat = s1.concat(s2);
	System.out.println(concat);
	System.out.println("Memory Address :" +System.identityHashCode(concat));
	String s7 = "Banglore";
	String concat2 = s1.concat(s7);
	System.out.println(concat2);
	System.out.println("Memory Address: " +concat2);
	
	System.out.println("\nMutable");
	StringBuffer s8 =  new StringBuffer ("Chennai");
	StringBuffer s9 = new StringBuffer ("Coimbatore");
	StringBuffer s10 = new StringBuffer ("Banglore");
	
	System.out.println("S8 memory Address: " +System.identityHashCode(s8));
	System.out.println("s9 memory Address: " +System.identityHashCode(s9));
	System.out.println("S10 Memory Address: " +System.identityHashCode(s10));
	
	StringBuffer append = s8.append(s9);
	System.out.println(append);
	System.out.println(System.identityHashCode(append));
	StringBuffer append2 = s8.append(s10);
	System.out.println(append2);
	System.out.println(System.identityHashCode(append2));

	}

}
