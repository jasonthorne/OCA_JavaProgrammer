package com.gretb;

public class Cattle extends Animal {
	
	//height and weight values for Cattle:
	double maxHeight = 10.0;
	double minHeight = 5.0;
	double maxWeight = 250.0;
	double minWeight = 50.0;
	
	//constructor
	Cattle(int id, boolean isMale){
		this.id = id;
		this.isMale = isMale;
		this.weight = makeRand(maxHeight, minHeight);
		this.height = makeRand(maxWeight, minWeight);
		
		getAttributes();
	}
	
	
}
