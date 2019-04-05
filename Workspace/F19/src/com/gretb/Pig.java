package com.gretb;

public class Pig {
	int age;//age of pig
	String name;//name of Pig
	/*
	 * any class can contain any object as one it's atributes
	 */
	Person owner;//the owner of the Pig
	//constructor to create a pig
	Pig(int pAge,String pName,Person pOwner){
		age=pAge;
		name=pName;
		owner=pOwner;
		System.out.println("Pig constructor called");
	}
	
	
	//eat method for pig
	void eat() {
		System.out.println("Pig eating: " + name);
		gainWeight();
		poop();
	}
	
	//gainWeight method for pig
	void gainWeight() {
		System.out.println("Pig gaining weight: " + name);
		
	}
	
	//poop method for pig
	void poop() {
		System.out.println("Pig pooping: " + name);
	}
	
	
	void one(){
		System.out.println("\none called");
		two();
		three();
	}
	
	void two(){
		System.out.println("two called");
		//one(); //THis causes a stack overflow error as it creates an endless loop of method calls being put on the stack.
	}
	
	void three(){
		System.out.println("three called");
	}
	
	
	
	
	
	
	
	
}
