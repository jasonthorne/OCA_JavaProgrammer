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
		assignAnimals(); //assign animals to farmer
	}
	
	
	//make farmer's animals: 
	void assignAnimals(){
		
		//make number of animals:
		int numOfSheep = numOfAnimal(maxSheep, minSheep); //create number of sheep
		int numOfCattle =  numOfAnimal(maxCattle, minCattle); //create number of cows
		int numOfPigs = numOfAnimal(maxPigs, minPigs); //create number of pigs
		
		//make and print sheep:
		System.out.println("***************************");
		System.out.println(numOfSheep + " Sheep: \n");
		createAnimals(numOfSheep, "sheep");
		
		//make and print cows:
		System.out.println("***************************");
		System.out.println(numOfCattle + " Cow(s): \n");
		createAnimals(numOfCattle, "cattle");
		
		//make and print pigs:
		System.out.println("***************************");
		System.out.println(numOfPigs + " Pig(s): \n");
		createAnimals(numOfPigs, "pig");
		
	}
	
	
	//create a random amount of animals, based on a given range:
	int numOfAnimal(int max, int min){
		Random rand = new Random();
		int randonNum = rand.nextInt((max - min) + 1) + 1;
		return randonNum;
	}
	//https://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java
	
	
	//create animal objects:
	void createAnimals(int numOfAnimal, String animalType) {
		
		for(int i=0;i<numOfAnimal;i++) {
		
			if (i%2 == 0) gender = "male"; else gender = "female"; //assign gender
			
			switch(animalType){ //find animal type
			  case "sheep":
				sheep = new Sheep(i+1, gender); //create sheep object
			    break;
			  case "cattle":
				cow = new Cattle(i+1, gender); //create cow object
			    break;
			  case "pig":
				pig = new Pig(i+1, gender);  //create pig object
			    break;
			}
			
		}
		
	}
	

}
