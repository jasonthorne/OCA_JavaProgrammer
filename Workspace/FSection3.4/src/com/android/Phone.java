package com.android;

public class Phone {
	/*
	 * this method can take Any object, which means it can also take
	 * any subclass of Object. the Object class is the super class
	 * of EVERY other class that will ever be created in java.
	 * however this is a very limited object, it can only call methods
	 * first created in the Object class.
	 * so if you sent it a Dog or Animal, it could not call any methods
	 * of the Animal or Dog class, only the methods Animal and Dog
	 * inherited from the Object class
	 */
	void talk(Object obj) {
		obj.getClass();
		obj.hashCode();
		obj.toString();
		
	}
	/*
	 * this is a method that can take an array of ints, which is 
	 * what a phone number is
	 */
	void dial(int[]numbers) {
		System.out.println("dial number that take an array of ints");
	}
	/*
	 * this will not work, as ...nums puts all your  nubmers into an
	 * array. So this method signature is exactly the same as the 
	 * other dial metho. You can't have two methods with the same
	 * signature in the same class
	 */
/*	void dial(int...nums) {
		
	}*/
	/*
	 * this is a method that can take a double or any SMALLER numeric
	 * data type
	 */
	void dial(double dnum) {
		System.out.println("dial method that takes a double");
	}
	
	void call(int num,double dnum) {
		System.out.println("call method that takes a int and double");
	}
	/*
	 * different order of parameters so yes these methods are
	 * overloaded
	 */
	void call(double dnum,int num) {
		System.out.println("call method that takes a double and a int");
	}

}
