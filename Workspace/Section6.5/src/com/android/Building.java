package com.android;

public class Building{
	double area;
	int age;
	double price;
	String address;
	
	Building(double area){
		
	}
	
	/*
	Building(){
		
	}*/
}

class House extends Building{

	House(){
		super(2.3);
	}
}


class Detatched extends House{
	
}

class SingleStory extends Detatched{
	
}

