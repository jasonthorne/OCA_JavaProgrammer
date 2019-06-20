package com.android;

/*
 * An abstract method can have both concrete & abstract methods. 
 * If you have an abstract method in a classs, the class has to be marked abstract. 
 */

public abstract class Animal {
	
	//concrete method
	void breed() {
		System.out.println("Animal breeding");
	}
	
	//concrete method
	void eat() {
		System.out.println("Animal eating");
	}
	
	//abstract method (no body & marked abstract)
	//any concrete class that extends Animal HAS TO override this method. 
	abstract void drink();
	

}

class Dog extends Animal implements Behaviour {
	
	//this is a Dog classe's own method. this is avaliable ONLY tothe Dog class, and any subclasses of Dog.
	void pant() {
		System.out.println("Dog panting");
	}

	//this CONCRETE class extends the abstract class Animal, so it's abstract class needs overridden. other extended abstract classes, DONT NEED TO override. ++++++++++++++++++++
	@Override
	void drink() {
		System.out.println("Dog drinking");
		
	}

	
	//----------------------------
	//These are from the Behaviour Interface. We HAVE to override any abstract methods from this interface..
	@Override
	public void sad() {
		System.out.println("Dog sad");
		
	}

	@Override
	public void happy() {
		System.out.println("Dog happy");
		
	}
	
}

class Cat extends Animal implements Behaviour{

	@Override
	void drink() {
		System.out.println("Cat drinking"); //overridden from the Animal class
		
	}
	
	@Override
	void eat() {
		System.out.println("Cat eating"); //overridden from the Animal class BUT DIDNT NEED TO BE as it's concrete, not abstract.
	}

	//------------------------------
	//These are from the Behaviour Interface. We HAVE to override any abstract methods from this interface..
	@Override
	public void sad() {
		System.out.println("Cat sad");
		
	}

	@Override
	public void happy() {
		System.out.println("Cat happy");
		
	}
	
	
	@Override
	public void mad() { //overriden from the Behaviour Interface BUT DIDNT NEED TO BE as it was default. 
		System.out.println("Cat mad");
		
	}
	
	/* this wont compile as it cant be package level access, as the mad() method in the interface can be LESS ACCESSIBLE. 
	 * The mad method in the interface is public void mad so overidding this method MUST give at LEAST the same visibility (which is public) 
	@Override
	void mad() { 
		System.out.println("Cat mad");
		
	}*/
	
}



