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
	
	void fiddleTheBooks() {
		System.out.println("Accountant fiddleTheBooks");
	}
	
	void earn() {
		System.out.println("Accountant earning");
	}

}



class ForensicAccountant extends Accountant{
	
	void investingate() {
		System.out.println("ForensicAccountant investingate");
	}
	
	@Override
	public void doWork() {
		System.out.println("ForensicAccountant doWork");
	}
	
}




















