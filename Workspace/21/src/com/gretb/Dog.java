package com.gretb;

public class Dog {
	int age;//age of dog
	String name;//name of dog
	double weight;//weight of dog
	Dog partner;//dogs partner
	Dog[]litter;//if female, the pups the female has
	boolean sex;
	//a constructor that takes no arguments
	Dog(){
		System.out.println("blank dog constructor called");
	}
	/*
	 * a constructor is still a method (albeit a method with no return type)
	 * so you overload it, and the exact same rules that apply to other overloaded
	 * methods also apply to overloaded constructors
	 * this constructor takes a int, String and a double
	 */
	Dog(int age,String name,double weight){
		this.age=age;
		this.name=name;
		this.weight=weight;
		System.out.println("Dog constructor that takes a int, String and double");
	}
	/*
	 * an overloaded constructor that takes a String, an int and weight and
	 * assigns these to the name, age and weight of the newly created Dog
	 */
	Dog(String name,int age,double weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
		System.out.println("Dog constructor that takes a string, int and double");
	}
	/*
	 * an overloaded constructor that takes just an int and assigns this to the
	 * age of the newly created dog.
	 */
	Dog(int age)
	{
		this.age=age;
		System.out.println("Dog constructor that takes only an int");
	}
	/*
	 * this constructor is a dog that has pups and is female
	 */
	Dog(Dog[]litter){
		this.litter=litter;
		this.sex=true;
	}
	/*
	 * this returns a string that contains all of the details of a dog
	 */
	String printDog() {
		return "age of dog is "+age+" name of dog is "+name+"weight of dog is "+
					weight;
	}
	
	
}
