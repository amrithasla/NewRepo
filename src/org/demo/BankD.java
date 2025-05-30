package org.demo;

public class BankD implements BankDetails {

	@Override
	public void savings() {
System.out.println("Savings - 8%");		
	}

	@Override
	public void deposit() {
System.out.println("Deposit - 6%");		
	}
public static void main(String[] args) {
	BankD b = new BankD();
	b.savings();
	b.deposit();
	System.out.println(a);
}
}
