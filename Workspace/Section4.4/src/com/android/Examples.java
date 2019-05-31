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
		
		/*
		 * An arrayList can ONLY take objects. It cannot take primitives: 
		 * ArrayList<string>names = new ArrayList<>(); //wont Compile.
		 * 
		 * It has to be Wrapper Classes:
		 */
		
		ArrayList<Integer>integerList = new ArrayList<>();
		ArrayList<Double>doubleList = new ArrayList<>();
		ArrayList<Character>characterList = new ArrayList<>();
		
		//this int is autoboxed into an Intger:
		integerList.add(1);
		
		//adding other values to lists:
		integerList.add(new Integer(4));
		integerList.add(100);
		integerList.add(1000);
		
		//this double is autoboxed into a Double:
		doubleList.add(2.34);
		doubleList.add(new Double(45.78));
		doubleList.add(3.99);
		doubleList.add(123.77);
		
		//'e' is autoboxed into a Character wrapper obj:
		characterList.add('e');
		characterList.add(new Character('a'));
		characterList.add('b');
		characterList.add('!');
		
		
		//printing arrayLists:
		System.out.println(integerList);
		System.out.println(doubleList);
		System.out.println(characterList);
		
		
		//spinnig through list;
		for(Integer i:integerList) {
			System.out.println("number is " + i);
		}
		
		
		//for arrays we use the var length to hget the length of the array. For arrayLists we use the method size() to the size of the arraylist.
		
		//arraylist numbering starts at 0
		System.out.println("\nfor loop:");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		
		
		
	}
}
