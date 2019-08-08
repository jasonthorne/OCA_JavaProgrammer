package com.gretb;
import com.android.*;
/*
 * Accountant has access to only the public and protected members
 * of this class, it can only inherit the public and protected 
 * variables
 * it can only override the public and protected methods of the
 * Employee class
 */
public class Accountant extends Employee{
	public Accountant(){
		super();
		
	}
	/*
	 * a method to test what we can access/inherit from the 
	 * Employee class
	 */
	public void getVariables() {
		/*
		 * has access to age, as age is a PUBLIC variable 
		 */
		System.out.println("age is "+age);
		/*
		 * does not have access to name as name is a 
		 * default level access variable, will not compile
		 */
	//	System.out.println("name is "+name);
		/*
		 * does not have access to phoneNumber as phoneNumber is
		 * a private level access variable, will not compile
		 */
		//System.out.println(phoneNumber);
		/*
		 * does have access to email and pps as both of these are
		 * protected variables and sub classes can inherit protected
		 * variables, this will compile fine
		 */
		System.out.println("email is "+email);
		System.out.println("PPs is "+pps);
		/*
		 * has no access to eitehr of these methods as these are
		 * package level access methods
		 */
		//earn();
		//work();
		/*
		 * this is public so will have access and will inherit
		 */
		someMethod();
		/*
		 * this is a private method so will have NO acess and will
		 * NOT inherit
		 */
		//privateMethod();
		/*
		 * this is a protected method so we will have access and will
		 * inherit
		 */
		protectMethod();

		
		
		
	}

}
