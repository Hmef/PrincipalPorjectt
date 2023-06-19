package com.mkyong;

public class Employee {

	static int count = 0;  // static, getter & setter 
	private String name;
	private int leaves;

	Employee() {
		count++;
	}

	Employee(String name, int leaves) {
		this.name = name;
		this.leaves = leaves;
		count++;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLeaves() {
		return leaves;
	}

	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}

}
