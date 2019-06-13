package com.android;

public class Examples {
	
	static void ex1() {
		
		/*
		 * If you have only 1 line of code after an if, else or else-if you do not have to have curly braces{}
		 * the if & else-if always has opening & closing braces after them.
		 */
		
		/*
		 * What goes in the braces is a BOOLEAN
		 */
		
		int age=5;
		if(age>=18) {
			System.out.println("You are an adult");
		}else if(age > 12) {
			System.out.println("You are a teenager");
		}else{
			System.out.println("You are a child");
		}
		
		//---
		
		//an if statement doesnt have to have an else-if or else
		double weight = 24.5;
		
		if(weight>20) 
				
			System.out.println("you are heavy");
		
		
		
		//You cant have an else OR else-if by itself. it has to belong to an if:
		/*
		else {
			
		}*/
		
		//you can have just an if & an else
		
		if(weight < 15) {
			System.out.println("a");
		}
		else if(weight > 15) {
			System.out.println("b");
		}
		
		
	}

}
