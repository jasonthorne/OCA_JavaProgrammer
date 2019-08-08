package com.android;
/*
 * if a class does not explictly extend any other class
 * that means the class implicitly extends Object
 * as the Object class is the super class of all 
 * other classes in java
 * object class contains method such as toString(), equals(),
 * hashCode(),etc
 */
public class Employee extends Object{
	int age=23;
	String name="tom";
	String pps="9999999A";
	
	void earn() {
		System.out.println("Employee earn");
	}
	void holiday() {
		System.out.println("Employee Holiday");
	}

}//end of employee class

class Accountant extends Employee implements Work{
	//Only avaiable to Employee or sub class of Accountant
	String[]qualifications= {"CPA","CFA","SFA"};
//interface
	@Override
	public void clockIn() {
		System.out.println("Accountant Clock in");
		
	}
//inteface
	@Override
	public void doWork() {
		System.out.println("Accountant do work");
		
	}
//interface
	@Override
	public void clockOut() {
		System.out.println("Accountant clock out");
		
	}
	@Override//from Employee class
	void earn() {
		System.out.println("Accountant earning");
	}
	//only in Accountant class
	void fiddleTheBooks() {
		System.out.println("Accounant fiddling");
	}
	
}

class ForensicAccounant extends Accountant{
	/*
	 * this method is only available to ForensicAccountants or sub
	 * classes of ForensicAccountants
	 */
	void investigate() {
		System.out.println("Forensic Accountant investigate");
	}
	/*
	 * this overriding doWork() method of the Accountant class
	 */
	@Override
	public void doWork() {
		System.out.println("forensic accounant doing work");
	}
}

class Fireman extends Employee implements Work{

	@Override//interface
	public void clockIn() {
		System.out.println("fireman clockin");
		
	}

	@Override//interface
	public void doWork() {
		System.out.println("firmean do work");
		
	}

	@Override//interface
	public void clockOut() {
		System.out.println("fireman clock out");
		
	}
	@Override//Empmloyee 
	void holiday() {
		System.out.println("fireman Holiday");
	}
	//method of fireman class, only available to Fireman and sub classes
	//of fireman
	void extinguish() {
		System.out.println("a fireman puts out fires");
	}
	
}

class Nurse extends Employee{
	@Override//from Employee class
	void earn() {
		System.out.println("nurse earning");
	}
	//method of Nurse class only available to Nurse and sub classes of 
	//Nurse
	void lookAfter() {
		System.out.println("nurse looks after you");
	}
}

class Teacher extends Employee{
	@Override//from Employee class
	void holiday() {
		System.out.println("Teacher holiday");
	}
	
	void teach() {
		System.out.println("a teacher teaches");
	}
}

class Farmer extends Employee{
	@Override//Employee class
	void earn() {
		System.out.println("teacher earning ");
	}
	//own method
	void farms() {
		System.out.println("a farmer farms");
	}
}
