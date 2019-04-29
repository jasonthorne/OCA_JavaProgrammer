package com.android;

//import java.sql.Date; //this is to do with dates and times regarding sql compatability
import java.time.LocalDate;
import java.util.Date; //this was a class used for dates prior to java8. You can still use this method to create dates in the current version of Java.



public class Dates {

	LocalDate date;
	
	Date oldDate; //this was the old way of creating dates in java. Using a class called "Date" (java.util.Date)
	
	java.sql.Date myDate = new java.sql.Date(0); //The ONLY way to import two classes with the same name from different packages.
	
	
}
