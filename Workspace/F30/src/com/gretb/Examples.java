package com.gretb;

import java.util.function.Predicate;

/*
 * this lesson is all about Abstract classes and Interfaces
 */
public class Examples {
	
	static void ex1() {
		//you can create a abract class reference
		Animal andy;
		//you CANNOT use the NEW keyword with an Abstract class
		//this will not compile, because you can't create an 
		//abstract object, Animal is an abstract class
		//Animal angela=new Animal();
		Dog spot=new Dog();
		/*
		 * implementing the overriden eat() Animal Abstract method. The Dog
		 * class HAS TO HAVE it's own eat() method
		 */
		spot.eat();
		/*
		 * implementing the overriden Drink(double) Animal Abstract method.
		 * the Dog class HAS TO HAVE IT'S own drink(double) method
		 */
		spot.drink(2.3);
		/*
		 * Sleep was first defined in the Animal class, but it is NOT 
		 * abstact. So the sub classes of Animal can choose to override this
		 * method or not. in This case Dog class does not override the Sleep()
		 * method so it takes the Sleep method from the Animal class
		 */
		spot.sleep();
		
		Cat tibbles=new Cat();
		/*
		 * implements the overriden abstract Animal eat() method. The Cat class
		 * HAS TO HAVE it's own eat method
		 */
		tibbles.eat();
		/*
		 * implements the overriden abstract Animal drink() method. The Cat class
		 * HAS TO HAVE IT'S own drink method.
		 */
		tibbles.drink(3.4);
		/*
		 * the Cat class did not have to overriden the Sleep method of the
		 * Animal class, as it was a concrete class. however it can, and it 
		 * did here, so it takes the sleep method from the Cat class
		 */
		tibbles.sleep();
		/*
		 * this method is only avaiable to Cats, because this method was
		 * first created in Cats.
		 */
		tibbles.purr();
		/*
		 * to recap you can't do this, because you can't use the NEW keyword
		 * with an abstract class, and Animal is an abstract class
		 */
		//Animal angela=new Animal();
		/*
		 * however you can have an Animal reference. you can  have a abstract
		 * class reference
		 */
		Animal anDog;
		/*
		 * you can have a super class reference to a sub class object,
		 * but not the other way around
		 * This is a Animal reference to a Dog object. Reference is only a NAME, 
		 * the actual obejct is created with the command new Dog().
		 * what determines what methods are available is the REFERENCE. This is
		 * a Animal reference, so only methods first defined in the Animal class 
		 * can be accessed. So only eat() drink(double) and sleep() can be accessed
		 * as these were the methods that were first created in the Animal class.
		 * We have a eat() and drink() method in the Dog class, so this object
		 * will takes it's eat and drink() method from the Dog class. There is not
		 * sleep method in the Dog class so the sleep method will be taken from the 
		 * Animal class. 
		 */
		Animal aDog=new Dog();
		aDog.drink(3.4);//from Dog Class Animal abstract method overriden
		aDog.eat();//from Dog class Animal abstract method overriden
		aDog.sleep();//from Animal class
		//has no access pant() as pant was not first created in the Animal class
		//it's unique to Dogs, or unique to Objects with a Dog reference
		//aDog.pant();
		aDog.age=8;//age first defined in Animal class
		aDog.weight=4.5;//weight first defined in Animal class
		/*
		 * sniffRating not first defined in Animal class so this object has
		 * no access to sniffRating
		 */
		//aDog.sniffRating=5;
		
		Animal anCat=new Cat();
		//overriden Drink method in Cat class from Animal abstract method
		anCat.drink(3.4);
		//overriden eat method in Cat class from Animal abstract method
		anCat.eat();
		//overriden sleep method in Cat class from Animal CONCRETE method
		//Cat class does not HAVE to override this method, but it can and it
		//choose to do so
		anCat.sleep();
		/*
		 * no access to the purr() method of the Cat class as this method
		 * was first created in the Cat class. So only a Cat reference
		 * or a sub class of Cat Reference can access this method
		 */
		//anCat.purr();//will not compile
		/*
		 * this object only has access to the variables first referenced
		 * in the Animal class, which are weight and age. the evilRating
		 * variable is only accessible by Cat references or sub class of
		 * Cat reference
		 */
		anCat.weight=45.6;
		anCat.age=200;
		System.out.println("");
		//only access to method in plant class
		Plant myPlant=new Plant();
		//a plant only has access to the grow() method and the age variable
		myPlant.grow();
		myPlant.age=4;
		/*
		 * myFruit has access to grow(),and flowering()
		 * also access to the age variable and the yearlyFruit variable
		 */
		Fruit myFruit=new Fruit();
		myFruit.grow();
		myFruit.flowering();
		myFruit.age=5;
		myFruit.yearlyFruit=9000;
		/*
		 * this object only has access to the methods and variables first
		 * referenced in the Plant class
		 */
		Plant pFruit=new Fruit();
		//grow first exists in the plant, but it does have an implementation
		//in the Fruit class
		pFruit.grow();
		pFruit.age=5;
	//	pFruit.flowering();
	//	pFruit.yearlyFruit=56;
		/*
		 * you can't have a sub class reference to a super class object
		 */
		//Fruit fPlant=new Plant();//will not compile
		
	}//end of ex1() method
	
	static void ex2() {
		/**INTERFACES**/
		/*
		 * two totally different classes and they're objects can't really
		 * be put in an inheritance relationship. As a zebra is not a vehicle
		 * and Car is not any kind of Animal
		 */
		Car myCar=new Car();
		myCar.move();
		Zebra zed=new Zebra();
		zed.move();
		/*
		 * Insect implements the Movement interface only
		 */
		Insect ina=new Insect();
		ina.fly();//from movement
		ina.walk();//from movement
		/*
		 * Robot implements the Movement and Behaviour interfaces
		 * multiple implmentation is allowed
		 */
		Robot ronnie=new Robot();
		ronnie.fly();//from movement
		ronnie.walk();//from movement
		ronnie.sad();//from Behaviour
		ronnie.happy();//from Behaviour
		
		Soilder sammy=new Soilder();
		sammy.fly();//from movement
		sammy.walk();//from movement
		/*
		 * both fight and shoot are Soilder only methods
		 * as first created inside the soilder class
		 */
		sammy.fight();//from soilder class
		sammy.shoot();//from soilder class
		/*
		 * you can have a interface reference
		 */
		Movement move;
		/*
		 * can't use the NEW keyword with an interface, as an interface
		 * is a purely abstract class and you can't create an 
		 * instance of a abstract class
		 */
		//Movement myMove=new Movement();
		/*
		 * you can have an interface reference to a class that implments
		 * that interface. Insect implements Movement, so that means you
		 * can assign a insect object to a Movement Interface reference
		 */
		Movement moveInsect=new Insect();
		Movement moveRobot=new Robot();
		Movement moveSoilder=new Soilder();
		
		Behaviour behaveRobot=new Robot();
		/*
		 * this object is a soilder accessed through the Movement interface
		 * which means this object can only move, but he can't shoot() or
		 * fight. this object ONLY has access to the methods of the interface
		 * movement and nothing else, so all this object can do is 
		 * walk(), run(), jump(), hop(), fly(), swim()
		 */
		moveSoilder.fly();
		moveSoilder.run();
		//has no access to fight(), has no access to shoot()
		//moveSoilder.fight();
		//moveSoilder.shoot();
		//has no access to the age defined in the Soilder class
		//System.out.println(moveSoilder.age);
		/*
		 * similarily with this object, you are accessing a robot object
		 * through the Movement interface, so only methods of the Movement
		 * interface are available to this object and nothing else
		 */
		moveRobot.fly();
		moveRobot.walk();
		/*
		 * even though Robot implments behaviour, this particular object
		 * has no access to any of the Behaviour methods
		 */
		//moveRobot.happy();//will not compile
		//moveRobot.sad();//will not compile
		/*
		 * this is an array of objects that implement the Movement interface
		 * 
		 */
		Movement[]movers= {ina,ronnie,sammy};
		/*
		 * this will cause all of the characters to fly and then swim
		 */
		for(Movement m:movers) {
			m.fly();
			m.swim();
			m.walk();
			m.run();
			m.hop();
			m.jump();
		}
		
		ForensicAccountant freddie=new ForensicAccountant();
		freddie.angry();//behaviour interface
		//Employee class overriding the happy() method from the Behavour interface
		freddie.happy();
		freddie.calculate();//Accountant class
		freddie.work();//Employee class
		freddie.eat();//Person class
		
		
	}

}
