package com.android;

public class Employee {
	
	private String name;
	int age;
	
	
	double calcWages(int hours) {
		return hours*20; //double is returned (int fits into double)
	}
	
	int calcHolidays(int daysWorked) {
		//every 5 days worked, gets 1 day of holidays
		int holidays=daysWorked/5; //integer division, so 9/5 = 1
		return holidays; //returns an int
	}
	
	
	//if method is void, you don't have to put in a return, but CAN if you want to. 
	void eat(){
		System.out.println("Employee eats");
		return; //the PRIMARY function of a return statement is to exit a method. NO CODE can be reached after this return statement, inside eat method. 
		//System.out.println("unreachable code"); //unreachable code. 
	}
	
	
	/*
	 * If working more than 12 hours, they are on day shift, and return true.
	 * If working less than or equal to 12 hours, they are on night shift, and return false.
	 */
	boolean shift(int hours) {
		if(hours > 12) {
			System.out.println("day shift");
			return true; //you can have more than 1 return as long as the last statement in a method is a return.
		}else {
			System.out.println("night shift");
			return false;
		}
	}
		

	
	String moreReturns(int choice) {
		
		// String myStr;
		//switch with returns instead of breaks
		switch(choice) {
		  case 1:
			  String myStr="you have chosen 1";
			  return myStr;
		  case 2:
			  myStr="you have chosen 2";
			  return myStr;
		  case 3:
			  myStr="you have chosen 3";
			  return myStr;
		  default:
			  myStr="you have chosen some other number";
			  return myStr;
		}
	}

	
}
