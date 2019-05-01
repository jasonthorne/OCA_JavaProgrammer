package com.android;


import java.time.LocalDate;
//this was the class used for dates prior to java 8
//you can still use this method to create dates in current version
//java
import java.util.Date;
//import java.sql.Date;

public class Dates {
	
	LocalDate date;
	/*
	 * this was the old way for creating dates in java. it used a class
	 * called Date and you have to import using the 
	 * import java.util.Date statement
	 */
	Date oldDate=new Date();
	
	java.sql.Date myDate=new java.sql.Date(0);
	java.util.Date myDate2=new java.util.Date();

}
