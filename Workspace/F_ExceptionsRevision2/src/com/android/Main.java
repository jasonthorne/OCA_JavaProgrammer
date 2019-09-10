package com.android;

public class Main {
	public static void main(String[]args)throws Exception {
		try {
			/*
			 * this may or may not produce a checked exception, so it has to
			 * be put in a try catch block, or the method calling it has to
			 * have a "throws Exception" in the method signature
			 * this method calls a method that DOES produced a checked exception
			 */
			Examples.ex1();
		}
		catch(Exception e) {
			System.out.println("exception is "+e);
		}
		/*
		 * this method COULD produce a checked exception, so it has to be put in 
		 * a try catch block or the method calling it, has to have a "throws
		 * Exception" in the method signature. ex2 produces no actual checked
		 * exceptiion
		 */
		Examples.ex2();
		/*
		 * if you call a method that actually produces an exception, our code will
		 * crash, even though you have a "throws Exception" in main. it will 
		 * compile, but it will crash as an actual checked exception is being
		 * produced
		 */
	//	Examples.ex1();
		
	//	Car myCar=new Car();
	//	myCar.move();
	//	Animal myAnimal=new Animal();
	//	myAnimal.eat();
	//	Dog spot=new Dog();
	//	spot.eat();
	//	myAnimal.eat();
		
	}

}

class Car{
	Car()throws Exception{
		System.out.println("Car created");
	}
	
	void move()throws Exception{
		
	}
}

class Animal{
	
	Animal()throws IndexOutOfBoundsException{
		System.out.println("Animal created");
	}
	void eat()throws Exception{
		System.out.println("animal eat throws Exception");
	//	throw new Exception();
	}
}

class Dog extends Animal{
	
	Dog()throws RuntimeException{
		System.out.println("Dog created");
		
	}
	void eat() {
		System.out.println("dog eat Method");
	}
}

class Collie extends Dog{
	Collie()throws Exception{
		System.out.println("collie created");
	}
}
