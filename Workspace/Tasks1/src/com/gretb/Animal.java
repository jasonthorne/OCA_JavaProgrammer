package com.gretb;

import java.util.Random;

public class Animal {
	
	
	//Animal instance vars:
	int id = 0; //Animal ID 
	boolean isMale = true; //Animal gender
	double maxHeight = 0.0; //max height of animal
	double minHeight = 0.0; //min height of animal
	double maxWeight = 0.0; //max weight of animal
	double minWeight = 0.0; //min weight of animal
	double height = makeRand(maxHeight, minHeight); // Animal height
	double weight = makeRand(maxWeight, minWeight); //Animal weight
	
	
	//show attributes of Animal:
	void getAttributes(){
		System.out.println("id: " + id); //show id
		System.out.println("gender: " + isMale); //show gender
		System.out.println("weight: " + String.format("%.2f", weight)); //show weight to 2 decimal places
		System.out.println("height: " + String.format("%.2f", height)); //show height to 2 decimal places
	}
	
	//make random values (for height and weight):
	double makeRand(double maxVal, double minVal) { 
		Random rand = new Random();
		double randonNum = minVal + (maxVal - minVal) * rand.nextDouble();
		return randonNum;
	}
	//https://stackoverflow.com/questions/3680637/generate-a-random-double-in-a-range/3680648

	
	
}
