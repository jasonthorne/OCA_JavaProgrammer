package com.android;

import java.util.concurrent.SynchronousQueue;

public class Test implements InterfaceTypes{

	//this is abstract method from the InterfaceTypes interface
	@Override
	public void takeApe(Ape magilla) {
		System.out.println("takeApe method in Test class");
		
	}
/*
 *This method can take an Ape or a subclass of Ape which is a hUman so
 *this method can take an Human or An ape
 *This method returns an Ape, so it can return a ape or a sub class of Ape
 *which is a Human. This method can return a Human or a Ape, here we
 *choose to return a Human
 */
	@Override
	public Ape returnApe(Ape magilla) {
		System.out.println("returnApe method in Test class");
		Human hanna=new Human();
		Ape andy=new Ape();
		/*
		 * this would be returning an Ape reference to an Ape object
		 */
	//	return andy;
		/*
		 * this is returning an Ape reference to a Human object called
		 * hanna
		 */
		return hanna;
	}
	/*
	 * This method can't take or return an Ape, this method CAN ONLY take 
	 * or return a Human or a sub class of Human, NOT A SUPERCLASS
	 */
	Human returnHuman(Human myHuman) {
		System.out.println("returnHuman method in test called");
		return new Human();
	}
	/*
	 * we have a static method in the InterefaceTypes interface calld
	 * statmMethod(). YOU CANNOT override static methods, so this is a
	 * totally different statmethod() to the one in the interface, they
	 * just happen to have the same name and signature
	 */
	//@Override
	static void statMethod() {
		System.out.println("static method in test class");
	}

}
