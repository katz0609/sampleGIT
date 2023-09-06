package com.javapractice;

public class Employee_Details {
	
	public void EmployeeName() {
  
		String s = "Raj";
		System.out.println(s);
		
	}

	public void EmployeeId() {
		// TODO Auto-generated method stub

		int i = 2442;
		System.out.println(i);
	}
	
	public void EmployeeAge() {
		
		int a = 21;
		System.out.println(a);

	}
	
	public void EmployeeSalary() {
		
		float f = 99989.45f;
		System.out.println(f);
		

	}
	
	public static void main(String[] args) {
		
		Employee_Details emp = new Employee_Details();
		
		emp.EmployeeName();
		emp.EmployeeId();
		emp.EmployeeAge();
		emp.EmployeeSalary();
		
		
	}
}
