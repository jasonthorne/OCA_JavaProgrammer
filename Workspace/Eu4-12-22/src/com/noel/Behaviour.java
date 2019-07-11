package com.noel;

public interface Behaviour {
	void mad();
	default void bad(){
		System.out.println("Behaviour bad");
	}
}

interface Mood extends Behaviour{
	void mad();
	default void bad(){
		System.out.println("mood bad");
		/*
		 * can call the behaviours default
		 * method from a sub interface by
		 * the following method
		 * it HAS to have the name of the 
		 * super interface, which is in
		 * this case id Behaviour
		 */
		Behaviour.super.bad();
		/*
		 * you can't do this in an interface
		 *  as this is only for classes
		 *  and sub classes NOT interfaces
		 *  and sub interfaces
		 */
		//super.bad();
	}	
}

class Person implements Mood{

	@Override
	public void mad() {
		/*
		 * Person DOES not implement Behaviour
		 * so we can't go
		 */
		//Behaviour.super.bad();
		/*
		 * however Mood extends Behaviour
		 * so we can access the Behaviour bad
		 * default method through the Mood
		 * interface, which Person implements
		 */
		Mood.super.bad();//Behaviour interface
		bad();//Mood interface
	}
	
}
