package com.gretb;

public class Cattle extends Animal {
	
	//instance vars of cattle:
	double maxHeight = 10.0;
	double minHeight = 5.0;
	double maxWeight = 250.0;
	double minWeight = 50.0;
	
	//constructor
	Cattle(int id, String gender){
		this.id = id;
		this.gender = gender;
		this.weight = makeRand(maxHeight, minHeight);
		this.height = makeRand(maxWeight, minWeight);
		
		getAttributes(); //get cattle's attributes
	}
	
	
}
