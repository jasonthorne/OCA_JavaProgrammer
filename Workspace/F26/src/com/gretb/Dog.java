package com.gretb;
/*
 * top level classes can only be either public or default/package level access
 * a top level class is a class that is not inside another class
 */
//this is a default access level class
class Car{
	
}

class Astronaut{
	/*
	 * this is an INNER class and inner classes can be public, protected, default
	 * and private
	 */
	private class heart{
		
	}
	
	protected class lungs{
		
	}
}
//can only have one public class per file and it has to be same name as file
public class Dog {
	/*
	 * Access level modifiers
	 * public - available to all classes everywhere, identified by the "public" 
	 * keyword
	 * protected - available in same package and in derived sub classes regardless
	 * of where the sub class is (so if sub class in a different package it can
	 * access protected members in it's super class) - identifed by keyword
	 * "protected"
	 * default - available in same package, there is no default keyword, you 
	 * identify a member as being default by a lack of 'private', 'protected' or
	 * 'public' in front of your member
	 * private - most restrictive - means available only in same class, identified
	 * by the keyword "private"
	 * all of the above can be applied to atributes of a class, methods of a 
	 * class and constructors, but NOT local variables
	 */
	/*
	 * this atribute of the Dog class is avaialable everywhere, even in 
	 * different programs and applications and packages. 
	 * usually the the atributes of a class should NOT BE PUBLIC
	 */
	public int age;
	/*
	 * this is default level access, there is not keyword for this. if we 
	 * define a atribute or a method with no access level, it is given the access
	 * level of default.
	 * default means it's available to every other class in the same package
	 */
	double weight;
	/*
	 * this is avaialable in the same package, plus it is also available in 
	 * derived/sub classes. So if we have a sub call in a different package 
	 * then this will be able to access this attribute
	 */
	protected double height;
	/*
	 * this is the most restrictive level access. This atribute is available only
	 * inside the same class (inside the Dog class). Even if a class extends 
	 * the Dog class i.e class collie extends Dog, collie will have no access to
	 * "name", because its private. We usually access these variables not directly,
	 * but through public methods, called getters(), to get the value and 
	 * setters() to set the value.
	 */
	private String name;
	/*
	 * this constructor is only available inside the com.gretb package.
	 * so if we are outside this package we can't create a dog by going
	 * Dog spot=new Dog();
	 */
	Dog(){
		System.out.println("default level access Dog Constructor");
	}
	/*
	 * this constructor if available in all classes everywhere, so anywhere we
	 * can create a dog by going 
	 * Dog spot=new Dog(12,"spot",2.34,1.23)
	 */
	public Dog(int age,String name,double weight,double height) {
		this.age=age;
		this.name=name;
		this.weight=weight;
		this.height=height;
		System.out.println("public level access Dog constructor that takes an"
				+ " int, string, double and double");
	}
	/*
	 * this constructor is avaiable within the same package and also in derived/
	 * subclasses regardless of whether they are in the same package or not
	 */
	protected Dog(int age) {
		
		this.age=age;
		System.out.println("protected level access Dog Constructor that takes an "
				+ " int");
	}
	/*
	 * this constructor is available only within the Dog class
	 */
	private Dog(String name) {
		this.name=name;
	}
	
	//public eat method
	public void eat() {
		System.out.println("dog eat method available everwhere");
		
	}
	//protected drink method
	protected void drink() {
		System.out.println("dog drink method protected available in same package "
				+ " and in derived/sub classes");
	}
	//default run method
	void run() {
		System.out.println("dog run method default/package level available in "
				+ "same package only");
	}
	//private bark method
	private void bark() {
		System.out.println("Dog bark method private available only in same class "
				+ ", which is the Dog class");
	}
	/*
	 * this is a public getter method, that will return the name of this Dog, 
	 * which is a private atribute. so a getter is a public method you use to 
	 * access a private memeber.
	 * in this method we are also calling the private bark() method
	 */
	public String getName() {
	//	bark();
		return name;
	}
	/*
	 * using a public method to call the private bark() method
	 */
	public void getBark() {
		System.out.println("this is calling the private bark() method");
		bark();
	}
	
	
	

}


