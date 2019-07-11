package com.noel;

import java.io.IOException;

public class Employee {
	
	int doWork(int one, double two){
		return 0;
	}

}
class Fireman extends Employee{
	/*
	 * this returns an int, takes in a int
	 * and double, has to be in that order
	 */
	@Override
	int doWork(int three, double four){
		return 0;		
	}
	
	//this is NOT overriden, this is overloaded
	int doWork(double three, int four){
		return 0;
	}
	//q 46
	static void throwException()throws IOException{
		throw new IOException();
	}
	/*
	 * in this method we are calling a method
	 * that throws out an exception, so we 
	 * deal with it by putting it in a try/
	 * catch block
	 */
	static void throwException2(){
		try{
			throwException();
		}
		catch(RuntimeException r){
			System.out.println(r);
		}
		//this block catches the IOException
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	
	
}
