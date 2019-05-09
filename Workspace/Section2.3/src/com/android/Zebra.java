package com.android;

public class Zebra {
	
	static int counter = 1;
	int age=45;
	double weight = 12.34;
	
	final int id;//every zebra will have a different id that cannot be changed.
	
	Zebra(){
		id=counter; //first zebra will have an id of 1. 2nd will have 2 etc..
		counter++; //add to counter
	}

	/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * Object is the superclass of all other classes in java and ultimately all classes are derived from this class.
	 * There is an equals method in this object that is used to compare object references returns true if both references are the same).
	 * This method takes an object. When you have a superclass object as an arguement to a method, it can ALSO take any of its subclass objects.
	 * This equals takes an OBJECT so it can take an OBJECT OF ANY TYPE. 
	 */
	
	/*
	@Override //this annotation checks if the method is overriding correctly (will cause an error if not)
	public boolean equals(Object myZebra) {
		Zebra newZebra=(Zebra)myZebra; //casting myZebra object 
		if(this.age==newZebra.age && this.weight==newZebra.weight) {
			return true;
		}
		else {
			return false;
		}
		
	}
	*/
	
	//Overloading this method works too. And means no cast to Zebra object is needed
	public boolean equals(Zebra myZebra) {
		
		if(this.age==myZebra.age && this.weight==myZebra.weight) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
