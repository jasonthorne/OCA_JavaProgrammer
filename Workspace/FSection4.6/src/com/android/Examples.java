package com.android;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.SynchronousQueue;

public class Examples {
	/*
	 * from java 8 onwards, there are three new time formats
	 * LocalDate is just the date
	 * LocalTime is just the time
	 * LocalDateTime is both the date and time
	 * previous versions of java has, and still has a
	 * Date data type, a Time data type, and a dateTime data time.
	 * the newer versions of dates are much easier to use
	 * the main difference between the old and new versions of
	 * time in java, is that in the older version you could
	 * create a time object (in other words you could use the new
	 * keyword when creating a date, a time, or a datetime).
	 * with the newer time formats, you can't directly create
	 * a time object, you call a static method to create a 
	 * localDate, LocalTime, LocalDateTime
	 */
	static void ex1() {
		/*
		 * this will not compile as we DO NOT have access to 
		 * any constructor of the Dog class, outside of the Dog
		 * class (the only constructor is private)
		 */
		//Dog spot=new Dog();
		/*
		 * we are accessing the static method createDog and this
		 * returns a new Dog object, which is assigned to rex
		 */
		Dog rex=Dog.createDog();
		/*
		 * LocalDate, LocalTime, LocalDateTime are the same as 
		 * the Dog class, in that all of they're constructors
		 * are private and you can only create each of them, through
		 * static methods of LocalDate, LocalTime and LocalDateTime
		 * You do need to create a member of a class to access a
		 * static method
		 */	
	}
	
	static void ex2() {
		System.out.println("LocalDate data type");
		/*
		 * dates in java 8 onwards are called LocalDate (dates on the
		 * machine you are currently working on)
		 * default format is YYYY-mm-dd
		 * time in java is called LocalTime, the default for which
		 * is 24 hour format and is hh:mm:ss.999
		 * LocalDateTime is a combination of both of the above.
		 * Java 8 introduced all of the above to deal with times
		 * and dates, you can still use Date, Time and DateTime
		 * data types but they are VERY AWKWARD TO use
		 */
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		/*
		 * you can't directly create a LocalDate or LocalTime object
		 * (can't use new). you create a date object by using
		 * static methods, one of which is the static method of()
		 */
		System.out.println("of() method");
		//LocalDate myDate=new LocalDate();//will not compile
		//date has to be entered into same format as it is printed
		LocalDate date1=LocalDate.of(2221, 5, 28);
		System.out.println("date1 is "+date1);
		System.out.println("now()");
		/*
		 * now is a static method that will get current date, time
		 * datetime
		 */
		LocalDate dateNow=LocalDate.now();//todays date
		System.out.println("today is "+dateNow);
		/*
		 * you can use the enum Month.January, etc for months,
		 * also LocalDate knows leap  years and illegal dates
		 * i.e you can't have the 32 of January.
		 * an illegal date generates DateTimeException
		 */
		LocalDate date2=LocalDate.of(2024, Month.FEBRUARY, 29
				);//leap year and will compile
		
		System.out.println("leap year date in 2024 is "+date2);
		
		System.out.println("Parsers for dates");
		/*
		 * for converting all time formats in a string to 
		 * LocalDate, LocalTime, LocalDateTime we use 
		 * parsers.
		 * parsers for dates again need to be in the format
		 * YYYY-mm-dd
		 */
		date2=LocalDate.parse("2018-08-02");
		System.out.println("date2 is now "+date2);
		System.out.println("gets() for LocalDate");
		/*
		 * LocalDate has various get methods, that allow you to
		 * get a month froma  date, a year from a date, day of
		 * week from a date, etc
		 */
		date2=LocalDate.now();
		System.out.println("month is "+date2.getMonth());
		System.out.println("day of week "+date2.getDayOfWeek());
		System.out.println("day of year "+date2.getDayOfYear());
		System.out.println("day of the month "+date2.getDayOfMonth());
		System.out.println("year is "+date2.getYear());
		System.out.println("month numeric value is "+date2.getMonthValue());
		
		System.out.println("isBefore() isAfter()");
		LocalDate xmas=LocalDate.of(2019, 12, 25);
		LocalDate paddys=LocalDate.of(2019, Month.MARCH, 17);
		/*
		 * to check if a date is after or before another date
		 * we use methods isBefore() and isAter().
		 * both return a boolean true/false
		 */
		System.out.println("xmas before paddys");
		System.out.println(xmas.isBefore(paddys));
		System.out.println("xmas after paddys");
		System.out.println(xmas.isAfter(paddys));
		System.out.println("is xmas same date as paddys");
		System.out.println(xmas.equals(paddys));
		System.out.println("plus and minus time periods");
		/*
		 * all minus and plus methods do not change the LocalDates
		 * as LocalDates are final like the string class
		 */
		xmas=xmas.minusDays(10);
		System.out.println(xmas);
		xmas=xmas.minusMonths(2);
		System.out.println(xmas);
		xmas=xmas.minusWeeks(17);
		System.out.println(xmas);
		xmas=xmas.minusYears(10);
		System.out.println(xmas);
		/*
		 * all LocalDates are final so any methods of the Date
		 * do NOT CHANGE the LocalDate
		 */
		date2=LocalDate.of(2018, Month.APRIL, 15);
		System.out.println("ten days on "+date2.plusDays(10));
		//dates is still 15 april 2018
		System.out.println("date2 is "+date2);
		
		date2=LocalDate.of(2000, 1, 1);
		System.out.println("millienium "+date2);
		System.out.println(date2.plusMonths(2).plusYears(3));
		/*
		 * the year 2000 is a leap year, so there is a 29 of 
		 * February, so 59 days onto the 01-01-200 is 29 of 
		 * february
		 */
		System.out.println(date2.plusDays(59));
		System.out.println("dates");
		date2=LocalDate.of(2000, 1, 1);
		/*
		 * date will be 28 feb 2001
		 */
		System.out.println(date2.plusDays(59).plusYears(1));
		date2=LocalDate.of(2000, 1, 1);
		/*
		 * date will be 01 march 2001
		 */
		System.out.println(date2.plusYears(1).plusDays(59));
		date2=LocalDate.of(2000, 1, 1);
		System.out.println(date2.plusDays(413));
		
		date2=LocalDate.of(2000, 1, 1);
		System.out.println(date2.plusWeeks(5).plusYears(2));
		
		date2=LocalDate.of(2019, 12, 26);
		System.out.println("with()");
		/*
		 * with() method, returns a copy of the date with 
		 * a replacement for the day, month or year
		 */
		System.out.println("original date "+date2);
		System.out.println("with dayOfMonth "+date2.withDayOfMonth(14));
		System.out.println("with Month "+date2.withMonth(5));
		System.out.println("with year "+date2.withYear(1979));
		System.out.println("withDayOfYear "+date2.withDayOfYear(100));
		
		LocalDateTime ldTime=LocalDateTime.now();
		System.out.println(ldTime);
		System.out.println("atTime()");
		/*
		 * atTime, this is for converting a LocalDate to a 
		 * LocalDateTime
		 */
		date2=LocalDate.of(2019, 12, 26);
		System.out.println(date2.atTime(16,30));
		System.out.println(date2.atTime(17, 30,30));
		LocalDateTime localDt=date2.atTime(20, 17, 54,567999999);
		System.out.println(localDt);
		System.out.println("local date time wiht current time");
		System.out.println(date2.atTime(LocalTime.now()));
		System.out.println(date2.atTime(LocalTime.now().plusHours(4)));
		System.out.println(date2.atStartOfDay());
		
		System.out.println("Epoch()");
		/*
		 * 01-01-1970 is date 0 for computers, so all dates and times
		 * are calculated from this point
		 */
		System.out.println(LocalDate.now().toEpochDay());
		
		LocalDate preEpoc=LocalDate.of(1959, 10, 15);
		System.out.println(preEpoc);
		System.out.println(preEpoc.plusMonths(5).plusWeeks(4));
		/*
		 * this gives a minus number of -3731, this is the amount
		 * of days before we get to date 0 of the 01-01-1970
		 * toEpochDay() returns an int, NOT A DATE
		 */
		System.out.println(preEpoc.toEpochDay());//this is a number
		/*
		 * so we can add and subtract numbers from this and we
		 * can't use any methods of time (plusDays, minusHours, etc)
		 */
		System.out.println(preEpoc.toEpochDay()+10);
		
		//System.out.println(date2.toEpochDay());
		
		System.out.println("max date");
		System.out.println(LocalDate.MAX);
		System.out.println("min date");
		System.out.println(LocalDate.MIN);
		/*
		 * AD which is what we use for dates (Annio Domino)
		 * is after the date in the christian calendar
		 * 00-00-00 is CE
		 * BC which is before christ is
		 * BCE
		 */
		System.out.println(LocalDate.now().getEra());
		System.out.println(LocalDate.now().minusYears(3000).getEra());
		System.out.println(LocalDate.now().minusYears(1500).getEra());
		}//ex of ex2
	
	static void ex3() {
		System.out.println("LocalTime");
		/*
		 * time from java 8 onwards, uses the class LocalTime
		 * LocalTime stores in the format 
		 * hours-minutes-seconds-nanoseconds (without timezone)
		 * like LocalDate, LocalTime is immutable and cannot
		 * change.
		 * Created in a similar way to LocalDate in that we use
		 * static methods to create a LocalTime and is displayed
		 * as a 24 hour clock by default
		 */
		LocalTime time1=LocalTime.of(13, 54);//hours, minutes
		System.out.println(time1);
		time1=LocalTime.of(11, 15,45);//hours, minutes, seconds
		System.out.println(time1);
		time1=LocalTime.of(14, 55,32,778);//hours, minutes, seconds, nanoseconds
		System.out.println(time1);
		/*there is no am and pm in localtime, but you can display
		 * it but you have to use a time formatter
		 */
		/*
		 * if you enter in illegal values in a time, hours
		 * greater than 23, or less than 0
		 * minutes greater than 59 or less than 0
		 * seconds greater thand 59 or less than 0
		 * nanos get to 9 decimal places
		 * this generates a DateTimeException
		 */
	//	time1=LocalTime.of(15, 61);
		/*
		 * LocalTime just like LocalDate also has parsers
		 * so it can take a String time and convert it to a
		 * LocalTime value
		 * has to be in correct format
		 */
		time1=LocalTime.parse("16:06");
		time1=LocalTime.parse("04:06");
		/*
		 * this gives a different exception this gives a
		 * DateTimeParseException
		 * which means the text is in the wrong format to be 
		 * converted to a time
		 * it has to be "04:05" NOT "4:05"
		 */
		//time1=LocalTime.parse("4:05");
		System.out.println("parse time is "+time1);
		//gets current time
		System.out.println("current time"+LocalTime.now());
		System.out.println(LocalTime.NOON);//12 midday
		System.out.println(LocalTime.MIDNIGHT);//midnight
		System.out.println(LocalTime.MIN);//midnight
		System.out.println(LocalTime.MAX);//last nanosecond of today
		
		time1=LocalTime.now();
		System.out.println("hour of now is "+time1.getHour());
		System.out.println("minute of now is "+time1.getMinute());
		System.out.println("second of now is "+time1.getSecond());
		System.out.println("nano of now is "+time1.getNano());
		System.out.println("plutimes times");
		System.out.println(time1.plusHours(4));//will add four hours
		System.out.println(time1.plusMinutes(99));//will add 99 minutes
		/*
		 * will add 2 hours, 25 minutes and 56 seconds
		 */
		System.out.println(time1.plusHours(2).plusMinutes(25).plusSeconds(56));
		System.out.println("minus times");
		System.out.println(time1.minusHours(5).minusMinutes(45));
		
		LocalTime rightNow=LocalTime.now();
		//this is the same time as now
		System.out.println(rightNow.plusHours(24));//current time
		System.out.println(rightNow);//current time
		LocalTime midDay=LocalTime.NOON;
		
		System.out.println("is current time before Noon");
		System.out.println(rightNow.isBefore(midDay));
		System.out.println("is current time after Noon");
		System.out.println(rightNow.isAfter(midDay));
		//this is the time you should clock in by
		LocalTime startTime=LocalTime.of(8, 30);
		//this is the time timmy clocks in
		LocalTime timmyTime=LocalTime.of(8, 30);
		/*
		 * if timmy arrives after 8:30 this will print out
		 * you are late
		 * if he arrives on time or before it will print out
		 * "you are on time"
		 */
		if(timmyTime.isAfter(startTime)) {
			System.out.println("you are late");
		}
		else
			System.out.println("you are on time");
		/*
		 * it timmy arrives before 8:30 OR
		 * timmy arrives exactly at 8:30
		 * the print out
		 * "timmy is on time"
		 * otherwise print out
		 * "timmy is late"
		 */
		if(timmyTime.isBefore(startTime)||timmyTime.equals(startTime)) {
			System.out.println("timmy is on time");
		}
		else
			System.out.println("timmy is late");
		//this is the world record for the mile
		/*
		 * this is 3 minutes and 43 seconds after midnight
		 */
		LocalTime worldRecord=LocalTime.of(0, 3,43);
		System.out.println(worldRecord);
		/*
		 * this is 3 minutes and 41 seconds after midnight
		 */
		LocalTime runner=LocalTime.of(0, 3,41);
		if(runner.isBefore(worldRecord)){
			System.out.println("world Record");
		}
		else
			System.out.println("tough luck");
		
		System.out.println("With");
		System.out.println("time now is "+rightNow);
		System.out.println(rightNow.withHour(19));
		System.out.println(rightNow.withMinute(20));
		
		//Duration duration=Duration.between(LocalTime.now(), LocalTime.now().plusHours(4));
			
	}
	
	static void ex4() {
		System.out.println("LocalDateTime");
		/*
		 * combination of LocalDate and LocalTime
		 */
		LocalDateTime dateTime1=LocalDateTime.of
				/*
				 * year 2212
				 * month april
				 * day 20
				 * hour 23
				 * minute 15
				 * second 50
				 * nano second 675
				 */
				(2212,Month.APRIL,20,23,15,50,675);
		LocalDateTime rightNow=LocalDateTime.now();
		System.out.println(rightNow);
		//todays date
		LocalDate today=LocalDate.now();
		//current time
		LocalTime now=LocalTime.now();
		/*
		 * combination of Date and Time gives us a 
		 * DateTime
		 */
		rightNow=LocalDateTime.of(today, now);
		/*
		 * all methods of the LocalDate class are available to this
		 * all methods of the LocalTime class are availabel to this
		 */
	
	}//end of ex4
	
	static void ex5() {
		/*
		 * to measure a length of time for dates, you have
		 * what are called periods
		 * for times you have what is called Durations
		 * you can have a period of days, weeks, months, years,
		 * epoch, era or combination of them all
		 */
		System.out.println("Period data type");
		Period yearPeriod=Period.ofYears(6);
		Period monthPeriod=Period.ofMonths(11);
		Period weekPeriod=Period.ofWeeks(17);
		Period dayPeriod=Period.ofDays(99);
		LocalDate today=LocalDate.now();
		System.out.println(today.plus(weekPeriod));
		//this is a period of 2 years, 9 months and 14 days
		Period per1=Period.of(2, 9, 14);
		//this will be a date 2 years 9 months and 14 days from today
		System.out.println(today.plus(per1));
		//this will be a date 2 years, 9 months and 
		//14 days in past from today
		System.out.println(today.minus(per1));
		//- by - gives a plus + by - gives a minus
		Period dayMinus=Period.ofDays(-20);
		/*
		 * this is minus by minus, which gives us a plus, so this
		 * adds 20 days onto today's date
		 */
		System.out.println("minus 20 days "+today.minus(dayMinus));
		/*
		 * this is plus by minus, which gives us a minus, so
		 * this subtracts 20 days from todays date
		 */
		System.out.println("minus plus 20 days"+today.plus(dayMinus));
	
		LocalDate date1=LocalDate.of(2010, 2, 12);
		LocalDate date2=LocalDate.of(2019, Month.APRIL, 1);
		System.out.println("Between()");
		Period betweenDates=Period.between(date1, date2);
		/*
		 * this will print out the period of 
		 * 9 years 1 month and 20 days
		 * and prints out like this
		 * P9Y1M20D
		 */
		System.out.println("betweendates is "+betweenDates);
		/*
		 * this does NOT DO what you think it does it only reads the 
		 * days from this period
		 * P9Y1M20D
		 * so this will be 20 days
		 */
		System.out.println("betweendates days is "+betweenDates.getDays());
		System.out.println("betweendates months is "
				+betweenDates.getMonths());//this will be 1
		System.out.println("betweendates years "
				+betweenDates.getYears());//will be 9
		per1=Period.of(2, 3, 12);//this will give us 2
		System.out.println(per1.getYears());
		/*
		 * you can do some limited comparing with periods
		 * buts it not much use to you
		 */
		System.out.println("compare days with months in two different "
				+ "time periods");
		/*
		 * this is asking 
		 * 12>1
		 * per1.getDays is 12
		 * betweenDates.getMonths is 1
		 */
		System.out.println(per1.getDays()>betweenDates.getMonths());
		
		System.out.println(betweenDates.getMonths());//1
		System.out.println(per1.getDays());//12
		
		Period days1=Period.ofDays(12);
		Period days2=Period.ofMonths(12);
		/*
		 * you can't compare objects of any type in this way
		 * also you can't know the exact amount of times in both
		 * these time periods, because 12 months in days can be
		 * 365 or 366, depeneding on whether a leap yar
		 */
		//System.out.println(days1>days2);//will not compile
		/*
		 * the of() methods cannot be chained for Periods
		 * this is only a period of 6 months, the ofYears(2)
		 * is disregarded, only the last of() method is considered
		 * which is here ofMonths(6), so this time period is
		 * only 6 months
		 */
		Period p1=Period.ofYears(2).ofMonths(6);
		System.out.println("date in future");
		//only 6 months in the future
		System.out.println(LocalDate.now().plus(p1));
		
		System.out.println("Durations");
		/*
		 * Durations can work for time and also dates, can do
		 * DAYS ONLY
		 * this is only a duration of 15 minutes, like periods
		 * only the last of() is considered, you can't chain
		 * methods in durations or periods
		 */
		Duration dur1=Duration.ofHours(2).ofMinutes(15);
		System.out.println(dur1);//PT15M
		//this will be 15 minutes in the future
		System.out.println(LocalTime.now().plus(dur1));
		System.out.println(dur1.getSeconds());	
	
	}
	
	static void ex6() {
		//date a film starting showing in local cinema
		LocalDate filmOpening=LocalDate.of(2018, 12, 3);
		//date a fiml stopped showing in local cinema
		LocalDate filmClosing=LocalDate.of(2019, 2, 14);
		/*
		 * this is the time period our film is showing in
		 * the local cinema
		 */
		Period filmTime=Period.between(filmOpening, filmClosing);
		System.out.println("film plays for "+filmTime);
		System.out.println("film plays for"+filmTime.getMonths()+
				" months "
				+ filmTime.getDays()+" days");
		
		LocalDate today=LocalDate.now();
		LocalDate century=today.plusYears(100);
		System.out.println(century);
		LocalDate finishTime=today.plus(filmTime);
		
		while(finishTime.isBefore(century)) {
			System.out.println("our film finishes in "+finishTime);
			finishTime=finishTime.plusDays(1);
			System.out.println("our next film starts in "
					+ finishTime);
			
			finishTime=finishTime.plus(filmTime);	
		}
		
	
	}//end of ex6
	
	static void ex7() {
		/*
		 * you can't compare periods directly, as 2 months could
		 * mean 62 days (july,August) or 61 days(march,april)
		 * and what about leap years (feb can be 28 days or 29 days)
		 * so we use something called "ChronoUnit" to get amount
		 * of days, weeks in a date in relation to a fixed point
		 * (not years or months)
		 * (i.e by using chrnounit two months starting in 01-01-2019
		 * will give us a days amount of 59, not a leap year,
		 * in 2020 this same time time period will be 60 as this is
		 * a leap year
		 */
		LocalDate today=LocalDate.now();//todays date
		LocalDate xmas=LocalDate.of(2019, Month.DECEMBER, 25);
		Period per1=Period.between(today, xmas);
		System.out.println(per1);
		/*
		 * you can pick any unit of time you want, and your answer
		 * will be a long, which in this case, will be the amount
		 * of days between todays date and christmas
		 * this is getting the amount of days between now
		 * and christmas 2019
		 */
		long p2=ChronoUnit.DAYS.between(today,xmas);
		System.out.println(p2+" days to christmas");
		
		LocalDate paddys=LocalDate.of(2019, Month.MARCH, 17);
		/*
		 * getting the amount of days between paddys day 2019
		 * and christmas 2019
		 * always will be 283 days
		 */
		long p3=ChronoUnit.DAYS.between(paddys, xmas);
		System.out.println("paddys is "+p3+" days from christmas");
		/*
		 * is the amount of days between today and christmas
		 * greater than the time period between paddys day and 
		 * christmas
		 * if i run this any time in the year 2019 before
		 * paddys day, this will true
		 * any other time will be false
		 */
		System.out.println(p2>p3);
		
		LocalTime rightNow=LocalTime.now();
		LocalTime noon=LocalTime.NOON;
		System.out.println(noon);
		long minFromNoon=ChronoUnit.MINUTES.between(rightNow,noon);
		System.out.println("minutes to noon is "+minFromNoon);
		//midnight is the very first nanosecond of the day
		//00:00:00.000000000
		LocalTime midnight=LocalTime.MIDNIGHT;//
		System.out.println(midnight);
		//this will give a minus number as midnight in the past
		long minFromMid=ChronoUnit.MINUTES.between(rightNow, midnight);
		System.out.println("minutes from midnight "+minFromMid);
		
		paddys=LocalDate.of(2234, Month.MARCH, 17);
		long toFuture=ChronoUnit.DAYS.between(today, paddys);
		System.out.println("days to day in future "+toFuture);
		/*
		 * this is a period of 1000 years, 799 months and 40_000
		 * days
		 */
		per1=Period.of(1000, 799, 40_000);
		LocalDate future=today.plus(per1);
		System.out.println("our date far in the future is "+future);
		/*
		 * we want to get the amount of EXACT days between today
		 * and this date in the future
		 */
		long futureDays=ChronoUnit.DAYS.between(today, future);
		/*
		 * this will be the amount of days to a time 
		 * 1000 years 
		 * 799 months
		 * and 40_000 days 
		 * in the future
		 * at time of writing this reads
		 * 429_563 days to 3195-07-20
		 */
		System.out.println(futureDays+" days to "+future);
		
	}//end of ex7
	
	static void ex8() {
		/*
		 * cannot chain methods of the period class
		 * this is only a period of 4 days
		 * 2 years and 3 months are ignored
		 */
		Period wrongPeriod=Period.ofYears(2).ofMonths(3).ofDays(4);
		//this is only 4 days in the future
		System.out.println(LocalDate.now().plus(wrongPeriod));
		/*
		 * if you want to create a Period of years, months and 
		 * days you have to use the of() method
		 */
		Period rightP=Period.of(2, 4, 24);
		
		Period per1=Period.of(1, 2, 10);
		Period per2=Period.of(2, 4, 4);
		/*
		 * when you are adding periods you only add up the
		 * individual elements with each other 
		 * only add up days with each other
		 * only add up months with each other
		 * only add up years with each other
		 * 1 year + 2 years becomes 3 years
		 * 2 months +4 months becomes 6 months
		 * 10 days + 4 days becomes 14 days
		 * P3Y6M14D
		 */
		Period addPer=per1.plus(per2);
		System.out.println(addPer);
		/*
		 * you can multiply a period, but you can mulitiply a period
		 * by a number not by another period
		 * multiples
		P3Y6M14D doubles each of the these  numbers to become
		P6Y12M28D
		 */
		System.out.println(addPer.multipliedBy(2));
		/*
		 * minus operates the exact same way as plus
		 * you minus the years
		 * you minus the months
		 * you minus the days
		 */
		per1=Period.of(1, 2, 10);
		per2=Period.of(2, 4, 4);
		System.out.println("per2 minus per1 "+per2.minus(per1));
		/*
		 * isZero
		 * this returns true if year, month and date are all zero.
		 */
		per1=Period.of(0, 0, 1);//not all zero so false
		System.out.println("per1 is zero "+per1.isZero());
		per1=Period.of(0, 0, 0);//all zero so true
		System.out.println("per1 is zero "+per1.isZero());
		/*
		 * this is four years forward, 5 months forward, then
		 * 10 days back
		 */
		per1=Period.of(4, 5, -10);
		LocalDate startYear=LocalDate.of(2019, Month.JANUARY, 1);
		System.out.println(startYear.plusMonths(5));//1st June
		System.out.println(startYear.plus(per1));
		System.out.println("isNegative()");
		/*
		 * isNegative() returns true if year or month or day
		 * are negative
		 */
		System.out.println("per is negative "+per1.isNegative());
		//0 is a positive number
		System.out.println("per2 is negative "+per2.isNegative());
	}
	
	static void ex9() {
		/*
		 * date and time formatters, to allow us to format dates
		 * in whatever format we want. In our case in western
		 * European Format which is 
		 * DD-MM-YYYY
		 */
		LocalDate today=LocalDate.now();
		//default format is YYYY-mm-dd
		System.out.println("default format is "+today);
		/*
		 * create a DateTimeFormatter for our dates and times
		 * in localised format (which is the format that is used
		 * for dates and times on this machine, or whatever 
		 * machine you install your app on). Localised date
		 * will be set to western european format.
		 * When creating formats for LocalDate, LocalTime and 
		 * LocalDateTime there are formatters for each type.
		 * LocalizedDate for LocalDate
		 * LocalizedDateTime for LocalDateTime
		 * LocalizedTime for LocalTime
		 */
		/*
		 * this creates a formatter called shortDate
		 * and the format it will take will be the Date format
		 * of the Machine the code runs on
		 * it takes the short formatStyle which will just print
		 * out 12/06/19
		 */
		DateTimeFormatter shortDate=DateTimeFormatter.
				ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("todays date in european format");
		//this prints out 12/06/19
		System.out.println(today.format(shortDate));
	
		DateTimeFormatter mediumDate=DateTimeFormatter.
				ofLocalizedDate(FormatStyle.MEDIUM);
		//12-jun-2019
		System.out.println("todays date in medium european format");
		System.out.println(today.format(mediumDate));
		
		DateTimeFormatter fullDate=DateTimeFormatter.
				ofLocalizedDate(FormatStyle.FULL);
		//12 June 2019
		System.out.println("todays date in full european format");
		System.out.println(today.format(fullDate));
		
		DateTimeFormatter longDate=DateTimeFormatter.
				ofLocalizedDate(FormatStyle.LONG);
		//12 June 2019
		System.out.println("todays date in long european format");
		System.out.println(today.format(longDate));
		/*
		 * there are a number of standard ISO formatters there are
		 * the following
		 */
		//prints out 20190612
		DateTimeFormatter formatter1=DateTimeFormatter.BASIC_ISO_DATE;
		/*
		 * ISO_LOCAL_DATE, ISO_LOCAL_TIME, ISO_LOCAL_DATE_TIME 
		 * are the default formatters for LocalDates, LocalTimes 
		 * and LocalDateTime
		 */
		System.out.println("basic iso "+today.format(formatter1));
		
		DateTimeFormatter formatter2=DateTimeFormatter.ISO_LOCAL_DATE;
		/*
		 * evertime we print out a date with no formatter it is calling
		 */
		System.out.println("default formatter "+today.format(formatter2));
		/*
		 * using the formatter on the local machine for time
		 * FormatStyle.MEDIUM
		 * FormatStyle.SHORT are the we can use
		 */
		LocalTime rightNow=LocalTime.now();
		System.out.println(rightNow);
		DateTimeFormatter timeFormatter=DateTimeFormatter.
				ofLocalizedTime(FormatStyle.SHORT);//no seconds
		
		timeFormatter=DateTimeFormatter.
				ofLocalizedTime(FormatStyle.MEDIUM);//this has seconds
		
		System.out.println(rightNow.format(timeFormatter));
		//System.out.println(LocalTime.now().format(timeFormatter));
		//default formatter for time
		DateTimeFormatter formatter3=DateTimeFormatter
				.ISO_LOCAL_TIME;
		//default formatter for datetime
		DateTimeFormatter formatter4=DateTimeFormatter
				.ISO_LOCAL_DATE_TIME;
		/*
		 * each time type has to have it's own formatter, ie.
		 * you can't use a localdate formatter for a local time
		 * formatter3 is a formatter for LocalTime only
		 * this gives a UnsupportedTemporalTypeException
		 */
	//	System.out.println(today.format(formatter3));
	}//end of ex9
	
	static void ex10(){
		/*
		 * Period parsers
		 * period parsers are strings that contain a period
		 * and then we can convert to periods
		 * these are all periods of 5 years
		 */
		Period p5=Period.parse("p5y");//not case sensitive
		p5=Period.parse("P5Y");
		System.out.println(LocalDate.now().plus(p5));
		p5=Period.parse("+p5y");
		//period of 5 years 1 month and 21 days
		//not case sensitive
		Period multiParse=Period.parse("P5Y1M21d");
		System.out.println(LocalDate.now().plus(multiParse));
		
		LocalDate today=LocalDate.now();
		LocalTime rightNow=LocalTime.now();
		LocalDateTime nowDateTime=LocalDateTime.now();
		System.out.println(today);//todays date
		System.out.println(rightNow);//current time
		System.out.println(nowDateTime);//current date and time
		/*
		 * D is day of the year
		 * e is day of the week (i.e monday first day of the week, 
		 * number 1)
		 * dd is day of the month
		 * EEEE is the named day of the week (i.e Tuesday), EE is the 
		 * shortened version of Tue
		 * MMMM gives us the full  name of the month (ie October)
		 * M give us 2 for february
		 * MM gives us 02 for february
		 * MMM gives us "feb" for february
		 * MMMM gives us february
		 * YYYY is the year (YY) just gives us 19 
		 * hh gives us 12 hour clock
		 * HH gives us 24 hour clock
		 * mm gives us minutes
		 * ss gives us seconds
		 * SS gives us nanoseconds (billion of a second)
		 * a gives us "am" or "pm"
		 * to put in text in your dateFormatter you use single quotes
		 * see 'day of year'
		 */
		//for LocalDateTime
		DateTimeFormatter eurDateTime=DateTimeFormatter.
				ofPattern("D e dd EEEE MMMM YYYY hh:mm:ss:SS a");
		System.out.println("todays current dateTime in european format");
		System.out.println(nowDateTime.format(eurDateTime));
		//for Local Dates
		/*
		 * you dont' HAVE to put in spaces, but if you don't
		 * no spaces will appear in your dates, i.e this will
		 * be 
		 * Thursday13June2019
		 */
		DateTimeFormatter eurDate=DateTimeFormatter.
				ofPattern("EEEEddMMMMYYYY");
		System.out.println("todays date in european format");
		System.out.println(today.format(eurDate));
		
		DateTimeFormatter timeFormatter=DateTimeFormatter.
				ofPattern("hh:mm a");
		System.out.println("current time is ");
		System.out.println(rightNow.format(timeFormatter));
		
		eurDate=DateTimeFormatter.
				ofPattern("dd MM YYYY");
		System.out.println("date is "+today.format(eurDate));
		/*
		 * here we are formatting a date as we are created it
		 */
		//LocalDate myDate=LocalDate.parse("01 01 2017",eurDate);
		//System.out.println(todayEur);
		
	}

}
