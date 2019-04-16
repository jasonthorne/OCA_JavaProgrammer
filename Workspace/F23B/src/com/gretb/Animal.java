package com.gretb;
/*
 * file contanis Animal class
 * Mammal class which extends Animal
 */
//Animal class
public class Animal {
	/*
	 * every animal we create will have a age, will have a eat(), drink(), move()
	 * and procreate() method. Every animal will also have a int age atribute.
	 * Why? because the base class for every Animal is the Animal class and
	 * every animal type we create will inherit/extend from the Animal class and
	 * the Animal class first creates those methods and atributes
	 */
	//if any Animal is not given an explicit age, it's age will be 10
	int age=10;//age of base class Animal
	/*
	 * if a subclass does not define any eat() method, the subclass will
	 * use this method as it's eat() method
	 */
	void eat() {
		System.out.println("a animal eating");
	}
	/*
	 * if a subclass does not define any move() method, the subclass will use
	 * this method as it's move() method
	 */
	void move() {
		System.out.println("a animal moving");
	}
	//same rule applies to drink() as the eat() and move() method
	void drink() {
		System.out.println("a animal drinking");
	}
	//same rule applies to procreate() as drink(),eat() and move() method
	void procreate() {
		System.out.println("a animal procreating");
	}

}
/*
 * Class Mammal now will have all the methods and atributes of the Animal class
 * as this class inherits from the Animal class. The Animal class is the super class
 * of Mammal.
 */
class Mammal extends Animal{
	/*
	 * every Mammal will have a age of 20 if they are not given an explicit age
	 */
		int age=20;
	/*
	 the eat() method was first created/defined in the Animal class. here we
	 are OVERRIDING the eat method. The Mammal class has a eat() method and has
	 it's own implmentation (overriding methods have to have the same method signature
	 and return type but what goes in between the body/curly brackets of the method
	 can be totally different)
	 */
		void eat() {
			System.out.println(" a mammal eating");
		}
		/*
		 * the mammal class uses the drink() method from the Animal class as
		 * the mammal class does not override the Animal drink() method
		 */
		/*
		overridng the procreate() method in the Animal class, same method signature
		and return type but different implmentation
		 */
		void procreate() {
			System.out.println(" a mammal procreating");
		}
		/*
		 * this is a method to show the calling of the methods and atributes of
		 * this class and the calling of the methods and atributes of the super class
		 */
		void callSuper() {
			System.out.println("age of mammal is "+age);//prints 20
			System.out.println("age of Animal is "+super.age);//prints 10
			System.out.println("calling mammal procreate method");
			procreate();
			System.out.println("calling super class Animal procreate method");
			super.procreate();	
		}
		/*
		 * every mammal will use the drink() and the move() method from the 
		 * Animal class as there is no drink() and move method in the
		 * Mammal class
		 */
}
/*
 * class Ape will now have all the methods and atributes of the Mammal class PLUS all
 * the atributes and methods the Animal class that mammal inherited. The Mammal
 * class is super class of the Mammal class
 */
class Ape extends Mammal{
	/*
	 * every Ape will have an age of 20 because it will inherit this value from
	 * the Mammal class and as ape gives no value to age itself, it will take the
	 * value of age from the mammal class, which is 20
	 */
	/*
	 * every ape will have an iq of 50 if they are not given a explicit value 
	 * for i1
	 */
	int iq=50;
	/*
	 there was no drink() method in the Mammal class so this method is overriding
	 the drink() method in the Animal class
	 */
	void drink() {
		System.out.println("an Ape Drinking");
	}
	/*
	 * overriding the procreate() method from the Mammal class
	 */
	void procreate() {
		System.out.println("an ape procreating");
	}
	
	/*
	 * method to show the calling of the atributes and methods of this class (Ape) and
	 * the callign of the atributes and methods of the super class(Mammal)
	 */
	void callSuper() {
		System.out.println("age of ape takes age from Mammal class "+age);
		System.out.println("which is the same as the super age "+super.age);
		System.out.println("calling Ape procreate method");
		procreate();
		System.out.println("calling Mammal procrate method");
		super.procreate();
	}
	/*
	 * there is no eat() method in the ape class so it takes it's implementation from
	 * the super mammal class
	 * there is no move() in the Ape class so it takes it's moves up the chain
	 * until it finds a move() method, and there is a move() method in the Animal
	 * class
	 */	
}
/*
 * class Human will now have all the atributes and methods of the Ape class
 * plus all methods and atributes inherited down along the chain from the Animal
 * class */
class Human extends Ape{
	/*
	 * every human will have an age of 34 and an iq of 120
	 */
	int iq=120;
	int age=34;
	/*
	 * overriding the move() method from the Animal class
	 */
	void move() {
		System.out.println("A human moving");
	}
	/*
	 * overriding the procreate method from the Ape class
	 */
	void procreate() {
		System.out.println("a human procreating");
	}
	/*
	 * showing the calling of methods and atributes of the same class and the
	 * calling of atributes and methods of the super class
	 * also showing the calling of methods and atributes from the base
	 * Animal class
	 */
	void callSuper() {
		System.out.println("age of human is "+age);
		System.out.println("age of ape is "+super.age);
		/*
		 * animal is the very top base class, but you can't go 
		 * super.super.super.age or super.super.age
		 * you have to create an instance of the animal class
		 * and access the methods and variables of the class that way
		 */
		Animal andy=new Animal();
		System.out.println("age of an animal is "+andy.age);
		System.out.println("callign Human procreate method");
		procreate();
		System.out.println("calling Ape super class procreate ");
		super.procreate();
		System.out.println("calling Animal class procreate using Animal object andy");
		andy.procreate();
	}
	
	
	
}
