package com.android;

public class Cat {
	int age;
	String name;
	double weight;
	
	/*
	 * constructor 1
	 * this is a cat Constructor that takes no arguments
	 * to create a cat using this constructor we have to go
	 * new Cat()
	 */
	Cat(){
		System.out.println("Cat constructor that takes no arguments");
		age=21;
		name="tibbles";
		weight=12.3;
	}
	/*
	 * overloaded constructor 2
	 * This is a constructor that takes an int assigns that int
	 * to age. This is a overloaded constructor as it has a different
	 * parameter list to the other constructors in the class
	 * to create a cat using this constructor we go
	 * new Cat(3);
	 */
	Cat(int age){
		System.out.println("Cat constructor that takes an int");
		this.age=age;
	}
	/*
	 * Overloaded constructor 3
	 * This is a constructor that takes an int, a String and a double
	 * and assigns them to age, name and weight. This is a overloaded
	 * constructor as it has a different parameter list to other
	 * constructors in the class
	 * to create a Cat using this constructor we go
	 * new Cat(2,"tom",2.3)
	 */
	Cat(int age,String name,double weight){
		System.out.println("Cat constructor that takes a int, String and double");
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	/*
	 * this is a overloaded constructor and it has a different ORDER
	 * of parameters to every other constructor in the class
	 * to create a cat using this constructor we type
	 * new Cat("tom",2.3,4)
	 */
	Cat(String name, double weight,int age){
		System.out.println("Cat constructor that takes a String,double and int");
		this.name=name;
		this.weight=weight;
		this.age=age;
	}
	/*
	 * this cat constructor can lead to ambigious constructor call
	 * as if we create a cat with
	 * new Cat("tibbles",3,3)
	 * it can call either this constructor, or the above, so java
	 * does not know which one to call
	Cat(String name, int age,double weight){
		this.name=name;
		this.weight=weight;
		this.age=age;
	}
	*/

}
