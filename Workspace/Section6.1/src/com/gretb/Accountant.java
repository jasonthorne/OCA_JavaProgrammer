package com.gretb;

import com.android.Employee;

/*
 * Accountant now has access to only the public & protected members of the Employee class.
 * It can only inherit the public & protected variables. 
 * It can only inherit the public & protected methods. 
 */

public class Accountant extends Employee{
	
	//this is a method to test what we can access/inherit in the Employee class:
	void getVariables() {
		System.out.println("age is: " + age); //age is public so this class has access.
		//System.out.println("name is: " + name); //name is DEFAULT level, so this class has NO access.
		//System.out.println("phone number is: " + phoneNumber); //phoneNumber is PRIVATE level, so this class has NO access.
		System.out.println("email is: " + email); //email is PROTECTED so this class has access as it extends from Employee.
		System.out.println("pps is: " + pps); //pps is PROTECTED so this class has access as it extends from Employee.
		
		//No access to either of these as their both package level access: 
		//earn();
		//work();
		
		someMethod();
		protectMethod();
	}
	
}
