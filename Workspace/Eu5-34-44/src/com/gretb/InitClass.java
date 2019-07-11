package com.gretb;

public class InitClass {
	/*
	 * statics first and called
	 * in order they are in the class
	 * STATICS ARE ONLY CALLED ONCE
	 * PER CLASS
	 * next instances and again in order
	 * they are in the class
	 * INSTANCES ARE CALLED EACH TIME
	 * A OBJECT IS CREATED
	 * lastly constructors are called
	 */
	int m;
	   static int i1 = 5;
	   static int i2 ;
	   int  j = 100;
	   int x;
	   public InitClass(int m){
		 
	      System.out.println(i1 + "  " + i2 + "   "
	   + x + "  " + j + "  " + m);
	   }
	   
	  { j = 30; i2 = 40; }  // Instance Initializer
	   static { i1++; }      // Static Initializer

}
