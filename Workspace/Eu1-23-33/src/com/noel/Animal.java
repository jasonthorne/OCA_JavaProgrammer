package com.noel;

public class Animal {
	int age=10;
	String name="Andy";
	void eat(){
		System.out.println("animal eat "+age);
	}

}
class Cow extends Animal{
	int age=100;
	String name="bessie";
	void eat(){
		System.out.println("cow eat "+age);
	}
}
class Heifer extends Cow{
	int age=1000;
	void eat(){
		System.out.println("Heifer eat "+age);
	}
	
}
