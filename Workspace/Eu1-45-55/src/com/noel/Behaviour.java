package com.noel;

public interface Behaviour {
	void eat();
	void drink();	
	default void sleep(){
		System.out.println("Sleeping");
	}
}

interface Behaviour2 extends Behaviour{
	void eat();
	default void sleep(){
		System.out.println("b2 sleeping");
	}
}

interface Behaviour3 extends Behaviour,
Behaviour2{
	@Override
	default void sleep(){
		System.out.println("b3 sleeping");
	}
}

class Dog implements Behaviour,Behaviour2{
	int age=100;
	void procreate(){
		System.out.println("dog Procreate");
	}
	@Override
	public void sleep(){
		System.out.println("dog sleeping");
	}
/*
 * this is not ambigious as both eat() methods in
 * the two interfaces are both abstract and
 * have no bodies to cause issues
 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	public void drink(){
		
	}
	
}
