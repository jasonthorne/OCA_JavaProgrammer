package com.gretb;

public class Person {
	double weight;//weight of the person, used in BMI calculation
	double height;//height of person, used in BMI calculation
	String name;//name of the person
	int id;//what uniquely identifies a person
	double bmi;//this is your BMI number, which we calculate
	
	/*
	 * this is going to be a method that takes no parameters, but takes
	 * the weight and the height of the person calling the method and 
	 * divides it by the height fo the person calling the method.
	 * if the result is greater than 15 t hen will print out 
	 * "bmi is too high"
	 * else will print out
	 * "BMI is grand "
	 */
	void calcBmi() {
		/*
		 * this is going to calculate our Bmi and assign to the BMI 
		 * atribute for this person
		 */
		bmi=weight/height;
		if(bmi>15) {
			System.out.println(name+" with id "+id+" bmi is too high");
		}
		else
			System.out.println(name+" with id "+id+" bmi is grand");
	}
	/*
	 * will access the name, weight and height of the person that 
	 * calls this method and displays the name of the person, 
	 * the weight of the person and the height of the person
	 * the BMI of the person
	 * the id of the person
	 */
	void display() {
		System.out.println("my name is "+name);
		System.out.println("my weight is "+weight);
		System.out.println("my height is "+height);
		System.out.println("my Bmi is "+bmi);
		System.out.println("my id is "+id);
	}

}
