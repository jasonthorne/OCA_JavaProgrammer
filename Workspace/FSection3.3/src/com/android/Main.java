package com.android;
/**
 * Exam objective 6.1 Create methods with arguments and return values
 *including overloaded methods
 * @author noelf
 *
 */
public class Main {
	public static void main(String[]args) {
		/*
		 * creating a Employee object to use all of the methods
		 * of the Employee class		
		 */
		Employee eddie=new Employee();
		/*
		 * calcWages(40) returns a double, so this can be assigned
		 * to a double variables myWages
		 */
		double myWages=eddie.calcWages(40);
		System.out.println("eddies first wages is myWages");
		/*
		 * calcHolidays(100) returns a value, an int, so this can
		 * be put in a print statement, this can also be assigned
		 * to a int or a double variable
		 */
		System.out.println(eddie.calcHolidays(100));
		int myHolidays=eddie.calcHolidays(1000);
		System.out.println("eddie has "+myHolidays+" days off");
		/*
		 * does the inner bracket first
		 * eddie.calcHolidays(10) produces the number 2
		 * so we then have eddie.calcWages(2), this returns a double
		 * 2*20 gives us 40.0
		 */
		System.out.println(eddie.calcWages(eddie.calcHolidays(10)));
		/*
		 * you can'ts put a method call that returns void in print
		 * statement of any type,
		 * eat() returns void, if the return is void, you can't put
		 * the method in print statement
		 */
		//System.out.println(eddie.eat());//will not compile
		/*
		 * the eat method returns void/nothing, so it can't be 
		 * assigned to any variable type and this will generate a
		 * compilation error
		 */
		//String myString=eddie.eat();//will not compile
		//int noInt=eddie.eat();//will not compile
		//this is the only correct way to call this method
		eddie.eat();
		//this will retrun true
		System.out.println("eddie day shift true"+eddie.shift(13));
		//this will return false
		System.out.println("eddie night work false "+eddie.shift(11));
		/*
		 * this is asking if eddie works days
		 * and he will get paid more
		 * or nights 
		 * and he will get paid less
		 */
		if(eddie.shift(13)) {
			System.out.println("you get paid less than night shift");
		}
		else {
			System.out.println("your get paid more than day shift");
		}
		
		Person patsy=new Person();
		/*
		 * daysWorked has a variable arguement parameter list which 
		 * means it can take one, many, an array or no ints
		 */
		patsy.daysWorked(2,45,67,100);//passing in four ints
		patsy.daysWorked(2);//passing in one int
		patsy.daysWorked();//passing in no int
		int[]days= {78,99,100,234};
		patsy.daysWorked(days);
		
		
	}

}
