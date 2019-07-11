package com.noel;

public class Dog {
	
	void eat(){
		System.out.println("Dog eat");
	}
	
	void callEat(){
		/*
		 * this is implicit so the below two
		 * are the same
		 */
		this.eat();
		eat();
	}

}
