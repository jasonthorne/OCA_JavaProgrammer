package com.android;

public class Deer implements Run {

	@Override
	public void landBased() { //this is from the Move interface 
		System.out.println("deer landbased method");
		
	}

	@Override
	public void runSpeed() { //this is from the Run interface, which is a subclass of the Move interface. 
		/*
		 * when a class implements an interface, we can access the variables of an interface just by typing the variable name:
		 */
		System.out.println("deer run and finalInt is: " + finalInt);
		System.out.println(finalNum);
		
		
		//run(); //CANT access the static method from the implemented interface this way
		Run.race(); //this is the ONLY way to access the interfaces method.
	}

}
