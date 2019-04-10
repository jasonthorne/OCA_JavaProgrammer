package com.gretb;


/**
 * 
 * Overloaded constructors
 *
 */
public class Main {

	public static void main(String[] args) {
		
		//these are vars we will use to create our dog with the different constructors
		int age=3;
		String name="spot";
		double weight = 6.78;
		
		Dog dog1 = new Dog(); //this uses the constructor that takes no vars
		
		Dog dog2 = new Dog(age, name, weight); //this uses the constructor that takes args
		
		//changing name of dog
		name="rex";
		Dog dog3 = new Dog(name, 3, 2.5); //this is going to use the constructor in the dog class that takes a String, an int and a double
		
		Dog dog4 = new Dog(age); //this uses the construcotr in the dog class that takes just an int.
		
		//a cat owned by pat:
		Cat tibbles = new Cat(3, "tibbles", 12.5);
		
		//dogs owned by pat:
		Dog[] dogArray = {dog1, dog2, dog3, dog4};
		
		//pats vars:
		int patsAge = 45;
		String patsName = "Pat";
		double patsWeight = 123;
		double patsHeight = 6.4;
		
		
		Person p = new Person();
		System.out.println(p.cat);
		System.out.println(p.name);
		System.out.println(p.age);
		
	}

}
