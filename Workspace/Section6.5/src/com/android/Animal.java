package com.android;

public class Animal {
	
	int age=23;
	String name="Andy";
	
	void eat(){
		System.out.println("Animal eating");
	}

}


class Dog extends Animal{
	
	int age=100;
	String name="Spot";
	
	void eat(){
		System.out.println("Dog eating");
	}
	
}

class Terrier extends Dog{
	int age=1000;
	String name="Terry";
	
	void eat(){
		System.out.println("Terrier eating");
	}
	
	void accessSuper() {
		System.out.println("age of Terrier is: " + age);
		System.out.println("also age of Terrier: " + this.age);
		System.out.println("age of Dog is: " + super.age); //super refers to the class it IDRECTLY inherits from, which is in this case the Dog class.
		
		eat(); //eat method of Terrier
		this.eat(); //also the eat method of Terrier.
		super.eat(); //eat method of Dog
		
		/*
		 * You CANT directly call  the eat() method of the Animal class or access the age & name of Animal directly +++++++++++++++++++++++++++++
		 * Only way is to create an Animal within this class
		 */
		
		Animal andy = new Animal();
		andy.eat();
		System.out.println("age of Animnal is " + andy.age);
	}
	
}

