package com.gretb;
/**
 * Inheritance
 * this is one of the central themes of all object Orientated programming languages
 * Animal is the base class or it is referred to in java as the Super class
 * All other classes in this file will inherit from the Animal class
 * you can only h ave one public class per file and the public class has to be
 * the same name as the file. However a file can have as many classes as you 
 * want
 * @author noelf
 *
 */
public class Animal{
	/*
	 * we will put in the Animal only atributes and methods that are common
	 * to all Animals
	 */
	double weight;
	int age=10;
	/*
	 * all of these are Super class methods (also called base class methods)
	 * all Animals that inherit from this class will also have all these
	 * methods. they will INHERIT these methods from the Animal super class
	 * any class that inherits from Animal can use the methods from the Animal
	 * class or they can choose to 	OVERRIDE THE method from the base class
	 */
	//all animals eat
	void eat() {
		System.out.println("Animal eating");
	}
	//all animals move
	void move() {
		System.out.println("Animal moving");
	}
	//all Animals reproduce
	void reproduce() {
		System.out.println("Animal reproducing");
	}
	//all animals breathe
	//the variables here are of no significance, we are just showing a method
	//that has a return type that is not void
	int breathe(String name, double bp) {
		System.out.println("Animal breathing ");
		//this value here has not significance, just there because our method
		//has to return an int and it can any number
		return 12;
	}
}//end of Animal class
/*
 * this is a cow class which inherits the following from the Animal class
 * inherits the variables 
 * int age
 * double weight
 * every cow will have a age, every cow will have a weight
 * it inherits the following methods 
 * void eat()
 * void move()
 * void reproduce()
 * int breathe(String,double)
 * the cow class then has two choices, it can choose to use the Animal class
 * version of the methods or it can define it's own
 */
class Cow extends Animal{
	//every cow will have a default age of 1000
	int age=1000;
	/*
	 * polymorphism
	 * the two drink methods, are overloaded methods, same name, but different
	 * parameter lists
	 * drink() is only available to the Cow class, this is avaiable to any sub
	 * classes of Cow 
	 * i.e class Fresian extends Cow
	 * this will have access to drink()
	 * but the Animal does NOT have access to drink() as Animal is the super 
	 * class of Cow
	 */
	void drink() {
		System.out.println("drink method with no variables");
	}
	//overloaded method
	void drink(int num) {
		System.out.println("drink method with int");
	}
	//overloaded method
	void drink(double dnum,int number) {
		System.out.println("drink method with double and int");
	}
	//overloaded method
	void drink(String str, double number) {
		System.out.println("drink method with string and double");
	}
	/*
	 * Overriding
	 * void eat() method in the cow class is overriding the eat() method
	 * in the Animal class. When you are overriding the return type DOES matter,
	 * the return type HAS TO MATCH, also the parameter list types have to match
	 */
	void eat() {
		System.out.println("I am a cow eating");
		System.out.println("inside eat method cow age is "+age);
		System.out.println("inside eat method age of Animal is "+super.age);
		/*
		 * this is calling the eat method in the Super class, which is the
		 * class Cow inherits, which is the Animal. So this is calling the Animal
		 * classes eat method.
		 * if you want to call any method in the superclass you can by going
		 * super.whatever method you have in the super class
		 */
		super.eat();
		drink();
	}
	
}//end of Cow class

class Zebra extends Animal{
	/*
	 * Zebra class has access to all 9 object class methods. the object class
	 * is a hidden super class which all object ultimately inherit from
	 * also Zebra has access to the five methods of the Animal class, so in all
	 * Zebra has access to 14 methods, even though it appears to be empty.
	 * also every Zerbra has two atributes, every Zebra has a weight and age
	 * 
	 */
	/*
	 * this class will take all of it's method's implementation from the 
	 * Animal class, as there nothing in here
	 */
}

class Shark extends Animal{
	//overriding the eat() method in the Animal class
	void eat() {
		System.out.println("A shark eats by attacking it's prey");
	//	attack();
	}
	//overriding the breathe() method in the Animal class
	int breathe(String var1, double var2) {
		System.out.println("a shark breathes in water");
		return 1;
	}
	/*
	 * this attack() method is only available to the shark and to NO other
	 * Animal
	 */
	void attack() {
		System.out.println("shark attacks by biting huge bites");
	}
}//end of shark class

class Fly extends Animal{
	//overriden eat method
	void eat() {
		System.out.println("I eat by regurgitating my food");
	}
}
//a pig class 
class Pig extends Animal{
	void eat() {
		System.out.println("I am a pig eating");
	}
}

class Fresian extends Cow{
	
}
