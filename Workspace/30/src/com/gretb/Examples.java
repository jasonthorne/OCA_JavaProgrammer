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
		 * This is an Animal reference to a Dog object. A reference is only a NAME. The object is actually created with the command new Dog()
		 * What determines what methods are available is the REFERENCE. This an Animal reference, so only methods in the Animal class are available. 
		 */
		Animal bDog = new Dog(); //You CAN have a superclass reference to a subclass object. But NOT the over way around.
		bDog.eat();
		bDog.drink(3);
		bDog.sleep();
		bDog.age = 8;
		bDog.weight = 4.5;
		
		Animal aCat = new Cat();
		aCat.drink(2.0);
		aCat.sleep(); //calling the overridden Animal CONCRETE method
		aCat.eat();
		//aCat.purr(); //no access to this as resides in Cat class
		
		//This object only has access to the variables first referenced in the Animal class, which are weight and age.  
		
		Plant myPlant = new Plant();
		myPlant.grow(); //only has access to this method
		myPlant.age=4; //only has access to this var
	
		Fruit myFruit = new Fruit();
		myFruit.grow(); //from Fruit class (as overridden)
		myFruit.flowering(); //from Fruit
		myFruit.age=5; //from Plant
		myFruit.yearlyFruit =10; //from Fruit
		
		Plant pFruit = new Fruit(); //this object only has access to to the methods and vars first referenced in Plant class.
		pFruit.grow();
		pFruit.age=5;
		
		//You cant have a subclass reference to a super class object. 
		//Fruit fPlant=new Plant();
	}
	
	
	static void ex2() {
		
		//INTERFACES
		
		
		//Car myCar = new Car();
		//myCar.move();
		
		//Zebra zeb = new Zebra();
		//zeb.move();
		
		Insect iona = new Insect(); //implements 'Movement' interface
		iona.fly();
		iona.walk();
		//etc..
		
		Robot ronnie = new Robot(); //implements 'Movement' and 'Behavior' interfaces
		
		ronnie.fly();
		ronnie.walk();
		//etc..
		
		ronnie.sad();
		ronnie.happy();
		//etc..
		
		Soldier sammy = new Soldier();  //implements 'Movement' interface, and has own fight and shoot methods.
		sammy.fly();
		sammy.walk();
		//etc..
		
		sammy.fight();
		sammy.shoot();
		
		//You CAN have an interfcace reference
		//Cant do this though: Movement movement = new Movement(); //An interface is an abstract class, and you cant create an instance of an abstract class. 
		
		//You CAN have an interface reference to a class that implements that interface. 
		//these only give access to the methods overridden in the 'Movement' interface: 
		Movement moveInsect = new Insect(); 
		Movement moveRobot = new Robot();
		Movement moveSoldier = new Soldier();
		
		
		
	}

	
	
	
	
	
}
