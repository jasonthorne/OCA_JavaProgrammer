package com.android;

import java.util.concurrent.SynchronousQueue;

public class Examples {
	
	static void ex1() {
		Dog spot=new Dog();
		Cat tibbles=new Cat();
		/*
		 * this is the pant() method in the Dog
		 * class
		 */
		spot.pant();
		/*
		 * drink() is an abstract method in teh Animal class and 
		 * the Dog class extends Animal so it HAS TO OVERRIDE
		 * THE drink() method
		 */
		spot.drink();
		/*
		 * sad() is a abstract method in the Behaviour interface and
		 * Dog implments Behaviour so Dog class has to override the
		 * sad() method
		 */
		spot.sad();
		/*
		 * happy() also is a abstract method in the behaviour interface
		 * and Dog implements behaviour so Dog class has to override
		 * the sad() method
		 */
		spot.happy();
		/*
		 * breed() is a concrete method in the Animal class that
		 * the Dog class does not override
		 */
		spot.breed();
		/*
		 * eat() is a concrete method in the Animal class that the
		 * Dog class does not override
		 */
		spot.eat();
		/*
		 * mad is a default method in the Behaviour interface and the
		 * Dog class chooshes NOT to override this method
		 */
		spot.mad();
		
		tibbles.drink();
		tibbles.sad();
		tibbles.happy();
		tibbles.breed();
		/*
		 * The cat class extends Animal and eat() is a concrete method
		 * in the Animal class. However the cat class decides to 
		 * override the eat() and produces "cat eating2
		 */
		tibbles.eat();
		/*
		 * the Cat class implements the Behaviour interface and the
		 * behaviour interface contains the default method mad().
		 * the Cat class chooses to override the mad() method, 
		 * and produces "Cat mad". 
		 */
		tibbles.mad();
		/*
		 * you can have a behaviour reference
		 * you CAN'T have a behaviour object, because this is an interface
		 * and an interface is an abstract class and you can't create
		 */
		//Behaviour behaveDog;//this will compile
		/*
		 * this will NOT COMPILE as you can't have a behavour object
		 */
		//behaveDog=new Behaviour();
		/*
		 * this is a behaviour interface reference a object of a clas
		 * that implments that interface. Dog implments Behaviour
		 * that means you can have Behaviour reference to a Dog object.
		 * this Object only has access to the methods first defined
		 * in the Behaviour interface
		 */
		Behaviour behaveDog=new Dog();
		/*
		 * this object does not have access to pant()
		 * as pant() is a method of the Dog class only
		 */
		//behaveDog.pant()
		/*
		 * this object does not have access to breed() eat() or
		 * drink() as these are methods of the Animal class which the
		 * dog class inherits
		 */
		//behaveDog.breed();
		//behaveDog.eat();
		//behaveDog.drink();
		/*
		 * all these methods were first defined in the Behaviour 
		 * interface
		 */
		behaveDog.happy();
		behaveDog.mad();//default method in behaviour interface
		behaveDog.sad();
		/*
		 * this object can only call the methods happy() mad() and
		 * sad() for the Cat object tibbles
		 */
		Behaviour behaveTibbles=tibbles;
		behaveTibbles.happy();
		behaveTibbles.mad();
		behaveTibbles.sad();
		/*
		 * you can have a super class reference to a sub class object
		 * Animal class reference to a Dog object
		 * this object only has access to methods that are common to 
		 * all Animals. Only has access to methods first defined in 
		 * the Animal class
		 * this object will only have access to breed() eat() and 
		 * drink()
		 */
		//super class reference Animal to sub class object Dog
		Animal anDog=new Dog();
		anDog.breed();//not overriden in Dog class
		anDog.drink();//overridden in Dog class
		anDog.eat();//not overriden in Dog class
		//anDog.pant();//no access to methods of Dog class only
		//anDog.happy();//no access to methods from Behaviour interface
		
		Animal anCat=new Cat();
		anCat.breed();//not overridden in Cat class
		anCat.drink();//Overridden in Cat class
		anCat.eat();//Overridden in Cat class
		
		Employee empFire=new Fireman();
		/*
		 * you can't have a sub class reference to a super class object
		 * this will not compile
		 */
		//Fireman fireEmp=new Employee();
		/*
		 * this does not give a compiler error this gives a 
		 * exception
		 * and the exception is called
		 * ClassCastException
		 * you wont' get a compiler error, you will get what is called
		 * a RuntimeException, which is an exception that the compiler
		 * cannot pick up
		 */
		//Fireman fireEmp=(Fireman)new Employee();
		
	}//end of ex 1
	
	static void ex2() {
		System.out.println("go to duck class to see multiple implementation "
				+ " of interfaces");
		Duck daffy=new Duck();
		daffy.findWater();//Swim interface
		daffy.paddle();//Swim interface
		daffy.launch();//Fly interface
		daffy.glide();//Fly interface
		daffy.land();//Fly interface
		System.out.println(daffy.age);
		
		Swim swimDaffy=daffy;
		/*
		 * this object can only findWater() and paddle(), can do
		 * nothing else and can access nothing else
		 */
		//System.out.println(swimDaffy.age);//can't access this
		//swimDaffy.launch();//can't access this
		swimDaffy.findWater();
		swimDaffy.paddle();
	}
	
	static void ex3() {
		Deer bambi=new Deer();
		
		bambi.landBased();//move interface
		bambi.runSpeed();//run interface
		//accessing static interface variables in a non static way
		System.out.println(bambi.finalInt);
		//accessing the static variable in a static way
		//accessing it through the name of the interface
		//this is the RECOMMENED WAY 
		System.out.println(Run.finalInt);
		/*
		 * accessing a static variable of interface through a class
		 * name that implements the interface
		 * Deer implements Move, Move contains the variable finalInt
		 */
		System.out.println(Deer.finalInt);
		/*
		 * we have a static method race() in the Run interface. there
		 * is only ONE way to access a static method in an interface
		 * that is the name of interface, followed by the name of
		 * the method
		 */
		Run.race();
		/*
		 * neither of these ways will compile		
		 *///Deer.race();
		//bambi.race()
	}
	
	static void ex4() {
		Ape magilla=new Ape();
		Human harry=new Human();
		
		Test testy=new Test();
		/*
		 * this method can take a Ape or a Human
		 */
		testy.takeApe(magilla);
		testy.takeApe(harry);
		/*
		 * this method can take a Ape or a Human
		 */
		testy.returnApe(magilla);
		testy.returnHuman(harry);
		/*
		 * this  method can only take a human reference object
		 */
		testy.returnHuman(harry);
		//can take a sub class of Human but not a super class
		//will not compile
		//testy.returnHuman(magilla);
		Ape humApe=new Human();
		/*
		 * returnHuman expects a object that has a HUMAN reference, this
		 * object is a Human (humApe) but it has a Ape reference, and 
		 * reference is what determines if a method can take a certain
		 * object or not
		 * so this will NOT compile
		 */
		//testy.returnHuman(humApe);
		/*
		 * Casting is changing of the REFERENCE of an object, it only
		 * works for compatible objects
		 * i.e humApe is a Ape reference to a Human object, which means
		 * we can cast this object to be a Human reference
		 */
		Human newHuman=(Human)humApe;
		/*
		 * now newHuman is a Human reference to a Human object
		 * so now we can send this object to the method returnHuman which
		 * takes only Human referenced objects or a sub class of Human
		 */
		testy.returnHuman(newHuman);
		/*
		 * this is casting humApe to be a reference type Human and sending it
		 * to the returnHuman method
		 */
		testy.returnHuman((Human)humApe);
	
		//this will not work either
		humApe=(Human)humApe;
		
		//testy.returnHuman(humApe);
	}

}
