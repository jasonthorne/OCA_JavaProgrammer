package com.android;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

/**
 * Exam Objective 5.2 create and use enhanced for loops
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		ArrayList<String>strList=new ArrayList<>();
		strList.add("Mary");
		strList.add("Patsy");
		strList.add("Harry");
		strList.add("Bridie");
		/*
		 * an enhanced for loops always consists of a list of itmems
		 * and a variable we use to iterate through the list (in our
		 * case we are only dealing with arrays and arrayLists)
		 * the variable HAS TO BE THE SAME type as the elements in the
		 * list.
		 * in this case we have an arrayList of Strings so we have a
		 * variable of type string to iterate through the list
		 */
		//System.out.println(strList);
		//using a string to go through an arraylist of strings
		for(String name:strList) {
			System.out.println("strList name is "+name);	
		}
		//using a string to go through a array of strings
		String[]nameArray= {"Mary","Patsy","Harry","Bridie"};
		for(String name:nameArray) {
			System.out.println("nameArray name is "+name);
		}
		//using an int to go through an array of ints
		int[]numArray= {56,78,999,23};
		for(int num:numArray) {
			System.out.println("numArray number is "+num);
		}
		/*
		 * an enhanced for loop is also sometimes called a 
		 * for each loop
		 */
		StringBuilder[]sbArray= {new StringBuilder("tom"),
				new StringBuilder("George"),new StringBuilder("yvonne")
		};
		/*
		 * this will not compile as you can't use a different data type
		 * (in this case a String) to go through a list of a different
		 * data type (in this case an array of StringBuilder objects
		 */
	/*	for(String s:sbArray) {
			
		}*/
		
		for(StringBuilder sb:sbArray) {
			System.out.println("sbArray name is "+sb);
			/*
			 * this does NOT change any of the names in this array
			 * of stringBuilder. an enhanced CANNOT change values
			 * in a arrayList or array in this way
			 */
			sb=new StringBuilder("harry");
		}
		
		for(StringBuilder sb:sbArray) {
			System.out.println("sbArray not changed "+sb);
		}
		/*
		 * you CAN'T use an enhanced for loop to directly change variables
		 * in an array or arraylist, you CAN with an ordinary for loop
		 * or any other type of loop
		 */
		for(int n:numArray) {
			/*
			 * this will print out the numbers in the array
			 */
			System.out.println("number is "+n);
			/*
			 * this multiples the number by 2, if you print out this
			 * it is NOT one of the lemetns of the array. it is just the
			 * variable n which now has a value of 112, for first iteration
			 * and 156, and 1998 and 46 for the other iterations.
			 */
			n*=2;
			//all this is printing out is double the number in the array
			System.out.println("number by 2 is "+n);
		}
		//still the same numbers in our array
		for(int num:numArray) {
			System.out.println("number is still "+num);
		}
		/*
		 * you can't change the value of a primitive variable data type
		 * in an enhanced for loop. similarily you can't change what
		 * an object in an array of objects refers too, but you can change
		 * the atributes of that object.
		 * i.e we have an array of dogs, spot, rex and lassie. you can't change
		 * the face that each of the dogs will always be spot, rex and lassie
		 * but you CAN change height, weight, colour, age, etc of each dog
		 */
		for(StringBuilder sb:sbArray) {
			System.out.println("sb before change "+sb);
		}
		for(StringBuilder sb:sbArray) {
			sb.append(" lally");
		}
		for(StringBuilder sb:sbArray) {
			System.out.println("sb after change "+sb);
		}
		
		Soilder s1=new Soilder();
		Soilder s2=new Soilder();
		Soilder s3=new Soilder();
		Soilder s4=new Soilder();
		/*
		 * you can't use an enhanced for loop to initialise an 
		 * array and modify its elements
		 * you can use a for loop
		 */
		Soilder[]army=new Soilder[4];
	//	for(int i=0;i<army.length;i++)
			/*
			 * this creates four soilder and adds them to our 
			 * array, this initialies our array
			 */
	//		army[i]=new Soilder();
		
		for(Soilder s:army) {
			//this does NOT POPULATE our array
			s=new Soilder();
		}
		
		for(Soilder s:army) {
			//we still only have four null objects in this array
			System.out.println("soilder is "+s);
		}
		army[0]=s1;
		army[1]=s2;
		army[2]=s3;
		army[3]=s4;
		
		for(Soilder s:army) {
			s.fight();
		}
		/*
		 * you can't use an enhanced for to initialise values in a
		 * array of primtitives
		 * this is an array of 5 zeros
		 */
		int[]myArray=new int[5];
		for(int n:myArray)
			n=5;
		//still an array of 5 zeros
		for(int n:myArray)
			System.out.println("number is still "+n);
		//this DOES populate the array
		for(int i=0;i<myArray.length;i++) {
			myArray[i]=i*2;
		}
		for(int n:myArray) {
			System.out.println("number is now "+n);
		}
		/*
		 * strList contains four names
		 * we want to remove every name that appears at a postion in
		 * the array that is a even number
		 * you can't remove by using an enhanced for loop
		 */
		System.out.println(strList);
		for(int i=0;i<strList.size();i++) {
			if(i%2>0)
				strList.remove(i);
		}
		System.out.println(strList);
		
		int[]numArray2= {2,45,67,99};
		int[]numArray3= {345,678,990,2,88};
		/*
		 * a for loop can go through as many arrays as you like
		 * an enhanced for loop can only go through one array
		 * at a time
		 */
		for(int i=0;i<numArray2.length;i++) {
			System.out.println(numArray2[i]);
			System.out.println(numArray3[i]);
		}
		
		String[]name1={"harry","mary","laura"};
		String[]name2={"Laura","sally","shelly"};
		String[]name3={"colm","jack","michael"};
		/*
		 * this is an nested enhanced for loop
		 * this is an array of an array of strings, which means we
		 * to use an array of strings(nameArr) to iterated through the
		 * 2d array of strings.
		 * then use a string to iterate through each of the array
		 * of strings
		 */
		String[][]twoDname= {name1,name2,name3};
		
		for(String[]nameArr:twoDname) {
			for(String name:nameArr) {
				System.out.println("using nested enhanced for loop");
				System.out.println(name);
			}
		}
		

	}

}
