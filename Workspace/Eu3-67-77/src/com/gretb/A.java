package com.gretb;

public class A {
	/*
	 * before a object of a sub class is created
	 * there has to be a call to the super class
	 * constructor, if there is no explicit
	 * call to a user defined constructor then
	 * there is a implicit call to a super class
	 * constructor that takes no arguments
	 */
	A() { 
		this("hello", " world");  }
	/*
	 * calls third this prints out the
	 * string sent to it
	 */
	   A(String s) { 
		   System.out.println(s);}
	   /*
	    * calls second and is looking for
	    * a constructor in its own class
	    * that takes One String (it 
	    * concatenates the two strings to
	    * become one string)
	    */
	   A(String s1, String s2){ 
		   this(s1 + s2); }
}
class B extends A{
	   B(){ super("good bye"); };
	   /*
	    * called first and is looking for 
	    * a constructor in the super class
	    * that takes two strings
	    */
	   B(String s){ super(s, " world"); }
	   B(String s1, String s2){ this(s1 + s2 + " ! "); }
	}
