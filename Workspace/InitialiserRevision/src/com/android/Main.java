package com.android;

public class Main {

	public static void main(String[] args) {
		
		//2 objects created, but static initialiser only runs ONCE (during first object creation)
		Methods method1 = new Methods();
		//Methods method2 = new Methods();
		
		
		//proper way to call a static method (through accessing the static method through the classname):
		//Methods.callStatic(); //this triggers the STATIC initialisers.
		
		//call static method in a NON static way:
		//method2.callStatic();	
		
		//Methods method3; //creating just a reference doesnt trigger static initialisers (as its not accessing the class)
		
		//method3 = null;
		
		//nullPointerException as a null object CANNONT call a NON STATIC method of it's class. ++++++++++++++++++++++++++++++++++++++
		//method3.myMethod(); 
		
		//this is fine as a null object CAN call a static method of a class. (and static intialisers are triggered)
		//method3.callStatic(); 
		
		

	}

}
