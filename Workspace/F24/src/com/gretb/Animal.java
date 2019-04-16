package com.gretb;
//extends Object is here implicitly
public class Animal/* extends Object*/{
	int age;
	//blank Animal constructor
	Animal(){
		/*
		 * this is calling the blank constructor in the Object class
		 * the Object class is a inbuilt class that ALL OTHER CLASSES in java
		 * inherit from. it contains such methods as toString()
		 * equals()
		 * hashCode() and a few others. all objects will have these methods, and 
		 * all can be overriden
		 */
		super();
	System.out.println("Animal created");
	}
	//this is our second overloaded constructor in the Animal class
/*	Animal(int age){
		this.age=age;
		System.out.println("Animal constructor that takes an int");
	}*/
}//end of Animal class
class Mammal extends Animal{
	//blank mammal constructor
	Mammal(){
		/*
		 * in order for us to create a Mammal, we first have to create a
		 * Animal object. we do this by calling the super Animal constructor with
		 * no arguements to create an Animal FIRST.
		 * super() is there implicitly. WE DO NOT HAVE TO PUT THIS IN
		 */
	//	super();
		//super(12);
		System.out.println("Mammal created");
	}
	
	
	
}//end of Mammal class

class Ape extends Mammal{
	//blank ape constructor
	Ape(){
		super();
		System.out.println("Ape created");
	}
}//end of Ape class

class Human extends Ape{
	/*
	 * in order to create a Human the super ape class constructor that
	 * takes no arguments is first called, then in order to create
	 * an ape the super Mammal call constructor that takes no arguments
	 * is called first then to create a Mammal the super Animal 
	 * constructor that takes no arguments is called. then the rest 
	 * of the Animal constructor is run, then the rest of the Mammal
	 * constructor it run, then the rest of the Ape constructor is run
	 * then the rest of the Human constructor is run
	 */
	//blank Human Constructor
	Human(){
		super();
		System.out.println("Human created");
	}
}//end of Human
