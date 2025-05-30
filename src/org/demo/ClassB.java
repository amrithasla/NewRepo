package org.demo;

public class ClassB extends ClassA {
	public static void main(String[] args) {
	
		//with object
		
		ClassA a = new ClassA();
		//Private Acess modifier method cannot be called
		a.method2();  
		a.method3();
		a.method4();
		
		//without object - using extends
	
		ClassB b = new ClassB();
		//Private Acess modifier method cannot be called
		b.method2();
		b.method3();
		b.method4();
	}

}
