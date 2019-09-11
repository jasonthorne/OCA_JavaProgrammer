package com.apple;

public class Cat {
	/*
	 * this is package/default level access, so the main class in a 
	 * different package will NOT have access to this
	 */
	int age;
	/*
	 * this is public access variable, so main class in a com.android
	 * 	WILL have access to this variable
	 */
	public String name;
	/*
	 * this is a protected variable, which means only classes that are in
	 * the same package or in a derived class will have access to this
	 * variable. main is in a different package, but main is NOT a sub
	 * class of Cat, so main will NOT have any access to this variable
	 */
	protected double weight;
	/*
	 * you will not be able to access this variable outside of the 
	 * Cat class
	 */
	private double height;
	/*
	 * if you do a import in antoher class in another package such as
	 * import com.apple.Cat;
	 * you will have access to this variable, as the above import 
	 * statement imports both statics and non statics
	 */
	public static int catCounter=0;
	//static initialiser, run only once
	static {
		System.out.println("static cat initialiser called");
		System.out.println("amount of Cats at start is "+catCounter);
	}
	//non static initialiser and it's run every time before a 
	//cat is created
	{
		System.out.println("this initialiser is run every time a "
				+ " new cat is created");
	}
	//constructor
	public Cat(){
	//	this(12);
		System.out.println("Cat constructor with no arguments called");
		catCounter++;
	}
	//construcotr
	private Cat(int age) {
		super();
		System.out.println("private Cat constructor with int called");
		catCounter++;
	}
	public void eat() {
		System.out.println("cat eating");
	}
	
	public static void fight() {
		System.out.println("cat static fight method");
	}
	//not available outside of the com.apple package
	void drink() {
		System.out.println("cat drinking");
	}
	/*
	 * this is only avaialable in the same package of com.apple
	 */
	static void attack() {
		System.out.println("cats attacking");
	}

}
