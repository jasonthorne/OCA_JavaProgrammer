package com.android;

public class Building {
	double area;
	int age;
	double price;
	String address;
	//constructor that takes a double
	Building(double area){
		this.area=area;
		System.out.println("buliding constructo that takes a double");
		
	}
	//overloaded constructor
	//constructor that takes all four variables of Building
	Building(double area,int age,double price,String address){
		this.area=area;
		this.age=age;
		this.price=price;
		this.address=address;
		System.out.println("Building constructor that takes a "
				+ " double, int, double and string called");
	}
	
	Building(int age,double area,String address,double price){
		System.out.println("Building constructor that takes a "
				+ "int, double, String and double called");
		this.age=age;
		this.area=area;
		this.address=address;
		this.price=price;
	}
	
	Building(){
	//	System.out.println();
		//calling the constructor that takes a int,double,String and double
		this(2,2.3,"Galway",119_000.00);
		System.out.println("Blank Building constuctor called");
	}
	
	Building(String address){
		/*
		 * this is calling the blank constuctor
		 */
		this();
		System.out.println("Building Constructor that takes a String called");
	}

}

class House extends Building{
	House(){
		/*
		 * we now can call any of the super class constructors in
		 * the Building class
		 * we also don't need any call to any constructor because
		 * by default it will call the super class constructor 
		 * that takes no arguments, which we do have in the
		 * Buidling class
		 */
	//	super(2.3);
	//	super();
		System.out.println("house constructor that takes no arguments");
	}
	
	House(double area,int age,double price, String address){
		/*
		 * this is calling the constructor in the Building class
		 * that takes a double, int, double and String
		 */
		super(area,age,price,address);
		System.out.println("House constructor that takes a double,"
				+ "int, double and String");
		
	}
	//this constructor calls the one directly above it
	House(double area,int age,double price){
		this(area,age,price,"Galway");
		System.out.println("house Constructor that takes a double,"
				+ "int and double");
	}
	//this constructor calls the one directly above
	House(double area,int age){
		this(area,age,119_00.00);
		System.out.println("house Constructor that takes a double and"
				+ " an int");
	}
	//this constructor calls the one directly above it
	House(double area){
		this(area,2);
		System.out.println("House Constructor that takes a double called");
	}
	
	
	
	
}

class Detached extends House{
	Detached(){
		System.out.println("detached constructor that takes no arguments");
	}
}

class SingleStorey extends Detached{
	
	SingleStorey(){
		System.out.println("singlestorey constructor that takes no arguments");
	}
}
