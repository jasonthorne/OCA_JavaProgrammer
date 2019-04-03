package com.gretb;

public class Person {
	
	//vars for BMI calc:
	double weight;
	double height;
	String name;
	int id; //uniquely identifies the person
	double bmi;
	
	/*
	 * this is going to be a method that tkes no parameters, but takes the weight and height of a person calling the method
	 *  and divides it by the height of the person calling the method. 
	 *  If the result is greater than 15 then will print out "bmi" is too high. Else, print out "bmi is grand"
	 */
	
	void calcBmi() {
		bmi=weight/height; //calculate the bmi
		
		if(bmi>15){
			System.out.println(name + " with id " + id + ": bmi is too high");
		}else{
			System.out.println(name + " with id " + id + ": bmi is fine");
		}
		
	}
	
	
	void display() {
		System.out.println("name: " + name + ". height: " + height + ". id: " + id + ". bmi: " + bmi);
	}
}	
