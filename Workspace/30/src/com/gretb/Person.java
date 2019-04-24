package com.gretb;

//our base person class is abstract. You CANT create a person object.

public abstract class Person {
	
	int age;
	String name;
	
	abstract void eat(); //All classes that extend person class will inherit this. ONLy concrete classes have to inherit this. 
	//Abstract classes that extend this, DO NOT have to implement this
	
	//An extending concrete class can shoose whether to override this or not. 
	void drink() {
		System.out.println("Person drinking");
	}

}

//A subclass Employee is abstract, so you CANT create an Employee object. Also you DONT have to override the abstract eat method from the Person class.
//Here we are also implementing from the Behaviour interface, however we dont HAVE TO apply implementation for the methods until we get to a concrete class.
abstract class Employee extends Person implements Behaviour{
	
	//This class also inherits the eat method, so any class that extends Employee now has the eat and drink method from the Person class
	//and work from the Employee class.
	
	abstract void work();
	
	//overridden from Behaviour interface:
	public void run() {
		System.out.println("Employee running");
	}
}

//this inherits the methods drink(), eat() from Person and work() from Employee and doesn't NOT have to override the abstract eat() or work() method because this class is abstract. 
abstract class Accountant extends Employee{
	abstract void calculate();
}


//This is the first concrete class in the chain, so ALL abstract classes HAVE TO BE OVERIDDDEN in this class
class ForensicAccountant extends Accountant{

	@Override  //from Accountant class
	void calculate() {
		System.out.println("ForensicAccountant calculating");
		
	}

	@Override  //from Employee class
	void work() {
		System.out.println("ForensicAccountant working");
		
	}

	@Override //from Person class
	void eat() {
		System.out.println("ForensicAccountant eating");
		
	}
	
	//=========From Behaviour interface: 

	@Override
	public void happy() {
		System.out.println("ForensicAccountant happy");
		
	}

	@Override
	public void sad() {
		System.out.println("ForensicAccountant sad");
		
	}

	@Override
	public void mad() {
		System.out.println("ForensicAccountant mad");
		
	}

	@Override
	public void angry() {
		System.out.println("ForensicAccountant angry");
		
	}
	
}