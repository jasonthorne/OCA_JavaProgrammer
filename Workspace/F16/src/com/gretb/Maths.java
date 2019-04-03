package com.gretb;

public class Maths {
	String name;
	double weight;
	/*
	 * every method has to have return type, in the dog class the return 
	 * type for all methods was void. In the main method, that we have being 
	 * using since day one, the return type is also void.
	 * methods can have parameters (something that is sent to a method)
	 * which can be any data type or oejct or array or any type of data.
	 * All concrete methods (normal methods) have a body, a body is 
	 * enclosed in curly brackets {} and is the code that is run when 
	 * the method is called
	 */
	/*
	 * the first line of the method is known as the method signature
	 * here the return type is a a double
	 * the name is add
	 * and it takes as two parameters which are two ints, and will be
	 * knows as number and number2 in the body of the method
	 */
	double add(int number, int number2) {
		/*
		 * declare a local variable that is the sum of the two numbers
		 * sent to the method
		 */
		double sum=number+number2;
		System.out.println("add method called");
		/*
		 * when you have a return type, that is not void, YOU HAVE TO use
		 * the keyword 'return'
		 * also as this method is returning a double, we have to put a 
		 * double value after the return
		 */
		return sum;
		//return number+number2;
	}
	/*
	 * taking two ints and multiplying and returning the 
	 * result as an int
	 */
	int multiply(int num,int num2) {
		//local variable which is the two numbers multiplied
		int sum=num*num2;
		//just to show our method is called
		System.out.println("multiply called");
		//returns the sum
		return sum;
	}
	
	/*
	 * takes two doubles and divides the first by the second
	 * and the result is returned as a double
	 */
	double division(double num,double num2) {
		double sum=num/num2;
		System.out.println("division called");
		return sum;
	}
	/*
	 * takes two ints and does a calculation and does not
	 * return anyting, but it will display the results
	 * in a print statement
	 */
	void calculation(int num,int num2) {
		int sum=(num+num2)*num;
		System.out.println("sum is "+sum);
	}
	

}
