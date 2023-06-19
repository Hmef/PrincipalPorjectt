package com.mkyong.time.convertLocalDateTimeToDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeExample {

	private static final String DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
	private static final DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
	private static final DateTimeFormatter dateFormat8 = DateTimeFormatter.ofPattern(DATE_FORMAT); // formatter for localDateTime
	
	public static void main(String[] args) {

		System.out.println("  ");
		System.out.println("        =================   CurrentDate  =================        ");
		System.out.println("  ");
		Date currentDate = new Date(); 
		
		System.out.println(" current Date ==> " + currentDate);
		System.out.println(" current date Using date format ==> " + dateFormat.format(currentDate));
		
		//currentDate.getDay(); // getDay() is deprecated
		
		System.out.println("  ");
		System.out.println("        =================   LocalDateTime  =================        ");
		
		System.out.println("  ");
		LocalDateTime localDateTime = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		
		System.out.println(" localDateTime Without DateTimeFormatter ==> " + localDateTime);
		
		System.out.println(" localDateTime Using DateTimeFormatter ==> " + dateFormat8.format(localDateTime));
	}
}
