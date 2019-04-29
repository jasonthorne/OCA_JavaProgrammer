package com.animal.mammal;

public interface Behaviour {
	
	/*
	 * ALL methods by default in an interface are 'Abstract' and 'Public' +++++++++++++++++
	 * Up to Java 8, this what what was allowed in an interface. 
	 * From Java 8 onwards you could have DEFAULT IMPLEMENTATION and STATIC METHODS in an interface. 
	 */
	
	//A DEFAULT METHOD. any class implementing this interface does NOT have to override this method (i.e provide a body for it in any method implementing the interface).
	default void angry() { //THese HAVE TO have a body here!
		System.out.println("I am angry");
	}
	
	
	//A STATIC METHOD. YOyu can have static methods in interfaces from Java8 onwards. These HAVE TO have a body
	public static void statMethod(){
		System.out.println("statMethod Called");
	}
	                                
	
	
	void mad();
	void sad();
	void happy();
}


interface Movement { //an interface is a class, so the rule that you can only have one Public class in the file still applies (this is default).
	
	void run();
	void walk();
	void swim();
}


//This is in the Behaviour.java file, it is NOT in the behavior INTERFACE.
class Mammal {
	
}

