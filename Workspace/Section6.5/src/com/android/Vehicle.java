package com.android;

public class Vehicle {
	
	Vehicle(){
		System.out.println("Vehicle constructor called");
	}
}

class Boat extends Vehicle{
	
	Boat(){
		System.out.println("Boat constructor called");
	}
	
}

class RowBoat extends Boat{
	
}

class CruiseShip extends Boat{
	
	CruiseShip(){
		System.out.println("CruiseShip constructor called");
	}
}

class LuxuryLiner extends CruiseShip{
	
	LuxuryLiner(){
		System.out.println("LuxuryLiner constructor called");
	}
	
}



