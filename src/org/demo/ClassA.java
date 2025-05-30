package org.demo;

public class ClassA {
private void method1() {
System.out.println("method-1");
}
public void method2() {
System.out.println("method-2");
}
protected void method3() {
System.out.println("method-3");
}
void method4() {           //default method
System.out.println("method-4");
}
public static void main(String[] args) {
	ClassA a = new ClassA();
	a.method1();
	a.method2();
	a.method3();
	a.method4();
}
}
