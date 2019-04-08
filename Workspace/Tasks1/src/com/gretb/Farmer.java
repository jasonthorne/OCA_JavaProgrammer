package com.gretb;

import java.util.Random;

public class Farmer {
	
	String name = ""; //name of Farmer
	int age = 0; //age of Farmer
	boolean isMale = true; //gender of Farmer
	int maxSheep = 10; //max number of sheep the farmer can own
	int maxCattle = 5; //max number of cattle the farmer can own
	int maxPigs = 10; //max number of pigs the farmer can own
	int minSheep, minCattle, minPigs = 1; //minimum number of each animal the farmer can own
	
	Sheep sheep;
	Cattle cow;
	Pig pig;
	
	//constructor
	Farmer(String name, int age, boolean isMale){
		this.name = name;
		this.age = age;
		this.isMale = isMale;
		
		System.out.println("Farmer: ");
		System.out.println(name + " " + age  + " " + isMale);
		System.out.println("***************************");
		makeAnimals();
	}
	
	
	void makeAnimals(){
		System.out.println("Yo");
		
		int numOfSheep = numOfAnimals(maxSheep, minSheep); //create number of sheep
		System.out.println("s:" + numOfSheep); ///////////////////////////////////////////////////////
		int numOfCattle =  numOfAnimals(maxCattle, minCattle); //create number of cows
		System.out.println("c:" + numOfCattle); ///////////////////////////////////////////////////////
		int numOfPigs = numOfAnimals(maxPigs, minPigs); //create number of pigs
		System.out.println("p:" + numOfPigs); ///////////////////////////////////////////////////////
		
		
		System.out.println("Sheep: ");
		for(int i=0; i<numOfSheep; i++) {
			sheep = new Sheep(i+1, true); //change this to have equal number of sexes +++++++++++++++++++++++++
		}
		System.out.println("***************************");
		System.out.println("Cows: ");
		for(int j=0; j<numOfCattle; j++) {
			cow = new Cattle(j+1, true); //change this to have equal number of sexes +++++++++++++++++++++++++
		}
		System.out.println("***************************");
		System.out.println("Pigs: ");
		for(int k=0; k<numOfPigs; k++) {
			pig = new Pig(k+1, true); //change this to have equal number of sexes +++++++++++++++++++++++++
		}
		
	}
	
	
	int numOfAnimals(int max, int min){
		Random rand = new Random();
		int randonNum = rand.nextInt((max - min) + 1) + min;
		return randonNum;
	}
	//https://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java
	

}
