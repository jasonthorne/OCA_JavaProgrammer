package com.android;

public class Employee {
	private String  name;
	int age;
	
	Employee(){
		
	}
	/*
	 * this method takes an int(hours) and returns a double (wages)
	 * the amount of hours is multiplied by 20 and returns this
	 * to main
	 * the return type is double, so we HAVE to have a return statement
	 * in our method. after the return statement we have to have a 
	 * double as in our method signature the return type is marked as
	 * a double
	 */
	double calcWages(int hours) {
		double wages;
		wages=hours*20;
		return wages;
	//	return hours*20;
	}
	/*
	 * this returns an int, so it has to return some whole number
	 * for every 5 days worked, we get one day of holidays
	 */
	int calcHolidays(int daysWorked) {
		/*
		 * this is integer division so 9/5 will be 1
		 */
		int holidays=daysWorked/5;
		return holidays;
	}
	
	void eat() {
		System.out.println("Employee eats");
		/*
		 * if your return is void, you do not have to put in a return,
		 * but you can if you want too.
		 * the primary function of a return statement is to exit a
		 * method
		 * this return statement has no value being returned to whatever
		 * called this method.
		 * this ONLY exits the method
		 * no code can be reached after this return statement inside
		 * the eat() method
		 */
		return;
		/*
		 * this is unreachable code and will not compile
		 */
		//System.out.println("This is unreachable code");
	}
	/*
	 * if working more than 12 hours, they are on the day shift
	 * and this method will return true
	 * if working less than or equal to 12 hours, they are on the 
	 * night shift and
	 * this method will return false
	 * you can have more than one return, as long as the last statement
	 * in a method is a return.
	 * So if horus>12, the last line executed will be 
	 * return true
	 * else if hours<=12, the last line executed will be 
	 * return false
	 */
	boolean shift(int hours) {
		if(hours>12) {
			System.out.println("day shift");
			/*
			 * this HAS to be the last statement if you are working
			 * more than 12 hours
			 */
			return true;
			//unreachable code
			//System.out.println("no code can exist here");
		}
		else
			/*
			 * if working 12 or less hours, this has to be the last
			 * line of code
			 */
			System.out.println("night shift");
		return false;
		/*
		 * unreachable code and will not compile
		 */
	//	System.out.println("will not compile");	
	}
	/*
	 * we are going to use a switch statement and in this switch
	 * statement, instead of break, we will have a return statement.
	 * we are given a numeric choice. if we pick 1, this will
	 * return "you have choosen 1", similar for 2,3,4 any other
	 * number it will return "you have choosen some other number"
	 */
	String moreReturns(int choice) {
		System.out.println("Multiplie returns in switch statement");
		String myStr;
		switch(choice) {
		case 1:
			myStr="you have choosen 1";
			return myStr;
		case 2:
			myStr="you have choosen 2";
			return myStr;
		case 3:
			return "you have choosen 3";
		case 4:
			return "you have choosen 4";
		default:
			return "you have choosen some other number";
		}
	}
	
	
	

}
