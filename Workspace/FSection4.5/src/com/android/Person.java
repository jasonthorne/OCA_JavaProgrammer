package com.android;

public class Person {
	String name;
	double weight;
	public Person(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	//blank constructor
	Person(){
		
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			Person newPerson=(Person)obj;
			boolean check=name.equals(newPerson.name);
			return check;
		}
		
		return false;
	}

}
