package com.gretb;
//our base Person class is abstract, you can't create a person object
public abstract class Person {
	
	int age;
	String name;
	/*
	 * all classes that extend person class will inherit this.
	 * ONLY concrete classes have to implement this
	 * abstract classes that extend this class DO NOT HAVE TO IMPLEMENT
	 * THIS METHOD
	 */
	abstract void eat();
	/*
	 * an extending concrete class can choose whether to override this or
	 * not
	 */
	void drink() {
		System.out.println("I am drinking");
	}

}//end of Person class

//our sub class employee is abstract, so you can't create a Employee object
//also because it's abstract we DO NOT HAVE TO OVERRIDE the abstract
//eat() method from the Person class
/*
 * here we have Employee implementing the Behaviour interface
 * however we don't have to apply implementation for the methods of teh 
 * Behaviour interface until we get to a Concrete class
 */
abstract class Employee extends Person implements Behaviour{
	/*
	 * this class inherits the eat() method, so that means that any class
	 * that extends Employee now has the eat() and drink() method from
	 * the person class and work() method from the Employee
	 */
	abstract void work();
	
	public void happy() {
		System.out.println("Employee happy");
	}
}
/*
 * this inherits all of the methods of eat(), drink() from person
 * work() from employee and does not HAVE TOO override the abstract eat()
 * or work() method because this class is abstract
 * we can override any method in an abstract class if we want, but DON'T
 * HAVE TOO
 */
abstract class Accountant extends Employee{
	
	abstract void calculate();
}
/*
 * this is the first concrete class in the chain of classes, so all abstract
 * methods HAVE TO BE OVERRIDEN in this class
 */
class ForensicAccountant extends Accountant{

	@Override
	void calculate() {//from accountant class
		System.out.println("forensic Accountant calculating");
		
	}

	@Override
	void work() {//from employee class
		System.out.println("forensic Accountant working");
		
	}

	@Override
	void eat() {//from person class
		System.out.println("forensic accountant eating");
		
	}

	

	@Override
	public void sad() {
		System.out.println("forensic sad");
		
	}

	@Override
	public void mad() {
		System.out.println("forensic mad");
		
	}

	@Override
	public void angry() {
		System.out.println("forensic angry");
		
	}
	
}
