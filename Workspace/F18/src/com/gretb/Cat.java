package com.gretb;

public class Cat {
	int age;
	String name;
	double weight;
	/*
	 * this is a Cat constructor that takes an int, a String and a double
	 * if you are creating a cat, you have to pass in arguments in that 
	 * order i.e new Cat(12,"tibbles",2)
	 * the constructor then takes these three values and assigns them to the 
	 * atributes of the newly created CAt
	 * so age is 12
	 * name is tibbles
	 * weight is 2.3
	 */
	Cat(int myAge,String myName,double myWeight)
	{
		//assigns the int sent to the constructor to be the age of the new cat
		age=myAge;
		//assigns the string sent to the constructor to be the name of the new cat
		name=myName;
		//assigns the double sent to the construcotr to be the name of the new cat
		weight=myWeight;
		System.out.println("cat constructor called");
	//	printMe();
	}
	//simple eat method that any cat can call
	void eat() {
		System.out.println(name+" is eating");
	}
	void printMe() {
		System.out.println("printMe method called");
		System.out.println("name of cat is "+name);
		System.out.println("age of cat is "+age);
		System.out.println("weight of Cat is "+weight);
	}
}
