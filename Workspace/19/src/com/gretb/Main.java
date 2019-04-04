package com.gretb;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog lassie = new Dog();
		Dog benji = new Dog();
		
		System.out.println("Lassie's age: " + lassie.age);
		System.out.println("Benji's age: " + benji.age);
		
		//THis is checking if lassie and benji are the SAME dog (checking for equivilence)
		System.out.println(lassie==benji);
		
		Dog rex = new Dog(); //make a new dog
	
		rex = lassie; //this makes rex and lassie the same dog
		
		Cat tiddles = new Cat();
		Cat tom = new Cat();
		
		Swan swan1 = new Swan(2,2.5,2.5, "Sinead");
		Swan swan2 = new Swan(5,4.5,3.5, "Sean");
		
		swan1.printSwan();
		swan2.printSwan();
		
	}

}
