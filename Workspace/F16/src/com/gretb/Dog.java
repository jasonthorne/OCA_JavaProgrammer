package com.gretb;
/**
 * Methods
 * @author noelf
 *
 */
public class Dog {
	//atributes of a Dog
	String name;//name of dog
	double weight;//weight of dog
	int age;//age of dog
	double runninSpeed;//speed dog can run
	/*
	 * Something a objec can do, is called a method. 
	 * so in our case, a Dog can run, lick, eat.
	 * every method has to have a return type, return type is the
	 * first thing you have to have in method declaration.methods can
	 * only exist inside a class.
	 *  We will do a method called run() and it has a return type
	 *  of void (which means it's returning nothing. 
	 *  your method has to have a name, in this case run, methods
	 *  are usually just like variables in that they have a lower case
	 *  letters.
	 *  A method ALWAYS has to have parenthesis (), these can contain
	 *  'METHOD PARAMETERS', this method has no parameters, so they 
	 *  are empty.
	 *  The method body (which is the code that is run when the method
	 *  is called) is in curly brackets.
	 */
	//return type void, name is run, no parameters sent to method
	void run() {
		/*
		 * num is a local variable and is only available inside the run()
		 * method
		 */
		int num=4;
		/*
		 * this will take whatever is the name of the dog is calling this
		 * method and put between the string "name" and "is running.
		 * so if your dog's name is spot this will print out 
		 * "spot is running"
		 */
		System.out.println("name "+name+" is running");
	}//end of run method
	//num=5;
	//a method for our dog lick
	void lick() {
		System.out.println(name+" is licking");
	}
	/*
	 * every time a dog eats something he adds 1 onto his weight
	 */
	void eat() {
		System.out.println("before i eat i weight "+weight);
		System.out.println("my name is "+name+" i am eating");
		weight=weight+1;
		System.out.println("i now weight "+weight);
	}

}
