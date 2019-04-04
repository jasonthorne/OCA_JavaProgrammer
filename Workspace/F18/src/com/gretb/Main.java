package com.gretb;

import java.util.concurrent.SynchronousQueue;

public class Main {

	public static void main(String[] args) {
		//will print out Dog Constructor called for every dog created
		Dog spot=new Dog();//this creates one dog
		//creates an array for 24 dogs
		Dog[]dogArray=new Dog[24];
		//populates the array with 24 dogs
		for(int i=0;i<24;i++) 
		{
			dogArray[i]=new Dog();//this creates 24 dogs
		}
		//we see "Dog Constructor called" printed 25 times
		//this is calling the Cat constructor
		Cat tibbles=new Cat(12,"tibbles",2.3);
		Cat tom=new Cat(11,"tom",3.5);
		
		System.out.println("name of tibbles is "+tibbles.name);
		System.out.println("age of tibbles is "+tibbles.age);
		
		tibbles.printMe();
		tom.printMe();
		/*
		 * you cannot create a cat this way, as there is  no constructor
		 * in the Cat class that takes no variables
		 */
		//Cat tom=new Cat();
		/*
		 * this uses the default constructor in the printer class
		 * this is the hidden built in no arguement constructor that every
		 * class has, if no constructor of your own, is created in the
		 * class
		 */
		Printer myPrint=new Printer();
		/*
		 * create two arrays of ints that we will use use in the 
		 * printAll() method
		 */
		int[]myArray= {3,5,78};
		int[]myArray2= {10,100,1000};
		//this will display all the numbers in our arrays
		myPrint.printAll(myArray);
		myPrint.printAll(myArray2);
		/*
		 * you can put in a method call in a print statement, as long
		 * as the method call is RETURNING a value. if it's returning 
		 * void, you get an error.
		 */
		System.out.println("sum of array is "+myPrint.sumAll(myArray2));
		/*
		 * you can assign this to a variable, as this method returns the 
		 * int 1110
		 */
		int sum=myPrint.sumAll(myArray2);
		System.out.println("sum is "+sum);
		/*
		 * this  generates an error as this method returns void, which 
		 * means it returns nothing. you can't put nothing in a print
		 * statement
		 */
		//System.out.println(myPrint.noReturn());
		
		

	}

}
