package com.android;

public class Dog implements Behaviour{

	@Override
	public int lambda1(int a, int b) {
		System.out.println("lambda1 dog method called");
		return 0;
	}
	void bark() {
		System.out.println("dog barking");
	}

}

class Ostrich implements Behaviour{

	@Override
	public int lambda1(int a, int b) {
		System.out.println("lambda ostrich method called");
		return 0;
	}
	
}
