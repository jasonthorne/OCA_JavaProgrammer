package com.gretb;

public class Swan { //ONLY one class can be public (visible to EVERY class/package), and HAS to be the same name as the file
	
	/*
	 * 	public: accessible from everywhere.
		protected: accessible by the classes of the same package and the subclasses residing in any package.
		default (no modifier specified): accessible by the classes of the same package.
		private: accessible within the same class only.
	 */
	
	int age;
	String name;
	double weight;
	
	public Swan(int myAge, String myName, double myWeight){
		this.age = myAge;	
	}
	
	void swim() {
		System.out.println("swan swimming");
	}

}

class Zebra{ //Default which is package level access only!
	
}
