package com.android;

/**
 * 
 * Exam objective 6.1. Create methods with arguements, and return values, including overloaded methods. 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		//employee.moreReturns(1);
		System.out.println(employee.moreReturns(1));
		
		double myWages=employee.calcWages(40);
		System.out.println(myWages);
		
		System.out.println(employee.calcHolidays(100));
		
		int myHolidays = employee.calcHolidays(20);
		
		System.out.println(myHolidays);
		
		System.out.println(employee.calcWages(employee.calcHolidays(10)));
		
		employee.eat(); //this works, though nothing happens (other than it's print statement), as it returns void!
		//System.out.println(employee.eat()); //wont work, as returns void.
		//int myInt=employee.eat(); //wont work, as returns void.
		
		System.out.println(employee.shift(12));
		
		if (employee.shift(12)){ //if works days or nights. returns true (days) or false
			System.out.println("yo");
		}else {
			System.out.println("woop");
		}
		
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		Person patsy = new Person();
		patsy.daysWorked(2, 45, 67, 100); //daysWorked has a int... parameter allowing it to recieve as many params as possible (which it then creates an array from)
		
	
		
	}

}
