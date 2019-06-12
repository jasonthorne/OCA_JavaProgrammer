import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Examples {
	/*
	 * From java 8 onwards, there are 3 new time formats:
	 * LocalDate - just the date
	 * LocalTime - just the time
	 * LocalDateTime - both the date & time
	 * Previous vers of java have (and still has) a:
	 * Date data type, time data type & a dateTime data time.
	 * 
	 * The newer versions of Java are much easier to use. 
	 * The main difference between the old and new versions of java is that in the old version
	 * you could create a time object (in other words you could you the NEW keyword
	 * when creating a date, time or a datetime.
	 * In the new formats, you call a static method to create a localDate, localTime and LocalDateTime.
	 */

	static void ex1() {
		
		//This WONT compile, as we dont have access to any constructor of the Dog class (as the only one is private)
		//Dog dpot = new Dog();
		
		
		/*
		 * Here were accessing the static method, which returns a Dog, which is assigned to rex
		 */
		Dog rex=Dog.createDog();
		
		/*
		 * LocalDate, LocalTime, LocalDateTime are the same as the Dog class,
		 * in that all of their constructors are private and you can only create one of them
		 * through static methods of LocalDate, LocalTime, LocalDateTime.
		 */
	}
	
	
	
	static void ex2() {
		
		//DATES:
		
		System.out.println("localDates data type:");
		
		/*
		 * Dates in Java 8 onwards are called LocalDate (dates on the machine your currently working on)
		 * default format is: YYY-mm-dd
		*/
		
		System.out.println(LocalDate.now());
		
		/*
		 * Time in java is called LocalTime. The default for which is 24 hour format and is hh:mm:ss.999
		 */
		
		System.out.println(LocalTime.now());
		
		/*
		 * LocalDateTime is a combination of both of the above. Java 8 introduced all of the above to deal with times & dates.
		 * You can stil use Date, Time & dateTime data types, but they're very awkward to use. 
		 */
		
		System.out.println(LocalDateTime.now());
		
		//=====================
		
		
		/*
		 * You cant directly create a LoclaDate or localTime obj (cant use NEW).
		 * LocalDate myDaye = new Localdate(); //will not compile!! 
		 */ 
		
		//OF();
		System.out.println("of()");
		
		/* You create a date object by using static methods, one of which is the static method 'of()'
		 */
		
		LocalDate date1 = LocalDate.of(2221, 5, 28); //date1.date has to be entered into the same format as its printed
		System.out.println("date1 is: " + date1);
		
		//-----------------------
		
		//NOW();
		System.out.println("now()");
		
		/*
		 * Now is a static method that will get the current date, time or dateTime.
		 */
		
		LocalDate dateNow = LocalDate.now(); //today's date
		System.out.println("today is: " + dateNow);
		
		//-----------------------
		
		/*
		 * You can use enum Month.Januray etc for months.
		 * Alos LocalDate knows knows leap years & illegal dates.
		 * IE you can have the 32 of Jan. An illegal date generates DateTimeException.
		 */
		LocalDate date2 = LocalDate.of(2021, Month.FEBRUARY, 21);
		
		
		//---------------------
		
		//PARESERS FOR DATES
		
		System.out.println("Parsers for dates");
		
		/*
		 * For converting all time formats in a string to LocalDate, LocalTime, LocalDateTime we use PARSERS.
		 * 
		 * Parsers for dates are in the format: YYYY-mm-dd
		 */
		
		date2=LocalDate.parse("2018-08-02");
		System.out.println("date2 is now: " + date2);
		
		
		//---------------------
		
		//GETS() for localDate
		
		System.out.println("get()");
		
		date2=LocalDate.now();
		System.out.println("Month is: " + date2.getMonth()); //get month
		System.out.println("day of week is: " + date2.getDayOfWeek()); //get day of the week
		System.out.println("day of year is: " + date2.getDayOfYear()); //get day of the year
		System.out.println("day of the month: "+ date2.getDayOfMonth()); //get day of the month
		System.out.println("year is: "+ date2.getYear()); //get the year
		System.out.println("month numeric value is: "+ date2.getMonth()); //get the numeric value of the month
		
		
		//---------------------
		
		//ISBOFORE() & ISAFTER()
		
		System.out.println("isBefore() & isAfter()");
		
		LocalDate xmas = LocalDate.of(2019, 12, 25);
		LocalDate paddys = LocalDate.of(2019, Month.MARCH, 17);
		
		System.out.println("xmas before paddies: " + xmas.isBefore(paddys));
		System.out.println("xmas after paddies: " + xmas.isAfter(paddys));
		System.out.println("xmas same day as paddies: " + xmas.equals(paddys)); //check if they're the same day
		
		//---------------------
		
		//MINUS & PLUS
				
		/*
		 * All minus and plus methods dont change the LocalDates ans LocalDates are final like the string class.
		 */
		xmas=xmas.minusDays(10); //take 10 days from xmas
		System.out.println(xmas);
		xmas=xmas.minusMonths(2); //take 2 months from previously edited xmas
		System.out.println(xmas);
		xmas=xmas.minusWeeks(17); //take 17 weeks from previously edited xmas
		System.out.println(xmas);
		xmas=xmas.minusYears(10); //take 10 years from previously edited xmas
		System.out.println(xmas);
		
		
		//PLUS IS EXACLTY THE SAME!! :P
		
		date2=LocalDate.of(2018, Month.APRIL, 15);
		System.out.println("ten days on: " + date2.plusDays(10));
		System.out.println("day2 is still 15th of april: " + date2); //All dates are FINAL, so any of the date methods DONT CHANGE THE DATE
		
		
		date2=LocalDate.of(2000, 1, 1);
		System.out.println("millenium: " + date2);
		System.out.println(date2.plusMonths(2).plusYears(3));
		
		
		//The year 2000 was a leap year, so there was a 29th of feb. So 59 days onto the 0-0-2000 is 29th of feb
		System.out.println(date2.plusDays(59));
		
		System.out.println(date2.plusDays(59).plusYears(1));
		
		//---------------------
		
		//WITH: returns a COPY (not the original as it's final) of the date with a REPLACEMENT for the day, month or year
		
		date2 = LocalDate.of(2019, 12, 26);
		
		System.out.println("original date: " + date2);
		System.out.println("with day of month: " + date2.withDayOfMonth(14));
		
		System.out.println("with month: " + date2.withMonth(5));
		System.out.println("with year: " + date2.withYear(1979));
		System.out.println("with day of year: " + date2.withDayOfYear(100)); //100 days into the year
		
		
		
		//---------------------
		
		//At TIME()
		
		/*
		 * for converting a local date to a localDateTime.
		 */
		
		date2 = LocalDate.of(2019, 12, 26); //a local date
		
		LocalDateTime ldTime = LocalDateTime.now(); //the current time 
		System.out.println();
		
		System.out.println(ldTime);
		
		System.out.println(date2.atTime(16,30));
		System.out.println(date2.atTime(17,30, 30));
		
		LocalDateTime localDt = date2.atTime(20,17,54,56746);
		
		System.out.println(localDt);
		System.out.println(date2.atTime(LocalTime.now())); //gives the local time on this date
		System.out.println(date2.atTime(LocalTime.now().plusHours(4))); //gives the local time on this date
		
		
		System.out.println(date2.atStartOfDay()); //gets us 00:00
		
		
		//---------------------
		
		//EPOCH()
		
		/*
		 * 01-01-1970 is date 0 for computers, so all dates & times are calculated from this point. 
		 */
		
		System.out.println(LocalDate.now().toEpochDay()); //how many days after 01-01-1970
		//System.out.println(LocalDate.now().toEpochDay());
		
		LocalDate preEpoc = LocalDate.of(1959, 10, 15);
		System.out.println(preEpoc); //the amount of days before we get to date 0 of the 01/01/1970. this returns an int NOT A DATE
		
		
		System.out.println(preEpoc.toEpochDay()); //this is a number so we can add and subtract numbers from this and we cant use any methods of time (plusDays, minusHours, etc)
		
		System.out.println("max date:");
		System.out.println(LocalDate.MAX);
		
		System.out.println("min date:");
		System.out.println(LocalDate.MIN);
		
		System.out.println(LocalDate.now().getEra()); //CE (AD)
		System.out.println(LocalDate.now().minusYears(3000).getEra()); //o back 3000 years (BC)
		System.out.println(LocalDate.now().minusYears(1500).getEra());//go back 1000 years
	}
	
	

	static void ex3() {
		
		System.out.println("LocalTime");
		
		/*
		 * Time from java8 onwards uses the class LocalTime.
		 * LocalTime stores in the format: hours-mins-secs-nanoSecs (without timezones)
		 * Like LocalDate, LocalTime is immutable and cannot change.
		 * Created in a similar way to LocalDate in that we use static methods to create a LocalTime,
		 *  and is displayed as a 24 hour clock by default
		 */
		
		LocalTime time1= LocalTime.of(13, 54); //hours, minutes
		System.out.println(time1);
		time1= LocalTime.of(11, 15, 45); //hours, minutes, secs
		System.out.println(time1);
		time1= LocalTime.of(11, 15, 45, 778); //hours, minutes, secs, nanosecs
		System.out.println(time1);
		
		
		//There is no am & pm in localTime, but you can dispaly it, but you need to use a time formatter.
		
		//time1 = LocalTime.of(15,60); //gives runtime error as secs are invalid. only goes to .59 NOT compile time error.
		//time1 = LocalTime.of(24,00); //gives runtime error as hours are invalid. only goes to 23.59
		
		/*
		 * LocalTime just like LocalDate also has parsers. 
		 * So it can take a String time and convert it to a LocalTime value.
		 */
		
		//parsing:
		time1 = LocalTime.parse("16:06"); //evening
		time1 = LocalTime.parse("04:06"); //morning - String must be exact (ie have the leading 0 here)
		System.out.println("parse time is: " + time1);
		
		//gets current time:
		System.out.println("current time is: " + LocalTime.now());
		System.out.println(LocalTime.NOON); //12 midday
		System.out.println(LocalTime.MIDNIGHT); //midnight
		System.out.println(LocalTime.MIN); //midnight
		System.out.println(LocalTime.MAX); //last nanosec of today
		
		time1=LocalTime.now();
		
		System.out.println("hour of now is: " + time1.getHour()); 
		System.out.println("minute of now is: " + time1.getMinute()); 
		System.out.println("second of now is: " + time1.getSecond()); 
		System.out.println("nano of now is: " + time1.getNano()); 
		
		//plus times:
		System.out.println(time1.plusHours(4)); //add 4 hours
		System.out.println(time1.plusMinutes(99)); //add 99 mins
		System.out.println(time1.plusHours(2).plusMinutes(25).plusSeconds(56)); //add 2 hours, 25 minus & 56 secs
		
		//minus times:
		System.out.println(time1.minusHours(5)); //minus 5 hours
		System.out.println(time1.minusMinutes(45)); //minus 45 mins
		
		LocalTime rightNow=LocalTime.now();
		System.out.println(rightNow.plusHours(24)); //current time
		System.out.println(rightNow); //current time
		LocalTime midDay=LocalTime.NOON;
		
		System.out.println("is current time before noon?"); 
		System.out.println(rightNow.isBefore(midDay)); 
		System.out.println("is current time after noon?"); 
		System.out.println(rightNow.isAfter(midDay));
		
		//-----------
		
		LocalTime startTime = LocalTime.of(8, 30);
		LocalTime timmyTime = LocalTime.of(8, 15); // thus is the time that timmy comes to work
		
		
		
		if(timmyTime.isAfter(startTime)) {
			System.out.println("Timmy is late");
		}else {
			System.out.println("Timmy is on time");
		}
		
		
		if(timmyTime.isBefore(startTime)|| timmyTime.equals(startTime)) { //arrives before 8:30 or at 8:30
			System.out.println("timmy is on time");
		}else {
			System.out.println("Timmy is late");
		}
		
		
		
	}
	
	
	
	static void ex4() {
		
		//LOCAL DATE TIME - combination of LocalDate & LocalTime
		
		LocalDateTime dateTime1 = LocalDateTime.of
				/*
				 * year 2212
				 * month april
				 * day 20
				 * hour 23
				 * minute 15
				 * second 50
				 * nano sec 675
				 */
				
				(2212,Month.APRIL,20,23,15,50,675);
		
		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println(rightNow);
		
		LocalDate today = LocalDate.now();//todays date
		
		LocalTime now = LocalTime.now(); //todays time
		
		//the combination of the above is the LocalDateTime:
		rightNow = LocalDateTime.of(today, now);
		
		//All the methods from the LocalDate & LocalTime classes are available to this.
	
	}
	
	
	static void ex5() {
		
		/*To measure a length of time for dates you have what are called PERIODS.
		 * For times you have what is called DURATIONS.
		 * 
		 * You can have a period of days, weeks, months, years, epoch, era or a combination of them all.
		 */
		
		//PERIOD
		
		Period yearPeriod = Period.ofYears(6); //6 year period
		Period monthPeriod = Period.ofMonths(11); //11 month period
		Period weekPeriod = Period.ofWeeks(17); //17 week period
		Period dayPeriod = Period.ofDays(99); //99 day period
		
		///You can add a period to a date:
		LocalDate today = LocalDate.now();
		System.out.println(today.plus(weekPeriod)); //17 weeks from today
		
		Period per1 = Period.of(2, 9, 17); //2 year, 9 months & 17 days.
		System.out.println(today.plus(per1)); //17 weeks from today
		
		//====================
		
		//BETWEEN()
		
		LocalDate date1 = LocalDate.of(2010, 2, 12);
		LocalDate date2 = LocalDate.of(2019, Month.APRIL, 1);
		
		Period betweenDates = Period.between(date1, date2);
		
		System.out.println(betweenDates); //Prints 'P9Y1M20D' - Period of 9 years, 1 month, 20 days.
		
		System.out.println("betweenDates.getDays: " + betweenDates.getDays());
		System.out.println("betweenDates.getMonths: " + betweenDates.getMonths());
		System.out.println("betweenDates.getYears: " + betweenDates.getYears());
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++Below:
		Period p1 = Period.ofYears(2).ofMonths(6); //this DOESNT create a period of 2 yrs & 6 mnths - as these methods CANT be changed. The 'ofYears' is disregarded!
		System.out.println("some time in the future: " + LocalDate.now().plus(p1));
		
		//===================
		
		//DURATIONS
		
		/*
		 * Durations can work for time & also dates & dateeTimes
		 */
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++Below:
		Duration dur1 = Duration.ofHours(2).ofMinutes(5).ofSeconds(15); //this DOESNT create a period of 2 hrs,5 mnts & 15 secs - as these methods CANT be changed. The final 2 are disregarded!
		System.out.println(LocalTime.now().plus(dur1));
		//System.out.println(dur1);
		
	}
	
	
	
	static void ex6() {
		
		//date a film started showing in local cinema:
		LocalDate filmOpening=LocalDate.of(2018, 12, 3);
		//date a film stopped showing in local cinema:
		LocalDate filmClosing=LocalDate.of(2019, 2, 14);
		
		//this is the time period the film is showing for:
		Period filmTime=Period.between(filmOpening, filmClosing);
		System.out.println("film plays for: " + filmTime);
		
		//better way of formatting:
		System.out.println("film plays for: " + filmTime.getMonths() + " months & " + filmTime.getDays() + " days");
		
		//------
		
		LocalDate today = LocalDate.now();
		LocalDate century = today.plusYears(100);
		System.out.println(century);
		LocalDate finishTime = today.plus(filmTime); //today + filmTime
		
		while(finishTime.isBefore(century)) {
			System.out.println("film finishes in " + finishTime);
			System.out.println("next film starts in "+ finishTime.plusDays(1));
			finishTime=finishTime.plus(filmTime);
		}
		
	}
	
	
	
	static void ex7() {
		
		/*
		 * You CANT compare periods DIRECTLY,
		 * as 2 months could mean 62 days (july or august) or 61 days (march or april)
		 * and what about leap years (feb can be 28 or 29 days)
		 * So we use CHRONOUNIT to get the amount of days & weeks in a date in relation to a fixed point. (NOT years or months)
		 * I.E by using a chronoUnit, two months starting in 01-01-2019 will give us a days amount of 59 & not a leap year
		 * in 2020 this same time period will be 60 as this is a leap year.
		 */
		
		LocalDate today = LocalDate.now(); //todays date
		LocalDate xmas = LocalDate.of(2019, Month.DECEMBER, 25); //date of xmas
		
		Period period1 = Period.between(today, xmas); //amount of time inbetween
		System.out.println(period1);
		
		long period2 = ChronoUnit.DAYS.between(xmas, today);  //find exact amount of time in DAYS (can't be done with period)
		System.out.println(period2);
	}
	
	
	
	
}
