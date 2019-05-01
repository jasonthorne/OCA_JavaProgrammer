package com.android;

public interface Behaviour {
	
	//An interface is an abstract class. Has the same rules as a class. Its a special type of abstract class (you implement an interface)
	//You have to provide a body for all the abstract methods contained in the interface. 
	//Prior ot Java8, they were all abstract classes with nothing but abstract classes in them.
	//From java 8 onwards they could have methods with DEFAULT implementation and static methods.
	//Multiple implementation is allowed (one class may implement many interfaces)
	
	
	//Below are 4 abstract methods (No body). All methods in an interface are by default PUBLIC and ABSTRACT.
	//Any concrete class that implements an interface MUST override all the abstract methods from the interface.
	
	
	void jealous(); //no body, so abstract and public
	
	int anger(double aDouble, char myChar); //no body, so abstract and public. Takes a double and char, and returns an int.
	
	public abstract void joy(); //you can put in abstract and public, but you dont have to.
	
	void euphoria();
	
	//Only methods with bodies that are default or static are allowed in an interface: ++++++++++++++
	
	//==========Default================
	//with Java8 we have DEFAULT implementation of a method. This means that any class implementing this has a method called nervous().
	//The implementing class CAN CHOOSE whether to override this method or not. 
	default void nervous() {
		System.out.println("I am nervous");
	}
	
	//==========Static================
	/*
	 * Java 8 introdcued static methods in an interface. 
	 * YOU CANNOT OVERIDE a static method, because a static method does not belong to any individual object, but to a group of objects.
	 * The only way to call this method is:
	 * Behaviour.statMethod()
	 * You can only call static methods in a static way.
	 */
	
	static void statMethod() {
		System.out.println("statMethod in the Behaviour interface");
	}
	
	

	
	

}
