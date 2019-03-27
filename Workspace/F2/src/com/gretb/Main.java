package com.gretb;

public class Main {

	public static void main(String[] args) {
		/*
		 * variables by convention always begin with a lower case letter.
		 * Also camel case notation is commonly used
		 */
		int ageOfPerson;
		/*
		 * variables can't start with an number 
		 * they CAN start with a underscore _
		 */
		//int  5num;
		int _5num;
		/*
		 * casting is the process of changing from one data type to another. You can
		 * cast only compatible data types
		 */
		int num=45;
		/*
		 * you can assign an int to a double as an int is smaller than a double
		 */
		double dnum=num;
		double dnum2=(double)num;
		/*
		 * decimal point numbers in java are by default double, so we
		 * have to cast them to be a float
		 */
		float fnum=(float)4.56;
		/*
		 * this is another way to cast a double to be a float, by placing
		 * the word 'f' at the end of the number
		 */
		float fnum2=5.67f;
		char myChar='a';
		/*
		 * this is an object, it is NOT a primitive data type
		 */
		String name="harry is here";
		System.out.println(name);
		/*
		 * you can declare as many variables of the one type on the same
		 * line, you cannot however declare variables of different types
		 * on the same line
		 */
		int num2=19,num3=10;
		int sum=num2/num3;
		/*
		 * this is integer division, the answer is 1.9, but as sum is an 
		 * integer it can only display whole numbers, so it simple deletes
		 * the .9 to become 1
		 */
		System.out.println("10 divided by 6 is "+sum);
		
		num2=19;
		double doub=10;
		/*
		 * when you use two diffent numeric types in a calculation, the result
		 * will be in the larger data types format. moral of the story, if in
		 * doubt have the variable as large as possible.
		 */
		System.out.println(num2/doub);
		
		int comp1=23;
		int comp2=23;
		/*
		 * this is testing for equalivance, if two numers are the same this
		 * will print true, otherwise will print false
		 */
		System.out.println(comp1==comp2);
		/*
		 * this is testing if the two number are NOT the same, if they are NOT
		 * the same this will be true, if the same, this will false
		 */
		System.out.println(comp1!=comp2);
		
		
		
		
		
		

	}

}
