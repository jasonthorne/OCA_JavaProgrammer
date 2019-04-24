package com.gretb;

import java.util.ArrayList;

public class Examples {
	
	static void ex1() {
		
		//+++++++ ArrayLists +++++++
		
		int []numArray1=new int[4]; //an empty array of ints called numArray1, with a length of 4
		
		int[]numArray2 = {1,2,3,4}; //an array of ints called numarray2 with 4 numbers 
		
		System.out.println("Array length: " + numArray2.length);
		System.out.println(numArray2[2]); //accessing the 3rd element of the array.
		
		//generates an out of bounds as length goes from 0-3:
		//numArray1[4] = 666;
		//System.out.println(numArray1);
		
		//ArrayList are dynamic arrays who's size can change, and you can add as many elements as you want to the list.
		
		//Datatype MUST be on the left
		ArrayList<String>StrList1 = new ArrayList<>();
		ArrayList<String>StrList2 = new ArrayList<>();
		
		StrList1.add("Laura");
		StrList1.add("Joanna");
		StrList1.add("Daniel");
		
		System.out.println(StrList1); //arrayList overrides the toString method to print out all the elements of the arrayList
		
		//This will get the SIZE:
		System.out.println(StrList1.size());
		
		System.out.println("first item in list: " + StrList1.get(0));
		
		Dog spot = new Dog(23, "Spot");
		Dog lassie = new Dog(16, "Lassie");
		Dog rex = new Dog(3, "Rex");
		
		System.out.println(rex); //prints out details of dog (because of toString being overridden in Dog class).
		
		ArrayList<Dog>dogList=new ArrayList<>();
		dogList.add(spot);
		dogList.add(lassie);
		dogList.add(rex);
		
		System.out.println(dogList); //prints out details of dog (because of toString being overridden in Dog class).
		
		//==================================
		
		//An arrayList can ONLY take Objects, not primitive variable types ++++++++++++++++++++++++++++++
		
		//So we use 'wrapper' classes (in ex2 below)
		
	}
	
	static void ex2() {
		
		//Wrapper classes are simply primitive data types that are wrapped in a class:
		//byte becomes Byte
		//int becomes Integer
		//float becomes Float
		//double becomes Double
		//long becomes Long
		//boolean becomes Boolean
		//char becomes Character
		//Wrapper classes only have ONE attribute. (the data type itself) 
		
		//create an Int wrapper from an int:
		int num = 333;
		Integer number = new Integer(num);
		
		/*
		 * All wrapper numbers are subclasses of the superclass Number:
		 */
		Number newNumber = new Integer(45); //superclass reference to a subclass object
		
		
		Integer num3 = new Integer(4);
		Integer num4 = 67;
		Integer num5 = 333;
		
		ArrayList<Integer> myInts = new ArrayList<>();
		myInts.add(num3);
		myInts.add(num4);
		myInts.add(num5);
		myInts.add(5); //is automatically wrapped into an object during insertion (Autoboxing) //+++++++++++++++++++AUTOBOXING WILL BE IN EXAM
		
	}
	

}
