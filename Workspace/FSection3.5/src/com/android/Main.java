package com.android;
/**
 * Exam Objective 6.3 Create and Overload constructors
 * @author noelf
 *What is a constructor
 *A constructor is a speical type of method that is used to create
 *an object. The constructor is always the same name as the class
 *it is contained within. IT NEVER HAS A RETURN TYPE, not even void.
 *You can overload constructors, which means a single class can
 *have many different constructors. The same rule applies to overloaded
 *constructors as overloaded methods. You have to have either a 
 *different parameter list or a different order of parameters in order
 *to have overloaded constructors
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * new Dog() is calling a constructor in the Dog class that
		 * takes no arguments. As we have no user defined constructor
		 * in the Dog class, this will use the default no argument
		 * constructor. As soon as you define a constructor in the
		 * class, you no longer have access to the default no
		 * argument constructor
		 */
		Dog spot=new Dog();
		/*
		 * you can only create a Zebra by calling the only constructor
		 * in the class, which is a constructor that takes an int.
		 * there is NO constructor in the class that takes no arguments
		 * (have no access to hidden default constructor with no
		 * arguements)
		 */
		//Zebra zippy=new Zebra();
		/*
		 * this creates a zebra by using the ONLY constructor in the
		 * Zebra class, which is one that takes an int
		 */
		Zebra zed=new Zebra(2);
		
		Cat cat1=new Cat();//constructor 1
		Cat cat2=new Cat(3);//constructor 2
		Cat cat3=new Cat(2,"tom",3.5);//constructor 3
		Cat cat4=new Cat("tabby",5.7,7);//Constructor 4
		
		//Cat cat5=new Cat("satan",4,5);
		/*
		 * I cannot create an Elephant because all of the Constructors
		 * in the Elephant class are private
		 */
		//Elephant dumbo=new Elephant();
		/*
		 * however we can create a static method in the elephant class
		 * that returns an elephant
		 */
		Elephant nellie=Elephant.makeElephant();
		/*
		 * calls the Donkey constructor that takes no arguments which
		 * itself calls the Donkey constructor that takes an int,
		 * String and double
		 */
		Donkey neddie=new Donkey();
		/*
		 * this calls constructor 1, which calls construct 2
		 * which calls constructor 3, which calls constructor one
		 * and prints 
		 * constructor 4 called
			Constructor 3 called
			constructor 2 called
			constructor 1 called
		 */
		Human harry=new Human(43,"harry",156,false);
		/*
		 * 
		 */
		Fresian Freddie=new Fresian();
		/*
		 * static first and in order in the file and only run once
		 * then instance initialisers and run in the order they
		 * are in the file, and run always before constructors
		 * then constructors
		 */
		Employee eddie=new Employee();
		/*
		 * static initialiser is NOT CALLED for etna
		 */
		Employee etna=new Employee();
		/*
		 * see building class for issues with super class and default
		 * constructors
		 */

	}

}
