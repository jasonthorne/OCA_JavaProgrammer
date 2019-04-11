package com.gretb;

import java.util.ArrayList;
import java.util.Random;

public class Dog {

    private Random rand = new Random(); //instance of random

    //dog vars:
    private String id =""; //dog id
    private String[] breedArray = {"cocker spaniel", "collie", "terrier", "bulldog", "st bernard"}; //breed options of dog
    private String breed = chooseElement(breedArray); //breed of dog
    private String sex = ""; //sex of dog
    private String[] colourArray = {"red", "black", "white", "brown"}; //colour options of dog
    private String colour = chooseElement(colourArray); //colour of dog
    private String[] temperamentArray = {"aggressive", "placid", "nervous"}; //temperament options of dog
    private String temperament = chooseElement(temperamentArray); //temperament of dog
    private final double minWeight = 5.0; //min weight of dog
    private final double maxWeight = 12.0; //max weight of dog
    private final double weight = minWeight + (maxWeight - minWeight) * rand.nextDouble(); //weight of dog //https://stackoverflow.com/questions/3680637/generate-a-random-double-in-a-range/3680648
    private ArrayList<Pup> puppiesArray = new ArrayList<>(); //holds femaleDog's puppies

    //constructor:
    Dog(boolean isMale, String intId){
        if(isMale) sex = "male"; else sex = "female"; //assign sex of dog
        this.id = sex + "_" + intId; //assign an id to dog
    }


	//return a random element from given array:
    private String chooseElement(String[] targetArray) {
        return targetArray[rand.nextInt(targetArray.length)]; //https://stackoverflow.com/questions/8065532/how-to-randomly-pick-an-element-from-an-array
    }

    //add pup to puppiesArray:
    public void addToPuppies(Pup pup) {
        puppiesArray.add(pup);
    }

    //show a litter of female dog's puppies:
    public void showLitter(String id){
        for(Pup puppy: puppiesArray){ //grab each pup in list

            //find dogs belonging to target dad:
            if(puppy.getSireDogId() == id){
                puppy.printValues(); //print values of puppy
            }
        }
    }
    
    //show values of dog (formatting weight to one decimal place):
    public void printValues() {
    	System.out.println( id + " (" + breed + ", "  + sex + ", " + colour + ", " + temperament + ", " + String.format("%.1f", weight) + ")");
    }
    
    //return id value:
  	public String getId() {
  		return id;
  	}

    //return breed value:
	public String getBreed() {
		return breed;
	}

	//return colour value:
	public String getColour() {
		return colour;
	}

	//return temperament value:
	public String getTemperament() {
		return temperament;
	}

	//return weight value:
	public double getWeight() {
		return weight;
	}
	
	//return sex value:
	public String getSex() {
		return sex;
	}
    
	//needed for Pup class
	public Dog() {

	}
}
