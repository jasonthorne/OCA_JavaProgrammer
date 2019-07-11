package com.noel;
//see question 41
//A
public class Animal {
	void eat(){
		System.out.println("Animal eat");
	}
}

//b1
class Dog extends Animal{
	
}
//c1
class Collie extends Dog{
	
}
//c2
class Poodle extends Dog{
	void eat(){
		System.out.println("Poodle eat");
	}
	
}
//b2
class GoldFish extends Animal{
	void eat(){
		System.out.println("GoldFish eat");
	}
	
}