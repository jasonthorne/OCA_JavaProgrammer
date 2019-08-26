package com.android;

public class Human {
	
	
	
	//constructor:
	Human() throws IndexOutOfBoundsException{
		System.out.println("Human created");
	}
	
	
	
	//if this method is called, its "throws Exception" sig MUST be handled
	void walk() throws Exception {
		System.out.println("Human walk method");
		throw new Exception(); //deliberately throw an exception from this method +++++++++++++
	}
	
	
	//this OVERLOADED method (different parameters) is different from the method above, so doesnt need any throws in its sig
	void walk(int age) throws Throwable {
		
	}
	
	
	//--------------
	
	//any overriding methods to this can ONLY throw a RuntimeException or a subclass of it.
	void breath() throws RuntimeException{
		
	}
	
	
	

}


class Employee extends Human{
	
	
	//constructor:
	Employee() throws RuntimeException {
			System.out.println("Employee created");
	}
	
	/*
	 * When you are overriding a method that throws some exception, the overriding method can only throw the SAME exception, or a subclass of THAT exception
	 */
	
	/*
	void walk() throws Throwable{ //doesnt compile as this overriding method has a throws in its sig thats a superclass to its overridden method's sig
		
	}
	*/
	
	void walk() throws RuntimeException{ //this is fine as RuntimeException is a sublass of Exception
		
	}
	
	/*
	void breath()throws Exception{ //doesnt compile as this is trying to throw a superclass of its overridden parent.
		
	}*/
	
	
	void breath() { //this is fine as NO exception is considered a subclass of ANY exception ++++++++++++++++++++++++
		
	}
	
}


class Accountant extends Employee{
	
	//constructor:
	Accountant() throws Exception{
			System.out.println("Accountant created");
	}
	
}



class ForensicAccountant extends Accountant{
	
	//constructor:
	ForensicAccountant() throws Throwable{
			System.out.println("ForensicAccountant created");
	}
	
}