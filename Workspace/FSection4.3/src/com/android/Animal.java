package com.android;
/*
 * as our class is abstract we CANNOT create a Animal object
 * , however we can have a Animal  reference
 */
public abstract class Animal {
	/*
	 * all classes that inherit from Animal will have an age
	 * atribute as well
	 */
	int age=23;
	/*
	 * a class that inherits from Animal can choose to override this
	 * or not
	 */
	void eat() {
		System.out.println("Animal eating");
	}
	/*
	 * any class that inherits from Animal HAS TO override this
	 * drink method
	 */
	abstract void drink();
	//inherited classes can choose whether to override or not
	void sleep() {
		System.out.println("Animal sleeping");
	}

}//end of Animal class

class Monkey extends Animal{
	int iq=98;
/*
 * the Monkey class HAS TO override the Drink method, as the drink()
 * in the Animal class is abstract and when a concrete extends an
 * abstract class, all of the abstract methods HAVE TO BE 
 * OVERRIDEN. so here we are overriding the drink() method from the 
 * Animal class
 */
	@Override
	void drink() {
		System.out.println("Monkey drinking");
	}
	/*
	 * the monkey class has it's own method climb(), which is only 
	 * available to the monkey class
	 */
	void climb() {
		System.out.println("Monkey climbing");
	}
	
}//end of monkey class

class Hippo extends Animal{
	double swimSpeed=12;

	@Override
	void drink() {
		System.out.println("Hippo drinking");
		
	}
	/*
	 * this is overriding the sleep() method from the Animal class,
	 * we don't have to do this, but here we choose to do this
	 */
	void sleep() {
		System.out.println("hippo sleeping");
	}
	/*
	 * only hippos can swim
	 */
	void swim() {
		System.out.println("hippo swimming");
	}
	
}//end of hippo class

class Bird extends Animal{

	@Override
	void drink() {
		System.out.println("bird drinking");
		
	}
	//we choose to override the eat() method of the Animal class
	void eat() {
		System.out.println("bird eating");
	}
	//only birds can fly
	void fly() {
		System.out.println("bird flying");
	}
	
}
