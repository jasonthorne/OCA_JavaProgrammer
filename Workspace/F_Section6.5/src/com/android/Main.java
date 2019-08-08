package com.android;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Employee eddie=new Employee();
		Employee etna=new Employee(53,"Etna");
		Employee patsy=new Employee(50);
		
		etna.duties();
		/*
		 * even though we have no constructor in the Accountant
		 * it is still calling the blank Employee super class
		 * constructor as Accountant is using the blank default
		 * no argument constructor that exists in ALL classes you
		 * create. As soon as you create a constructor in a class
		 * you no longer have access to the blank no argument 
		 * constructor
		 */
		Accountant andy=new Accountant();
		System.out.println("Andy the Accountant calling callThis");
		andy.callThis();
		/*
		 * an accountant can call variables of a Interface directly
		 * calling a static in a non static
		 */
		System.out.println(andy.finalInt);
		/*
		 * calling a variable in a static way, which is name of 
		 * class followed by name of variable
		 */
		System.out.println(Behaviour.finalInt);
		/*
		 * An Accountant Object cannot call the static method 
		 * statMethod in the Behaviour interface, even though 
		 * Accountant implements Behaviour
		 */
	//	andy.statMethod();
		/*
		 * this is the only way to call a static method of an interface
		 * outside of that interface
		 */
		Behaviour.statMethod();
		
		Athlete ann=new Athlete();
		ann.sad();
		System.out.println("Ann the Athlete");
		ann.callThis();
		//calling static method from Athlete class
		/*
		 * she has no access to the static method of the Behaviour
		 * interface
		 */
		ann.statMethod();
		
		Terrier terry=new Terrier();
		terry.accessSuper();
		System.out.println("luxury liner created");
		LuxuryLiner titanic=new LuxuryLiner();
		Boat myBoat=new Boat();
		CruiseShip myShip=new CruiseShip();
		Vehicle myVehicle=new Vehicle();
		System.out.println("Amount of Vehicles "+Vehicle.vehicleCounter);
		System.out.println("Amount of Boats "+Boat.boatCounter);
		System.out.println("amount of cruise ships "+CruiseShip.cruiseCounter);
		System.out.println("Amount of luxury liners "+LuxuryLiner.luxuryCounter);
		//Test<ArrayList>mytest;
		
		SingleStorey mySingleStorey=new SingleStorey();
		
		Building myBuilding=new Building(2.3);
		System.out.println("creating a building with a string");
		/*
		 * this calls the constructor that takes an String
		 * which calls the constructor in the same class that takes
		 * no arguments
		 * which calls the constructor in the same class that takes
		 * an int, double, String and double
		 */
		Building buildingAddress=new Building("Dublin");
		System.out.println("House created");
		House myHouse=new House(100.02);
		

	}

}
