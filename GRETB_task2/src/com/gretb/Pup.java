package com.gretb;

public class Pup{


    //puppy vars:
    String id =""; //puppy id
    String breed = ""; //breed of pup
    String sex = ""; //sex of pup
    String colour = ""; //colour of pup
    String temperament = ""; //temperament of pup
    double weight = 0.0;  //weight of pup
    Dog sireDog; //dog ref


    //constructor:
    public Pup(String id, String breed, String sex, String colour, String temperament, double weight, Dog sireDog) {
        this.id = "Puppy_" + id; //assign an id to pup
        this.breed = breed;
        this.sex = sex;
        this.colour = colour;
        this.temperament = temperament;
        this.weight = weight;
        this.sireDog = sireDog;

        //System.out.println(this.id + ": " + this.breed + ", " + this.sex + ", " + this.colour + ", " + this.temperament + ", " + String.format("%.1f", this.weight));

    }

}
