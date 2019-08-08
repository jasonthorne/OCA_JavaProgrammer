package com.android;
/*
 * all methods in an interface are public by default
 */
public interface Behaviour {
	/*
	 * this is the same as 
	 * public abstract void sad();
	 * no body means it's abst ract
	 */
	void sad();
	//also an abstract method
	public abstract void happy();
	/*
	 * up to java 8 the only type of method  you could have in an
	 * interface would be a abstract method.
	 * however from java 8 onwards you can have a DEFAULT method 
	 * and STATIC methods
	 * default here means, default implementation. Any class that 
	 * implements this interface has to provide a body for all the 
	 * abstract methods, it does this by overriding them
	 * have to override sad() and happy()
	 * with a default method, you DON'T HAVE TOO override the method,
	 * but you can choose too if you want too. 
	 * So any class that implements this interface does NOT HAVE TOO
	 * override the mad() method
	 */
	default public void mad() {
		System.out.println("I am mad");
	}

}
