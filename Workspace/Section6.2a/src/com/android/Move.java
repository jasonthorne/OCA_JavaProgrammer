package com.android;

public interface Move {
	
	void landBased();

}

//An interface DOES NOT IMPLEMENT an interface, an interface EXTENDS an interface.
interface Run extends Move{ 
	
	/*this inherits from Move, which means that ANY class that implements the Run interface 
	 * HAS to implement all of the abstract methods in the Move interface.
	 */
	
	/*
	 * An interface CAN have variables, BUT ALL vars in an interface are "public, static & final"
	 */
	public static final int finalNum=12345;
	
	int finalInt = 67; //also public, static & final (just not declared)
	
	void runSpeed(); //Any class that implements Move will have to override runSpeed (from this interface) & landBased (from Move). 
	
	 //A static method can ONLY be called by the name of the interface followed by the static method name. "Run.race()"
	static void race() {
		System.out.println("we are in a static race method");
	}
	
	
	
}
