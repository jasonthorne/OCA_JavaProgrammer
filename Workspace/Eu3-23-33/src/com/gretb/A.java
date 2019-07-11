package com.gretb;

public abstract class A {
	protected int m1(){ 
		return 0; 
		}
}

class B extends A{
	/*
	 *this will not compile as you are decreasing
	 *the visibility, PACKAGE level access is less
	 *visible than PROTECTED
	 */
/*	int m1(){
		return 1;
	}*/
	/*
	 * public is more visible than protected
	 */
	public int m1(){
		return 1;
	}
}
