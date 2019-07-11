package com.noel;

public abstract class Calculate {
	//the main can be inside a abstract class
	public static void main(String[] args){
		/*	try{
				Questions.q26();
			}
			catch(Exception e){
				System.out.println(e);
			}*/
			//
		//	Questions.q27();
			System.out.println("calling me");
			//this is allowed this is a abstract 
			//reference
			//to a null object
			Calculate myCalculator=null;
			/*
			 * not allowed as Calculator is 
			 * an abstract class
			 */
			//Calculate myCalc=new Calculator();
			//myCalculator.callAbstract();
			/*
			 * as this is a static method you do not 
			 * have
			 * to create a object of the class to access this
			 * so this will compile fine
			 */
			myCalculator.callStatic();
			callStatic();
			/*
			 * this will throw a nullpointer
			 * exception because we are trying
			 * to access a instance method
			 * through a null object
			 */
			myCalculator.callAbstract();
		}
	void callAbstract(){
		System.out.println("instance method call");
		
	}
	static void callStatic(){
		System.out.println("call me in a static way only");
	}

}
