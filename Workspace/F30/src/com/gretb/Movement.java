package com.gretb;
/*
 * an interface is a totally abstact class. At it's simpliest it's just a 
 * list of abstract methods. That means that any class that IMPLEMENTS
 * an interface has to override all of the methods listed.
 */
public interface Movement {
	
	public abstract void walk();
	void run();
	void fly();
	void swim();
	/*
	 * all methods in an interface are implicitly PUBLIC and ABSTRACT
	 */
	public abstract void jump();
	void hop();
}
