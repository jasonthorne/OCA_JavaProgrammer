package com.noel;

interface I{
	void eat();
}
class Animal implements I{

	@Override
	public void eat() {
		System.out.println("Animal eat");	
	}	
}

class Mammal extends Animal{
	@Override
	public void eat(){
		System.out.println("Mammal eat");
	}
	
}

class Cat extends Animal{
}
