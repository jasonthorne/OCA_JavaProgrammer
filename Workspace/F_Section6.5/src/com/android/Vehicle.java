package com.android;
/**
 * Exam objective 7.4 use "this" and "super" to access objects and
 * constructors
 * @author tutor1
 *
 */
/*
 * in each one of these derived classes there is an implicit call
 * to the super constructor that takes no arguments, 
 */
public class Vehicle {

	static int vehicleCounter=0;
	Vehicle(){
		vehicleCounter++;
		System.out.println("Vehicle constructor called");
	}
}//end of vehicle class

class Boat extends Vehicle{
	
	static int boatCounter=0;
	Boat(){
		boatCounter++;
		System.out.println("Boat constructor called");
	}
}//end of Boat class
class RowBoat extends Boat{
	
}

class CruiseShip extends Boat{
	
	static int cruiseCounter=0;
	CruiseShip(){
		cruiseCounter++;
		System.out.println("CruiseShpe Constructor called");
	}
}//end of CruiseShipe class

class LuxuryLiner extends CruiseShip{
	
	static int luxuryCounter=0;
	LuxuryLiner(){
		super();
		luxuryCounter++;
		System.out.println("LuxuryLiner Constructor called");
	}
}//end of LuxuryLiner class
