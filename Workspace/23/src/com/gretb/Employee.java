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
	
	//what goes in here is everything that applies to accountants ONLY.
	
	//array of accountant qualifications:
	String[] qualifications;
	
	double allowences; //tax free allowance (amount you don't pay tax on)
	
	//only accountants are on health insurance
	boolean healthPlan = true; //true if have, false if not
	
	//override the Employee work method
	void work() {
		//System.out.println("I'm an accountant working");
		
		//inside this work method for every accountant, we are callimg 3 other methods of the accountant class:
		billing(); //does the blling
		calcWages(); //calculates the wages
		doBudgets(); //does the budgets
	}
	
	//=====
	//tasks that are unique to accountants:
	void billing() {
		System.out.println("I'm an accountant, billing");
	}
	
	void calcWages() {
		System.out.println("I'm an accountant, calculating wages");
	}
	
	void doBudgets() {
		System.out.println("I'm an accountant, doing the budgets");
	}
	//=====
	
}//end of accountant class


class ForensicAccountant extends Accountant{
	//Nothing in the class, so it takes everything from the Accountant class, and everything from that's super class (Employee)
}


class CharteredAccountant extends Accountant{
	
	//overrides the Employee work():
	void work() {
		System.out.println("I'm a chartered accountant, doing work");
	}
}
                        
class HumanResources extends Employee{
	//Nothing in the class, so it takes everything from the Employee class.
}












