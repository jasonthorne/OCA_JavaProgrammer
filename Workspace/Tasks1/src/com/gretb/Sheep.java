package com.gretb;

public class Sheep extends Animal{
	
	double maxHeight = 5.0;
	double minHeight = 2.0;
	double maxWeight = 40.0;
	double minWeight = 20.0;
	
	//constructor
	Sheep(int id, boolean isMale){
		this.id = id;
		this.isMale = isMale;
		this.weight = makeRand(maxHeight, minHeight);
		this.height = makeRand(maxWeight, minWeight);
		
		getAttributes();
	}
	
	
	

}
