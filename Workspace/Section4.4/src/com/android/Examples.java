package com.android;

import java.util.ArrayList;
import java.util.Arrays;

/*
 *An arraylist is a list. It implements the list interface.
 *There are 2 major differences from arrays:
 *1. an arraylist can change size.
 *2. An arraylist can only take objects. An array can take both objects and primitives.  
 */

public class Examples {

	static void ex1() {
		
		System.out.println("yo");
		
		ArrayList<String>strList1 = new ArrayList<String>();
		
		//you dont NEED the 'string' on the right brackets (for now...)
		ArrayList<String>strList2 = new ArrayList<>(); 
		
		//an array of length 4 with 4 numbers in it. But you cant have any more than 4 numbers in this array. 
		int[]myArray = {34,56,78,99};
		
		myArray[0]=100;
		//myArray[4]=9; //runtime exception
		
		//ArrayList<String>names = Arrays.asList<String>("noel", "mary", "paddy", "bob", "frank");
		
		ArrayList<String>names = new ArrayList<>();
		
		//adding to an array, requires the use of the add method:
		names.add("mary");
		names.add("bob");
		names.add("frank");
		names.add("barney");
		
		//printing the elements of an arraylist. (the object's toString method has been overridden to print these)
		System.out.println(names);
		
		
	}
}
