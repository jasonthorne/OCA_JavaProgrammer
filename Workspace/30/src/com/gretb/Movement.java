package com.gretb;

public interface Movement {
	
	//An interface is a completely abstract Class. It's just a list of abstract methods.
	//That means that any class that IMPLEMENTS an interface has to override all of the methods listed.
	
	void walk();
	void run();
	void fly();
	void swim();
	
	//'public abstract' is there implicitly for all the above as well.
	public abstract void jump();
		

}
