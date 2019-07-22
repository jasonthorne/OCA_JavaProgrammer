package com.android;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * A wrapper object is a primitive variable that is wrapped in a object.
		 * A primitive DOES NOT have any methods or attributes. 
		 * When we create a wrapper from a primitive, that means this primitive now can call methods. 
		 * 
		 */
		
		int num=5; //this is a primitive. which means it ONLY has a reference to a value, and nothing else.
		
		Integer number = 5; //this is an Integer wrapper object which contains the number 5. 
		//this is called autoboxing, where the int value 5 is boxed into an Integer wrapper, which we can access through the reference "number".
		
		//All wrapper numbers inherit from the Number class: Number num1;
		
		Number num1; //Number class reference
		Byte bNumber; //primitive is: byte 
		Short sNumber; //primitive is: short 
		Integer iNumber; //primitive is: int
		Long lNumber; //primitive is: long
		Double dNumber; //primitive is: double
		Float fNumber; //primitive is: float
		
		Character myChar; //primitive is: char
		Boolean myBool; //primitive is: boolean
		
		
		//You can assign a primitive version of a wrapper to a wrapper reference: 
		num=5;
		iNumber = num; //assign an int to an Integer (AUTOBOXING)
		num = iNumber;//assign an Integer to an int. This UNBOXES the int value inside the int and assigns it to the primitive. 
		
		
		Integer number2 = 56; //this creates a new integer object "number2" with the value of 56
		

	}

}
