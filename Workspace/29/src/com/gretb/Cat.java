package com.gretb;

public class Cat {
	
	int age;
	
	//+++++ When a variable is marked as FINAL, it cannot be changed.
	//+++++ A method can also be final. If so, it cannot be overridden.
	//+++++ A Class can also be final. THe string class for example is final. 
	
	//error if we don't give a value to a final string.
	final String name;
	final double weight;
	final static double height = 4.5; //a static variable that can never change +++++++++++++++++++
	
	//Cat constructor:
	public Cat(int age, String name, double weight) { //This gives values to the FINAL instance vars. (allowing them to not be instantiated during declaration) +++++++++++
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	//you CANT have a constructor in this class that doesnt give a value to the final vars.
	/*
	public Cat() {
		
	}
	*/
	
	//final method cannot be overridden in a subclass but CAN be overloaded (as overloading produces an entirely different method) ++++++++++++++
	final void eat() {
		System.out.println("Im a cat eating");
	}
	
	void drink() {
		System.out.println("Im a cat drinking");
	}
	

}



class Siamese extends Cat{

	//this class needs a constructor that also assigns values to parent final vars ++++++++++++++++++++++++++++
	//Because without a constructor, it uses the default, which is blank and so an instance of Cat is attempted to be made as Siamese is, with no values being assigned to its final vars
	public Siamese(int age, String name, double weight) {
		super(age, name, weight); //Super is NEEDED here as it passes the siamese constructor vars to its parent (Cat), allowing the Cat's 'final' instance vars to be initialised. 
	}
	
	
	void drink() {
		System.out.println("overriden drink method from cat class");
	}
	
	//cant override this method as its final: ++++++++++++++++++
	/*
	final void eat() {
		System.out.println("overriden eat method from cat class");
	}
	*/
	
	
	//You CAN overload a final method:
	void eat(int num) {
		
	}
	
	

}

















