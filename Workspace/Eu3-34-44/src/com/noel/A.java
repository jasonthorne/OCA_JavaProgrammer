package com.noel;
/*
 * the public class has to be same name 
 * as the file in which it resides
 * you can only have one Public top level
 * class per file
 */
public class A {
	private int num;
	protected double dnum;
	public boolean booly;
	void myMethod(){
		//access modifiers not allowed inside methods
/*		private int number;
		protected double dNumber;
		public boolean myBool;*/
	}
}
//will generate an error as public
/*
 * public class B{}*/
