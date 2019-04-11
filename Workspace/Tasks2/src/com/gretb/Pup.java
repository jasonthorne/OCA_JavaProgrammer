package com.gretb;

public class Pup extends Dog{

    //puppy vars:
	private String id =""; //puppy id
	private String breed = ""; //breed of pup
	private String sex = ""; //sex of pup
	private String colour = ""; //colour of pup
	private String temperament = ""; //temperament of pup
	private double weight = 0.0;  //weight of pup
	private Dog sireDog; //dog ref for sireDog

    //constructor:
    public Pup(String id, String breed, String sex, String colour, String temperament, double weight, Dog sireDog) {
        this.id = "Puppy_" + id; //assign an id to pup
        this.breed = breed; //assign breed
        this.sex = sex; //assign sex
        this.colour = colour; //assign colour
        this.temperament = temperament; //assign temperament
        this.weight = weight; //assign weight
        this.sireDog = sireDog; //assign sireDog
    }
    
    //show values of pup (formatting weight to one decimal place):
    public void printValues() {
    	System.out.println(id + " (" + breed + ", "  + sex + ", " + colour + ", " + temperament + ", " + String.format("%.1f", weight) + ")");
    }
    
    //return the id of pup's sireDog:
    public String getSireDogId() {
    	return sireDog.getId();
    }
    
}
