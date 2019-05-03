package com.android;
/*
 * An abstract class cannot be instantiated (can't create an Animal object)
 * A abstract method can only exist in an abstract class. If ONE method
 * in a class is abstract then the whole class has to declared Abstract
 * A abstract class CAN HAVE concrete methods (a method with a body)
 * a abstract method has not body (no curly brackets)
 * you don't HAVE TO HAVE a abstract method in a abstract class. so a
 * abstract class can contain nothing but concrete methods.
 */
public abstract class Animal {
	//variables CANNOT BE abstract
	int age;
	//will not compile as variables cannot be abstract
	//abstract double weight;
	//methods CAN BE abstract, a abstract method has no body {}#
	/*
	 * a abstract method has to be defined with the keyword "Abstract" and
	 * it has no body {curly brackets}
	 * any concrete class that extends Animal has to provide a body for
	 * void happy(), it does this by OVERRIDING the happy method
	 */
	abstract void happy();//no body, no curly brackets
	/*
	 * a abstract class can have concrete methods, which a sub class
	 * can choose to override or not, it does not have to override the
	 * concrete methods
	 */
	void mad() {
		System.out.println("I am a mad Animal");
	}
	//you can't have a concrete method without a body
	//void angry();//will not compile
	//can't use the abstract keyword with a concrete method (method with
	//a body)
	/*abstract void angry() {
		
	}*/
	void sad() {
		System.out.println("I am a sad Animal");
	}
}//end of Animal class
/*
 * every inherited abstract method, HAS to be implemented in this class,
 * that means we have to override the abstract happy method and provide
 * it with a body in the Dog class. Because this class is a Concrete 
 * class you can't have a abstract method in this class
 */
class Dog extends Animal{
/*
 * overriding the abstract happy method in the Animal class, which 
 * the Dog class HAS TO DO, the Dog class has no choice
 */
	@Override
	void happy() {
		System.out.println("I am a dog happy");
		
	}
/*
 * here	we are overriding the concrete sad method (method with a body)
 * from the Animal class, we DON'T HAVE TOO override but we choose too
 * override
 */
	void sad() {
		System.out.println("I am a sad Dog");
	}	
}//end of Dog class

/*
 * when an abstract class inherits from another abstract class that has
 * abstract methods in it, it does NOT HAVE TOO override those abstract
 * methods. In this case the Reptile class does not HAVE TOO provide
 * a body to the happy(), but it can if it wants too.
 */
abstract class Reptile extends Animal{
	/*
	 * this abstract class inherits all the methods from Animal of 
	 * the abstract method happy() and the concrete methods sad() and
	 * mad(). The next concrete class in the chain HAS TO OVERRIDE all
	 * the abstract methods collected on the way
	 */
	/*
	 * any concrete class that extends Reptile, has to override the 
	 * Happy() and the bite() abstract methods
	 */
	abstract void bite();
}//end of Reptile class

/*
 * an abstract class extends another abstract class does NOT HAVE too
 * override anything
 */
abstract class Snake extends Reptile{
	abstract void Slither();
	/*
	 * we can choose to override the abstract bite() method from
	 * the Reptile class, we don't HAVE TOO, but we choose to do so
	 */
	void bite() {
		System.out.println("snake biting");
	}
}
/*
 * this is a concrere class which means all the abstract methods it has
 * inherited from all the abstract classes up the chain, have to be 
 * overriden and provided with a body {curly brackets}
 */
class RattleSnake extends Snake{

	/*
	 * overriding the abstract method Slither() in the abstract Snake
	 * class
	 */
	@Override
	void Slither() {
		System.out.println("rattlesnake slithering");	
	}
/*
 * overriding the abstract method bite() from the abstract reptile
 * class
 */
/*	@Override
	void bite() {
		System.out.println("rattlesnake biting");	
	}
	*/
/*
 * overriding the abstract method happy from the abstract class Animal
 */
	@Override
	void happy() {
		System.out.println("rattlesnake happy");	
	}
	
}






