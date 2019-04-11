package com.gretb;

public class Cat {
	int age;
	String name;
	double weight;
	//constructor that takes an int, string and double
	Cat(int age,String name, double weight){
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	/*
	 * this returns a string that contains all the details of a cat
	 */
	String printCat() {
		return "age of cat is "+age+" name of cat is "+name+"weight of cat is "+
					weight;
	}

}
