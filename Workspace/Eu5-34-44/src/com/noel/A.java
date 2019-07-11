package com.noel;

public class A {
	//constructors
	public A() { }
	/*
	 * creating an object of this class
	 * with this constructor will
	 * just print out the value used
	 * when creating the object
	 * will print out 3
	 */
	public A(int i) {   
		System.out.println(i );    
		}
}
/*
 * statics called first so s1 is
 * first created then s2 then 
 * A a is created
 * so creating a object of B 
 * class prints 1,4,2
 */
class B{
	   static A s1 = new A(1);
	   A a = new A(2);
	  
	   static A s2 = new A(4);
	}
