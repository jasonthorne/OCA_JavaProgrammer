package com.gretb;

public class Maths {
	
	String name;
	double weight;
	
	/*
	 * Every method has to have a return type. In the dog class the return type for all methods was void. 
	 * In the main method that weve been using since day one, the return type is also void.
	 * Methods can have parameters (something which is sent to a method), which can be any data type or object or array or any type of data.
	 * All concrete methods have a body, a body is enclosed in curly brackets {} and is the code which is run when the method is called. 
	 */
	
	/*the first line of the method is known as the method signature. here the return type is 'double', the name is 'add' and it takes as two parameters, 2 ints
	 * and will be known as 'number1' and 'number2' in the body of the method
	 */
	
	double add(int number1, int number2) {	
		double sum=number1+number2;
		return sum; //must return a double (or smaller (eg int)) as return type is declared as 'double'
	}

}
