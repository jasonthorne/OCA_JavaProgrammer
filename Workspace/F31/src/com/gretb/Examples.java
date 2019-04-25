package com.gretb;

import java.util.ArrayList;

public class Examples {
	/**
	 * ArrayLists
	 */
	static void ex1() {
		//this creates an array of ints called numArray of length 4
		int[]numArray=new int[4];
		/*
		 * this creates an array of ints caled numArray2 and is populated
		 * with 4 numbers, this gives the array a length of 4
		 */
		int[]numArray2= {56,78,999,123567};
		/*
		 * array numbering starts at 0, an array of length 4 goes from
		 * 0 to 3
		 */
		System.out.println(numArray[2]);//accessing 3rd element
		numArray2[0]=12000;//changing value of first element
		/*
		 * this generates an ArrayIndexOutOfBoundsException as this array
		 * is of length 4, so it's numbering goes from 0 to 3. you can't
		 * change the size of an array once it has been given a length
		 */
	//	numArray[4]=789;
		/*
		 * Arraylists are at they're simpliest a dynamic array whose size
		 * can change and we can add as many elements as we want to the 
		 * list
		 * both of the below syntax is perfectly fine for creating an
		 * arraylist of String
		 * you have to have the Data type you want on the left hand side
		 */
		ArrayList<String>strList=new ArrayList<String>();
		ArrayList<String>strList2=new ArrayList<>();
		/*
		 * we can add as many strings as we want to this arraylist
		 */
		strList.add("pat");
		strList.add("Kate");
		strList.add("mary");
		strList.add("Colm");
		/*
		 * arrayList overrides the toString method, to print out all of
		 * the elements of the arraylist
		 * so this will print out pat, kate, mary, colm
		 */
		System.out.println(strList);
		/*
		 * this will get the SIZE() of the arraylist
		 */
		System.out.println("size of Arraylist is "+strList.size());
		System.out.println("Get method of the ArrayList class");
		System.out.println("first item on arraylist is "+strList.get(0));
		System.out.println("second item "+strList.get(1));
		//this generates IndexOutOfBoundsException
	//	System.out.println("not in list "+strList.get(4));
		
		Dog spot=new Dog(23,"spot");
		Dog lassie=new Dog(4,"lassie");
		Dog rex=new Dog(7,"rex");
		/*
		 * when you put a dog object in a print statement it will call
		 * the toString() method of the Dog class and print out the details
		 * of the Dog
		 */
		System.out.println(rex);
		//creates an arrayList of Dogs
		ArrayList<Dog>dogList=new ArrayList<>();
		//populating our arraylist with three dogs
		dogList.add(spot);
		dogList.add(lassie);
		dogList.add(rex);
		/*
		 * this will look in the Dog class for a toSTring method, there
		 * is one, so all the details of all the dogs will be printed
		 */
		System.out.println(dogList);
		/*
		 * an arraylist, can only take OBJECTS, it can't take primitive
		 * variable types
		 * how do you put numbers into an arraylist? we do this with 
		 * what are called WRAPPER classes
		 */
		//ArrayList<int>intList;//will not compile
		
	}
	
	static void ex2() {
		/*
		 * Wrapper classes
		 * Wrapper classes are simply primitive data types that are 
		 * wrapped in a class
		 * byte becomes Byte
		 * short becomes Short
		 * int becomes Integer
		 * float becomes Float
		 * double becomes Double
		 * long becomes Long
		 * char becomes Character
		 * boolean becomes Boolean
		 * wrapper classes only have ONE atribute
		 */
		int num=34;
		Integer number=new Integer(num);
		Double dNumber=new Double(3.45);
		Boolean bNumber=new Boolean(true);
		Character myCharcter = new Character('a');
	//	Byte btNumber=new Byte(3);
		/*
		 * all wrapper numbers are sub classes of the super class
		 * Number
		 */
		Number newNumber=new Integer(45);
		/*
		 * can assign nubmers directly to a wrapper, but these  nubmers
		 * are NOT ints,they are now a Wrapper Integer Object
		 */
		Integer number3=new Integer(4);
		/*
		 * the number 67 is AUTOBOXED to become the wrapper Integer 
		 * object number4
		 */
		Integer number4=67;
		Integer number5=90;
		
		ArrayList<Integer>integerList=new ArrayList<>();
		integerList.add(number3);
		integerList.add(number4);
		integerList.add(number5);
		/*
		 * the number 89 is autoboxed to become the fourth wrapper
		 * integer object in the integerList arrayList
		 */
		integerList.add(89);
		
		System.out.println(integerList);
		/*
		 * all wrapper numbers are a sub class of the super class called
		 * Numbers
		 */
		ArrayList<Number>allNumbers=new ArrayList<>();
		Double dNumber2=new Double(3.45);
		Integer iNumber=new Integer(45);
		Float fNumber=new Float(23.45f);
		
		allNumbers.add(dNumber2);
		allNumbers.add(iNumber);
		allNumbers.add(fNumber);
		
	}

}
