package com.android;

public class Donkey {
	int age;
	String name;
	double weight;
	/*
	 * This constructor is calling another constructor in the same class
	 * that takes an int,string and a double. When calling another
	 * constructor from inside a constructor, this statement HAS TO BE
	 * the first statement in the constructor and there can only be
	 * ONE call to another constructor in a constructor.
	 * if you are calling a constructor in your own class, you use the 
	 * keyword "this", if calling a constructor in a super class you
	 * use the keyword "super"
	 */
	public Donkey(){
		this(12,"neddy",120.2);
		System.out.println("donkey constructor that takes no arguments");
		//this(12);
		System.out.println("donkey constructor no args finished");
	}
	/*
	 * by default every class implicity has a call to the super 
	 * constructor that takes no arguments, it is hidden however
	 * but we can include like we have here. This is calling the
	 * super no argument constructor in the Object class.
	 * Ultimately every class inherits from the Object class and if
	 * it does'nt, this is an error
	 */
	private Donkey(int age, String name, double weight) {
		/*
		 * calling the super class Object no arguments constructor
		 */
		super();
		/*
		 * is calling the Donkey constructor that takes no arguements
		 * 
		 */
		//this();
		System.out.println("donkey constructor that takes a int,"
				+ "String and double");
		this.age = age;
		this.name = name;
		this.weight = weight;
		System.out.println("donkey constructor int, string, double "
				+ " is finished");
	}
	
	private Donkey(int age) {
		this.age=age;
	}
	
	

}
