package com.android;

public class Zebra {
	static int counter=1;
	int age=45;
	double weight=12.34;
	/*
	 * this cannot be changed and has to be given a value
	 */
	final int id;
	
	Zebra(){
		/*
		 * the id will be the current count. so if two zebras created
		 * the first zebra will have an id of 1, the second zebra will
		 * have an id of 2, etc
		 */
		id=counter;
		counter++;
	}
	/*
	 * Object is the superclass of all other classes in java and ultimately
	 * all classes are derived from this class. 
	 * There is a method in the Object class, called equals, if you do not
	 * override this method, it will return true if the two objects references
	 * you are comparing are the SAME OBJECT.
	 * this method takes a Object, when you have a superclass object in 
	 * the parameter list of a method, it means that this method can take
	 * ANY subclass of this object. In this case it's an Object, which means
	 * it can take ANY OBJECT OF ANY TYPE
	 */
	@Override
	/*when overriding a method, the name, return and parameter list
	 * have to be the same as the method you are overriding.
	 * this method will take a zebra, but this will be a Zebra Object 
	 * with a Object reference, which means this object will have no 
	 * access to the age and weight of a zebra
	 */
	public boolean equals(Object myZebra) {
		/*
		 * so we have to cast the object reference to the zebra object
		 * to be of type zebra, and then this object has access to the 
		 * age and weight of the zebra zelda
		 * if both zebras have the same age and weight, this method
		 * returns true
		 */
		Zebra newZebra=(Zebra)myZebra;
		/*
		 * age refers to the age of the zebra calling this method, which
		 * is ZED, newZebra.age refers to the age of zelda
		 */
		if(age==newZebra.age && this.weight==newZebra.weight) {
			return true;
		}
		
		return false;
		
	}

}
