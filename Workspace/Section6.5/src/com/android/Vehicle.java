package com.android;

public class Vehicle {
	static int VehicleCounter = 0;
	Vehicle(){
		VehicleCounter++;
		System.out.println("Vehicle constructor called");
	}
}

class Boat extends Vehicle{
	static int BoatCounter = 0;
	Boat(){
		BoatCounter++;
		System.out.println("Boat constructor called");
	}
	
}

class RowBoat extends Boat{
	static int RowBoatCounter = 0;
}

class CruiseShip extends Boat{
	
	static int CruiseShipCounter = 0;
	CruiseShip(){
		CruiseShipCounter ++;
		System.out.println("CruiseShip constructor called");
	}
}

class LuxuryLiner extends CruiseShip{
	
	static int luxuryCounter = 0;
	LuxuryLiner(){
		luxuryCounter++;
		System.out.println("LuxuryLiner constructor called");
	}
	
}



