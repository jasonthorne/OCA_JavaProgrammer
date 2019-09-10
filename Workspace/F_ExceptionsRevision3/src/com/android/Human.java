package com.android;

public class Human {
	
	Human()throws IndexOutOfBoundsException{
		System.out.println("Human Created");
	}
	
	/*
	 * with overloaded methods (different parameters) it does matter whether it 
	 * throws Any sort of exception as it's a totally different method to the 
	 * other walk method()
	 */
	void walk(int age)throws Throwable{
		
	}
/*
	 * if we call the walk method for the Human class, we have to have it in a 
	 * try/catch or whatever method is calling it has to have a "throws Exception
	 */
	void walk() throws Exception{
		System.out.println("Human walk method");
		throw new Exception();
	}
	/*
	 * our overriding method can only throw a RuntimeException or subclass of this
	 */
	void breathe()throws RuntimeException{
		System.out.println("breathe Human");
	}
}

class Employee extends Human{
	
	Employee()throws RuntimeException{
		System.out.println("Employee created");
	}
	/*
	 * when your overridng a method that "throws someException" the overriding method
	 * can only throw the same exception or a subclass of that exception
	 * this will not compile as we are overriding the walk() method that "throws
	 * Exception", so our overridne walk() method can only throws a subclass or same
	 * exception. Throwable is a SUPER class of Exception
	 */
	/*void walk()throws Throwable{
		
	}*/
	/*
	 * RuntimeException is a sub class of Exception, so this will compile
	 */
	void walk()throws RuntimeException{
		
	}
	/*
	 * breathe in the Human class throws RuntimeException, so the overridden
	 * method can only throw the same exception or subclass of this exception.
	 * Exception is a super class of RuntimeException
	 * An overriden method can throw the same exception
	 * a sub class of that exception 
	 * or no exception
	 * breathe() in the Human class "throws RuntimeException" so this overriden
	 * method can throw no exception and it will compile and run
	 * */
	void breathe(){
		
	}
}

class Accountant extends Employee{
	
	Accountant()throws Exception{
		System.out.println("Accountant created");
	}
	void breathe() {
		System.out.println("accountant breathe");
	}
}

class ForensicAccountant extends Accountant{
	
	ForensicAccountant()throws Throwable{
		System.out.println("Forensic Accountant created");
	}
}
