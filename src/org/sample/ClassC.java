package org.sample;

import org.demo.ClassA;

public class ClassC extends ClassA {
public static void main(String[] args) {
	
	//With Object
	ClassA cd = new ClassA();
	
	//Private
	cd.method2();
	//Protected
	//Default
	
	//WIthout Object - using "EXTENDS"
	ClassC d = new ClassC();
	
	//Private
	d.method2();
	d.method3();
	//Default
}
}
