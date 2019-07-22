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
		
		//===============
		
		Integer number2 = 56; //this creates a new integer object "number2" with the value of 56
		
		double dNum1=56; //this will work as a primitive int is smaller than a primitive double, so will fit inside this variable.
		
		//Double dNumber2 = 56; //this WONT compile as 56 is an int, and so cant be added to an Integer wrapper
		
		//Double dNumber2 = num; //Also wont work as num is an int.
		
		//Double dNum = iNumber; Also wont work, as iNumber is an Integer. So this is like assigning a Cat to a Hippo!
		
		//what will work:
		Double dNum2 = dNum1; //You can assign a primitive double to a wrapper Double.
		dNumber = 56.0; //assigning a double balue to a Double wrapper
		dNumber=dNumber; //assigning a Double wrapper the value of another Double wrapper.
		
		//------
		
		byte bNum=3;
		
		byte myByte = bNum; //assigning a primitive byte to a wrapper byte.
		
		myByte = 34; //assigning an int value as long as the int value is less than 128 and greater -127
		
		//myByte=num; //You CANT assign a primitive variable to a wrapper byte. BECAUSE num COULD be greater than 128 or less than -127.
		
		
		//------
		
		short sNum = 7890;
		Short myShort = sNum;
		myShort = 567; //can take a LITERAL int value
		//myShort = num; //but CANT assign an int variable to it.
		
		
		//------
		
		//All numbers with decimal points in Java are by default doubles.
		
		//Float myfloat = 5.6;
		float fNum = 3.45f; //needs the f as by default its counted as a double
		
		Float myFloat = 4.56f; //like its primitive equivalent above, you have to put an f at the end of the number or cast it.
		//myFloat = (float)dNum1;
		
		
		//-----
		
		char myChar2 = 'a';
		Character myCharacter = 'a';
		myCharacter=myChar2; //assigning a char primitive to a Char wrapper.
		myCharacter = 57; //You CAN assign a number ot a character wrapper (like with regualr primitive chars).
		
		
		//-----
		
		Boolean myBool2 = false;
		boolean bool = false; 
		myBool2 = bool;
		
		
		//---------
		
		//System.out.println(dNumber == iNumber); //wont compile as wrappers are different types.
		dNumber = 56.0;
		iNumber = 56;
		//System.out.println(dNumber.equals(iNumber)); //will compile but can NEVER be equal as they are different wrapper object types.
		
		
		
		/*
		 * Using the example of the Byte and Integer classes (ALL other classes are the same)
		 * These classes have methods called "byteValue(), shortValue, intValue(), doubleValue(), floatValue() & longValue()"
		 */
		
		int num2= dNumber.intValue();
		System.out.println("num2 is now: " + num2);
		
		
		///================
		
		
		num=56;
		iNumber=56;
		System.out.println(iNumber.equals(num)); //you CAN compare a wrapper object with a primitive int using the equals method. 
		//System.out.println(num.equals(iNumber));//but NOT the other way around. 
		System.out.println(num==iNumber);
		System.out.println(iNumber==num);
		
		dNumber = 56.0;
		iNumber = 56;
		
		//System.out.println(dNumber.intValue()==iNumber.intValue());
		
	}

}
