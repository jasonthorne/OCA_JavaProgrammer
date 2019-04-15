package com.gretb;

/*This contains:
Animal
Mammal that extends Animal
Ape that extends Animal
Human that extends Ape
*/


//super class of all animals:
public class Animal {
	
	double weight;
	int age=10; //default age of Animal is 10
	
	//when this is called from here, it will print 'Animal print: 10'
	void printMe() {
		System.out.println("'printMe' in Animal: " + age);
	}
	
}

class Mammal extends Animal{
	int age=20; //default age of mammal is 20
	
	//overriding the printMe from Animal
	void printMe() {
		System.out.println("'printMe' in Mammal: " + age); //when this is called from here, it will print 'Animal print: 10'
	}
	
	//Mammal classes'' own method:
	void callSuper() {
		System.out.println("'Age' in Mammal: " + age);
		
		//accessing the age in the Animal class:
		System.out.println("'callSuper' in Mammal: " + super.age);
		
		printMe(); //call printMe in Mammal
		super.printMe();//call printMe in Animal 
	}
}


class Ape extends Mammal{
	int age=30;
}

















