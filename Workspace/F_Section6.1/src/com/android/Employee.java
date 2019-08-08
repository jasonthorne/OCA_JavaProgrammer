package com.android;

public class Employee {
/*
 * public means that this is available in all classes, regardless
 * of where they are.
 * that means we can access this variable in all the classes in this
 * package and also all the classes in com.gretb package
 * so both Flower class and Accountant class can access this
 */
	public int age=23;
/*
 * this is default or package level acces, its available only in 
 * the same package so it's NOT available to classes in a different
 * package, so Accountant and Flower has no access to this variable	
 */
	String name="tony";
	/*
	 * available only inside the Employee class
	 */
	private int phoneNumber=9087654;
	/*
	 * available in same package or in a derived sub class, no matter
	 * where that sub class is. So Accountant is a sub class of 
	 * Employee and it's ine the com.gretb package, and it does have
	 * access to the email variable
	 */
	protected String email="me@you.com";
	/*
	 * after a few months of usage of the app that this code produces, 
	 * the customer decided he wanted to be able to store the PPS 
	 * number of every Employee and make it as secure as possible.
	 * So we create a new string atribute called "pps" and we made it
	 * protected, which means that all subclasses can access it, but
	 * not all classes 
	 */
	protected String pps="9898980a";
	/*
	 * you have to make this constructor eitehr public or protected.
	 * As Accountant is in a different package and Accountant extends
	 * Employee, which means, we first have to create an employee, in
	 * order to create an accountant (super object created first then
	 * sub class object created). If the only constructor in Employee
	 * is default level access, then the accountant class has no 
	 * access to this constructor and cannot first create an employee
	 */
	protected Employee(){
		System.out.println("protected Employee constructor called");
	}
	/*
	 * these two methods are avaialable to all subclasses in the same
	 * file and same package, but NOT available outside of the
	 * com.android package, so these are NOT available to Accountants
	 */
	void earn() {
		System.out.println("employee earing");
	}
	
	void work() {
		System.out.println("Employee working");
	}
	/*
	 * this can be inherited by any class, anywhere
	 */
	public void someMethod() {
		System.out.println("Employee someMethod");
	}
	/*
	 * this can't be inherited
	 */
	private void privateMethod() {
		System.out.println("can only be accessed inside Employee class");
	}
	/*
	 * this can be accessed from the same package or in a derived class
	 * in a different package. So Accountant can access and inherit
	 * this method
	 */
	protected void protectMethod() {
		System.out.println("employee protectMethod");
	}
	/*
	 * this method can take an employee or a sub class of employee
	 * which means this method can take a Employee, a Secretary,
	 * a Fireman or a OilrigFireman or an Accountant.
	 * similarily this method can choose to return any type of employee
	 * can return a fireman, oilrigFireman, secretary or Employee or
	 * Accountant
	 */
	public Employee sendInvitation(Employee emp) {
		System.out.println(emp.getClass().getSimpleName());
		System.out.println("invitation sent");
		return new Fireman();
	//	return new Secretary();
	}
}//end of employee class

class Secretary extends Employee{
	int wordsPerMinute;
	
	void fileAway() {
		System.out.println("secretary filing");
	}
	void type() {
		/*
		 * The Secretary class extends Employee and is in the same
		 * package as Employee
		 * that means it inherits all public, protected and package
		 * level access variables and methods from the Employee 
		 * class
		 */
		System.out.println("age is public "+age);//public
		System.out.println("name is default "+name);//package
		System.out.println("email is protected "+email);//protected
		//cannot access private variables
		//System.out.println("phoneNumber is private "+phoneNumber);
		/*
		 * same rule as above for methods
		 */
		earn();//default level acces
		someMethod();//public level access
		protectMethod();//protected level access
		//privateMethod();//private level access, we have no access
	}	
}//end of secretary class
class Fireman extends Employee{
		String safetyQualifications;
		
		void rescue() {
			System.out.println("Fireman rescue");
		}
		
		void extinguish() {
			System.out.println("Fireman extinguish");
		}
	}//end of fireman class

class OilRigFireman extends Fireman{
	/*
	 * you can specialise as much or as little as you want
	 */
	void swim() {
		System.out.println("oilrig swimming man");
	}
}