package com.gretb;

public class Main {
	
	static Dog dog; //Dog reference

	public static void main(String[] args) {
		
		
		//make 5 female dogs:
		Dog[] femaleDogsArray = makeDogs(false); 
		
		//make 5 male dogs:
		Dog[] maleDogsArray = makeDogs(true); 
		
		
		/*
		for(int i=0;i<maleDogsArray.length; i++) {
			System.out.println(maleDogsArray[i].breed);
		}*/
		
		//select and breed dogs:
		for (Dog femaleDog: femaleDogsArray) { //loop through female dogs
		
			for (Dog maleDog: maleDogsArray) { //loop through male dogs
				
				System.out.println(femaleDog.id + " " + maleDog.id); 
				
				//calculate puppy values from current female dog with current male dog:
				CalcPuppyValues(femaleDog, maleDog);
				
			}	
		}
		
	}//main

	//build an array of Dog objects:
	private static Dog[] makeDogs(boolean isMale) {
		
		Dog[] dogArray = new Dog[5];
		
		for(int i=0;i<dogArray.length; i++) {
			dog = new Dog(isMale, Integer.toString(i+1)); //create a new dog, passing in sex and id
			dogArray[i] = dog; //add dog to array
		}
		return dogArray;
	}
	
	
	//calculate puppy values based on given parents:
	private static void CalcPuppyValues(Dog femaleDog, Dog maleDog) {
		
		int combinedWeight = femaleDog.weight + maleDog.weight; //calc combined weight
		int pupNum = 0; //holds number of pups to be made
		///////String heaviestDogId = ""; //holds heaviest dog's id
		String heaviestDogBreed = ""; //holds heaviest dog's breed
		String lightestDogBreed = ""; //holds heaviest dog's breed
		//++++++++++++++
		
		int puppiesBreed75pc = 0;
		int puppiesBreed25pc = 0;
		
		
		//+++++++++++++
		
		//calculate number of pups to be made:
		if(combinedWeight > 18) { //>18
			pupNum = 12;
		} else { //<18
			
			if (combinedWeight < 12) pupNum = 4; else pupNum = 8; // <12 = 4. <18 = 8. 
		}
		
		//find breed of pups:
		String allPuppiesBreed = ""; //holds breed type for when all puppies are made of this breed
		if (femaleDog.breed == maleDog.breed) allPuppiesBreed = femaleDog.breed; //if parent's breed are the same, puppies will all be of this breed 
		else {
	
			//compare dog weights to find heaviest:
			switch(Integer.compare(femaleDog.weight, maleDog.weight)) { //compare female weight vs male weight
				case -1: //female weight is lightest
					heaviestDogBreed = maleDog.breed; //assign heaviest dog
				break;
				case 1: //male is lightest
					heaviestDogBreed = femaleDog.breed; //assign heaviest dog
				break;
			}
			
			
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			//calculate percentage of puppy breeds, based on heaviest dog:
			puppiesBreed75pc = pupNum - (pupNum * 75 )/100;
			System.out.println(pupNum + " " + puppiesBreed75pc);
			
			
			puppiesBreed25pc = pupNum;
			System.out.println(pupNum + " " + puppiesBreed25pc);
			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		}
		
		
		//System.out.println("female weight: " + femaleDog.weight + ". male weight: " + maleDog.weight + "\n" + Integer.compare(femaleDog.weight, maleDog.weight));
		////System.out.println("female weight: " + femaleDog.weight + ". male weight: " + maleDog.weight + "\n" + heaviestDogId);
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	

}
