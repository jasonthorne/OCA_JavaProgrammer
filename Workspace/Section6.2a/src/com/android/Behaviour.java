package com.android;

/*
 * All methods inside an interface are PUBLIC by default.
 */

public interface Behaviour {
	

	void sad(); //this is the same as: "public abstract void sad()". No body means it's abstract. 
	
	public abstract void happy(); //also an abstract method.
	
	/*
	 * Up to java8, the only type of method you could have in an interface was an abstract method. 
	 * From java 8 onwards though, you can have a DEFAULT method, and STATIC methods.
	 * Any class that implements this interface has to provide a body for all the abstract methods. 
	 * This is overriding them.
	 * With DEFAULT methods, you DONT HAVE TO override them, but obviously can if you want to.
	 */
	
	
	//doesnt have to be overriden.
	default void mad() {
		System.out.println("default implementation");
	}

}
