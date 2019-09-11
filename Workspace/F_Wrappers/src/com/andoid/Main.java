package com.andoid;

public class Main {

	public static void main(String[] args) {
		/*
		 *A wrapper object is simply a primitive variable that is 
		 *wrapped in a object. a primitive DOES NOT have any methods
		 *or atributes, when we create a wrapper, out of a primitive
		 *that means that this primitive now can call methods
		 */
		int num=5;
		/*
		 * num is a primitive which means it only has a reference
		 * to a value, of 5 in this case and nothing
		 */
		//num. will not compile as num is nothing but the number 5
		/*
		 * this is a the Integer wrapper object number, which contains
		 * the int 5. What is happening is called autoboxing, where
		 * the int vaule 5, is boxed into a Integer wrapper which we
		 * can access through the reference number
		 */
		Integer number=5;
		/*
		 * All wrapper numbers inherit from the Number class
		 */
		Number num1;
		Byte bNumber;//byte is primitive
		Short sNumber;//short is primitive
		Integer iNumber;//int is primitive
		Long lNumber;//long is primitive
		Double dNumber;//double is primitive
		Float fNumber;//float is prmitive
		Character character1;//char is prmitive
		Boolean myBoolean;//boolean is prmitive
		/*
		 * you can assign a primitive version of a wrapper to a wrapper
		 * reference
		 * num is an int
		 */
		num=5;
		/*
		 * you can assign an INT to an Integer
		 * because when you do so, the int num is AUTOBOXED (boxed) to become
		 * an Integer wrapper object that is assigned to iNumber Integer
		 * wrapper object
		 * so this creates a new Integer object that contains the value
		 * 5. this creates a NEW integer object
		 */
		iNumber=num;
		/*
		 * the opposite is UNBOXING this is taking the int value out
		 * of iNumber and assigning it to the int primitve num
		 */
		num=iNumber;
		/*
		 * this creates a new Integer object number2 with the value of
		 * 56
		 */
		Integer number2=56;
		/*
		 * this will work as a primitive int is smaller than a double
		 * so will fit inside this variable
		 */
		double dnum=56;
		/*
		 * this will not compile as 56 is an int
		 */
		//Double dNumber2=56;
		//this will not compile as num is an int
		//Double dNumber2=num;
		/*
		 * this will not compile iNumber is an INTEGER, so this is like
		 * assigning a cat to a hippo. they're both Animals but you
		 * can't do it
		 */
		//Double Dnum=iNumber;
		/*
		 * you can assign a primitive double to a wrapper DOUBle
		 */
		Double dNumber2=dnum;//assigning a double primitive to wrapper Double
		dNumber=56.0;//assigning a double value to wrapper Double
		dNumber=dNumber2;//assigning a Double wrapper to a wrapper Double
		
		byte bnum=3;
		/*
		 * assigning a primitive byte to a wrapper byte
		 */
		Byte myByte=bnum;
		/*
		 * you can assign a int value as long as the int value is less
		 * than 128 and greater than -127
		 */
		myByte=34;
		/*
		 * you can't assign a primitive variable to a wrapper byte,
		 * because num could be greater th an 128 or less than -127
		 */
	//	myByte=num;//will not compile
		short snum=7890;
		Short myShort=snum;
		//can take a int value
		myShort=567;
		//can't assign int variable to a Short wrapper
		//myShort=num;
		//all numbers with decimal points in java are by default doubles
		//so this will not compile
		//Float myFloat=5.6;
		float fnum=3.45f;
		/*
		 * just like it's primitive equalivent you have to either put an 
		 * f at the end of the number
		 */
		Float myFloat=4.56f;
		myFloat=fnum;
		//myFloat=myDouble;
		//myFloat=num;
		//can't assign an Integer wrapper to a Float wrapper
		//myFloat=number2;
		char myChar='b';
		Character myCharacter='a';
		myCharacter=myChar;
		/*
		 * you can assign a number to a Character wrapper
		 * this is the number 9
		 */
		myCharacter=57;
		System.out.println(myCharacter);
		
		Boolean myBool=false;
		boolean bool=true;
		myBool=bool;
		/*
		 * this will not compile as dNumber is a wrapper DOUBLE
		 * and iNumber is a wrapper INTEGER
		 */
		//System.out.println(dNumber==iNumber);
		dNumber=56.0;
		iNumber=56;
		myByte=56;
		/*
		 * this will compile but they can never be equal as they are
		 * different wrapper object types
		 */
		System.out.println(dNumber.equals(iNumber));
		System.out.println(iNumber.equals(myByte));
		/*
		 * using the example of the Byte and Integer classes
		 * these classes have methods called
		 * byteValue(),shortValue(),intValue(),doubleValue(),
		 * floatValue() and longValue()
		 */
		dNumber=78.99;
		int num2=dNumber.intValue();
		System.out.println("num2 is now "+num2);
		dNumber=56.0;
		iNumber=56;
		//System.out.println("numbers same "+dNumber.intValue()==iNumber.intValue());
		
		num=56;
		iNumber=56;
		/*
		 * you can use the equals method between a wrapper Integer
		 * and a primitive int, but NOT THE other way around
		 */
		System.out.println(iNumber.equals(num));
		/*
		 * this will not compile as num is NOT an object and cannot
		 * call the equals method
		 */
		//System.out.println(num.equals(iNumber));
		System.out.println(num==iNumber);//true
		System.out.println(iNumber==num);//true
		/*
		 * will not compile as two different data types and can't
		 * compare them
		 */
		//System.out.println(dNumber==iNumber);
		/*
		 * can use equals but will always be false
		 */
		System.out.println(dNumber.equals(iNumber));
		/*
		 * this will return true as this will check the intVAlue of
		 * 56.0 against the wrapper iNumber containing the int 56
		 */
		System.out.println(dNumber.intValue()==iNumber);
		/*
		 * can't call the .equals() emthod as dNumber.intValue returns
		 * an int and an int is not an object
		 */
		//System.out.println(dNumber.intValue().equals);
		/*
		 * this will work as iNumber is a INteger wrapper object
		 */
		System.out.println(iNumber.equals(dNumber.intValue()));
		
		//System.out.println(dNumber.intValue()==iNumber);//dNumber.intValue()==iNumber;
		
		
		System.out.println("our final calculations");
		/*
		 * whenever you use the new keyword you are creating a new
		 * wrapper object
		 */
		number=new Integer(34);
		number2=new Integer(34);
		System.out.println(number==number2);
		System.out.println("wrappers equal "+number.equals(number2));
		Integer number3=new Integer("34");
		Integer number5=34;
		dnum=34.0;
		//System.out.println(dnum.equals(number5));
		num=34;
		System.out.println(number5==num);
		System.out.println(number.equals(number2));
		

	}

}
