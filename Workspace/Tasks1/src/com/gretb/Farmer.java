package com.gretb;

import java.util.Random;

public class Farmer {
	
	//instance vars of farmer:
	String name = ""; //name of Farmer
	int age = 0; //age of Farmer
	boolean isMale = true; //for receiving farmer's gender from user
	String gender = ""; //gender of farmer or animal
	int maxSheep = 10; //max number of sheep the farmer can own
	int maxCattle = 5; //max number of cattle the farmer can own
	int maxPigs = 10; //max number of pigs the farmer can own
	int minSheep, minCattle, minPigs = 1; //minimum number of each animal the farmer can own
	Sheep sheep; //for sheep objects
	Cattle cow; //for cow objects
	Pig pig; //for pig objects
	
	//constructor
	Farmer(String name, int age, boolean isMale){
		this.name = name;
		this.age = age;
		this.isMale = isMale;
		if (isMale) gender = "male"; else gender = "female"; //assign gender string for printout
		
		System.out.println("Farmer: \n" + name + ", " + age  + ", " + gender + "."); //print farmer's values
		System.out.println("***************************");
		makeAnimals(); //make animals for farmer
	}
	
	
	//make farmer's animals: 
	void makeAnimals(){
		
		//create animals:
		int numOfSheep = numOfAnimals(maxSheep, minSheep); //create number of sheep
		int numOfCattle =  numOfAnimals(maxCattle, minCattle); //create number of cows
		int numOfPigs = numOfAnimals(maxPigs, minPigs); //create number of pigs
		
		//make and print sheep:
		System.out.println(numOfSheep + " Sheep: \n");
		for(int i=0; i<numOfSheep; i++) {
			if (i%2 == 0) gender = "male"; else gender = "female"; //assign gender
			sheep = new Sheep(i+1, gender); //create object
		}
		System.out.println("***************************");
		
		//make and print cows:
		System.out.println(numOfCattle + " Cow(s): \n");
		
		for(int j=0; j<numOfCattle; j++) {
			if (j%2 == 0) gender = "male"; else gender = "female"; //assign gender
			cow = new Cattle(j+1, gender); //create object
		}
		System.out.println("***************************");
		
		//make and print pigs:
		System.out.println(numOfPigs + " Pig(s): \n");
		
		for(int k=0; k<numOfPigs; k++) {
			if (k%2 == 0) gender = "male"; else gender = "female"; //assign gender
			pig = new Pig(k+1, gender);  //create object
		}
		
	}
	
	
	//create a random amount of animals, based on a given range:
	int numOfAnimals(int max, int min){
		Random rand = new Random();
		int randonNum = rand.nextInt((max - min) + 1) + 1;
		return randonNum;
	}
	//https://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java
	

}
