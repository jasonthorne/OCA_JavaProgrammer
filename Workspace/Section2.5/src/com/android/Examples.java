package com.android;

import java.util.ArrayList;

public class Examples {
	
	/*
	 * Why use wrappers?
	 * 
	 * A wrapper is an object version of a primitive variable. 
	 * This means that as it's an object, it has many methods it can use.
	 * A primitive variable has NO methods. ONLY objects have methods.
	 */
	
	static void createWrappers(){
		
		Integer myInt1 = 45;  //Integer object with lots of predefined methods. Every numeric wrapper is a subclass of Number, which is a subclass of Object.
		int num1=45; //a primitive var with NO methods (cant go num.).
		
		System.out.println(myInt1.intValue());
		 //invoking a method from the Int class. 
		
		//There are 4 ways of creating a wrapper object:
		
		//Method1:
		//Use the 'new' keyword and pass a number to the wrapper classe's constructor
		Integer myInt2 = new Integer(333);
		
		//Method2:
		//Use the 'new' keyword and pass a string (or var that contains a string) to the wrapper classe's constructor
		Integer myInt3a = new Integer("333");
		//OR:
		String myString = "333";
		Integer myInt3b = new Integer(myString);
		
		//Method3:
		//assign a literal value to a wrapper:
		Integer myInt4 = 33; //this AUTOBOXES the primitive int into an Integer obj ++++++++++++++++++++++++++++++
		
		//Method 4:
		//Using the static method 'valueOf' of the integer class
		Integer myInt5 = Integer.valueOf(3); //takes an int
		myInt5 =Integer.valueOf("3"); //takes a string
		
		Double myDouble1=Double.valueOf(3.33);
		myDouble1 = Double.valueOf("3.33");
		
		Boolean myBool=Boolean.valueOf("true");
		myBool=Boolean.valueOf(true);
		
		/*
		 * There are numerous methods for all wrapper numbers, such as intValue90 below:
		 */
		int newNum=myDouble1.intValue(); //extracts the int value form the double (chops off everything after the decimal)
		System.out.println(newNum);
		
		//An arrayList can only take Objects. So when you add a number to an arraylist, what's actually being added is a wrapper object that contains a number.
		//eg numList.add(45);
		/*When we assign a literal number to a wrapper Object or when we add a literal number to an arraylist, 
		the process by which this number is converted to a wrapper object is called AUTOBOXING.*/
		ArrayList<Integer>numList = new ArrayList<>();
		
		//adding 23 and 67 to the arrayList. Where they're autoboxed to become an integer, then added to the arrayList. 
		numList.add(23);
		int newNum2=67;
		numList.add(newNum2);
		
		
		Integer myInt7=89;
		
		//myDouble=myInt7; //you CANT assign between different wrapper types. (As you can with primitives)
		//myDouble=56;
		
		ArrayList<Double>dList = new ArrayList<>();
		//dList.add(4); //WONT WORK as arg isnt a double
		//dList.add(myInt7); //WONT WORK as arg isnt a double
		
		
		ArrayList<Number>numberList = new ArrayList<>();
		numberList.add(2.34);
		numberList.add(myDouble1); //adding a double wrapper
		numberList.add(2); //adding an int
		
		
		
		/*All wrappers (with the exception of Character wrappers) have 2 constructors in their classes.
		 * One that takes a primitive value of the correct type
		 * One that takes a String that contains a primitive value of the correct type.
		 */
		
		Boolean myBool3 = new Boolean(true);
		myBool3 = new Boolean("tRue"); //constructor arguement isnt case sensitive! 
		
		
		
		//=================CHAR WRAPPERS ++++++++++++++++++++++++++++++++++++++++++
		//ONLY have ONE constructor;
		
		/*
		 * The ONLY way to create a character wrapper object with a constructor is by passing in an actual character to the character constructor.
		 */
		Character myCharacter1 = new Character('a');
		//Character myCharacter = new Character(67); //Doesn't work
		//Character myCharacter = new Character("a"); //Doesn't work
		
		//The primitive var is being autoboxed to a character object.
		myCharacter1 = 'Z'; 
		myCharacter1 = 67;
		
		char mychar = '1';
		Character myCharacter2 = new Character(mychar);
		
		
		
		Integer number5 = new Integer(333);
		
		Integer number6 = new Integer(333);
		
		System.out.println(number5 == number6); //comparing if they're the same object
		System.out.println(number5.intValue() == number6.intValue()); //correct to compare their contained values. 
		
		//This is the ORACLE RECOMMENDED way to create wrappers. By using the static methods of the wrapper class: ++++++++++++++++++++++++++++++
		Integer staticInt = Integer.valueOf(12);
		Double staticDouble = Double.valueOf(3.33);
		Byte staticByte = Byte.valueOf("3");
		
		
		Integer staticInt2 = staticDouble.intValue(); //trims off everything after the decimal.
		staticByte = staticDouble.byteValue();
		
		
		//convert int to double:
		double dNum=staticInt2.doubleValue(); 
		
		//Adding an int to an arraylist of doubles:
		ArrayList<Double>doubleList=new ArrayList<>();
		doubleList.add(staticInt2.doubleValue()); //calling the method of the Integer class that will convert the number to a double.
		
		
		//=================================================PARSERS========================================
		
		
		System.out.println("\nPARSERS:");
		
		//Parsers are methods of the wrapper classes, and are used for converting numbers in a string to a primitive data type. 
		
		String strNum2="123";
		String strNum3 = "2";
		
		int primitiveInt = Integer.parseInt(strNum2); //note that this converts string to a PRIMITIVE variable. +++++++++++++++++++
		
		System.out.println(Integer.parseInt(strNum2) + Integer.parseInt(strNum3)); //parsing string to int
		System.out.println(Double.parseDouble(strNum2) + Double.parseDouble(strNum3)); //parsing string to double
		
		boolean bValue = Boolean.parseBoolean("tRue");

		
		/*
		 * UNBOXING: Taking the int variable out of the Integer wrapper object and assigning it to an int. 
		 */
		
		Integer statInt2=Integer.valueOf(89); //an Integer wrapper object (with an instance var with value of 89)
		int num=67; //primitive var
		System.out.println("Num is: " + num);
		num=statInt2; //assigning the value in the int wrapper to the primitive var
		System.out.println("Num is now: " + num);
		
		
		ArrayList<Integer>intList=new ArrayList<Integer>();
		intList.add(num); //int will be AUTOBOXED into an Integer wrapper
		intList.add(statInt2); //Integer warapper
		
		System.out.println(intList.get(0));
		System.out.println(intList.get(1));
		
		//Get the class name of the second object in the arraylist:
		System.out.println(intList.get(0).getClass().getSimpleName());
		System.out.println(intList.get(1).getClass().getSimpleName());
		
	}
	
	
	
	static void compareWrappers() {
		
		/*
		 * You cant assign one wrapper object of one type to another wrapper of a different type. 
		 */
		
		Short sNumer=45;
		//Integer iNumber = sNumber; //Wont work
		double dNum=67; //asigning a value to a primitive.
		//Double dNumber = 67; //Doesnt work as only a primitive double can be autoboxed.+++++++++++++++TYPES matter NOT amount (only primitives care about size) 
		Double dNumber = 67.0; //assigning a value to a double wrapper object.
		
		/*
		 * When directly assigning a value to a wrapper object you caon ONLY asign the primitive equivillent (ie a primitive double to a wrapper double)
		 * or a wrapper object of the samwe type. I.E a wrapper double assigned to a wrapper double.
		 */
		
		
		Integer number1=1000;
		Integer number2=1000;
		
		int num1=100;
		int num2=100;
		
		System.out.println(num1==num2); //true as comparing values
		System.out.println(number1==number2); //false as comparing if they're pointing to the same object
		
		//If we want to see if two wrapper objects contain the same nymber, we use equals:
		System.out.println(number1.equals(number2)); //true
		
		num1=1000;
		
		//You can also compare a wrapper with it's primitive equivalent (of SAME type):
		System.out.println(number1.equals(num1)); //true
		double dNum1 = 1000.00;
		//System.out.println(number1.equals(dNum1)); //doesn't give an error, but will return false (as you're trying to compae two different things that cant be compared.
		
		
		//number1 & number2 are integer wrapper objects. 
		number1 = 12; //value of 12 is autoboxed into the wrapper object
		number2 = 12; //value of 12 is autoboxed into the wrapper object
		//If two Integer wrappers are less than or equal to 127, and greater than or equal to -128, then the two wrappers point to the same object.
		System.out.println("Number1 and number2: " + (number1==number2));
		
		//When you use the NEW keyword to create a wrapper, YOU ALWAYS HAVE different objects.
		
		number1=new Integer(50);
		number2=new Integer(50);
		//this will print false
		System.out.println("number1 and number2 using new: " + (number1 == number2));
		
		

		//All these references will point to the same Boolean wrapper object:
		Boolean cBool1 = true;
		Boolean cBool2 = true;
		Boolean cBool3 = true;
		
		System.out.println(cBool1==cBool2==cBool3);
		cBool1 = new Boolean(true); //create a NEW Boolean wrapper obj
		System.out.println(cBool1==cBool2); //gives false, as two different objects
		System.out.println(cBool1 = Boolean.valueOf(cBool2)); 
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		Integer cNumber1=500;
		Integer cNumber2 = cNumber1; //reference the same object
		
		System.out.println("cNumbers: " + (cNumber1 == cNumber2));
		//incrementors OR decrementors on a wrapper obj, automatically create a NEW wrapper object, storing the new value. 
		cNumber1++; //THIS AUTOMATICALLY CREATES A NEW WRAPPER OBJECT (holding the value 501) ++++++++++++++
		System.out.println("cNumber1 is: " + cNumber1);
		System.out.println("cNumber2 is: " + cNumber2);
		//cNumber1--;
		
		/*
		 * When you change a wrapper number in any way, you are creating a new wrapper (with the exception of numbers less than 128 & greater than -129)
		 * So above cNumber1 & cNumber2 begin as references to the same object, and both contain the number 500.
		 * With ++cNumber1 we are adding 1 to the value of this wrapper object value, so cNumber1 becomes 501, and this creates a NEW WRAPPER OBJECT.
		 * So cNumber1 is now 501, and cNumber2 is still 500. 
		 */
		
		--cNumber1; //This also creates a new object (giving value of cNumber2), so this is still false:
		System.out.println("cNumbers: " + (cNumber1 == cNumber2));
		System.out.println("cNumbers (using .equals): " + cNumber1.equals(cNumber2));//correct way of comparing
		
		
		//====================Exception to rules above:
		
		cNumber1=10;
		cNumber2=cNumber1;
		
		cNumber1++;
		System.out.println("cNumbers: " + (cNumber1 == cNumber2)); //the above increment will differ these values so a new object is created (as long as number is less than 128 & > -129)
		cNumber1--;
		System.out.println("cNumbers: " + (cNumber1 == cNumber2)); //both values are now the same so the objects will now share the same reference again. 
		
		/*
		 * If the number is less than 128 & greater than -129 then the below will print true.
		 */
		
		System.out.println("cNumbers: " + (cNumber1 == cNumber2)); //true
		
		//========================
		
		Integer i3 = Integer.valueOf(99);
		
		Byte b1=34;
		
		//Byte wrapper construction arguments need CAST (as the args are ints initially) ++++++++++++++++++++++++++++++
		//Byte myByte1 = new Byte(33); //wont compile
		Byte myByte1 = new Byte((byte)33);
		Byte b2=Byte.valueOf((byte)12);
		
		//i3=myByte; //this wont work as i3 is an Int and myByte is a byte, so they CANT be assigned to one another. 
		//You have to cast the byte to an int first;
		i3=(int)myByte1;
		
		//You cant test for equivalence with two different wrapper types;
		//System.out.println(i3==myByte1);		
		
		//The below wont compile as you can ONLY cast from a smaller type to  bigger type.
		//IE from a byte to an int. But not from a bigger type to a smaller type.
		//myByte=(byte)i3;
		
		//This WILL compile, but will always give false because i3 is an Integer wrapper and myByte1 is a Byte wrapper (so proper comparison wont work).
		System.out.println(i3.equals(myByte1));
		
		
		//This is the way to compare them (casting myByte1 to be an int)
		System.out.println(i3.equals((int)myByte1));
		//OR:
		System.out.println(i3.equals(myByte1.intValue())); //true
		
		//=========
		
		Long myLong = 12340000L;
		
		//creating Object wrappers with the long value (changed to relevent values during assignment):
		Integer finalInt = myLong.intValue();
		Byte finalByte=myLong.byteValue();
		Short finalShort=myLong.shortValue();
		Double finalDbl=myLong.doubleValue();
		Float finalFloat=myLong.floatValue();
		
		System.out.println(finalInt);
		System.out.println(finalByte);
		System.out.println(finalShort);
		System.out.println(finalDbl);
		System.out.println(finalFloat);
		
		//===================
		//Book questions. p136
		
		
		//Q2-1
		int myChar1 = 97; //'a'; //97
		int myChar2 = 98; //'b'; //98
		

		//In a print statement if you have NO STRING before you use the plus symbol (+) this symbol will be the addition symbol.
		System.out.println((char)myChar1 + (char)myChar2); //Casting doesnt work here as they're chars already.
		
		System.out.println("yo dawg: " + myChar1 + myChar2); //A string before we use the + symbol, so that means everything AFTER the + symbol is considered a string
		System.out.println("yo dawg: " + (myChar1 + myChar2)); //chars added, as they're summed in the bracket before concatenation.
		
		System.out.println(myChar1 + myChar2); //No string b4 the + so treated as an addition operator.
		
		
		//Q2-2
		char c = '1';
		char b=1;
		
		System.out.println(c + " " + b);
		
		//===================
		byte a = -0;
		System.out.println(a);
		
	}

}
