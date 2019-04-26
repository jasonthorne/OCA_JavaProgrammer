package com.android; //package statement

import com.animal.Cow; //imported the cow class from the com.animal package. MUST be AFTER the package statement

//import com.building.*; //import ALL classes from the com.building package. 

import com.animal.*; //this is importing all of the classes from the com.animal package (Cow, Duck and Zebra). NOT the packages in any sub package(Monkey, Horse, Behaviour, Ape). 

//If you want to import everything from a sub package, you need to have a seperate import statement for it:
import com.animal.mammal.*;

//======
//we could chose to import everything from this package. THis is one of the standard library packages that comes with every installation of java:
import java.util.*;
//If only using one of the classes from this package (such as arrayList), then it doesn't make sense to import all of the classes from the package:
import java.util.ArrayList;
//=======


 
public class Person {
	
	Cow Bessie = new Cow(); //from com.animal
	
	//if we don't import a class, we can still create an object of the class by using its fully qualified name (if public) ++++++++++++++++++++++++++
	com.building.Apartment apt1 = new com.building.Apartment(); //from com.building //BOTH SIDES HAVE TO MATCH ++++++++++++++++++
	com.building.Bungalow bung1 = new com.building.Bungalow(); //from com.building
	
	Apartment animalApt = new Apartment(); //this is from the animal package (imported above) Couldn't be used if Building package was also imported. ++++++++++
	
	//============
	
	ArrayList<Integer>myList = new ArrayList<>();
	
	java.util.ArrayList<Double>dList; //Importing with the fully qualified name
	
	
	//++++++++++++++++++++++++++++++++CAN BE IN EXAM: ++++++++++++++++++++++++++++++++++++++++++++
	
	//enums:
	//A type of your won making. THis type is 'Car', and it can only be one of six values.
	
	enum Car{
		FORD, TOYOTA, VOLKSWAGON, MERCEDES, BMW, MASSEY_FERGUSON
	}
	
	
	Car myCar=Car.BMW;
	
	//Inner class:
	
	//A class inside a class. An inner class can be: private, protected, default (no keyword) or public

	//ONLY a Person can create a heart, as the class is private. 
	//Nothing outside of the Person class can access the Heart class.
	private class Heart{
		int bpm;
		double bloodPressure;
		
		Heart(int bmp, double bloodPressure){
			this.bpm=bpm;
			this.bloodPressure=bloodPressure;
		}
	}
	
	
	Heart myHeart = new Heart(90,89.56); 
	
	
	//Comments
	
	String name="hello /*comment*/ there"; //this is a full string, not a comment.
	
	/*
	name="hello /* "
			+ "this is the same line. The concatenator"
			+ " is inserted eachtime you hit"
			+ " return in Eclipse";
	*/
	
	/**
	 * Java docs
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

