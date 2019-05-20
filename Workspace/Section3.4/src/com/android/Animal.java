package com.android;

public class Animal {
	
	int eat() {
		System.out.println("Eat method that takes no vars");
		return 0;
	}
	
	//this is an OVERLOADED METHOD, as the eat method below has a different param list. RETURN TYPE DOESNT MATTER for overloaded methods ++++++++++++++++
	void eat(int num){
		System.out.println("Eat method that takes an int");
	}
	
	/* doesnt compile as there is already an int method that takes no params (RETURN TYPE DOESNT MNATTER!)
	double eat() {
		
	}
	*/
	
	int eat(double dNum, String str) {
		System.out.println("Eat method that takes a double and a string");
		return 0;
	}

	//This method has a different order of params to the above method, so is OVERLOADED
	int eat(String str, double dNum) {
		System.out.println("Eat method that takes a double and a string");
		return 0;
	}

	
	//access modifiers DONT MATTER for overloading.(private, protected, public) 
	//You can only access this method within the animal class.
	private void eat(boolean myBool) {
		System.out.println("Method that takes bool");
	}
	
	void drink() {
		System.out.println("drink method in Animal class that takes NO args.");
	}
	
}

class Dog extends Animal{
	
	//this method OVERLOADS the drink method in the Animal class
	void drink(int num) {
		System.out.println("drink method in Dog class that takes an int.");
	}
	
	//this method is OVERRIDES the drink method in the Animal class (as its param list identical to it)
	/*
	void drink() {
		
	}*/
}



