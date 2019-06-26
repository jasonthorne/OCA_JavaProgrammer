package com.android;

/**
 * 
 *Exam Objective 7.2 - Develop code that demonstrates the use of Polymorphism. 
 *Including overriding an object type VS a reference type.
 *
 */
public class Main {
	
	public static void main(String[]args) {
		
		Accountant andy = new Accountant(); //accountant reference to an accountant object
		ForensicAccountant fred = new ForensicAccountant();
		
		System.out.println(andy.age);
		System.out.println(fred.age);
		
		fred.fiddleTheBooks(); //accountant
		fred.investingate(); //ForensicAccountant
		//andy.investingate(); doesnt have access to this method
		
		fred.doWork(); //interface
		fred.clockIn(); //interface
		fred.clockOut(); //interface
		fred.Holiday(); //employee
		fred.earn(); //employee
		
		
	
		/*
		 * super class reference to a subclass object. 
		 * Reference determines what methods and variables can be called.
		 * Below is a superclass Employee reference to a subclass Accountant object.
		 * The other way around will not compile. 
		 */
		
		Employee eddie = new Accountant(); //superclass Employee reference to a subclass Accountant object
		
		//Accountant angela=(Accountant) new Employee();//subclass reference to a super. doesnt work!! 
		
		
		/*
		 * The ONLY things eddie above has access to are the methods in the Employee class.
		 */
		

		Work workAccount = new Accountant();
		Work workFireman = new Fireman();
		
		/*
		 * if a superclass implements an interface, all of its subclasses also implement the interface
		 */
		
		Work workForensic = new ForensicAccountant();
		
		/*
		 * An interface reference to an object of a class that implements that interface only has access to the methods of the interface
		 * in this case the workAccount, workFireman and workForensic only have access to:
		 * clockIn()
		 * clockOut()
		 * doWork()
		 */
		
		/*
		 * No access to methods of the ForensicAccountant class
		 * No access to methods of the Employee class
		 * No access to methods unique to the Accountant class
		 */
		
		
		Work workFreddie = fred; //workFreddie is an interface reference to a fred ForensicAccountant object.
		
		
		/*this is an arraythat takes object that implement the work interface. 
		 * THIS IS NOT AN ARRAY OF WORK OBJECTS
		 * This array can take an Accountant, ForensicAccountant and a Fireman
		 * because all of these classes implement the work interface.
		 */
		
		Work[]workEmployees = new Work[4];
		
		workEmployees[0]=new Accountant();
		workEmployees[1]=fred;
		workEmployees[2]=new Fireman();
		workEmployees[3]=new ForensicAccountant();
		
		System.out.println("a day of work");
		for(Work w:workEmployees) {
			w.clockIn();
			w.doWork();
			w.clockOut();
		}
		
		
		Employee[]empList = {
				new Employee(), new Accountant(), new ForensicAccountant(), new Fireman(), new Nurse(), new Teacher(), new Farmer()
		};
		
		
		//these are the ONLY methodas and vars these objects have access to:
		for(Employee e:empList) {
			e.earn();
			e.Holiday();
			System.out.println("age is:" + e.age);
			System.out.println("name is:" + e.name);
			System.out.println("pps is:" + e.pps);
		}
		
		
	
	}
}
