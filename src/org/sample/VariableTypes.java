package org.sample;

public class VariableTypes {
	//Local Variable
private int a;
	private void add() {
 a = 10;
System.out.println(a);
	}
	private void sub() {
		int b = 100;
System.out.println(b);
	}
public static void main(String[] args) {
	int a = 59;
	VariableTypes c = new VariableTypes();
	System.out.println(c.a);
	c.add();
	System.out.println(c.a);
	c.sub();
	
}
}
