package com.gretb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

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
		
		date=LocalDate.of(2019, 12, 25);
		System.out.println(date);
		
		//The of() method is overloaded and can use an enum value:
		date=LocalDate.of(2019, Month.FEBRUARY, 15);
		System.out.println(date);
		
		time=LocalTime.of(23, 56, 53);
		System.out.println(time);
		
		//this dateTime consists of an existing date and an existing time:
		localDateTime=LocalDateTime.of(date, time);
		System.out.println(localDateTime);

		//Only 28 days in feb, so this gives a DateTime exception:
		
		try {
			date=LocalDate.of(2019, 2, 29);
			System.out.println(date);
		}catch(Exception e) {
			//e.printStackTrace();
		}
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++
		
		//date is now going to be today's date:
		date=LocalDate.now();
		
		LocalDate newDate = date.plusDays(169); //adding 169 days to now
		System.out.println(newDate);
		
		//time is now going to be today's time:
		time = LocalTime.now();
		LocalTime newTime = time.minusHours(6); //minus 6 hours from current time
		System.out.println(newTime);
		
		//You can chain methods of time/date/dateTime:
		date=date.plusDays(4).plusWeeks(5).plusMonths(2);
		System.out.println(date);
		
	}

}
