package com.apple;

public class Cat {
	
	int age; //this is default (package) level access. So the main class (which is in a different package) will NOT have access to this.
	
	public String name; //this is a public access var. So main class in com.android DOES have access to this. 
	
	protected double weight; //this is a protected var, which means only classes in the SAME package, or SUB classes have access to this (so main DOESNT have acess)

	private double height; //you will not be able to access this var outside of this class. 
	
	//==================
	
	//STATICS:
	
	public static int catCounter = 0; //if you do an import in another class in another package, you will have access to this var. As the above import imports statics & non statics.
	
	//static initialiser:
	static {
		System.out.println("STATIC cat initialiser called");
		System.out.println("ammount of cats is: " + catCounter);
	}
	
	//ordinary initialiser:
	{
		System.out.println("this ORDINARY (non static) initialiser is run everytime a new cat is created");
	}
	
	//Cat constructor:
	public Cat(){ //public so Cat's can be created OUTSIDE of this classe's package
		//this(12); //call to private constructor
		System.out.println("Cat constructor with no args called");
		catCounter++;
	}
	
	//Cat constructor:
	private Cat(int age){ //Private so only THIS class can create Cat's
		System.out.println("Cat constructor with int arg called");
		catCounter++;
	}
	
	
	public void eat() {
		System.out.println("Cat eating");
	}
	
	public static void fight() {
		System.out.println("static cat 'fight' called");
	}
	
	
	
	
	
	
	
	
	
	
}
