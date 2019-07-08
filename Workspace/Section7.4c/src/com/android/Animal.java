package com.android;

public class Animal {
	
	Animal(){
		System.out.println("Animal constructor");
	}
	
	void eat()throws Exception{
		System.out.println("Animal eat method that throws 'Exception'");
	}

}

class Dog extends Animal{
	/*
	 * When you are overriding a method that throws any exception, 
	 * the overriding method can throw the same exception class or a subclass of that exception class.
	 */
	
	void eat() throws RuntimeException{
		System.out.println("Dog eat method that throws 'RuntimeException'");
	}
	
	Dog(){
		System.out.println("Dog constructor");
	}
}

class Collie extends Dog{
	Collie(){
		System.out.println("Collie constructor");
	}
	
	//This eat method can ONLT throw the same exception as Dog above, or a subclass of it.
	//void eat() throws Exception { // - Computer say's no. 
	void eat() throws ClassCastException{
		System.out.println("Collie eat method that throws 'ClassCastException'");
	}
}



class BorderCollie extends Collie{
	
	BorderCollie(){
		System.out.println("BorderCollie constructor");
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++
	//no exception is considered a subclass of exception.
	void eat() {
		
	}
	
}














