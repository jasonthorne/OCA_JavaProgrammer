package com.gretb;

import java.util.Random;

public class Dog {
	
	Random rand = new Random(); //instance of random
	
	//dog vars:
	String id =""; //dog id
	String[] breedArray = {"cocker spaniel", "collie", "terrier", "bulldog", "st bernard"}; //breed options of dog
	String breed = chooseElement(breedArray); //breed of dog
	String sex = ""; //sex of dog
	String[] colourArray = {"red", "black", "white", "brown"}; //colour options of dog
	String colour = chooseElement(colourArray); //colour of dog
	String[] temperamentArray = {"aggressive", "placid", "nervous"}; //temperament options of dog
	String temperament = chooseElement(temperamentArray); //temperament of dog
	int minWeight = 5; //min weight of dog
	int maxWeight = 12; //max weight of dog
	int weight = rand.nextInt((maxWeight - minWeight) + 1) + minWeight; //weight of dog //https://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java
	
	
	//constructor:
	Dog(boolean isMale, String intId){
		
		if(isMale) sex = "male"; else sex = "female"; //assign sex of dog
		this.id = sex + "_" + intId; //assign an id to dog
		
		/*
		System.out.println("dog: ");
		System.out.println(weight);
		System.out.println(breed);
		System.out.println(colour);
		System.out.println(temperament);
		System.out.println(sex);
		System.out.println(id);
		System.out.println("=======================");*/
		
	}
	
	
	//return a random element from given array:
	String chooseElement(String[] targetArray) {
		return targetArray[rand.nextInt(targetArray.length)]; //https://stackoverflow.com/questions/8065532/how-to-randomly-pick-an-element-from-an-array
	}

}
