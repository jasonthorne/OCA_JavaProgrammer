package com.gretb;

import java.util.ArrayList;

public class Main {

    static Dog dog; //Dog reference

    public static void main(String[] args) {

        //make 5 female dogs:
        Dog[] femaleDogsArray = makeDogs(false);

        //make 5 male dogs:
        Dog[] maleDogsArray = makeDogs(true);

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
        int pupWeight = combinedWeight/20; //weight of pups
        int pupNum = 0; //holds number of pups to be made

        //calculate number of pups to be made:
        if(combinedWeight > 18) { //>18
            pupNum = 12;
        } else { //<18
            if (combinedWeight < 12) pupNum = 4; else pupNum = 8; // <12 = 4. <18 = 8.
        }

        //arraylists for holding values to be randomly selected during Puppy creation:
        ArrayList<String> pupBreedArray = new ArrayList<String>();
        ArrayList<String> pupColourArray = new ArrayList<String>();
        ArrayList<String> pupTemperamentArray = new ArrayList<String>();
        ArrayList<String> pupSexArray = new ArrayList<String>();

        //calculate percentages of puppy num (for assigning breeds, colours and temperaments):
        int pupNum75pc = (pupNum * 75 )/100; //75% of puppyNum
        int pupNum25pc = pupNum - pupNum75pc; ////25% of puppyNum
        int pupNum50pc = pupNum/2; ////50% of puppyNum

        //find breed(s) of pups:
        if (femaleDog.breed == maleDog.breed) addToArrayList(pupBreedArray, femaleDog.breed, pupNum); //if breeds are same, fill pupBreedArray with only this breed
        else {

            //compare dog weights to find heaviest:
            switch(Integer.compare(femaleDog.weight, maleDog.weight)) { //compare female weight vs male weight
                case -1: //male is heaviest
                    addToArrayList(pupBreedArray, maleDog.breed, pupNum75pc); //add heaviest breed elements to pupBreedArray
                    addToArrayList(pupBreedArray, femaleDog.breed, pupNum25pc); //add lightest breed elements to pupBreedArray
                    break;
                case 1: //female is heaviest
                    addToArrayList(pupBreedArray, femaleDog.breed, pupNum75pc); //add heaviest breed elements to pupBreedArray
                    addToArrayList(pupBreedArray, maleDog.breed, pupNum25pc); //add lightest breed elements to pupBreedArray
                    break;
                case 0: //weights are equal
                    addToArrayList(pupBreedArray, femaleDog.breed, pupNum50pc); //fill half of array with female breed
                    addToArrayList(pupBreedArray, maleDog.breed, pupNum50pc); //fill half of array with male breed
            }
        }


        //find colour(s) of pups:
        if (femaleDog.colour == maleDog.colour) addToArrayList(pupColourArray, femaleDog.colour, pupNum); //if colours are same, fill pupColourArray with only this colour
        else{

            //calculate colour scores and compare to find lightest colour:
            switch(Integer.compare(scoreDogColour(femaleDog.colour), scoreDogColour(maleDog.colour))) {
                case -1: //male is lightest colour
                    addToArrayList(pupColourArray, maleDog.colour, pupNum75pc); //add lightest colour elements to pupColourArray
                    addToArrayList(pupColourArray, femaleDog.colour, pupNum25pc); //add darkest colour elements to pupColourArray
                    break;
                case 1: //female is lightest colour
                    addToArrayList(pupColourArray, femaleDog.colour, pupNum75pc); //add lightest colour elements to pupColourArray
                    addToArrayList(pupColourArray, maleDog.colour, pupNum25pc); //add darkest colour elements to pupColourArray
                    break;
            }
        }

        System.out.println(pupNum + " " + pupBreedArray + " " + pupColourArray); //+++++++++++++++++++++++++

        //add temperaments to arraylist:
        addToArrayList(pupTemperamentArray, femaleDog.temperament, pupNum75pc); //75% from mother
        addToArrayList(pupTemperamentArray, maleDog.temperament, pupNum75pc); //25% from father

        //add sexes to arraylist:
        addToArrayList(pupSexArray, femaleDog.sex, pupNum50pc); //50% from mother
        addToArrayList(pupSexArray, maleDog.sex, pupNum50pc); //50% from father

        //make puppies!


        //https://stackoverflow.com/questions/35254019/randomly-remove-element-from-array-java


    }

    //add elements to arraylists:
    private static ArrayList addToArrayList(ArrayList<String> list, String item, int num){
        //add items:
        for(int i=0;i<num;i++){
            list.add(item);
        }
        return list; //return arraylist
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
        return score;
    }



}

