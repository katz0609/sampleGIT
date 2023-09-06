package com.javapractice;

public class Phonepe extends Amazon_Pay{
	
	@Override
	public void transaction(int amount) {
		
		System.out.println("Zooomaka zoo");
		super.transaction(amount);
	}

	public static void main(String[] args) {
		
		Phonepe p = new Phonepe();
		
		p.transaction(50000);
		
	}
}
