package org.demo;

public class EmployeeDetails extends CourseDetails {
	public void employeeID() {
		System.out.println("Employee ID is 10");

	}

	public void employeeName() {
		System.out.println("Employee name is Ria");
	}
public static void main(String[] args) {
	EmployeeDetails cd = new EmployeeDetails();
	cd.employeeID();
	cd.employeeName();
	cd.javaClass();
	cd.seleniumClass();
}
	
}
