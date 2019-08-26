package com.android;

public class Main {

	public static void main(String[] args) {
		
		
		Examples.ex1();
		
		
		try {
			Animal andy = new Animal(); //gives an error during instantiation, as the Animal constructor has a throws.
			andy = new Animal();
			
			
			andy.eat(); 
			andy.drink(); //throws an EXCEPTION so needs to be in the try/catch
			
		}catch(Exception e) {
			e.printStackTrace();
	
		}
		
		
		//-------------------------
		
		
		Vehicle myVehicle = new Vehicle();
		
		try {
			
		myVehicle.drive(); //this COULD produce an exception (but doesnt)
		myVehicle.speed(); //this DOES produce an exception (which is then caught below)
		
		}catch(Exception e) {
			System.out.println("exception for vehicle is caught");
			System.out.println("exception is: " + e);
		}
		
		//===========================
		
		
		System.out.println("");
		
		try {
			
			
			ForensicAccountant freddie = new ForensicAccountant();
			System.out.println("");
			Accountant andy = new Accountant();
			
		}catch(Throwable e) { //catching throwable (Super of exception) because ForensicAccountant throws this.
			
		}
		
		
		
		Employee eddie = new Employee(); //NO try/catch needed as this throws a runtime exception.

		
	}

}
