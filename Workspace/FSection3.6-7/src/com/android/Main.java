package com.android;
/**
 * Exam objective 2.3
 * Know how to read or write to object fields
 * Exam objective 3.7
 * Apply Encapsulation principles to a class
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * creating a dog and setting the age and name of a dog by
		 * using a constructor
		 */
		Dog spot=new Dog(5,"spot");
		/*
		 * both age and name are public variables of the Dog class
		 * which means, we don't have to use the getters and setters
		 * to get the age and name of the Dog or change the age and
		 * name of the dog
		 */
		System.out.println("age of dog is "+spot.age);
		System.out.println("name of Dog is "+spot.name);
		spot.age=67;
		
		Cat tibbles=new Cat(4,"tibbles");
		/*
		 * this is using the public getters to view the private
		 * atributes of age and name of this cat. once a cat has
		 * an age and a name, there is NO way to change the age
		 * and name of the Cat
		 */
		System.out.println("age of cat "+tibbles.getAge());
		System.out.println("name of cat "+tibbles.getName());
		/*
		 * cannot access the private variables directly, so have
		 * no means to change existing name and age atributes
		 */
		//System.out.println(tibbles.name);
		//System.out.println(tibbles.age);
		
		Zebra zed=new Zebra();
		/*
		 * we're using a public setter method to set the private
		 * atribute age of the zebra called zed, setters should always
		 * return void
		 */
		zed.setAge(4);
		zed.setName("Zed");
		/*
		 * we are using a public getter method to the private atribute
		 * age, which is the age of the zebra.
		 * getters ALWAYS have a return, NEVER VOID
		 * if you are retrieving an int atribute, the getter method
		 * has to return an int
		 */
		System.out.println("age of zebra is "+zed.getAge());
		System.out.println("name of zebra is "+zed.getName());
		/*
		 * See Human and Animal class for examples of tightly and 
		 * loosely coupled classes
		 */

	}

}
