package com.gretb;

public class Animal{
	
	//blank Animal constructor:
	Animal(){
		System.out.println("Animal created");
	}

}

class Mammal extends Animal{
	
	//blank Mammal constructor:
	//In order to create a Mammal, we first have to create an Animal Object. We do this by calling the super Animal constructor with super().This is then 'wrapped' in 'Mammal'
	Mammal(){
		System.out.println("Mammal created");
	}
	
}

class Ape extends Mammal{
	
	//blank Ape constructor:
	Ape(){
		System.out.println("Ape created");
	}
	
}

class Human extends Ape{
	
	//blank Human constructor:
	Human(){
		System.out.println("Human created");
	}
	
}













