package com.gretb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		
		
		//Showing initialisers:
		Animal andy = new Animal();
		Animal judy = new Animal();
		
		//Dates:
		//Three types in Java:
		
		//LocalDate (in American format by default):
		LocalDate date;
		
		//LocalTime (gives in 24 hour format):
		LocalTime time;
		
		//Combination of date and time (YYY--MM--DD ":12:12:23"):
		LocalDateTime localDateTime;
		
		//You cant create a date or time directly, eg you CANT go: LocalDate myDate = new LocalDate();
		//You have to use static methods to create times:
		
		LocalDate myDate = LocalDate.now(); //today's date
		LocalTime myTime=LocalTime.now(); //current time
		LocalDateTime myDateTime=LocalDateTime.now(); //todays time and date
		
		System.out.println("\nDate is: " + myDate);
		System.out.println("Time is: " + myTime);
		System.out.println("LocalDateTime is: " + myDateTime);

	}

}
