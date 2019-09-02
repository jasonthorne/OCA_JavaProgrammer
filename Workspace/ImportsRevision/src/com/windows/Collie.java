package com.windows;

import com.apple.Dog; //This imports all of the public and protected members of the Dog class (as this is a SUBCLASS of Dog).

public class Collie extends Dog {
	
	//Dog myDog= new Dog();
	
	Collie(){
		/*this is calling the constructor in the super class that takes no args
		the dog class is the super class of the Collie class and there is a construvtor in the dog class that has the following signiature:
		protected Dog()
		*/
		super();
	}
	

	public Collie(String name){
		/*
		 * This is calling the construvtor in the super class that takes a String
		 * the Dog class is the super of the collie class and there is a constructor in the Dog class that has the following sig:
		 * public Dog(String name)
		 */
		super(name);
		eat(); //protected method
		drink(); //public method
	}
	
	
	

}
