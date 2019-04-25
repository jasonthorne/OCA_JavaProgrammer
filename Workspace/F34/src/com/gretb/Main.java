package com.gretb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Animal andy=new Animal();
		Animal angela=new Animal();
		
		/*
		 * three different types of Dates
		 * first is just the date
		 * which is called in java LocalDate data type
		 * by default its in American format
		 * 2019-04-25
		 */
		LocalDate date;
		/*
		 * time is LocalTime and it gives the time in 24hr format
		 * 12:12:34:23
		 */
		LocalTime time;
		/*
		 * combination of date and time is the LocalDateTime data type
		 * YYYY-MM-DD 12:12:12:23
		 */
		LocalDateTime dateTime;
		/*
		 * you can't create a date or time or dateTime directly, you can't
		 * go 
		 */
		//LocalDate myDate=new LocalDate();//this will not compile
		/*
		 * you have to use static methods to create times
		 */
		/*
		 * each of the above three classes has a static method called now()
		 * which for the LocalDate class will get todays date
		 * for the LocalTime class will get the current time
		 * for the LocalDateTime class will the currnet dateTime
		 * the format of date is YYYY-MM-DD
		 */
		LocalDate myDate=LocalDate.now();//todays date
		LocalTime myTime=LocalTime.now();//the current time
		LocalDateTime myDateTime=LocalDateTime.now();//current date and time
		
		System.out.println("date is "+myDate);
		System.out.println("time is "+myTime);
		System.out.println("date time is "+myDateTime);
		/*
		 * one of the other methods we use to create a time is the
		 * of() method
		 */
		date=LocalDate.of(2019, 12, 25);
		System.out.println("christmas is "+date);
		/*
		 * the of() method is overloaded and can use a enum value
		 */
		date=LocalDate.of(2019, Month.FEBRUARY, 14);
		System.out.println("valentines Day is "+date);
		
		time=LocalTime.of(23, 56, 53);
		System.out.println("time is "+time);
		/*
		 * this dateTime consists of an existing date and an existing
		 * time
		 */
		myDateTime=LocalDateTime.of(date, time);
		System.out.println("date time is "+myDateTime);
		//this is a date time with year, month, date, hour, minute
		myDateTime=LocalDateTime.of(2019, 5, 4, 12, 45);
		/*
		 * this will generate a DateTimeException, as java knows the 
		 * amount of days in each month in any given year
		 * if we attempt to assign a illegal date to a time/date/datetime
		 * we will get a DateTimeException
		 */
		try {
			date=LocalDate.of(2019, 2, 32);
		}
		catch(Exception e)
		{
			System.out.println("the exception is "+e);
		}
		/*
		 * date is now going to be todays date
		 */
		date=LocalDate.now();
		LocalDate newDate=date.plusDays(120);
		System.out.println("120 days from now is "+newDate);
		
		time=LocalTime.now();
		LocalTime newTime=time.minusHours(6);
		System.out.println("six hours ago is "+newTime);
		/*
		 * you can chain methods of the time/date/dateTime
		 */
		date=date.plusDays(4).plusWeeks(5).plusMonths(2);
		System.out.println("this date is "+date);
		
		

	}

}
