package com.gretb;

public class Swan { //ONLY one class can be public (visible to EVERY class/package), and HAS to be the same name as the file
	
	int age;
	String name;
	double weight;
	
	public Swan(int myAge, String myName, double myWeight){
		this.age = myAge;	
	}

}

class Zebra{ //Default which is package level access only!
	
}
