package org.sample;

public class Constructor {
	
	public Constructor() {
		System.out.println("Parent Non-Parameterized");		//4
}
	
	public Constructor(int id) {
		this();
		System.out.println("Parent Int Parameterized");		//3
	}
	
	public Constructor(String name) {
		this(7862562098l);
		System.out.println("Parent String Prameterized");		//1	(from object to string)
	}
	
	public Constructor(Long phno) {
		this(67);
		System.out.println("Parent Long Prameterized");		//2
	}
public static void main(String[] args) {
	Constructor a = new Constructor("Hi");				//Execution -> 4-3-2-1 
}
}
