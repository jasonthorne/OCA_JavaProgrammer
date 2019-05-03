package com.android;
/*
 * the final keyword
 * final means you can't change
 * if a class is final - you can't inherit from the class
 * if a method is final - you can't override the method in a derived class
 * if a variable is final, you can't change the value of the variable, once
 * the variable has been given a value. if a variable is final, java will
 * not allow any circumstance where a final variable will not be given
 * a value
 */
/*
 * when you declare a class as final, it does not mean that everything 
 * inside the class is final
 */
public final class Person {
	String name;//name of person not final so this can change
	/*
	 * a final variable cannot change once given a value
	 * so every person we create will have an age of 34, which we cannot
	 * then change
	 */
	final int age=34;
	/*
	 * you cannot create a person without make sure all of your final
	 * variables are given a value. so the statement
	 * final double weight;
	 * will generate an error as we are not giving a value to weight
	 */
	final double weight;
	/*
	 * you can't create a person without using this constructor, so this
	 * will always assign a value to the final double weight. it is an 
	 * error to even attempt to create a person without giving a value
	 * to weight. comment out constructor to see error 
	 */
	Person(double weight){
		this.weight=weight;
		System.out.println("Person constructor called");
	}

}//end of Person class
/*
 * this will not compile as you cannot extends a final class and Person
 * is a final class
 */
/*
class European extends Person{
	
}
*/

class European{
	
	final void talk() {
		System.out.println("European talking");
	}
	
	
}

class Irish extends European{
	/*
	 * you CAN overload a final method, as when you overload, you are creating
	 * a totally different method. Overriding is you are overwriting an 
	 * existing method of the same method signature and method signature is
	 * a combination of method name and parameter list types
	 */
	
	void talk(int num) {
		/*
		 * local varaibles CAN be final
		 */
		final int finalInt=78;
		//finalInt=999;//cannot change this
	}
/*
 * you can't override a final method and talk is a final method in the
 * European class, so this is not allowed	
 */
/*	void talk() {
		System.out.println("irish talking");
	}*/
}
