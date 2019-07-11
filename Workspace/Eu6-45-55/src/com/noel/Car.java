package com.noel;

public abstract class Car{
	   public abstract int getDailyRate();
	   public abstract void printDetails();
	   /*
	    * an abstract method CANNOT be
	    * private
	    */
	  // private abstract void myMethod();
	   void newMethod(){
		   System.out.println("newmethod called");
	   }
	}
/*
 * if you want to force as sub class to implement
 * a method from base class (Override it), you have
 * to make the base class method abstract. if
 * you have an abstract method in a class, then
 * the whole class has to be made abstract.
 * each concrete class that extends a abstract
 * class HAS to implement the abstact method 
 * it inherits
 */
class Bus extends Car{

	@Override
	public int getDailyRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
	}
	
}

class Lorry extends Car{

	@Override
	public int getDailyRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
	}	
}
/*
 * but an abstract class that extends an abstract
 * class DOES NOT HAVE TO  override any of the
 * abstract methods from the base class but
 * it CAN
 */
abstract class SmallCar extends Car{
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
	}
}
