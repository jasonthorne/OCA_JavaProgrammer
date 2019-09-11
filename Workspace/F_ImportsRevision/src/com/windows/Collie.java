package com.windows;
/*
 * this imports all of the public and PROTECTED members of the Dog
 * class
 */
//import com.apple.Dog;
/*
 * this imports all of the public members from Dog and Cat and all
 * of the protected members from Dog
 */
import com.apple.*;
//can't import instance methods or instance variables
//import com.apple.Dog.drink

public class Collie extends Dog{
	
	//Dog myDog;
	Collie(){
		/*
		 * this is calling the Constructor in the super class that
		 * takes no arguments. the Dog class is the super class of the 
		 * Collie class and there is a constructor in the Dog class that
		 * has the following method signature
		 * protected Dog() {
		 */
		super();
	}
	/*
	 * this is calling the constructor in the super class that takes
	 * a String. the dog class is the super of the collie class and there
	 * is a constructor in the Dog class that has the following method
	 * signature
	 * public Dog(String name)
	 */
	public Collie(String name){
		super(name);
		eat();//protected method
		drink();//public method
	}
	
	@Override
	protected void eat() {
		
	}

}
