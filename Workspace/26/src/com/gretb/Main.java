package com.gretb;

public class Main {
	
	/**
	 * 
	 * Access modifiers
	 */

	public static void main(String[] args) {
		
		/*
		 * Public: accessible from everywhere (all packages)
		 * Protected: accessible by classes of the same package and subclasses residing in any other package
		 * Default (blank): (package level) accessible by classes of the same package.
		 * Private: accessible within the same class only
		 */
		
		Dog spot = new Dog(); //Using default level access constructor (all classes in the same package can access this constructor).
		
		Dog rex = new Dog(3, "Rex", 3.3, 3.3); //using public constructor (all classes in all packages).
		
		Dog benji = new Dog(2); //using protected constructor (all classes in its package, and any subclasses in other packages)
		
		//age is a public attribute, which can be accessed in any other class.
		
		//Dog myDog = new Dog("Lassie");
		
		System.out.println("age of rex: " + rex.age); //public (all classes in all packages)
		System.out.println("weight of rex: " + rex.weight); //default (package level)
		System.out.println("height of rex: " + rex.height); //protected (package + subclasses in other packages)
		//System.out.println("name of rex: " + rex.name); //private level (class level only, so no access here)
		
		rex.eat(); //public level access
		rex.drink(); // protected level access
		rex.run(); //default level access
		//rex.bark(); //not accessible as private
		System.out.println("Name of rex is: " + rex.getName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
