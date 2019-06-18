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
		
		
		//-------------------
		
		/*
		 * You cant change the value of a primitive variable data tpye in an enhanced for-loop. 
		 * Similarly, you cant change what an object in an array of objects referes to.
		 * BUT you CANT change the attributes of that object.
		 * I.e se have an array of Dogs (spot, rex, lassie).
		 * You cant change the fact that each of the dogs will always be spot, rex & lassie
		 * but you CAN change the height, weight, colour age etc of each dog.
		 */
		
		for(StringBuilder sb:sbArray) {
			System.out.println("sb before change: " + sb);
		}
		
		for(StringBuilder sb: sbArray) {
			sb.append(" Lally");
		}
		System.out.println();
		for(StringBuilder sb:sbArray) {
			System.out.println("sb after change: " + sb);
		}
		
		
		//------------------------
		
		
		Soldier s1 = new Soldier(); //id 1
		Soldier s2 = new Soldier(); //id 2 
		Soldier s3 = new Soldier(); //..
		Soldier s4 = new Soldier(); 
		
		//you CANT use an enhanced for-loop to initialise an array and modify it's elements
		
		Soldier[]army = new Soldier[4];
		
		//populate the array the traditional way:
		for(int i=0;i<army.length;i++) {
			army[i] = new Soldier();
		}
		
		//populate doesnt work using an enhanced for:
		for(Soldier s: army) {
			s=new Soldier();
		}
		
		army[0] = s1;
		army[1] = s2;
		army[2] = s3;
		army[3] = s4;
		
		//using an enhanced for loop to invoke all object' fight methods:
		System.out.println();
		for(Soldier s: army) {
			s.fight();
		}
		
		//----------------------
		
		
		int[]myArray = new int[5];
		
		//doesnt work: 
		for(int n:myArray) {
			n=5;
		}
		
		System.out.println();
		for(int n:myArray) {
			System.out.println("number is still: " + n);
		}
		
		
		//does work:
		for(int i=0;i<myArray.length;i++) {
			myArray[i]=i*2;
		}
		
		//------------------------
		
		/*
		 * strList contains 4 names. We want to remove every second one.
		 */
		
		System.out.println(strList);
		
		//DOESNT WORK! 
		/*
		for(int i=0;i<strList.size();i++) {
			if(i%2 ==0) { //if the remainder of dividing by 2 is 0 (then you've hit an even position)
				strList.remove(i); //remove whats in that even position
			}
		}*/
		
		System.out.println(strList);
		
		//---------------------------
		
		
		int[]numArray2 = {2,45,67,78,89};
		int[]numArray3 = {1,67,32,95,53};
		
		//a loop can go through as many arrays as you like:
		
		for(int i=0;i<numArray2.length;i++){
			System.out.println(numArray2[i]);
			System.out.println(numArray3[i]);
		}
		
	}

}
