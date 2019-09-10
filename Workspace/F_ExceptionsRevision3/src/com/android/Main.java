package com.android;

public class Main {
	public static void main(String[]args) {
	//	Examples.ex1();
		/*
		 * the Animal no arguments constructor "throws Exception" which means
		 * whenever we use "new Animal()" we eitehr have to put this in a try/catch
		 * block or the method that is created the Animal, has to have a 
		 * "throws Exception"
		 */
		Animal andy = null;
		try {
			/*
			 * this throws Exception, so has to be in a try/catch block
			 */
			andy=new Animal();
			/*
			 * eat() method also throws exception, so has to be in a try/catch block
			 */
			andy.eat();
			//only throws RuntimeException so does not have to be in try catch block
			andy.drink();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//can't access drink() as you can't access andy outside of the try block
		
		//	andy.drink();
		
		Vehicle myVehicle=new Vehicle();
		try {
			//this does not produce an exception and not throws clause
			myVehicle.drive();
			/*
			 * this has a "throws Exception" but it does not produce a checked
			 * exception, so it has to be in a try/catch block but it does not
			 * cause the catch block to run
			 */
			myVehicle.getFuel();
			//this produces a checked exception, which is caught in the 
			//catch block and has a throws clause
			myVehicle.speed();
		}
		catch(Exception e) {
			System.out.println("exception for vehicle is caught");
			System.out.println("exception is "+e);
		}
		try
		{
			/*
			 * Forensic Acccountant throws throwable
			 * Accountant throws Exception
			 * both of which are checked exception
			 */
			ForensicAccountant freddie=new ForensicAccountant();
			Accountant anne=new Accountant();
			Human hAccountant=new Accountant();
			hAccountant.breathe();
		}
		catch(Throwable e) {
			
		}
		Employee eddie=new Employee();
		Human harry=new Human();
		
		
		
		
	}

}
