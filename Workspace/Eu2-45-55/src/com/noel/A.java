package com.noel;

public class A {
	int i;
	   public A(int x) 
	   { 
		   this.i = x; 
		   }
}

class B extends A{
	int j;
	//this is called by the last constructor in this class
	   public B(int x, int y) 
	   {
		   super(x);  this.j = y; 
		   }
	   /*
	    * there is no constructor in the super class
	    * that takes no arguments. as every sub class
	    * first calls a super class constructor.
	    * so the below constructor is actually 
	    * attempting to call a super class constructor
	    * with not aruguments which does NOT exist
	    */
	  /* B( ) 
	   {
	   		super();
	   }*/
	   /*this constructor has the same problem as
	    * the above
	    * B(int y ) 
	    * { 
	    * 		super();
	    * 		j = y; 
	    * }
	    */
	   /*
	    * this works as we are callign a super constructor that
	    * takes an int, and we have such a constructor
	    * in the A class
	    */
/*	   B(int y ) { 
		   super(y*2 ); 
		   j = y; }*/
	   /*
	    * same issue trying to call a blank constructor in the 
	    * A class
	    * B(int y ) { 
	    * super();
	    * i = y; 
	    * j = y*2; }
	    */
	   /*
	    * works as we are calling a constructor in
	    * this class that takes two ints
	    */
	   B(int z ) { 
		   this(z, z); 
		   }
}
