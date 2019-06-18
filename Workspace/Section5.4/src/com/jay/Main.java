package com.jay;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//ENHANDED FOR LOOP
		
		ArrayList<String>strList = new ArrayList<>();
		
		strList.add("Mary");
		strList.add("Patsy");
		strList.add("Harry");
		strList.add("Bridie");
		
		/*
		 * An enhanced for loop always consists of a list of items,
		 * and a variable we use to iterate through the list.
		 * In this case we are only dealing with arrays & arraylists.
		 * The variable has to be the SAME TYPE as the elements in the list.
		 * In this case we have an arraylsit of Strings, 
		 * so we have to have a var of type string to iterate through the list. 
		 */
		
		for(String name: strList) {
			System.out.println("name is: " + name);
		}
		
		//--------------
		System.out.println();
		String[]nameArray = {"Mary","Patsy", "Harry", "Bridie" };
		
		for(String name: nameArray){
			System.out.println("name is: " + name);
		}
		
		//--------------
		System.out.println();
		int[]numArray = {56, 67, 89};
		
		for(int num: numArray){
			System.out.println("num is: " + num);
		}
		
		//----------------
		
		StringBuilder[]sbArray = {new StringBuilder("tom"), new StringBuilder("george"), new StringBuilder("yvonne")};
		
		for(StringBuilder sb: sbArray) {
			System.out.println("sb is: " + sb);
			
			/*
			 * below doesnt work as its reasigned in next iteration. 
			 * An enhanced for loop CANNOT change values in an arraylist or array this way.
			 */
			sb=new StringBuilder("bob"); //doesnt work
		}
		
		//-------------------
		System.out.println();
		
		for(int n: numArray) {
			
			System.out.println("number is: " + n);
			n*=2; //double the number
			System.out.println("number is: " + n);
		}
		
		

	}

}
