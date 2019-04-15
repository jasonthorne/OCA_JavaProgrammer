package com.gretb;

public class Employee {
	
	//things every employee has:
	int pps;
	String name;
	double wages;
	
	
	//the one thing that every employee does is work. Any class that extends Employee will now have a work method.
	void work(){
		System.out.println("Im an employee working");
	}
	
	
}//Employee

//Accountant class:
class Accountant extends Employee {
	
	//what goes in here is everything that applies to accountants ONLY
	
	//array of accountant qualifications:
	String[] qualifications;
	
	double allowences; //tax free allowance (amount you don't pay tax on)
	
	//only accountants are on health insurance
	boolean healthPlan = true; //true if have, false if not
	
	//override the Employee work method
	void work() {
		System.out.println("I'm an accountant working");
	}
	
	
	
	
	
}
