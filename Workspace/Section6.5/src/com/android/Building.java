package com.android;

public class Building{
	double area;
	int age;
	double price;
	String address;
	
	Building(double area){ //Building constructor that takes a double
		System.out.println("Building constructor that takes a double");
	}

	
	Building(double area, int age, double price, String address) {
		super();
		this.area = area;
		this.age = age;
		this.price = price;
		this.address = address;
		System.out.println("Building constructor that takes a  double, int, double & string");
	}
	
	Building(int age, double area, double price, String address) {
		super();
		this.age = age;
		this.area = area;
		this.price = price;
		this.address = address;
		System.out.println("Building constructor that takes an int, double., double & string");
	}
	
	Building(){
		this(2,2.3,"Galway", 119_000.00);
		System.out.println("BLANK bulding constuctor called (which calls another constructor with it's 'this')");
	}


	public Building(int i, double d, String string, double j) {
		System.out.println("Building constructor that takes an int, double, string & double");
	}
	
	
	Building(String address){
		this();
		System.out.println("Building Constructor that takes a String");
	}
	
}

class House extends Building{
	
	//We can call any of the constructors in the Building class.

	House(){ //House constructor that takes no arguments
		super(2.3);
		System.out.println("House constructor that takes no args");
	}
	
	House(double area, int age, double price, String address){
		super(area,age,price,address); //calls the constructor in the building class that tskes these values
		System.out.println("House constructor that takes 'area,age,price,address'");
	}
	
	
	House(double area, int age, double price){
		this(area, age, price, "Galway"); //
		System.out.println("House constructor that takes a double, int & double. and calls a constructor that takes a doube,int,double,&string");
	}
	
	House(double area, int age){
		this(area,age,119_00.00);
		System.out.println("House constructor that takes a double & int. and calls a constructor that takes a doube,int & double");
	}
	
	House(double area){
		this(area, 2);
		System.out.println("House constructor that takes a double. and calls a constructor that takes a double & int");
	}
	
}


class Detatched extends House{
	Detatched(){
		System.out.println("detatched constructor that takes no args");
	}
}

class SingleStory extends Detatched{
	
	SingleStory(){
		System.out.println("SingleStory constructor that takes no args");
	}
	
}

