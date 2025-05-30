package org.sample;

public class ContructorChild extends Constructor {

	public ContructorChild() {
this(10);
		System.out.println("Non-Parameterized");
	}
	
	public ContructorChild(int id) {
super("Hi");
		System.out.println("Int Parameterized");
	}
	
	public static void main(String[] args) {
		ContructorChild a = new ContructorChild();
	}
}
