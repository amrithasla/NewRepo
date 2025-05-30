package org.demo;

public class Polymorphism_Class {
private void employee() {
	System.out.println("Employee Details");
}
private void employee(int id) {
	System.out.println("EMployee id: " +id);
	
}
private void employee(String name) {
	System.out.println("Employee Name: " +name);
}
private void employee(String name, char gender, String email) {
	System.out.println("Employee Email id: " +email);
	
}
private void employee(long phno, boolean result) {
	System.out.println("Employee phone number: " +phno);
	}
private void employee(boolean result, long phno) {
	System.out.println("All the above information are " +result);
	}
public static void main(String[] args) {
	Polymorphism_Class a = new Polymorphism_Class();
	a.employee();
	a.employee(18);
	a.employee("abc");
	a.employee(true, 786485686);

}
}

