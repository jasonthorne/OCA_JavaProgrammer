package com.android;

/**
 * 
 * An abstract class cannot be instantiated.
 * An abstract method can only exist in an abstract class. If ONE method in a class is abstract the nthe whole class has to be declared abstract.
 * An abstract class CAN HAVE concrete methods (methods with a body)
 * You DONT HAVE TO HAVE abstract methods inside an abstract class.
 */

public abstract class Animal {
	
	//Variables cannot be abstract: 
	//abstract double weight; //computer say's no
	int age;
	
	//methods CAN be abstract. An abstract method has no body.
	//An abstract method has to be defined with the keyword "Abstract" and it has no body:
	abstract void happy(); //no body or braces! 
	
	//Any concrete class that extends Animal HAS TO provide a body for void happy().
	//It does this by OVERRIDING the method.
	
	
	//An abstract class CAN HAVE concrete methods, which a subclass can CHOOSE to override or not.
	void mad() {
		System.out.println("I am a mad Animal");
	}
	
	//You cant have a concrete method WITHOUT a body;
	//void angry();
	
	//You cant use abstract with a method with a body:
	/*abstract void angry() {
		
	}*/
	
	void sad() {
		System.out.println("I am a sad Animal");
	}
	

}

/*
Every inherited abstract method HAS to be implemented in this class. 
That means you HAVE TO override the abstract happy method and provide it with a body in the Dog class. 
 */

class Dog extends Animal{

	//overriding the happy method. Which it HAS TO DO.
	void happy() {
		System.out.println("I am a happy Dog");
	}
	
	
	//overriding the CONCRETE sad method from the animal class. We DONT HAVE TO override this, but we've chosen to:
	void sad() {
		System.out.println("I am a sad Dog");
	}
	
}


//An abstract class extending ANOTHER abstract class. Don't HAVE to override it's parents abstract methods (note that it inherits them). 
abstract class Reptile extends Animal{
	
	//This abstract class inherits ALL the methods from Animal. THe abstract method happy() and the concrete methods sad() and mad().
	//The next CONCRETE class in the chain HAS TO override the happy() and bite() methods.
	
	abstract void bite();
	
	
}

//as above, this class DOSENT HAVE TO override anything
abstract class Snake extends Reptile{
	
	abstract void slither();
	
	//override the bite method from the Reptile class. that means any child classes will be using this method, and DONT HAVE TO override it themselves
	void bite() {
		System.out.println("Snake bite - from Reptile class");
	}
}



//THis is a CONCRETE class, which means all the abstract methods it's inherited up the chain HAVE TO BE overridden.
class RattleSnake extends Snake{

	@Override
	void slither() {
		System.out.println("RattleSnake slither - from Snake class");
		
	}

	/*
	@Override
	void bite() {
		System.out.println("RattleSnake bite - from Reptile class");
		
	}
	*/

	@Override
	void happy() {
		System.out.println("RattleSnake happy - from Animal class");
		
	}
	
}




