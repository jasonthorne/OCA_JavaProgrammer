package com.gretb;

import java.util.concurrent.SynchronousQueue;

public class Person {
	int age;//age of person
	String name;//name of person
	double weight;//weight of person
	double height;//height of person
	boolean sex;//true if female, false if male
	/*
	 * this is just for us to see if this is a male or female, if doing
	 * any sort of calculation that concerns males or females we will be using
	 * the boolean sex
	 */
	String gender;//calculated from the boolean sex using getGender() method
	//this means that a person CAN own a cat, but he does not have too
	Cat myCat;
	//this means that a person CAN own many dogs, but he does not have too
	Dog[]dogArray;
	//this means that a person CAN have a partner, but again 
	Person partner;
	/*
	 * constructor that takes everything to do with a person, except gender, which
	 * will be calculated within the constructor depending on the boolean sex.
	 * this includes a Person object, which is a partner (has only one)
	 * includes a cat (can only have one cat)
	 * and a number of Dogs (can have one or many dogs)
	 */
	Person(int age,String name,double weight,double height,boolean sex,Cat myCat,
			Dog[]dogArray,Person partner){
		this.age=age;//age of person
		this.name=name;//name of person
		this.weight=weight;//weight of person
		this.height=height;//height of person
		this.myCat=myCat;//the person cat, can only be one cat
		this.sex=sex;//the person's sex, true for female, false for male
		this.dogArray=dogArray;//the person dogs, can be one dog or many dogs
		this.partner=partner;//the person partner	
		//this will calculate the gender based on the boolean sex
		getGender();
		System.out.println("constructor that takes everything ");
	}
	//this gets the gender for the person 
	void getGender() {
		/*
		 * sex is a boolean, which means it can only be true or false
		 * so by going if(sex), what we are actually saying is 
		 * if(sex==true), as the if statement braces () has to be a boolean
		 * and sex is a boolean
		 */
		if(sex) {
			gender="Female";
		}
		else {
			gender="Male";
		}
	}
	/*
	 * a constructor that takes an int and a string and assigns them to our
	 * newly created person
	 * i will create a person that will be a partner of the person who owns
	 * some dogs and one cat
	 */
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	
	void printPerson() {
		System.out.println("your name is "+name);
		System.out.println("your age is "+age);
		System.out.println("your height is "+height);
		System.out.println("your weight is "+weight);
		System.out.println("your gender is "+gender);
		/*
		 * the cat that pat owns is called myCat, this is what java knows this
		 * cat as. so what we are doing here is calling the print method for
		 * Pat's cat myCat
		 * this will print out the name pat's cat - tibbles
		 * this will print out the age of pat's cat - 3
		 * this will print out the weight of pat's cat - 12.5
		 */
		System.out.println(myCat.printCat());
		/*
		 * dogArray is the pack of dogs owned by the person that is calling this
		 * method
		 */
		for(Dog d:dogArray) {
			/*
			 * this uses an enhanced for loop, to loop through our array of dogs
			 * that means we access all the variables of each dog or we can call
			 * any method of the Dog class for each Dog
			 * this is calling the printDog() method for every dog in the array
			 * we have four dogs, so this will be called for each one of our dogs
			 */
			System.out.println(d.printDog());
		}//end of loop
		
	//	partner.printPerson();
		
	}//end of printPerson() method 

}
