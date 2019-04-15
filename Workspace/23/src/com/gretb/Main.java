package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		//creating an accountant:
		Accountant andy = new Accountant();
		System.out.println("Andy: ");
		andy.work(); //calls the Accountant work method, which calls 3 other methods in the class: billing(), calcWages() & doBudgets()
		
		
		//create a forensic accountant:
		ForensicAccountant fred = new ForensicAccountant();
		System.out.println("Fred: ");
		fred.work(); //calls the Accountant work method as there's no work method in ForensicAccountant. 
	
		
		//create a chartered accountant:
		CharteredAccountant bob = new CharteredAccountant();
		System.out.println("Bob: ");
		bob.work(); //this calls the overridden work method in the CharteredAccountant class
		
		
		//create a human resources:
		HumanResources sue = new HumanResources();
		System.out.println("Sue: ");
		sue.work(); //directly inherits from Employee
		
		//==========================
		
		//create an Animal:
		Animal anto = new Animal();
		anto.printMe(); //Animal class has only one method (printMe)
		
		//create an Mammal:
		Mammal mick = new Mammal();
		mick.printMe(); //this is the overidden printMe in the mammal class
		mick.callSuper(); 
		
		//create an Ape:
		Ape angela = new Ape();
		System.out.println("\nAngela the Ape:");
		angela.printMe();
		angela.callSuper();
		
		
		
	}

}
