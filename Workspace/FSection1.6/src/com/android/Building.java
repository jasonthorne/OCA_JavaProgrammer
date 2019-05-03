package com.android;

public class Building {
	/*
	 * constructor for each building to show that a building has
	 * been created
	 */
	Building(){
		System.out.println("Building created");
	}
	/*
	 * this build method can take a person object, which means it can
	 * also take a sub class of Person. So this method can take a 
	 * Person, a European or an Irish
	 */
	void build(Person p) {
		p.buildIt(p);
	}
	

}

class Residential extends Building{
	Residential(){
		System.out.println("Residential created");
	}
	
	
}

class Commercial extends Building{
	Commercial(){
		System.out.println("Commercial created");
	}
}

class Bungalow extends Residential{
	Bungalow(){
		System.out.println("Bungalow created");
	}
}
class Factory extends Commercial{
	Factory(){
		System.out.println("facotry created");
	}
}
