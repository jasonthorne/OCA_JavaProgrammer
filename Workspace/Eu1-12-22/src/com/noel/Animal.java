package com.noel;

public class Animal {
	void eat(){
		System.out.println("animal eat");
	}
	
	Animal returnAnimal(Animal myAnimal){
		return new Animal();
	}
}
class Cow extends Animal{
	@Override
	void eat(){
		System.out.println("Cow eat");
	}
	/*
	 * covariant return type the overriden
	 * method can return the same data type
	 * or a sub class (Cow is a sub class of
	 * animal)
	 */
	@Override
	Cow returnAnimal(Animal myAnimal){
		return new Cow();
	}
	//available only in Cow class
	void drink(){
		System.out.println("cow drinking");
	}	
}
class Sheep extends Animal{
	
}
