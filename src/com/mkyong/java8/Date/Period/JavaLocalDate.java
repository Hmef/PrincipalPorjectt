package com.mkyong.java8.Date.Period;

import java.time.LocalDate;
import java.time.Period;

public class JavaLocalDate {

	public static void main(String[] args) {
		
		LocalDate from = LocalDate.of(2020, 5, 4);
		LocalDate to = LocalDate.of(2020, 10, 10);
		
		Period period =Period.between(from, to);
		
		System.out.println(" period between from & to : " + period.getYears() + " years ");
		System.out.println(" period between from & to : " + period.getMonths() + " months ");
		System.out.println(" period between from & to : " + period.getDays() + " days ");
	}
}
