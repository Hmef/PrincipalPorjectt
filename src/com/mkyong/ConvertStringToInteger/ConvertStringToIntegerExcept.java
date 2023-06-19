package com.mkyong.ConvertStringToInteger;

public class ConvertStringToIntegerExcept {
	
	
	public static void main(String[] args) {

        String number = "D99"; //For unparsable String
        try {
            Integer result = Integer.valueOf(number);
            System.out.println(result);
        } catch (NumberFormatException e) {
            //do something for the exception.
            System.err.println("Invalid number format : " + number);
        }

    }


}
