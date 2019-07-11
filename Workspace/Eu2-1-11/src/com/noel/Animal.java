package com.noel;

public class Animal {
	
	public double eat(int a){
		return a*10/4-30;
	}
	
	public Animal returnObj(Animal a){
		
		return new Animal();
	}

}

class Dog extends Animal{
	public double eat(int a){
		/*
		 * when you have a double in a 
		 * calculation all numbers are promoted
		 * to a double.
		 * if whole numbers all numbers are
		 * promoted to int
		 */
		return a*10/4.0;
	}
	/*
	 * an overriden method can return a subclass 
	 * here we are returning a Dog, 
	 * we can also have the return type
	 * in the method signature either be
	 * a Dog or a Animal
	 */
	@Override
	public Dog returnObj(Animal andy){
		
		return new Dog();
	}
	
	
	
}
