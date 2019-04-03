package com.gretb;
/*
 * this is a class, called Dog, which is a template that allows to 
 * create Dogs. This class should contain everything a Dog has
 * which are called instance variables/variables/atributes, example 
 * of these are name, age, weight, height, sex. Each of these variables
 * are declared the exact same way as we have been doing up to now
 */
public class Dog {
	/*
	 * you declare the variables that each dog has inside the class
	 * but not inside a method, age is available everywhere inside
	 * the Dog Class
	 */
	//the age of the Dog
	int age;
	//the name of the Dog
	String name;
	//the weight of the Dog
	double weight;
	//the height of the Dog
	double height;
	//the sex of the Dog
	//true is female, false is male
	boolean sex;
	//an object can have as one of it's atributes another object
	Heart dogHeart;



}
