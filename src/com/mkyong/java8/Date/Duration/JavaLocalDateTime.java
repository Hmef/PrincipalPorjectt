package com.mkyong.java8.Date.Duration;


import java.time.Duration;
import java.time.LocalDateTime;

public class JavaLocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime from = LocalDateTime.of(2020, 10, 4, 10, 20, 55);
		LocalDateTime to = LocalDateTime.of(2020, 10, 10, 10, 21, 1);
		
		Duration duration = Duration.between(from, to);
		
		System.out.println(" duration between from & to : " + duration.getSeconds()+ " seconds ");
		// System.out.println(" duration between from & to : " + duration.getNano() + " nanos "); // 0, nano non définit dans from et to 
		
		System.out.println(" duration between from & to : " + duration.toDays() + " days ");
		System.out.println(" duration between from & to : " + duration.toHours() + " hours ");
		System.out.println(" duration between from & to : " + duration.toMinutes() + " minutes ");
		
		
	}
}
