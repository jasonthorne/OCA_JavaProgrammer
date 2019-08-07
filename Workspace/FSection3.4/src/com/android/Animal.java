package com.android;

public class Animal {
	
	int eat() {
		System.out.println("eat method that takes no variables");
		return 0;
	}
	/*
	 * this is an overloaded method, as the eat method has a different
	 * parameter list, this takes an int but the above eat() method
	 * takes no parameters. RETURN TYPE DOES NOT MATTER FOR 
	 * OVERLOADED METHODS
	 */
	void eat(int num) {
		System.out.println("eat method that takes an int");
	}
	/*
	 * you can't have this method in this class, as you already have
	 * an eat method that takes no variables, and what uniquely
	 * identifies a method is the name in combination with the
	 * method parameters
	 */
	/*double eat() {
		
	}
	*/
	int eat(double dnum,String str) {
		System.out.println("eat method that takes a double and string");
		return 1;
	}
	/*
	 * this method has a different ORDER of parameters to the 
	 * above eat() method
	 */
	int eat(String str,double dnum) {
		System.out.println("eat method that takes a string and a double");
		return 1;
	}
	/*
	 * access modifers do not matter for overloading, i.e private,
	 * protected, public
	 * you can only access this method inside the Animal class,
	 * no where else, not even in the Dog class which extends 
	 * Animal
	 */
	private void eat(boolean myBool) {
		System.out.println("eat method that takes a boolean");
	}
	
	void drink() {
		System.out.println("Animal drinking");
	}
	/*
	 * this variable will be either a Animal, Dog or Collie
	 */
	String type=this.getClass().getSimpleName();
	void identifyMe() {
		System.out.println("I am a "+this.getClass().getSimpleName());
	}

}//end of Aninmal class

class Dog extends Animal{
	/*
	 * this method OVERLOADS the drink() method in the Animal class
	 * 
	 */
	void drink(int num) {
		System.out.println("drink method in Dog that takes an int");
	}
	
	// this overrides the drink() method in the Animal class
	/*void drink() {
		return;
	}*/	
	
	void bark() {
		System.out.println("i am a "+type+" barking");
	}
}

class Collie extends Dog{
	
}
