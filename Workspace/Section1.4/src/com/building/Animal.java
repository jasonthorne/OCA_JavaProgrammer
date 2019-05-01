package com.building;
/*
 * The access levels are:
 * Private - Only in same class
 * Default - Only in same package (no keyword)
 * Protected - Avaliable in same package OR in a child class within another package
 * Public - Avaliable to ALL packages. You still have to import or use the smae fully qualified name.
 * 
 * Only two access levels allowed for top level classes (A class that isnt a child of another class)
 * The access levels allowed are public and default. 
 */

public class Animal {
	
	private int age; //this variable is ONLY available within the Animal package. If we want to acces this outside of this class, we make a public getter().
	
	double weight; //this is 'default' or 'package' level access. Only classes within this classe's package have access to this variable.
	
	protected double height = 3.3;//Available to ALL classes within the same com.building package and any children it has in other packages (eg Dog which is inside com.canine)
	
	public String name = "Spot"; //public is available to all classes, regardless of package level
	
	private class Heart{
		
	}
	
	protected class Lungs{
		
	}
	
	//If the ONLY constructor in your class is private, its impossible to create a member of this class.
	public Animal() { //can only be created within this class.
		System.out.println("Private constructor called");
	}
	
	//This is a constructor that will be avaliable to ALL other classes, regardless of what package they're in. 
	//If you want to create an Animal outside of this package, you HAVE to have a public constructor.
	public Animal(int age) {
		
		/*when we use 'this' keyword inside a constructor, we are calling another constructor in the same class.
		 * here this() means were looking for a constructor in the Animal class which takes no variables. 
		 * You issue a call to one other constructor and its has to be the FIRST STATEMENT inside the constructor.
		 */
		this(); 
		this.age = age;
		System.out.println("Public constructor that takes an int");
		
	}
	
	//A default constructor that can only be used by other classes within the same package
	Animal(double weight){
		this.weight=weight;
	}
	
	//=======================Methods==================================
	
	//a public method that cab be accessed anywhere in the project
	public void run() {
		System.out.println("Animal running, and age is: " + age); //accessing a private variable with a public method
	}
	
	//a default/package level method, that can only be accessed within the same package. 
	void eat() {
		System.out.println("Animal eating");
	}
	
	//a method that can ONLY be accessed within the Animal class
	private void drink() {
		System.out.println("Animal drinking. Private level access");
	}
	
	//this can only be accessed inside the same package or by children within other classes.
	protected void sleep() {
		System.out.println("Animal sleeping. Protected level access");
	}
	
	//this can be done, but doesn't make sense as you cant go: Animal.herd().
	static private void herd() {
		
	}
	
	
	Animal andy = new Animal();
	Zebra zed = new Zebra(); //Zebra class has package level access, which means you can only access the Zebra class if in 'com.building'

}


//This whole class is only package level access, which means you can't access this class in any other package.
class Zebra extends Animal{
	
}



