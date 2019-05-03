package com.android;
/*
 * Animal implements both Behaviour and Movement so we can 
 * create an object and then we can create another object whereby
 * we only know information about the Behaviour of an Animal
 * we only know information about the Movement of an Animal
 */
public class Animal implements Behaviour, Movement{

	@Override
	public void happy() {
		System.out.println("Animal happy");
		
	}

	@Override
	public void mad() {
		System.out.println("Animal mad");
		
	}

	@Override
	public void sad() {
		System.out.println("Animal sad");
		
	}

	@Override
	public void run() {
		System.out.println("Animal run");
		
	}

	@Override
	public void jump() {
		System.out.println("Animnal jump");
		
	}

	@Override
	public void walk() {
		System.out.println("Animal Walk");
		
	}

}
