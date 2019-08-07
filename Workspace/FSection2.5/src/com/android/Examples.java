package com.android;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Examples {
	/*
	 * why use wrappers?
	 * a wrapper is a object version of a primitive variable, this means
	 * that as it's an object it has many methods it can use.
	 * a primitive variable, has no methods, only objects have methods
	 */
	
	static void createWrappers() {
		Integer myInt=45;
		int num=45;
		/*
		 * num is a primitive variable so has no methods
		 */
		//num.//no methods for a primitive variable
		/*
		 * every wrapper object has numerous methods it can call upon
		 */
		myInt.intValue();
		/*
		 * every numeric wrapper is a subclass of the super class called
		 * Number, which is then also a sub class of object
		 */
		/*four basic ways to create a wrapper object
		 * 
		 */
		/*
		 * Method 1
		 * we use the "new" keyword and pass in a number to the wrapper
		 * classes constructor
		 */
		Integer myInt2=new Integer(3);
		/*
		 * we use the "new" keyword and pass in a string, that contains a
		 * number, this is using the overloaded constructor in the 
		 * Integer class that takes a String
		 */
		Integer myInt3=new Integer("67");
		String strNum="567";
		myInt3=new Integer(strNum);
		/*
		 * third way 
		 * we can assign a literal value to a wrapper
		 */
		Integer myInt4=56;
		Double dNumber=34.56;
		/*
		 * using the static method valueOf, of the Integer class
		 * one method takes an int, one method takes a string
		 * same process for Byte, Short,Long, Double, Float
		 */
		Integer myInt5=Integer.valueOf(45);
		myInt5=Integer.valueOf("45");
		
		Double myDouble2=Double.valueOf(2.34);
		myDouble2=Double.valueOf("2.99");
		Boolean myBool=Boolean.valueOf("true");
		myBool=Boolean.valueOf(true);
		/*
		 * there are numerous methods for all wrapper numbers
		 * such as intValue(), which will take the int out of the double
		 * myDouble2, myDouble2 is the value 2.99, the int value 2 will
		 * be extracted from this number
		 */
		int newNum=myDouble2.intValue();
		System.out.println(newNum);
		/*
		 * an ArrayList can only take objects, so when you add a numberr
		 * to an arraylist, what is actually being added is a wrapper 
		 * object that contains the number
		 * numList.add(45)
		 * this is actually adding a wrapper Integer object to the arraylist
		 * that contains the number 45
		 * when we assign a literal number to a wrapper object, or when
		 * we add a literal number to an arraylist, the process by which
		 * this number is converted to a wrapper object is called 
		 * AUTOBOXING
		 */
		ArrayList<Integer>numList=new ArrayList<Integer>();
		/*
		 * so when we add 23 and 67 to add the primitive ints, each of
		 * these numbers is first autoboxed to become an integer and then
		 * added to the arraylist
		 */
		numList.add(23);//can add literal numbers
		int newNum2=67;
		numList.add(newNum2);//can add primitive int variables
		numList.add(myInt2);//can add integers
		/*
		 * here we are also autoboxing we are assigning the primitive 
		 * double to a Double wrapper
		 */
		Double myDouble=2.0;
		double dnum=12.5;
		myDouble=dnum;
		Integer myInt7=89;
		int num9=67;
		/*
		 * this will not compile as  you can't assign between different
		 * wrapper types
		 */
		//myDouble=myInt7;//will not compile
		//myDouble=56;//will not compile
		myDouble=56.0;
		ArrayList<Double>dList=new ArrayList<Double>();
		dList.add(4.678);
		dList.add(7.997);
		//dList.add(4);
		//dList.add(num9);
		/*
		 * all wrapper numbers inherit from the Number class
		 * so we CAN have an arraylist of Numbers
		 */
		ArrayList<Number>numberList=new ArrayList<Number>();
		numberList.add(2.34);//adding a double
		numberList.add(dnum);//adding a Double
		numberList.add(num);//adding a Integer
		numberList.add(myDouble);//adding a Double wrapper
		/*
		 * all wrappers (with the exception of the Character wrappers)
		 * have two constructors in they're classes
		 * one that takes a primitive value of the correct type
		 * one that takes a String that contains a primitive value of
		 * the correct type
		 */
		Boolean myBool3=new Boolean(true);
		//not case sensitive when it comes to the string representing a 
		//boolean
		myBool3=new Boolean("TrUe");
		/*
		 * the only way to create a character wrapper object with a 
		 * constructor is by passing in a actual character to the 
		 * Character constructor
		 * A STRING DOES NOT WORK
		 * A NUMBER DOES NOT WORK
		 */
		Character myCharacter=new Character('a');
		//myCharacter=new Character(67);;//does not compile
		//myCharacter=new Character("a");//does not compile
		/*
		 * the primitive variable 'z' is autoboxed and becomes the wrapper
		 * object that is referenced the myCharacter reference
		 */
		myCharacter='z';
		//you can assign a literal whole number to Character
		myCharacter=67;
		System.out.println("character is "+myCharacter);
		
		char myChar='1';
		myChar='!';
		Character myCharacter2=new Character(myChar);
		
		Integer number5=new Integer(10);
		Integer number6=new Integer(10);
		/*
		 * this is the oracle recommended way to create wrappers
		 * by using the static methods of the wrapper class
		 * we create a wrapper object by passing in a primitive value
		 * to these methods
		 */
		Integer statInt=Integer.valueOf(12);
		Double statDbl=Double.valueOf(1000.93);
		Byte statByte=Byte.valueOf("3");
		
		
		Byte statByte2=4;
		/*
		 * gets the int 1000 from the double statDbl
		 */
		Integer statInt2=statDbl.intValue();
		statByte=statDbl.byteValue();
		System.out.println("integer value of double is "+statInt2);
		System.out.println("byte value of double is "+statByte);
		/*
		 * this is converting the int 2 into teh double 2.0
		 */
		double dnum5=statInt2.doubleValue();
		/*
		 * there is a way to add integers to a arraylist of doubles
		 * we call the doubleValue() method of the Integer class that wil
		 * convert the number 2 to the double number 2.0
		 */
		ArrayList<Double>doubleList=new ArrayList<Double>();
		doubleList.add(statInt2.doubleValue());
		
		System.out.println("PARSERS");
		
		String strNum2="123";
		String strNum3="2";
		/*
		 * strNum2 and strNum3 are both Strings, they are NOT numbers
		 * so here we are concatenating two strings and this will print
		 * out 1232
		 */
		System.out.println(strNum2+strNum3);
		/*
		 * Parsers are methods of the wrapper classes and are used for
		 * converting numbers in a string to a primitive data type		
		 */
		int value=Integer.parseInt(strNum2);//value becomes the number 123
		int value2=Integer.parseInt(strNum3);//value becomes the number 2
		System.out.println(value+value2);
		/*
		 * dValue is now the double 2.0
		 */
		double dValue=Double.parseDouble(strNum3);
		short sValue=Short.parseShort(strNum2);
		boolean bValue=Boolean.parseBoolean("TRue");
		
		/*
		 * unboxing, taking the int variable out of the wrapper Integer
		 * variable number and assigning it to an int
		 */
		//an Integer wrapper
		statInt2=Integer.valueOf(89);
		//primitive int variable
		int num4=67;
		/*
		 * what is happening here is that the number 89 is taken out of
		 * the wrapper statInt2 and this value is assigned to the 
		 * primitive int variable num
		 */
		num4=statInt2;
	//	numberList.addAll(dList);
		System.out.println("num is now "+num4);
		System.out.println("statInt2 is "+statInt2);
		
		ArrayList<Integer>intList=new ArrayList<Integer>();
		intList.add(num4);
		intList.add(statInt2);
		//this will print out first number in arrayList
		System.out.println(intList.get(0));
		System.out.println(intList.get(1));
		/*
		 * this chained command will get the class of the second object
		 * in our arraylist
		 */
		System.out.println(intList.get(1).getClass().getSimpleName());
		/*
		 * we inserted num4 into our arraylist at this position
		 * it was autoboxed first into a wrapper Integer and then 
		 * added to the arraylist. we can see from this command that the
		 * number 89 is autoboxed into a Integer wrapper object
		 */
		System.out.println(intList.get(0).getClass());
		
		Dog spot=new Dog();
		Cat tibbles=new Cat();
		Cow daisy=new Cow();
		
		ArrayList<Animal>animList=new ArrayList<Animal>();
		animList.add(spot);
		animList.add(tibbles);
		animList.add(daisy);
		
		System.out.println(animList.get(0));
		System.out.println(animList.get(1).getClass());
		System.out.println(animList.get(2).getClass().getSimpleName());
		
		
	//	int[]numArray= {56,78,100};
		
		//List list = Arrays.asList(numArray);
	//	Collections.addAll(numberList, (Number) Arrays.asList(numArray));
		//Collections.addAll(numberList, numArray);
	}
	
	static void compareWrappers() {
		/*
		 * can't assign one wrapper object of one type to another 
		 * wrapper of a different type
		 */
		Short sNumber=45;
		//Integer number=sNumber;
		double dnum=122;
		System.out.println(dnum);
		/*
		 * this does not compile as a Double wrapper reference can only
		 * autobox a primitive double, so this number would have to be
		 * 67.0
		 */
		//Double dnumber=67;
		Double dnumber=67.0;
		dnumber=dnum;
		
		float fnum=45.6f;
		//will not compile as fnum is a primitive float
	//	dnumber=fnum;
		/*
		 * when directly assigning a value to a wrapper object you can only
		 * assign the primitive equalivent (i.e a primitve double to a 
		 * wrapper double) or a wrapper object of the same type
		 * i.e wrapper double assigned to wrapper double
		 */
		
		Integer number1=1000;
		Integer number2=1000;
		
		int num=100;
		int num2=100;
		/*
		 * here we are comparin two values to see if they are the same
		 * value
		 */
		System.out.println(num==num2);
		/*
		 * here we are asking is number1 and number2 the same object
		 * these are two SEPERATE object, and both contain the number 1000
		 * so if we go number1==number2, they are two different objects
		 * so they will return false
		 */
		System.out.println(number1==number2);
		num=1000;
		dnum=100.0;
		Double dNumber=1000.0;
		/*
		 * if we want to see if two wrapper objects contain the same number
		 * we use equals
		 */
		/*
		 * this returns true we are checking two Integer objects to see
		 * if they have the same value
		 */
		System.out.println(number1.equals(number2));
		/*
		 * this returns true, we are checking the value in the Integer object
		 * number1 against the primitive int num, which is 1000. 
		 * you can compare a wrapper Integer with primitive int, and similar
		 * for all wrapper objects and they're primivite versions
		 */
		System.out.println(number1.equals(num));
		/*
		 * this will return false, as we are comparing a wrapper Integer
		 * with primitive double, this will always return false as if you
		 * compare a wrapper with a primitve version of another type, you
		 * will always get galse
		 */
		System.out.println(number1.equals(dnum));
		/*
		 * these are two different wrapper types number1 is a Integer
		 * dNumber is a Double, even though they do have the same value of
		 * 1000
		 */
		System.out.println(number1.equals(dNumber));
		//number1 and number2 are Integer wrapper objects
		/*
		 * if you are assigning two of the same nubmers directly to two
		 * integer wrapper objects and the number is less than or equal to
		 * 127 and greater than or equal -128, then the two wrappers point to the
		 * same object and
		 * number1==number2 will be true
		 */
		number1=127;
		number2=127;
		//number less than 128 so number1 and number2 are same object
		System.out.println("number1 and number2 "+(number1==number2));
		//this does not create a new Integer wrapper
		Integer number3=Integer.valueOf(127);
		//this will return true
		System.out.println("using valueOf "+(number1==number3));
		/*
		 * regarless of the number, when you use the NEW keyword to create
		 * a wrapper. YOU ALWAYS HAVE different objectgs
		 */
		number1=new Integer(50);
		number2=new Integer(50);
		//this will print false
		System.out.println("number1 and number2 using new "+(number1==number2));
		
		
		/*
		 * all these references will point to the same Boolean wrapper
		 * object
		 */
		Boolean cBool=true;
		Boolean cBool2=true;
		Boolean cBool3=true;
		//they are all the same
		System.out.println(cBool==cBool2==cBool3);
		cBool=new Boolean(true);
		System.out.println(cBool==cBool2);
		//valueOf DOES not create a new object
		cBool=Boolean.valueOf(true);
		System.out.println(cBool==cBool2);
		
		Integer cNumber=new Integer(500);
		Integer cNumber2=cNumber;
		/*
		 * when you change a wrapper number in any way, you are 
		 * CREATING A NEW WRAPPER (	with the exception of numbers less
		 * than 128 and greater than -129) so here cNumber and cNumber2
		 * are two references to the same object to start off and they
		 * both contain the number 500
		 * with ++cNumber we are adding one to this wrapper, so cNumber
		 * becomes 501 and also is A NEW WRAPPER object.
		 * cNumber is  now 501
		 * cNumber2 is still 500
		 * subtract one number from cNumber with --cNumber, so again this
		 * creates a new wrapper object and assigns it to cNumber.
		 * so 
		 * cNumber is now 500
		 * cNumber2 is still 500
		 * even though these two wrappers have the same values, they
		 * are different objects
		 * so (cNumber==cNumber2) will be false
		 */
		System.out.println("cNumbers "+(cNumber==cNumber2));
		cNumber++;
		System.out.println("cNumber is "+cNumber);
		System.out.println("cNumber2 is "+cNumber2);
		cNumber--;
		System.out.println("cNumber is "+cNumber);
		System.out.println("cNumber2 is "+cNumber2);
		System.out.println(cNumber==cNumber2);
		//this will return true as both contain 500
		System.out.println("same value "+(cNumber.equals(cNumber2)));
		
		/*
		 * if your number is less than 128, greater than -129
		 * then if the two numbers match the answer will be true
		 */
		cNumber=10;
		cNumber2=cNumber;
		/*
		 * this creates a new wrapper object for cNumber which contains
		 * the nubmer 11
		 */
		cNumber++;
		//this is a different object, different value, will print false
		System.out.println(cNumber==cNumber2);//false
		cNumber--;
		/*
		 * cNumber and cNumber2 are both the number 10 and as this number
		 * is less than 128 and greater than -129 then both variables
		 * point to the same Integer object
		 * so cNumber==cNumber2 will be true
		 */
		System.out.println(cNumber==cNumber2);//true
		
		Integer i3=Integer.valueOf(99);
		/*
		 * you can create a Byte wrapper by assigning a number to the
		 * Byte wrapper objectg 
		 * 
		 */
		Byte b1=34;
		/*
		 * this will not compile, as the number 100 is by default,
		 * an int. when creating byte, using the NEW keyword or using
		 * the valueOf() method, the number you use HAS TO BE A BYTE
		 * if you are creating Bytes or Short wrapper object by either
		 * of the below methods, you have to cast the number to be of
		 * type byte
		 */
		//Byte myByte=new Byte(100);//will not compile
		Byte myByte=new Byte((byte)99);
		//Byte b2=Byte.valueOf(12);//will not compile
		Byte b2=Byte.valueOf((byte) 12);//will compile
		/*
		 * these are two different wrapper classes, and you can't assign
		 * one type to a reference of another type
		 * i3 is an Integer
		 * myByte is a Byte
		 */
		//i3=myByte;
		//you have to cast it
		i3=(int)myByte;
		/*
		 * you can't test for equalivance with two different wrapper
		 * types. here we have an Integer and a Byte
		 */
		//System.out.println(i3==myByte);
		System.out.println(i3);
		System.out.println(myByte);
		/*
		 * this will not compile
		 * we can cast from a smaller type to a bigger type
		 * i.e cast from byte to int
		 * but not from a bigger type to a smaller type
		 * i.e cast from int to byte
		 * because if you could, information could be lost
		 * integer number=3455677;
		 * the above number is greater than 128, so a byte could not 
		 * store the above number without losing a lot of information 
		 * about the number
		 */
		//myByte=(byte)i3;
		/*
		 * even though these two objects have the same value, this
		 * will return false always. because i3 is an Integer wrapper 
		 * and myByte is a byte wrapper
		 */
		System.out.println(i3.equals(myByte));
		/*
		 * here we are casting myByte to be an int
		 * both numbers are 99, so true
		 */
		System.out.println(i3.equals((int)myByte));//returns true
		/*
		 * instead of casting we are getting the intValue of the
		 * Byte wrapper myByte, which will be 99
		 * so this returns true
		 */
		System.out.println(i3.equals(myByte.intValue()));//returns true
		
		Long myLong=12340000L;
		/*
		 * each numeric type as a intvalue(),shortValue(),
		 * doubleValue(),etc which gets, for instance in this
		 * case, the integer value of the number stored in the
		 * testLong Long wrapper object
		 */
		Integer finalInt=myLong.intValue();
		Byte finalByte=myLong.byteValue();
		Short finalShort=myLong.shortValue();
		Double finalDbl=myLong.doubleValue();
		Float finalFloat=myLong.floatValue();
		
		System.out.println(finalInt);
		System.out.println(finalByte);
		System.out.println(finalShort);
		System.out.println(finalDbl);
		System.out.println(finalFloat);
		
		
	}

}
