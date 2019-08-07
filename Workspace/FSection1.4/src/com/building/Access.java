package com.building;//same package

public class Access {
	/*
	 * in same package as this class
	 */
	Animal myAnimal=new Animal();
	/*
	 * the Zebra class has package level access, which means you can only
	 * access the Zebra class if in com.building.
	 * The Access class is in the same package, so we can create a 
	 * Zebra
	 */
	Zebra zed=new Zebra();
	/*
	 * if in same package we can access all variables, methods, 
	 * constructors, classes, etc that are public, protected or 
	 * package level access (no keyword)
	 */
	void printMe() {
		/*
		 * age is private variable of the Animal class
		 * so if we can access the age variable, depends on where
		 * we create the Animal. if we create an Animal outside of
		 * the Animal class, we cannot access age, as it's private.
		 * if however, we create an Animal inside the Animal class
		 * this Animal DOES have access to age.
		 * cannot access age here, as private
		 * see the run() method in the Animal class where we create
		 * Animal object with access to age
		 */
	//	System.out.println(myAnimal.age);//private, so cannot access
		//protected, we are in same package so can access height
		System.out.println(myAnimal.height);//protected
		//default, in same package so we can access weight
		System.out.println(myAnimal.weight);//default
		//public, so we can access this anywhere
		System.out.println(myAnimal.name);//public
		myAnimal.eat();//default level access
		//can't access this as this is a private method
		//myAnimal.drink()
	}
}
