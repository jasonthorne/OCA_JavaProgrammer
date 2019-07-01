package com.android;

public class Dog implements Behaviour {

	@Override
	public int lambda1(int a, int b) {
		System.out.println("lambda1 Dog method called");
		return 0;
	}
	
	void bark() {
		System.out.println("dog barking");
	}

}

class Ostritch implements Behaviour{

	@Override
	public int lambda1(int a, int b) {
		System.out.println("lambda1 Ostritch method called");
		return 0;
	}
	
}