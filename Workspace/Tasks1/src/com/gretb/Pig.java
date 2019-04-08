package com.gretb;

public class Pig extends Animal{
	
	//instance vars of pig:
	double maxHeight = 5.0;
	double minHeight = 2.0;
	double maxWeight = 80.0;
	double minWeight = 40.0;
	
	//constructor
	Pig(int id, String gender){
		this.id = id;
		this.gender = gender;
		this.weight = makeRand(maxHeight, minHeight);
		this.height = makeRand(maxWeight, minWeight);
		
		getAttributes(); //get pig's attributes
	}

}
