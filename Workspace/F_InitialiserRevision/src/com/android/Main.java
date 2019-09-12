package com.android;

public class Main {

	public static void main(String[] args) {
	//Methods.statMethod();
		Methods method1=new Methods();
	//	Methods method2=new Methods();
	//	method2.callStatic();
	//	Methods.callStatic();
	//	Methods.callStatic();
		/*
		 * this is not accessing the class, so the static initialiser WILL NOT
		 * run
		 */
		//Methods method3;
		/*
		 * a null object will generate a NullPointerException if it attempts to call
		 * a non static method of that class
		 */
		//Methods method3=null;
	//	method3.myMethod();
		/*
		 * a null object CAN call a static method
		 */
	//	method3.callStatic();
	
		
		

	}

}
