 package com.javapractice;

public class Over_Loading {

	public void game(String name) {
		
		System.out.println(name);
		
	}
	
	public void game(String name , int id) {
		System.out.println("winner Name is:"+name+" & "+"runner Name is:"+id);
	}
	
	public void game(int id ,String name) {
		
		System.out.println(id + name);
	
	}
	
	public void game(float weightp1 ,String VS ,float weightp2) {
		System.out.println(weightp1+"  " +"VS"+"  "+weightp2);

		
	}
	
	public static void main(String[] args) {
		
		Over_Loading o = new Over_Loading();

		o.game("JOSSY");
		o.game(875454, "KATZ");
		o.game("rossy", 316477);
		o.game(75.45f, "VS", 65.47f);
		
		
		
		
	}
}
