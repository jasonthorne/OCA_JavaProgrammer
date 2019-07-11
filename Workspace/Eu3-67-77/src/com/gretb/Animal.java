package com.gretb;

public class Animal {
	void eat(){
		System.out.println("Animal eat");
	}
}

class Dog extends Animal{
	void eat(){
		/*
		 * correct way to call superclass eat() 
		 * method
		 */
		super.eat();
		System.out.println("Dog eat method");
	}
	/*
	 * this is an example of a recursive method
	 * call that is correctly implemented
	 * a recursive method call needs to
	 * have some way of exiting its 
	 * continually calling itself
	 */
	int count=10;
	void recurMethod(){
		--count;
		System.out.println("recurMethod called "
		+count);
		if(count>0){
			recurMethod();
		}
	}
}
