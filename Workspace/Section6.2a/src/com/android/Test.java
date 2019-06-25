package com.android;

public class Test implements InterfaceTypes{

	//this is from the interface InterfaceTypes
	@Override
	public void takeApe(Ape magilla) {
		System.out.println("takeApe method in Test class");
		
	}

	
	@Override
	public Ape returnApe(Ape magilla) {
		System.out.println("returnApe method in Test class");
		
		Human hanna = new Human(); //as Human extends Ape, a Human can be returned instead of an Ape.
		return hanna;
	}
	
	//This method CANT take or return an Ape. Only a Human or anything that extends from Human.
	Human returnHuman(Human myHuman) {
		System.out.println("returnHuman method in test");
		return new Human();
	}
	
	//Completely different method from the static method in InterfaceTypes. 
	static void statMethod() {
		System.out.println("static method in test - different from the static method with same name in 'InterfaceTypes'");
	}

}
