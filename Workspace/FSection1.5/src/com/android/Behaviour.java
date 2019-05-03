package com.android;
/*
 * An interfaced is a class, it's a abstract class
 * its a special type of abstract
 * you IMPLEMENT an interface, which means you have to provide a body
 * for all the abstract methods contained in the interface
 * prior to java 8, interfaces were purely abstract classes with nothing
 * but abstract methods in them.
 * From Java 8 onwards they could have methods with DEFAULT implementation
 * and static methods
 * Multiple implmentation is allowed, one class can implment many
 * interfaces
 */
public interface Behaviour {
	/*
	 * here we have four abstract methods, we know they're abstract
	 * because none of them have a body.
	 * all methods without a body in an interface are by default
	 * PUBLIC and ABSTRACT.
	 * any concretes class that implements an interface 
	 * HAS TO OVERRIDE all the 
	 * abstract methods of the interface.
	 */
	void jealous();//no body, so abstract and public
	
	int anger(double dnum,char myChar);//no body, so abstract and public
	//you can put abstract and public, but you don't have as all
	//methods without a body are implicitly public and abstract
	public abstract void joy();
	
	void euphoria();
	/*
	 * With java 8 we have default implementatoin of a method. This means
	 * that any class that implements the Behaviour interface now has
	 * a method called void nervous(). The implementing class CAN CHOOSE
	 * whether to to override this method or not, if it does not override
	 * this method then it will just take the below method with its body
	 * and print out "I am nervous"
	 * this is also public
	 */
	default void nervous() {
		System.out.println("I am nervous");
	}
	/*
	 * if you have a method inside an interface, that has a body and 
	 * no DEFAULT or STATIC keyword, your code will not compile
	 * only methods that are marked STATIC or DEFAULT can have a body
	 * in an interface
	 */
/*	void anxious() {
		
	}
	*/
	/*
	 * java 8 also introduced static methods in an interface. whereas
	 * a class implmenting an interface, can define a method with the 
	 * exact same method signature and return type, YOU CANNOT OVERRIDE
	 * a static method, because a static method does not belong to any
	 * individual object, but to groups of objects.
	 * The onlyl way, to call this method, is
	 * Behaviour.statMethod()
	 * you can only call static methods in a static way when they are
	 * in an interface - name of class.name of the static method
	 */
	static void statMethod() {
		System.out.println("statMethod in the Behaviour interface");
	}

}//end of behaviour interface
