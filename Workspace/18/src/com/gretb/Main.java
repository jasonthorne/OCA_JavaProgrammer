package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		
		
		Dog dog = new Dog();
		
		//this is calling the Cat constructor:
		Cat tibbles = new Cat(12, "tibbles", 2.3);
		
		System.out.println(tibbles.name);
		System.out.println(tibbles.age);
		
	}

}
