package com.android;

public interface Move {
	
	void landBased();

}
/*
 * an interface does NOT IMPLEMENT an interface, an interface
 * EXTENDS an interface.
 * Run inherits from Move interface, which means that any class that
 * implements the Run interface also has to implement all of the 
 * abstract methods in the Move interface
 */
interface Run extends Move{
	/*
	 * an interface CAN HAVE variables, but all variables in an interface
	 * are 
	 * public
	 * static 
	 * final
	 */
	public static final int finalNum=12345;
	//this is also public final and static
	int finalInt=67;
	/*
	 * any class that implements Run HAS TO OVERRIDE runSpeed() from
	 * this interface
	 * and landBased() from Move interface
	 */
	void runSpeed();
	/*
	 * a static method can ONLY be called by the name of the interface
	 * followed by the static method name
	 * i.e
	 * this is the only way to call this method
	 * Run.race();
	 */
	static void race() {
		System.out.println("we are statically in a race");
	}
}
