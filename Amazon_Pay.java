package com.javapractice;

public class Amazon_Pay {
	
	public void transaction(int amount) {
		
		System.out.println(amount);

	}
	
	public static void main(String[] args) {
		
		Amazon_Pay a = new Amazon_Pay();
		
		a.transaction(10000);
	}

}
