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
		
		
		
		//You can't have an else OR else-if by itself. it has to belong to an if:
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
		
		
		/*
		 * Whatever you put in the testing condition of an if or else has to evaluate to a boolean.
		 */
		
		weight = 45;
		
		//check if weight has the value of 45
		if(weight == 45) {
			System.out.println(weight == 45);
		}
		
		
		
		//any equals method of any object will return a boolean, so can be used in an if statement:
		
		String myString = "hello";
		String myString2 = new String("hello");
		
		if(myString.equals(myString2)) {
			System.out.println("two strings are the same");
		}
		
		
		//this dosent compile as weight=45 is not a boolean, its an assignment.
		
		Dog spot;
		spot = null;
		
		System.out.println(spot);
		
		//null pointer exception as spot is a null object & a null obj has no attributes. Only a real Dog has a name.
		//System.out.println(spot.name);
		
		if(spot ==null) {
			spot=new Dog();
			double dnum = 4.5;
		}
		
		//System.out.println(dnum); //cant access as we dont have scope.
		
		//-------------------------------------
		weight = 5;
		
		if((weight+=40)>60) {
			
		}
		
		boolean test = true;
		
		if(test=false) {
			System.out.println("yo");
		}
	}
	
	
	static void ex2() {
		
		int age=18;
		if(age>=17); //dont have to have a BODY, but need a semicolon sfter closing brace if so.
		
		if(returnMe());	
	}
	
	
	static boolean returnMe() {
		System.out.println("ill dissapear after execution!");
		return true;
	}
	
	
	static void ex3() {
		
		/*
		 * If no curly brackets, the body of your if, else & else-if can only have one line of code.
		 */
		
		String name = "lion";
		
		//if(name=="lion") //should not use this
		
		String name2 = new String("lion");
		
		System.out.println(name==name2); //checks if they're pointing to the same address (which they arent)

		System.out.println(name.equals(name2)); //correct way of comparing values
		
		//------
		
		if(name.equalsIgnoreCase("LION")) //no braces as only one statement
			System.out.println("a lion");
		else if(name.equalsIgnoreCase("horse")){
			System.out.println("a horse");
		}
		
	}
	

	
	
}
