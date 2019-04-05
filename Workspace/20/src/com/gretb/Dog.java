package com.gretb;

public class Dog {
	
	int age;
	double weight;
	String name;
	
	//dog constructor
	/*
	 * This uses the 'this' keyword, which refers to THIS dog. so this.age, means the age of the dog we just created
	 */
	Dog(int age, double weight, String name){
		this.age = age;
		this.weight = weight;
		this.name = name;
		System.out.println("Dog constructor called");
	}
	
	void eat() {
		//the 'this' keyword is implicitly there in every place you use an attribute name inside the dog class.
		System.out.println(this.name + " is eating");
	}
	
	
	/**
	 * POLYMORPHISM (Overloading, and overriding)
	 * A method can do different things depending on what calls it and what is sent to it.
	 * Different animals like a fish, bird and dog all have a method called move()
	 * how they move is different.
	 * A fish swims
	 * A bird flies
	 * A dog walks
	 * Same method, but different implementation
	 *
	 * 
	 * 
	 * OVERLOADING:
	 * What uniquely identifies a method is NOT THE NAME. What uniquely identifies a method is its name + the list of parameter types
	 * (int age, String name, Dog spot)
	 * Also ORDER of parameters matters. return type doesn't matter, and isn't considered for overloading
	 */
	

	void eat(double amount) {
		System.out.println("");
	}
	
	void eat(double amount, int num) {
		System.out.println("");
	}
	
	
	void eat(int num, double amount) { //DIFFERENT FROM ABOVE!! due to parameter order 
		
	}
	
	
	/*
	void eat(double thisdoesntMatter) { //INVALID as constructor exists. (name of parameter is irrelevant!)
		System.out.println("");
	}
	*/
	
	/*
	int eat(double amount) { //INVALID as constructor exists. (return type is irrelevant!)
		return amount;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
}
