package com.gretb;

public class Animal {
	
	protected void eat(){	
	}
	
	Animal returnAnim(Animal myAnimal){
		return new Animal();
	}
}
/*
 * method signature have to match
 * with the following points to
 * note
 */
class Mammal extends Animal{
	@Override
	/*can be more visible but
	 * not less, public is less
	 * restrictive than protected
	 */
	public void eat(){
		
	}
	@Override
	/*
	 * an Overriding method can return a 
	 * subclass of the method it is 
	 * overriding, but the parameter list
	 * has to be same
	 */
	Mammal returnAnim(Animal myAnimal){
		return new Mammal();
	}
	
}
