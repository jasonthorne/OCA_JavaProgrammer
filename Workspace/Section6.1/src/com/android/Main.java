package com.android;

import com.gretb.Accountant;

public class Main {
	
	/**
	 * 
	 * Exam objective 7.1 - Describe inheritence & it's benefits
	 * Exam objective 7.5 - use abstract classes & interfaces
	 */
	
	/*
	 * Benefit 1: With smaller derived classes (sub classes) we only need to concentrate on what is unique to a particular derived class.
	 * 
	 * Benefit 2: ease of modification to common properties & behaviour.
	 * 
	 * Benefit 3: Extensability. Code that works with the base class in some hierarchy tree can work with all classes that are added using inheritence later.
	 * 
	 * Benefit 4: Use tried & tested code from a base class. If something works in a base class. its going to work in a subclass. This promotes reuse of good code.
	 * I.e. connecting to a database finding a route in GPS software.
	 * 
	 * Benefit 5: You can concentrate on specialised behaviour.
	 * 
	 * Benefit 6: Logical structures & groupings. 
	 */
	
	public static void main(String[] args) {
		
		//amking different Employee objects;
		Employee eddie = new Employee();
		Employee ethna = new Employee();
		Fireman sam = new Fireman();
		OilRigFireman olivia = new OilRigFireman();
		Secetary sean = new Secetary();
		Accountant andy = new Accountant();
		
		eddie.sendInvitation(sam); //fireman pbject sent to method
		eddie.sendInvitation(ethna); //employee pbject sent to method
		eddie.sendInvitation(sean); //secetary pbject sent to method
		eddie.sendInvitation(olivia); //oilrigfireman pbject sent to method
		eddie.sendInvitation(andy);  //accountant pbject sent to method
		
		//assigning an employee reference to a returned employee object +++++++++++++++++++++++++++++++++++++++++
		Employee enda = eddie.sendInvitation(sam);
		
		Fireman fred = (Fireman)eddie.sendInvitation(sean); //casting to a fireman as an employee is what's being returned
		fred.extinguish();
		fred.rescue();
		
		//-----------------
		
		//this one method, replaces 25 overloaded methods if we have no inheritance relationship of all types of employee.
		//You would need 5 overloaded sendInvitation() methods in each of the Employee types, and we have 5 different types of employee, so 5*5 is 25. 
		
		eddie.sendInvitation(sam); //fireman pbject sent to method
		eddie.sendInvitation(ethna); //employee pbject sent to method
		eddie.sendInvitation(sean); //secetary pbject sent to method
		eddie.sendInvitation(olivia); //oilrigfireman pbject sent to method
		eddie.sendInvitation(andy);  //accountant pbject sent to method
		
		
			
	}
	
	
	

}
