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
	 * An interface CAN have variables, BUT ALL vers in an interface are "public, static final"
	 */
	
	
}
