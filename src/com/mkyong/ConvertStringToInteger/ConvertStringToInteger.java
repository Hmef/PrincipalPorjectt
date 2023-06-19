package com.mkyong.ConvertStringToInteger;

public class ConvertStringToInteger {
	
	
	
	public static void main(String[] args) {

	      String number = "99";

	      // String to integer
	      Integer result = Integer.valueOf(number);

	      // 99
	      System.out.println(result);
	      
	      
	      Integer result2 = Integer.valueOf("1");
	      System.out.println(result2);
	      
	      Integer result3 = Integer.valueOf("1.1");  // Number Format Exception (. or any symbol is not allowed)
	      System.out.println(result3);
	      
	      
	      
	      //Integer.valueOf("1");      // ok
	      //Integer.valueOf("+1");     // ok, result = 1
	      //Integer.valueOf("-1");     // ok, result = -1
	      //Integer.valueOf("100");    // ok

	      //Integer.valueOf(" 1");     // NumberFormatException (contains space)
	      //Integer.valueOf("1 ");     // NumberFormatException (contains space)
	      //Integer.valueOf("2147483648"); // NumberFormatException (Integer max 2,147,483,647)
	      //Integer.valueOf("1.1");    // NumberFormatException (. or any symbol is not allowed)
	      //Integer.valueOf("1-1");    // NumberFormatException (- or any symbol is not allowed)
	      //Integer.valueOf("");       // NumberFormatException, empty
	      //Integer.valueOf(" ");      // NumberFormatException, (contains space)
	      //Integer.valueOf(null);     // NumberFormatException, null

	  }


}
