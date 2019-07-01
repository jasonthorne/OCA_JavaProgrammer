package com.android;

public class Main {

	public static void main(String[] args) {
	
		
		Employee eddie = new Employee();
		Employee ethna = new Employee(53, "ethna");
		
		ethna.duties();
		
		/*
		 * Even though we have no constructor in the Accountant,
		 * it is still calling the blank Employee superclass constructor as Accountant is suing the blank default no arg constructor
		 * that exists in all classes you create. 
		 * As soon as yuo create a constructor in a class you no longer have acccess to the blank no arg constructor.
		 */
		Accountant andy = new Accountant();
		System.out.println("Andy the Accountant calling callTHis");
		andy.callThis();
		
		/*
		 * An accountant can call variables of an inteface directly:
		 */
		System.out.println(andy.finalInt); //accessing the static in a NON static way
		System.out.println(Behaviour.finalInt); //accessing the static in a static way RECOMMENED WAY!! ++++++++++++++++++++++++
		
		
		//An Accountant CANNOT call the static method statMethod in the Behaviour interface, 
		//even though Accountant implements Behaviour.
		//andy.statMethod(); -DOSNT WORK
		
		//The ONLY way to call a static method of an interface, outside of that interface:
		Behaviour.statMethod();
		
		//--------------------
		
		
		Athelete ann = new Athelete();
		ann.sad();
		
		
		System.out.println("\nAnn the athelete:");
		ann.callThis();
		
		ann.statMethod();
		
		System.out.println("\nterry the Terrier:");
		Terrier terry = new Terrier();
		terry.accessSuper();
		
		
		//-------------------
		
		LuxuryLiner titanic = new LuxuryLiner();
		Boat myBoat = new Boat();
		CruiseShip myShip = new CruiseShip();
		Vehicle myVehichle = new Vehicle();
		
		System.out.println("Ammount of Vehicles: " + Vehicle.VehicleCounter);
		
		//--------------------
		
		System.out.println("");
		SingleStory mySingleStory = new SingleStory();
		
		Building myBuilding = new Building(2.3);
		System.out.println("creating a building with a string"); 
		
		System.out.println("");
		Building buildingAddress = new Building("Dublin");
		
		

	}
	
	
}
