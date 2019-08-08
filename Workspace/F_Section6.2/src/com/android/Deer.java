package com.android;

public class Deer implements Run{

	/*
	 * from the Move interface which is the super class
	 * interface
	 */
	@Override
	public void landBased() {
		System.out.println("deer landbased");
		
	}
/*
 * this is from the Run interface which is a sub class of the
 * Move interface
 */
	@Override
	public void runSpeed() {
		/*
		 * when a class implements an interface we can access the
		 * variables of an interface by just typing the variable name.
		 */
		System.out.println("deer run and finalINt is "+finalInt);
		System.out.println(finalNum);
		/*
		 * the only way we can access a static method in interface
		 * is the name of the interface followed by the name of the
		 * static method
		 */
		Run.race();
		
	}

}
