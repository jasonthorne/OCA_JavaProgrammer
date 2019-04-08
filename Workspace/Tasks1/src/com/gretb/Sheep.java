package com.gretb;

public class Sheep extends Animal{
	
	//instance vars of sheep:
	double maxHeight = 5.0;
	double minHeight = 2.0;
	double maxWeight = 40.0;
	double minWeight = 20.0;
	
	//constructor
	Sheep(int id, String gender){
		this.id = id;
		this.gender = gender;
		this.weight = makeRand(maxHeight, minHeight);
		this.height = makeRand(maxWeight, minWeight);
		
		getAttributes(); //get sheep's attributes
	}
	
}
