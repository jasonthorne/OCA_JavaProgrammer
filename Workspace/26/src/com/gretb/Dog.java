package com.gretb;


//top level classes (a class not inside another class) can only be either public or default package level access. ++++++++++++
class Car{
	
}

class Astronaught{
	
	//This is an INNER class and can be of any type
	private class heart{
		
	}
}






public class Dog { //public - available to all classes within all packages


	public int age; //this is public. Can be accessed by any class in any package.
	
	double weight; //this is default level access. default is package level access.
	
	protected double height; //accessible by classes of the same package and subclasses within different packages.
	
	private String name; //this is the most restrictive level access. This attribute is available only inside the same class. Even subclasses are restricted.
	
	
	//We usually access these variables not directly, but through public methods called getters() to get the value, and setters() to set the value.
	
	//this constructor is only available inside the 'com.gretb package':
	Dog(){
		System.out.println("This is a default level access Dog constructor");
	}

	//this constructor is available in all classes from all packages:
	public Dog(int age,  String name, double weight, double height) {
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.name = name;
		System.out.println("This is a public level access Dog constructor. This takes: (int age, double weight, double height, String name)");
	}
	
	//this constructor is available to all classes within its package and any subclasses within other packages:  
	protected Dog(int age) {
		this.age = age;
		System.out.println("This is a protected level access Dog constructor. This takes: (int age)");
	}
	
	//this constructor is available to all classes within its package and any subclasses within other packages:  
	private Dog(String name) {
		this.name = name;
		System.out.println("This is a private level access Dog constructor. This takes: (String name)");
	}

	
	//methods ++++++++++++++++++++
	
	//public eat method:
	public void eat() {
		System.out.println("Dog eat method. Avaliable everywhere");
	}
	
	//public eat method:
	protected void drink() {
		System.out.println("Dog drink method. protected, so avaliable at package level, and to any subclasses in other packages");
	}
	
	//package level method:
	void run() {
		System.out.println("Dog run method. default, so avaliable at package level only");
	}
	
	//private bark level:
	private void bark() {
		System.out.println("Dog bark method. private, so avaliable at class level only");
	}
	
	//getters +++++++++++++++++++++
	
	//a public method used to access a private member:
	public String getName() { 
		//bark(); //calling the private bark method
		return name; //return the private name variable
	}
	
	public void getBark() {
		System.out.println("This is calling the private bark method");
		bark();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

