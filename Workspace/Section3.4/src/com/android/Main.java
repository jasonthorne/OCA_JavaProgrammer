package com.android;

/**
 * 
 * Exam objective 6.1 - Create methods with return values including OVERLOADED METHODS (a method with the same name but different param list or order of params) 
 *
 */

public class Main {
	
	public static void main(String[] args) {
		
		Animal andy = new Animal();
		
		andy.eat();
		andy.eat(3);
		andy.eat(3.33, "yo");
		andy.eat("yo", 3.33);
		
		Dog spot = new Dog();
		spot.drink();
		spot.drink(4); //an overloaded method in the Dog class that takes an int. 
		
		//println() is overloaded and takes anything!
		
		
		Phone samsung = new Phone();
		double dNum=3;
		int num=4;
		
		//the dial method can take a double or any SMALLER numeric data type.
		samsung.dial(dNum);
		samsung.dial(num);
		samsung.dial(2);
		samsung.dial(2.3);
		
		//these are fine, as the params know the arg types:
		samsung.call(dNum, num);
		samsung.call(num, dNum);
		
		//these gives error as params dont know arg types: 
		//samsung.call(2, 3);
		//samsung.call(8, 1);
		
		Tablet myTablet = new Tablet();
		
		Message myMessage = new Message();
		myMessage.read(samsung);
		myMessage.read(myTablet);
		myMessage.read(new Pc());
		myMessage.read(new GameConsole());
		myMessage.read(new Appliance());
		
		takeAnimal(new Collie()); //this will call the (Dog myDog) method as its the CLOSEST overloaded method TO IT. ++++++++++++++++IMPORTANT!++++++++++++++++++
		
	}//main
	
	
	
	static void takeAnimal(Animal myAnimal){ //can take an animal, a dog and a collie
		myAnimal.identifyMe();
		System.out.println("Animal calling me");
	}
	
	static void takeAnimal(Dog myDog){ //can take a dog and a collie
		myDog.identifyMe();
		myDog.bark();
		System.out.println("Dog calling me");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
