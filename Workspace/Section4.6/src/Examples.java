import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

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
		
		
	}
	
	
	
	
}
