package com.mkyong;

public class StaticVariableExample {
	
	

	public static void main(String[] args) {
		
		
		

		Employee e1 = new Employee("Employee1", 5);
		Employee e2 = new Employee("Employee2", 10);

		System.out.println("Employee Count using e1: " + e1.getCount());
		System.out.println("Employee Count using e2: " + e2.getCount());
		System.out.println("Employee Count using static reference: " + Employee.getCount());
		
		
		// the value of static variable “count” is shared across all the employee objects

	}

}
