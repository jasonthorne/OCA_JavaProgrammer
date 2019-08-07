package com.android;

public class Building {
	double price;
}

class Residental extends Building{
	Residental(double price){
		super();
		this.price=price;
	}
}
/*
 * this causes an error as bungalow call the default constructor, which
 * is looks like this
 * Bungalow(){
		super();
	}
	this constructor is looking for a constructor in the Residental
	class that takes no arguments, there is NO SUCH constructor in
	the Residental, only a constructor that takes a double
 */
//class Bungalow extends Residental{
/*	Bungalow(){
		super();
	}*/
//}
