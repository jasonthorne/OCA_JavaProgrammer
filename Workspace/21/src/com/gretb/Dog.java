package com.gretb;

import java.util.ArrayList;
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
    double minWeight = 5.0; //min weight of dog
    double maxWeight = 12.0; //max weight of dog
    double weight = minWeight + (maxWeight - minWeight) * rand.nextDouble(); //weight of dog //https://stackoverflow.com/questions/3680637/generate-a-random-double-in-a-range/3680648
    private ArrayList<Pup> puppiesArray = new ArrayList<>(); //holds femaleDog's puppies

    //constructor:
    Dog(boolean isMale, String intId){
        if(isMale) sex = "male"; else sex = "female"; //assign sex of dog
        this.id = sex + "_" + intId; //assign an id to dog
    }

    //return a random element from given array:
    String chooseElement(String[] targetArray) {
        return targetArray[rand.nextInt(targetArray.length)]; //https://stackoverflow.com/questions/8065532/how-to-randomly-pick-an-element-from-an-array
    }

    //add pup to puppiesArray
    public void addToPuppies(Pup pup) {
        puppiesArray.add(pup);
    }

    //show a litter of female dog's puppies
    public void showLitter(Dog sireDog){
        for(Pup puppy: puppiesArray){ //grab each pup in list

            //find dogs belonging to target dad:
            if(puppy.sireDog == sireDog){
                //print values of pup (formatting weight to one decimal place):
                System.out.println(puppy.id + ": " + puppy.breed + ", " + puppy.sex + ", " + puppy.colour
                + ", " + puppy.temperament + ", " + String.format("%.1f", puppy.weight));
            }
        }
    }


}
