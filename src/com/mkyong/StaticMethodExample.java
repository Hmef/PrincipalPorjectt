package com.mkyong;

public class StaticMethodExample {
	
	

	private int x = 0;
	private static int y = 0;

	
	
	public static void main(String[] args) {
		// If uncommented, x++ gives compilation error
		// x++;

		// y++ works fine without compilation error
		y++;

		// If uncommented, sayHello() gives compilation error
		// sayHello();

		// sayHi() works fine without compilation error
		sayHi();
		System.out.println("Value of y is: " + y);
	}

	public void sayHello() {
		System.out.println("Hello");
	}

	public static void sayHi() {
		System.out.println("Hi");
	}

}
