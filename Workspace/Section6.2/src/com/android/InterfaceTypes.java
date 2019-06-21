package com.android;

public interface InterfaceTypes {
	
	
	//abstract method that takes an Ape. As a Human extends Ape, this can ALSO take a Human.
	void takeApe(Ape magilla);
	
	//abstract method that takes and RETUNS an Ape. As a Human extends Ape, this can ALSO take and RETURN a Human.
	Ape returnApe(Ape magilla);
	
	
	 //YOU CANNOT OVERRIDE THIS STATIC METHOD!!
	static void statMethod() {
		System.out.println("static method in 'InterfaceTypes' interface");
	}
	

}
