package com.noel;
import java.util.ArrayList;
import java.util.Collection;

import com.google.*;

public class Questions {
	
	static void q23(){
		/*
	 * it consumes less memory is debatable as 
	 * once you go over size 10 with an arrayList
	 * every time you are adding a new element to
	 * a arraylist you are creating a new array.
	 * accessing a arraylist.
	 * 
	 * because of all of the above accessing
	 * elements in an array is marginally
	 * faster than accessing from an arraylist
	 * 
	 * ArrayList and array are NOT thread safe
	 * 
	 * ArrayList implements the Collections 
	 * interface Arrays DO NOT
	 * 
	 * arrays cannot be resized once created
	 * arraylists can
	 * 
	 */
	}
	
	static void q24(){
		/*
		 * when creating a new class without using
		 * the import statement we have to use
		 * the FULL qualified name
		 */
		com.gretb.Test myTest=new com.gretb.Test();
		/*
		 * if both classes in the one package no 
		 * need to have import statments
		 */
		
		/*
		 * we don't have to do all this as
		 * we are in the com.noel package, however
		 * it is not an error to do so
		 */
		com.noel.Questions myQuestion=new com.noel.Questions();
		/*
		 * similarily we have imported from the
		 * com.google package and both these
		 * options are valid
		 */
		com.google.Test2 myTest2=new com.google.Test2();
		Test2 myTest3=new Test2();	
	}
	
	static void q25(){
		/*
		 * the 'this' keyword is only available 
		 * to non static methods(constructors are
		 * also methods)
		 * 
		 * any class can contain both static and 
		 * non static methods and variables
		 * 
		 * every object has a copy of its own
		 * non static variables whereas a static
		 * variable or method only has one copy
		 * per class (i.e all students in a course
		 * will all have the one same course id)
		 *  
		 */	
		{
			int num=56;
			System.out.println("num is local and can "
					+ " only be accessed inside this "
					+ " block");
			System.out.println(num);
		}
		/*
		 * cannot access num outside of block
		 */
		//System.out.println(num);
		
		/*
		 * 'this' can't be used for static methods
		 * All non-static/instance methods in a 
		 * class are implicitly passed a 'this' 
		 * parameter when called. 
		 */
		Dog spot=new Dog();
		//call eat calls the eat() method two ways
		spot.callEat();
	}
	
	static void q26(){
		/*
		 * can't use a boolean in a switch
		 * statement
		 * you can use a string, in the question
		 * we are using the words "true" and "false"
		 */
		String strBool="true";
		
		switch(strBool){
		case "true":
			System.out.println("case is true");
			break;
		case "false":
			System.out.println("case is false");
			break;
		default:
			System.out.println("neither true or false");		
		}
	}
	static void q27(){
		int s = 5;
		s += s + mx(s) + ++s;
		System.out.println(s);
		/*
		 * s = s + s + mx(s) + ++s; 
		 * s = 5 + 5 + mx(5) + 6; 
		 * s = 5 + 5+ 8 + 6; 
		 * s = 24;
		 */	
	}
	/*
	 * for question 27
	 */
	static int mx(int s){
		for(int i=0; i<3; i++){
			s = s + i;
			}
		return s;
		}
	
	static void q28(){
		//will print true
		System.out.println(Boolean.parseBoolean("true") == true);
		//a Boolean wrapper can be null
		System.out.println(new Boolean(null));
		System.out.println(Boolean.parseBoolean("TrUe") 
				== new Boolean(null));
		/*
		 * Boolean wrapper class does not have
		 * a no args constructor
		 */
		//System.out.println(new Boolean() == false;);
		/*
		 * likewise you can't go
		 */
		//Boolean myBoolean=new Boolean()
		/*
		 * a wrapper number cannot be null you 
		 * will get a NumberFormatException
		 */
		//System.out.println(new Integer(null));
		//Integer number=new Integer(null);
		/*
		 * the Boolean class has a static final 
		 * variable called FALSE
		 */
		System.out.println(Boolean.FALSE);
		/*
		 * false as two different objects
		 */
		System.out.println(new Boolean("true") == Boolean.TRUE);
		/*
		 * will print false, as anything other than
		 * false will be false
		 */
		System.out.println(new Boolean("no") == false);
		
		Boolean myBool=true;
		System.out.println(myBool);
	}
	
	static void q29(){
		Object o = null;
		/*
		 * ArrayList implements the Collection
		 * interface
		 */
		Collection c =new ArrayList<Integer>(); 
		int[][] ia = {{23,45,67},{77,88,99}};
		/*
		 * can't use existing variable names 
		 * on the left
		 */
		//for(o : c){ }
		/*
		 * this is the correct way as
		 * this is an arraylist of integers
		 * which extends Object so we can use an
		 * object to iterate over a list of Integers
		 */
		for(Object i:c){
			System.out.println();
		}
		/*
		 * final is allowed here
		 */
		for(final Object o2 :c){ }
		/*
		 * not correct as ia is a two dimensional
		 * array
		 */
	//	for(int i : ia) { }
		/*
		 * this is correct we are using a array
		 * of ints to iterate over a two dimensional
		 * array
		 */
		for(int[]i:ia){
			
		}
		/*
		 * iterator does not return a list or 
		 * collection, so this is not valid
		 */
		//for(Iterator it : c.iterator()){ }
		/*
		 * uses the int i to iterate over the first
		 * row of our two dimensional array
		 */
		for(int i : ia[0]){ }	
	}
	
	static void q30(){
		/*
		 * this is how we call the Animal method
		 */
		Animal andy=new Animal();
		andy.Animal(10);
		new Animal().Animal(5);
		/*
		 * there is NO CONSTRUCTOR that takes
		 * an int, only a method called 
		 * Animal(int num) which you can't 
		 * call by the below method
		 */
		//andy=new Animal(5);
		/*
		 * every class has a default no arugument
		 * constructor if there is no constructor
		 * explicitly defined in that class
		 */
	}
	
	static void q31(){
		/*
		 * all methods in a interface are public
		 * can't have a method with a lower access
		 * level than public
		 * default and static methods in a interface
		 * have to have a body
		 * final is not allowed in a interface
		 */	
	}
	
	static void q32(){
		 String str = "01234567";
		 /*
		  * goes from index 4 UP TO BUT NOT INCLUDING 7
		  */
		 System.out.println(str.substring(4, 7));
		 
		 System.out.println(str.substring(4));
		 
		 System.out.println(str.substring(3, 6));
		 
		 System.out.println(str.substring(4, 6));
		 
		 try{
			 System.out.println(str.substring(4, 3));
		 }
		 catch(Exception e){
			 System.out.println(e);
		 }	 
	}
	
	static void q33(){
		/*
		 * narrowing occurs and a short can fit inside
		 * an int
		 */
		short s = 12 ;
		int num=5;
		/*
		 * an int is bigger than a short
		 */
		//s=num;
		/*
		 * a short can fit inside an int
		 */
		num=s;
		
		long g=012;
		
		long g2=45;
		g2=num;
		/*
		 * will not work as a long cannot fit inside
		 * an int
		 */
		//num=g2;
		//have to cast to be of type float
		float fnum=4.5f;
		//implicit widening will occur
		fnum=45;
	}
	
	
	
	
	
}
