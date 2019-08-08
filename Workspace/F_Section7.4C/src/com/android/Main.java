package com.android;

import java.io.FileInputStream;

/*
 * open in this order
 * Main
 * Animal
 * Person
 * Vehicle
 * this lesson is about when overriding methods and constructors THROWS
 * an exception
 * a class DOES NOT have a "throws Exception" a class EXTENDS EXCEPTION
 * overloded methods that throw an exception there is no relationship
 * between overloaded methods
 * i.e 
 * void eat(int num)
 * void eat(String name)throws Throwable 
 * both of these methods are fine as overloaded methods are different methods
 * that just happen to have the same name, does not matter if one "throws"
 * any exception or not
 */
public class Main {
/*
 * when we create a Ferrari, no actual exception is generated, it merely
 * has a "throws Exception" in the Ferrari constructor. So if we have
 * a "throws Exception" in the main method, our code will compile fine
 * and not crash.
 */
	public static void main(String[] args)/*throws Exception*/throws Throwable{
		System.out.println("see Animla class for overriding methods with "
				+ "a throws Exception clause in them");
		try {
			//this will compile fine
			Ferrari myCar=new Ferrari();
		}
		catch(Exception e) {
			System.out.println("exception caught");
		}
		/*
		 * if we try to create a Ferrari outside a try/catch block we will
		 * get a compilation error, as the constructor in the Ferrari
		 * class "throws Exception" which means we have to put the creation
		 * of the Ferrari either in a try/catch block or have a 
		 * "throws Exception" main
		 */
		//Ferrari myCar2=new Ferrari();
		//Car car=new Car();
		/*
		 * the midwife Cosntructor "throws Throwable" which means the catch
		 * block has to have catch(Throwable t) and catch(Exception e) will
		 * NOT work as throwable is a super class of exception and when
		 * you catch a particular exception, that means you catch that
		 * exception or all of its sub classes NOT ITS SUPER CLASS
		 */
		try {
			Midwife mary=new Midwife();
		}
		catch(Throwable t) {
			
		}
		/*
		 * if you want this to compile you have to put in a "throws Throwable"
		 * clause in the main, as "throws Exception" will not work because
		 * throwable is a super class of Exception and the Midwife constructor
		 * has a "throws Throwable" clause
		 */
		Midwife martin=new Midwife();
		
		
	/*	try {
			FileInputStream fis=new FileInputStream("myText.txt");
		}
		finally {
			System.out.println("run finally");
		}*/
		//Midwife mary=new Midwife();
		//Plant myPlant=new Plant();
		//myPlant.grow();

	}

}
