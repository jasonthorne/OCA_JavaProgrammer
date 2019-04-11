package com.gretb;

public class Main {

    public static void main(String[] args) {

        final int dogNum = 5; //number of each sex of dog to be made

        //make 5 female dogs:
        final Dog[] femaleDogsArray = makeDogs(false, dogNum);

        //make 5 male dogs:
        final Dog[] maleDogsArray = makeDogs(true, dogNum);

        //pair up each female dog with each male:
        for (Dog femaleDog: femaleDogsArray) { //loop through female dogs

            for (Dog maleDog: maleDogsArray) { //loop through male dogs

                //create some sexy time:
                SexyTime sexyTime = new SexyTime(femaleDog, maleDog);
                
                //show the results (litter):
                femaleDog.showLitter(maleDog.getId()); 
            }
        }

    }

    //build an array of Dog objects:
    private static Dog[] makeDogs(boolean isMale, int dogNum) {

        Dog[] dogArray = new Dog[dogNum];

        for(int i=0;i<dogNum; i++) {
            Dog dog = new Dog(isMale, Integer.toString(i+1)); //create a new dog, passing in sex and id
            dogArray[i] = dog; //add dog to array
        }
        return dogArray;
    }

}

