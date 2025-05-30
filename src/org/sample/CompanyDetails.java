package org.sample;
import org.demo.*;
public class CompanyDetails extends CourseDetails{
private void companyName() {
System.out.println("Company name is ABCD");
}	
public static void main(String[] args) {
	CompanyDetails d = new CompanyDetails();
	d.companyName();
	d.javaClass();
	d.seleniumClass();
}
	}

