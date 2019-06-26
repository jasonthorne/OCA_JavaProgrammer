package com.android;

public class Employee {
	
	int age = 23;
	String name = "Tom";
	String pps = "999999a";
	
	void earn() {
		System.out.println("Employee earn");
	}
	
	void Holiday() {
		System.out.println("Employee Holiday");
	}
	
}

class Accountant extends Employee implements Work {
	
	//only available to Employee or subclass of Accountant:
	String[] qualifications = {"CPA", "CFA", "SFA"};

	@Override
	public void clockIn() {
		System.out.println("Accountant clockIn");
	}
	
	@Override
	public void doWork() {
		System.out.println("Accountant doWork");
	}

	@Override
	public void clockOut() {
		System.out.println("Accountant clockOut");
	}
	
	//unique to this class & its children
	void fiddleTheBooks() {
		System.out.println("Accountant fiddleTheBooks");
	}
	

	//overridden from Employee
	void earn() {
		System.out.println("Accountant earning");
	}

}



class ForensicAccountant extends Accountant{
	
	/*
	 * This method is only available to forensic accountants or it's subclasses.
	 */
	
	void investingate() {
		System.out.println("ForensicAccountant investingate");
	}
	
	
	//overriding the doWork method of the Accountant class:
	@Override
	public void doWork() {
		System.out.println("ForensicAccountant doWork");
	}
	
}

class Fireman extends Employee implements Work {

	@Override
	public void clockIn() {
		System.out.println("Fireman clockIn");
		
	}

	@Override
	public void doWork() {
		System.out.println("Fireman doWork");
		
	}

	@Override
	public void clockOut() {
		System.out.println("Fireman clockOut");
		
	}
	
}


class Nurse extends Employee{
	
	//overridden from Employee
	void earn() {
		System.out.println("Nurse earning");
	}
	
	//unique to this class & its children
	void lookAfter() {
		System.out.println("Nurse looks after you");
	}
	
}

class Teacher extends Employee{
	
	//overridden from Employee class
	void holiday() {
		System.out.println("Teacher holiday");
	}
	
	void teach() {
		System.out.println("Teacher teaches");
	}
}


class Farmer extends Employee{
	//overridden from Employee
	void earn() {
		System.out.println("Farmer earning");
	}
	
	//unique to this class & its children
	void farm() {
		System.out.println("Farmer farms");
	}
}














