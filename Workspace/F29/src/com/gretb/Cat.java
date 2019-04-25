package com.gretb;

public class Cat {
	int age;
	
	/*
	 * when a variable is marked as final, this means that this variable
	 * CANNOT BE CHANGED
	 * A method can also be final, if a method is final it means it
	 * CANNOT BE OVERRIDEN
	 * String class is final
	 */
	/*
	 * if we do not give a value to a final string this will generate an
	 * error. As a final variable cannot change, if you do not give it 
	 * a value to start, it can never have a value
	 */
	final String name;
	final double weight;
	//this is a static variable that never change
	//a final static is the closet you can come in java to a global constant
	final static double height=4.5;
	
	public Cat(int age,String name, double weight) {
	//	super();
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	/*
	 * you cannot have a constructor in the Cat class that does not give
	 * a value to the final variables of name and weight. This constructor
	 * would mean we could create a cat without giving a value to the 
	 * final string name or the final double weight
	 */
	/*Cat(){
	
	}*/
	/*
	 * a final method is a method that CANNOT BE OVERRIDEN in a subclass
	 * it can be overloaded (because overloading is a totally different 
	 * method)
	 */
	final void eat() {
		int num;
		System.out.println("i am a cat eating");
	}
	
	void drink() {
		System.out.println("I am a cat drinking");
	}

}//end of Cat class

class Siamese extends Cat{
	/*
	 * if you have no constructor in this class, this will not compile
	 * as the default constructor in the Siamese is looking for a blank
	 * Cat constructor, which, because of the final variables CANNOT EXIST
	 * we create a constructor that takes in a int, string and double
	 * and pass these variables to the Cat class constructor that takes
	 * an int, String and double
	 */
	Siamese(int age,String name, double weight){
		//calling cat constructor that takes a int, String and double
		super(age,name,weight);
	//	super();
	}
	/*
	 * overriding the drink method in the Cat class
	 * (non-Javadoc)
	 * @see com.gretb.Cat#drink()
	 */
	void drink() {
		System.out.println("overriden siamese drink method");
	}
	/*
	 * the eat() method in the Cat class is final, so it CANNOT be 
	 * overriden(non-Javadoc)
	 * @see com.gretb.Cat#eat()
	 */
	/*void eat() {
		System.out.println("cannot override a final method");
	}*/
	/*
	 * you CAN overload a final method, as it's a different method
	 */
	void eat(int num) {
		
	}
}
