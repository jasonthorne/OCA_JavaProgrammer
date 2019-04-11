package com.gretb;

import java.util.ArrayList;

public class SexyTime {

    private Dog femaleDog; //mating female dog
    private Dog maleDog; //mating male dog

    //arrayLists for holding the values of traits to be randomly selected during puppy creation:
    private ArrayList<String> pupBreedArray = new ArrayList<String>();
    private ArrayList<String> pupColourArray = new ArrayList<String>();
    private ArrayList<String> pupTemperamentArray = new ArrayList<String>();
    private ArrayList<String> pupSexArray = new ArrayList<String>();

    private int pupNum = 0; //holds number of pups to be made
    private double pupWeight = 0.0; //holds weight of puppies

    //constructor:
    SexyTime(Dog femaleDog, Dog maleDog){
        this.femaleDog = femaleDog;
        this.maleDog = maleDog;

        showCouple(); //show the happy couple!
        calcPupTraits(); //calculate the traits of their puppies
        makePuppies(); //make puppies
    }
    
    //show values of paired couple:
    private void showCouple(){
        System.out.println("\n**********************************************\n");
    	femaleDog.printValues(); //print out values of current female dog
    	System.out.print("+ ");
    	maleDog.printValues(); //print out values of current male dog
    	System.out.print("\n");
    }

    //calculate the traits required for puppies:
    private void calcPupTraits(){

        double combinedWeight = femaleDog.getWeight() + maleDog.getWeight(); //calc combined weight of dogs
        pupWeight = combinedWeight/20; //calc weight of puppies

        //calculate number of pups to be made:
        if(combinedWeight > 18) { //>18
            pupNum = 12;
        } else { //<18
            if (combinedWeight < 12) pupNum = 4; else pupNum = 8; // <12 = 4. <18 = 8.
        }

        //calculate required percentages of puppy num (for assigning breeds, colours and temperaments):
        int pupNum75pc = (pupNum * 75)/100; //75% of puppyNum
        int pupNum25pc = pupNum - pupNum75pc; //25% of puppyNum
        int pupNum50pc = pupNum/2; //50% of puppyNum

        //add temperaments to arrayList:
        addToArrayList(pupTemperamentArray, femaleDog.getTemperament(), pupNum75pc); //75% from mother
        addToArrayList(pupTemperamentArray, maleDog.getTemperament(), pupNum25pc); //25% from father

        //add sexes to arrayList:
        addToArrayList(pupSexArray, femaleDog.getSex(), pupNum50pc); //50% from mother
        addToArrayList(pupSexArray, maleDog.getSex(), pupNum50pc); //50% from father

        //calculate the breed(s) of pups:
        if (femaleDog.getBreed() == maleDog.getBreed()) addToArrayList(pupBreedArray, femaleDog.getBreed(), pupNum); //if breeds are same, fill pupBreedArray with only this breed
        else {

            //compare dog weights to find heaviest:
            switch(Double.compare(femaleDog.getWeight(), maleDog.getWeight())) { //compare female weight vs male weight
                case -1: //male is heaviest
                    addToArrayList(pupBreedArray, maleDog.getBreed(), pupNum75pc); //add heaviest breed elements to pupBreedArray
                    addToArrayList(pupBreedArray, femaleDog.getBreed(), pupNum25pc); //add lightest breed elements to pupBreedArray
                    break;
                case 1: //female is heaviest
                    addToArrayList(pupBreedArray, femaleDog.getBreed(), pupNum75pc); //add heaviest breed elements to pupBreedArray
                    addToArrayList(pupBreedArray, maleDog.getBreed(), pupNum25pc); //add lightest breed elements to pupBreedArray
                    break;
                case 0: //weights are equal
                    addToArrayList(pupBreedArray, femaleDog.getBreed(), pupNum50pc); //fill half of array with female breed
                    addToArrayList(pupBreedArray, maleDog.getBreed(), pupNum50pc); //fill half of array with male breed
            }
        }

        //calculate the colour(s) of pups:
        if (femaleDog.getColour() == maleDog.getColour()) addToArrayList(pupColourArray, femaleDog.getColour(), pupNum); //if colours are same, fill pupColourArray with only this colour
        else{

            //calculate colour scores and compare them to find lightest colour:
            switch(Integer.compare(scoreDogColour(femaleDog.getColour()), scoreDogColour(maleDog.getColour()))) { //compare female colour vs male colour
                case -1: //male is lightest colour
                    addToArrayList(pupColourArray, maleDog.getColour(), pupNum75pc); //add lightest colour elements to pupColourArray
                    addToArrayList(pupColourArray, femaleDog.getColour(), pupNum25pc); //add darkest colour elements to pupColourArray
                    break;
                case 1: //female is lightest colour
                    addToArrayList(pupColourArray, femaleDog.getColour(), pupNum75pc); //add lightest colour elements to pupColourArray
                    addToArrayList(pupColourArray, maleDog.getColour(), pupNum25pc); //add darkest colour elements to pupColourArray
                    break;
            }
        }
    }

    //make puppies not war: 
    private void makePuppies(){

        int randomInt = 0; //for holding randomly assigned values
        String randomBreed, randomSex, randomColour, randomTemperament = ""; //Strings for holding randomly assigned values
        for(int i=0;i<pupNum; i++) {

            //make random numbers for each arrayList, and grab and remove elements from those lists equal to said random numbers:
            randomInt = (int) ((Math.random() * pupBreedArray.size())); //make random num equal to target list length
            randomBreed = pupBreedArray.remove(randomInt); //grab and remove a random breed
            randomInt = (int) ((Math.random() * pupSexArray.size())); //make NEW random num equal to target list length
            randomSex = pupSexArray.remove(randomInt); //grab and remove a random sex
            randomInt = (int) ((Math.random() * pupColourArray.size())); //make NEW random num equal to target list length
            randomColour = pupColourArray.remove(randomInt); //grab and remove a random colour
            randomInt = (int) ((Math.random() * pupTemperamentArray.size())); //make NEW random num equal to target list length
            randomTemperament = pupTemperamentArray.remove(randomInt); //grab and remove a random temperament
            //https://stackoverflow.com/questions/35254019/randomly-remove-element-from-array-java

            //create a new pup for female dog, and add to her litter:
            femaleDog.addToPuppies(new Pup(Integer.toString(i+1), randomBreed, randomSex, randomColour, randomTemperament, pupWeight, maleDog));
        }
    }

    //adds elements to arraylists:
    private void addToArrayList(ArrayList<String> list, String item, int num){
        //add items:
        for(int i=0;i<num;i++){
            list.add(item);
        }
    }

    //assigns a priority score to colours:
    private static int scoreDogColour(String colour) {
        //black = 1, brown = 2, red = 3, white = 4;
        int score = 0;  //holds score
        //assign value to score based on colour:
        switch (colour) {
            case "black":
                score = 1;
                break;
            case "brown":
                score = 2;
                break;
            case "red":
                score = 3;
                break;
            case "white":
                score = 4;
                break;
        }
        return score; //return score
    }

}
