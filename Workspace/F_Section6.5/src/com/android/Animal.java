package com.android;

import java.util.concurrent.SynchronousQueue;

public class Animal {
	int age=10;
	String name="andy";	
	void eat(){
		System.out.println("Animal eating");
	}
}//end of Animal
class Dog extends Animal{
	int age=100;
	String name="spot";
	void eat() {
		System.out.println("dog eating");
	}
	
	void accessSuper() {
		System.out.println("age is "+age);
		System.out.println("super age is "+super.age);
		eat();
		this.eat();
		super.eat();
	}
}//end of Dog
class Terrier extends Dog{	
	int age=1000;
	String name="terry";
	void eat() {
		System.out.println("terrier eating");
	}
	
	void accessSuper() {
		System.out.println("age of terrier is "+age);//age of terrier
		System.out.println("also age of terrier "+this.age);//age of terrier
		/*
		 * super refers to the class it DIRECTLY inherits from, which
		 * is in this case the Dog class
		 */
		System.out.println("age of Dog is "+super.age);//age of Dog
		eat();//eat method of Terrier
		this.eat();//eat method of Terrier
		super.eat();//eat method of Dog
		/*
		 * you can't directly call the eat() method of the Animal
		 * class or access the age and name of Animal directly
		 */
		//super.super.eat();
		//super.this.eat();
		//super.super.age;
		//super.this.age;
		/*
		 * one of the easiest ways toaccess both the eat() method and
		 * age of the Animal class is to create a Animal object and
		 * access the Age and the eat() method through that object
		 */
		Animal andy=new Animal();
		andy.eat();
		System.out.println("age of Animal is "+andy.age);
		super.accessSuper();
	}
	
}//end of Terrier
