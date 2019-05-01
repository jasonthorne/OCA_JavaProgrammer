package com.android;

/**
 * 
 * Exam objective 7.5 - Use abstract classes and Interfaces
 * Exam objective 6.2 - Apply the static keyword to methods and fields
 * 
 * Open classes in this order:
 * Main
 * Animal
 * Behaviour
 * Ape
 * Flamingo
 * Trainee
 * Person
 */

public class Main {

	public static void main(String[] args) {
		
		Dog spot = new Dog();
		
		//Takes the happy method from the Dog class, as the Dog class overrides the abstract happy method in the Animal class:
		spot.happy(); 
		
		//Takes the sad method from the Dog class, as the Dog class overrides the sad method in the Animal class:
		spot.sad();
		
		//A concrete method in the abstract Animal class. It is NOT overridden in the Dog class (though it could have been!):
		spot.mad();
		
		RattleSnake sammy = new RattleSnake();
		System.out.println("\n");
		
		sammy.slither(); //abstract from Snake. Overridden in RattleSnake
		sammy.happy(); //abstract from Animal class. Overridden in RattleSnake
		sammy.bite(); //abstract from Reptile. Overriden in Snake
		sammy.mad(); //concrete from Animal. NOT overridden
		sammy.sad(); //concrete from Animal. NOT overridden

	}

}
