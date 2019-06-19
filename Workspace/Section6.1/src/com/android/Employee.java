package com.android;

public class Employee {
	
	/* public means that this is available in ALL classes, regardless of where they are.
	*  That means we can access this variable in all of the classes in this package, and all of the classes in com.gretb package. 
	*  So both Flower class and Accountant class can access this.
	*/
	public int age = 23; 
	
	
	/*
	 * this is DEFAULT (or package) level access. Its only avaliable in the same package,
	 * so its NOT avaliable to classes in a different package. So Accountant and flower dont have access to this. 
	 */
	String name = "tony";
	
	
	/*
	 * This is available ONLY within the Employee class, because its private.
	 */
	private int phoneNumber = 897969594;
	
	
	/*
	 * Available in the same package or a child of this class, regardless of what package it resides in.
	 */
	protected String email = "me@me.com";
	
	
	/*After a few months of usage of the app that this code produces, the customer 
	 * decided he wanted to be able to store the pps number of every Employee, and make it as secure as possible.
	 * So we created a new string called pps, and made it protected, so that all subclasses could access it, but not all classes.
	 */
	protected String pps = "353353535353q";
	
	
	/*
	 * You have to make this constructor either public or protected 
 		as accountant is a different package & extends Employee.
 		Which means that we first must have to create an accountant (super object created first, then subclass object created).
 		If the only constructor in Employee is default level access, then the accountant class has no access to this constructor & cannot first create an employee
	 */
	protected Employee(){
		System.out.println("protected Employee constructor called");
	}
	
	
	/*
	 * These two methods are available to all subclasses in the same file and same package, 
	 * but not available outside of the com.android package, so these are not available to Accountants.
	 */
	void earn() {
		System.out.println("Employee earning");
	}
	
	void work() {
		System.out.println("Employee working");
	}
	
	//this can be inherited by any class anywhere: 
	public void someMethod() {
		System.out.println("Employee someMethod");
	}
	
	//this cant be inherited:
	private void privateMethod() {
		System.out.println("Employee privateMethod");
	}
	
	//this can be accessed from the same package, or in a derived class in a different package (Accountant for example extends this class, but is in different package):
	protected void protectMethod() {
		System.out.println("Employee protectMethod");
	}
	

}


class Secetary extends Employee{
	int wordsPerMinute;
	
	void fileAway() {
		System.out.println("Secetary fileAway");
	}
	
	void type() {
		/*
		 * The Secetary class extends Employee and is in the same package as Employee
		 * That means it inherits all public, protected & package level access variables and methods from Employee.
		 */
		
		System.out.println("age is: " + age); //age is public so this class has access.
		System.out.println("name is: " + name); //name is DEFAULT level, so this class has access.
		//System.out.println("phone number is: " + phoneNumber); //phoneNumber is PRIVATE level, so this class has NO access.
		System.out.println("email is: " + email); //email is PROTECTED so this class has access 
		System.out.println("pps is: " + pps); //pps is PROTECTED so this class has access
		
		
		
	}
}

