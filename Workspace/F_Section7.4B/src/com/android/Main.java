package com.android;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questions.q1();
		/*
		 * the finally always runs after the try block, so it belongs to the
		 * try block
		 */
		try {
			
		}
		finally {
			
		}
		
		//Questions.q2();
		//System.out.println("number is "+Questions.q3());
		System.out.println("number is "+Questions.q5());
		
		Dog spot=new Dog();
		System.out.println("before method call age is "+spot.age);
		Questions.q7(spot);
		System.out.println("after method call age is "+spot.age);
		
		try {
			Questions.q8();
		}
		catch(Exception e) {
			System.out.println("exception in main is "+e);
			/*
			 * if an exception causes our program to crash this will
			 * be printed out automatically
			 */
			e.printStackTrace();
		}
		

	}

}
