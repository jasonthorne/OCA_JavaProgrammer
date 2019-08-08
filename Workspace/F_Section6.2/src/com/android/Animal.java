package com.android;

import java.util.concurrent.SynchronousQueue;

/*
 * an abstract can have both concrete methods and abstract
 * if you have an abstract method in a class, the class has to be
 * marked abstract
 */
public abstract class Animal {
	
	//concrete method
	void breed() {
		System.out.println("Animal breeding");
	}
	//concrete method
	void eat() {
		System.out.println("Animal eating");
	}
	/*
	 * abstract method has no body and is marked abstract
	 * any concrete class that extends Animal() has to override
	 * the drink() method. a class that extends this class can choose
	 * whether it wants to override the eat() and the breed() method
	 */
	 abstract void drink();
}//end of Animal class

class Dog extends Animal implements Behaviour{
	/*
	 * this is the Dog classes own method, pant() and this method
	 * is available only to the Dog class and any sub classes of Dog
	 * if i have an Animal reference to a Dog object, this object 
	 * will not have access to pant()
	 */
	void pant() {
		System.out.println("Dog panting");
	}
/*
 * The Dog class extends the Abstract Animal class and in the Abstract
 * Animal class we have a abstract method drink(). we HAVE TOO override
 * the drink method in the Dog class. When a concrete class extends
 * an abstract class, the concrete HAS TOO override any abstract method.
 * if an abstract class extends an abstract class, you do NOT HAVE TOO
 * override the abstract method in the super class
 */
	@Override
	void drink() {//comes from Animal class
		System.out.println("Dog drinking");
		
	}
	/*
	 * both sad() and happy() are the abstract methods contained
	 * in the Behaviour interface. we HAVE TOO override any abstract
	 * methods in an interface a class is implementing. Dog class
	 * implements Behaviour, Behaviour has two abstract methods, 
	 * sad() and happy() so Dog has to override both sad() and happy()
	 */
	@Override
	public void sad() {//from Behaviour interface
		System.out.println("dog Sad");
		
	}
	@Override
	public void happy() {//from Behaviour interface
		System.out.println("dog happy");
		
	}
}//end of Dog

class Cat extends Animal implements Behaviour{

	//abstract method in Animal class
	@Override
	void drink() {//gets from animal class
		System.out.println("Cat drinking");
		
	}
	/*
	 * eat() is concrete method in the Animal class, we do not have
	 * too override, however in this case we choose to override it
	 */
	//concrete method in Animal class
	@Override
	void eat() {
		System.out.println("cat eating");
	}
	/*
	 * both sad() and happy() are abstract methods from the Behaviour
	 * interface so we HAVE TOO override them
	 */
	@Override
	public void sad() {
		System.out.println("Cat sad");
		
	}
	@Override
	public void happy() {
		System.out.println("Cat happy");
		
	}
	/*
	the mad() method is a default method in a interface (THIS IS
	NOT TO BE CONFUSED WITH DEFAULT/PACKAGE LEVEL ACCESS, FOR WHICH
	THERE IS NO KEYWORD). this means that the mad method has a body
	in the interface, and we DON'T HAVE TO override it. we choose
	not to override it in the Dog class, however we chooose to override
	in the Cat class, which is what we're doing here
	 */
	
	@Override
	public void mad() {
		System.out.println("Cat mad");
	}
	/*
	 * this will not compile, as it can't be package level access
	 * as the mad() method in the interface can't be LESS ACCESSIBLE.
	 * the mad() method in the interface is public void mad() so
	 * the overriding method has to be, at least, the same visibilty
	 * , which is public
*/	/*void mad() {
		System.out.println("cat mad");
	}*/
	
}
