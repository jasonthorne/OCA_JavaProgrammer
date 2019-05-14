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
		
		
	}

}
