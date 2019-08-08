package com.android;

import java.util.ArrayList;
import java.util.Arrays;

public class Questions {
	
	static void outOfBounds() {
		int[]numbers= {45,67,89};
		ArrayList<Integer>listNum=new ArrayList<>();
		listNum.add(567);
		listNum.add(677);
		listNum.add(999);
		//this will give a IndexOutOfBoundsException
		System.out.println(listNum.get(5));
		//this will give ArrayIndexOutOfBoundsException
		System.out.println(numbers[5]);
	}
	
	static void classCast() {
		System.out.println("ClassCastException");
		Animal[]farm=new Animal[3];
		/*
		 * these are all super class references (Animal) to sub class objects
		 * , both Dogs and Cats
		 */
		farm[0]=new Dog();//this is a Animal reference to a dog object
		farm[1]=new Cat();//this is a Animal reference to a Cat object
		farm[2]=new Dog();//this is a Animal reference to a Dog object
		/*
		 * this creates a Dog reference to a Dog object, this is casting
		 */
		Dog myDog=(Dog)farm[0];
		//this is a Animal refrence to a Dog object, only has access to Animal
		//methods
		Animal anDog=new Dog();
		//has no access to dog eat() method
		//anDog.eat();
		Dog myDog2=(Dog)anDog;
		myDog.eat();
		/*
		 * this code will only compile if farm[2]could be a Cat. it could
		 * as this is a Animal reference, and a Animal reference can be a
		 * reference to a Cat, Dog or Animal
		 * this will compile but it will produce a ClassCastException 
		 * because farm[2] is a Dog and you can't cast it to be a Cat
		 */
	//	Cat myCat=(Cat)farm[2];
		/*
		 * this will not even compile, there is no relationship between
		 * employee and cat
		 */
		//Cat empCat=(Cat)new Employee();
		/*
		 * you can have a super class reference to a subclass object
		 */
		Animal catDog=new Cat();
		/*
		 * you can't  have a sub class reference to a super class object
		 * this will not compile
		 */
	//	Cat catAnimal=new Animal();
		/*
		 * this code will compile, but it will produce a classCastException
		 * as you can't have a sub class reference to a super class object
		 * and then try to cast it
		 * you can't change a super class to a sub class
		 */
		Cat catAnimal=(Cat)new Animal();
		
	}
	/*
	 * as far as i know you have to explicitly throw this exception
	 */
	static void illegalArgument(String pwd) {
		if(pwd==null|| pwd.length()<6) {
			System.out.println("Illegal password format");
			throw new IllegalArgumentException("Password cannot be shorter "
					+ "than 6 characters");
		}
	}
	
	static void nullPointer() {
		/*
		 * when you create an array of Objects and you don't give them any
		 * explicit value, each itme in the array is null
		 */
		Dog[]kennel=new Dog[3];
		/*
		 * i creat a dog object, this then has access to all the methods
		 * of the Dog, only one the eat() method
		 */
		Dog spot=new Dog();
		spot.eat();
		System.out.println(spot);
		//not an error to access a null object
		System.out.println(kennel[0]);
		/*
		 * however it you attempt to do anything with a null, i.e
		 * call a method of its class (n.b a null object CAN CALL a static
		 * method)
		 * you will get a NullPointerException
		 */
		//kennel[0].eat();
		/*
		 * similarily here rext is a null object, so if we try to call the
		 * eat method of the Dog class, we will get a NullPointerException
		 */
		Dog rex=null;
		//this generates a NullPointerException
		rex.eat();	
	}
	
	static void arithmetic() {
		/*
		 * this is when you carry out an illegal artithmetic operations
		 * easiest one to show is divide by 0
		 * this is only the case for integers
		 */
		//System.out.println(45/0);
		/*
		 * if you have a double in your calculation you will NOT get a
		 * ArithmeticException, you will get the answer of "Infinity"
		 * or if you have a double 0.0 you get NaN
		 */
		System.out.println(4/0.0);
		System.out.println(4.0/0);
		System.out.println(0.0/0);
		/*
		 * if you have a integer and you divide by a larger integer
		 * you answer will always 0
		 * here 4/5 is 0.8, integer division lops off what is after the 
		 * decimal point, so the answer will be 0
		 */
		System.out.println(4/5);
	}
	
	static void numberFormat() {
		/*
		 * NumberFormatException is generated when we try to parse a String
		 * does not contain a valid number
		 * this exception is generated when you are trying to get a number
		 * out of a string that contains no numbers or not a valid number
		 */
		System.out.println("NumberFormatException");
		String number="234";
		String number2="4.56";
		int num=Integer.parseInt(number);
		System.out.println("num is "+num);
		double dnum=Double.parseDouble(number2);
		System.out.println("dnum is "+dnum);
		/*
		 * this text contains no numbers so this will compile but will
		 * produced NumberFormatException
		 */
		String wrongNum="banana";
		//num=Integer.parseInt(wrongNum);
		num=0xfff;
		System.out.println(num);
		String hexNumber="fff";
		/*
		 * this will also produce a numberFormatException as we have to 
		 * tell the parsers that this string contains not a Decimal number
		 * but a Hexadecimal number (base 16)
		 */
		//num=Integer.parseInt(hexNumber);
		/*
		 * this will parse out the string, which contains a hex number,
		 * to be an int. We have to tell the Parse that this is base
		 * 16 number, which is a hexadecimal number
		 */
		num=Integer.parseInt(hexNumber,16);
		System.out.println(num);
		String binaryNum="1001011";
		/*
		 * this will print out 75 as this is a base 2 number
		 */
		num=Integer.parseInt(binaryNum,2);
		System.out.println(num);
		/*
		 * this will generate a numberformatexception as this hex numbers
		 * only go as far as f
		 */
		String number3="123feabg";
		num=Integer.parseInt(number3,16);
	}
	
	static void ExceptionInitialiserError() {
		Statics myStatics =new Statics();
		Statics myStatics2=new Statics();
	}

}
