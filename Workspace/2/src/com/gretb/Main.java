package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * variables by convention always begin with a lower case letter.
		 * Also, camelcase notation is commonly used
		 */
		
		int ageOfPerson;
		
		/*
		 * Variables cant start with a number, they CAN start with an underscore
		 */
		
		/*
		 * Casting is the process of changing from one data types to another. You can only cast compatible date types. 
		 */
		
		//you can assign an int to a double as an int is smaller than a double:
		int num = 45;
		
		//making a double from a num without cast:
		double dnum=num;
		
		//making a double from a num with cast:
		double dnum2=(double)num; 
		
		//A string is an object. NOT a primitive data type. (its an array of characters)
		String myString = "ssss";
		
		//multi-line var declaration (must be of same type):
		int myNum1 = 5; int mynum2 = 10;
		
		
		int num2=19, num3=10;
		int sum=num2/num3; //should give 1.9
		System.out.println(sum); //but gives 1, because its an int, not a double
		
		
		//with two different data numeric types in a calculation, the result will be in the larger data types format.
		
		int num4=19;
		double doub=10;
		
		System.out.println(num4/doub);
		
		
	}

}
