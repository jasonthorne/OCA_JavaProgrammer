package com.gretb;

public class Main {
	
	static Dog dog;

	public static void main(String[] args) {
		
		
		//make 5 male dogs:
		Dog[] maleDogsArray = makeDogs(true); 
		
		//make 5 female dogs:
		Dog[] femaleDogsArray = makeDogs(false); 
		
		/*
		for(int i=0;i<maleDogsArray.length; i++) {
			System.out.println(maleDogsArray[i].breed);
		}*/
		
		//select and breed dogs:
		for (Dog femaleDog: femaleDogsArray) { //loop through female dogs
		
			for (Dog maleDog: maleDogsArray) { //loop through male dogs
				
				System.out.println(femaleDog.id + " " + maleDog.id); 
				
				//breed female dog with current male dog:
				BreedDogs(femaleDog, maleDog);
				
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
	
	
	//breed dogs with one another:
	private static void BreedDogs(Dog femaleDog, Dog maleDog) {
		
		int combinedWeight = femaleDog.weight + maleDog.weight; //calc combined weight
		int pupNum = 0; //holds number of pups to be made
		String heaviestDogId = ""; //holds heaviest dog's id
		
		//calculate number of pups to be made:
		if(combinedWeight > 18) { //>18
			pupNum = 12;
		} else { //<18
			
			if (combinedWeight < 12) pupNum = 4; else pupNum = 8; // <12 = 4. <18 = 8. 
		}
		
		//find breed of pups:
		String puppyBreed = ""; //hold breed value
		if (femaleDog.breed == maleDog.breed) puppyBreed = femaleDog.breed; //if parent's breed are the same, puppies will all be of this breed 
		else {
	
			//compare dog weights to find heaviest:
			switch(Integer.compare(femaleDog.weight, maleDog.weight)) { //compare female weight vs male weight
				case -1: //female weight is lightest
					heaviestDogId = maleDog.id; //assign heaviest dog
				break;
				case 1: //male is lightest
					heaviestDogId = femaleDog.id; //assign heaviest dog
				break;
			}
			
			
			//calculate percentage of puppy breeds, based on heaviest dog:
			
			
		}
		
		//calculate percentage of puppy breeds: 
		
		
		
		//System.out.println("female weight: " + femaleDog.weight + ". male weight: " + maleDog.weight + "\n" + Integer.compare(femaleDog.weight, maleDog.weight));
		////System.out.println("female weight: " + femaleDog.weight + ". male weight: " + maleDog.weight + "\n" + heaviestDogId);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
