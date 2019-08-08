package com.android;
/*
 * by default all runtimeExceptions are thrown out of the method in 
 * which they occur, so you don't need to have a "throws 
 * ArrayIndexOutOfBoundsException for example
 */
public class Vehicle {
	Vehicle()throws ArrayIndexOutOfBoundsException{
		System.out.println("vehicle constructor");
	//	throw new ArrayIndexOutOfBoundsException();
	}

}
class Car extends Vehicle{
	Car()throws IndexOutOfBoundsException{
		System.out.println("Car constructor");
	//	int[]numbers= {5,6};
	//	System.out.println(numbers[5]);
	}
}
/*
 * if we create a Ferrari using new Ferrari() we either have to put the 
 * creation of the Ferrari in a try/catch block or whatever method that is
 * creating the ferarri has to "throws" exception. If, in main, we have a
 * "throws Exception" this code will compile fine and no errors. However
 * if the Ferrari constructor actually produces a Exception (checked exception)
 * our program will crash
 */
class Ferrari extends Car{
	Ferrari()throws Exception{
		System.out.println("Ferrari");
		/*
		 * if the Ferrari constructor creates an exception, and we have
		 * a "throws Exception" in main, our code will compile, but it will
		 * crash the program
		 * uncomment this code to see our program crashing
		 * the second Ferrari outside of the try/catch block in main is
		 * what crashes our program
		 */
	//	throw new Exception();
	}
}
