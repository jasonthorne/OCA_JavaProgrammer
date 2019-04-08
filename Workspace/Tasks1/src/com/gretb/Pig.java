package com.gretb;

public class Pig extends Animal{
	
	double maxHeight = 5.0;
	double minHeight = 2.0;
	double maxWeight = 80.0;
	double minWeight = 40.0;
	
	
	//constructor
	Pig(int id, boolean isMale){
		this.id = id;
		this.isMale = isMale;
		this.weight = makeRand(maxHeight, minHeight);
		this.height = makeRand(maxWeight, minWeight);
		
		getAttributes();
	}

}
