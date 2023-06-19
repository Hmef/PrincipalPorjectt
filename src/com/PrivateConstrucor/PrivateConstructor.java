package com.PrivateConstrucor;

public class PrivateConstructor {

	
//	public PrivateConstructor() {
//		
//		System.out.println(" public Contructor ");
//	}
	
	private PrivateConstructor() {
		
		System.out.println(" private Constructor !! ");
	}
	
	public static void main(String[] args) {
		
		PrivateConstructor privateConstructor = new PrivateConstructor();
	}
}
