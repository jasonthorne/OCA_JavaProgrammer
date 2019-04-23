package com.gretb;


//ABSTRACT CLASSES AND INTERFACES

public class Examples {
	
	static void ex1() {
		Animal andy; //abstract class reference is fine. (As no object is created).
		
		//Animal angela = new Animal(); //this will NOT compile, because you can't create an object from an abstract class. 
		
		Dog spot = new Dog();
		
		spot.eat(); //implementing the overridden eat method. which the dog MUST have as its abstract in the Animal class.
		spot.drink(4.5); //implementing the overridden drink method. which the dog MUST have as its abstract in the Animal class.
		spot.sleep(); //implementing a Animal sleep method. This isn't abstract, so the dog can choose whether to override it or not (which it hasn't here)
		
		
		Cat tibbles = new Cat();
		
		tibbles.eat();  //implementing the overridden eat method. which the cat MUST have as its abstract in the Animal class.
		tibbles.drink(5.5); //implementing the overridden drink method. which the cat MUST have as its abstract in the Animal class.
		tibbles.sleep(); //implementing the cat's overridden sleep method. This isn't abstract, so the cat can choose whether to override it or not (which it has here)
		tibbles.purr(); //cat purr method. Only available to Cats and their kids.
		
		//Animal angela = new Animal(); //this will NOT compile, because you can't create an object from an abstract class. (using the 'new' keyword)
		
		Animal aDog; //A reference is fine though.
		
		/*
		 * This is an Animal reference to a Dog object. A reference is only a NAME. The object is actully created with the command new Dog()
		 * What determines what methods are available is the REFERENCE. This an Animal reference, so only methods in the Animal class are available. 
		 */
		Animal bDog = new Dog(); //You CAN have a superclass reference to a subclass object. But NOT the over way around.
		
	}

}
