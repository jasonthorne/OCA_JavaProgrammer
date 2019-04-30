package com.android;

/**
 * 
 * Exam objective 1.4 - Import other packages to make them accessible
 *
 */

//import com.building.residential.*; //imports ALL residential package classes (Bungalow and SemiDetached)

//import com.building.commercial.Factory; //importing a single class

import com.building.MultiStory;

import com.exam.Test1;
//import com.exam.Test3;


//import com.building.*; //DOSNT import package subclasses!! Just the classes in this package.
import static com.exam.Test3.*; // imports ALL of the STATIC classes from Test3 class +++++++++++++++++++++++
//Allows accessing of stat methods 

public class Main {

	public static void main(String[] args) {
		
		MultiStory building = new MultiStory();
		
		//inline import (fully qualified name), as another class is imported with the same name above (from another package) +++++++++++++++++++++++++++++ 
		com.building.commercial.MultiStory buildingCommercial = new com.building.commercial.MultiStory(); 
		
		System.out.println(Test1.score);
		System.out.println(Test1.statStr);
		Test1.statMethod();
		
		Test1 myTest = new Test1(); //creating a test object to access NON static variables and NON static methods
		//System.out.println(myTest.num); //cant be accessed as 'num' has only default (package level) access.
		System.out.println(myTest.myString);
		myTest.testMethod(); //this is non static. 
		
		myTest.statMethod();//this is static BUT DO NOT DO, as it is accessing it in a non static way.
		Test1.statMethod(); //RIGHT WAY to do above. (ie accessing a static in a static way)
		
		com.exam.Test2.test2StatMethod(); //Calling static methods directly (using it's fully qualified name) NO NEED to import the class when in a different package.
		
		System.out.println(statIntTest3); //print out static value from Test3. ++++++++++++++++
		
		//using a fully qualified name to create a test2 object
		com.exam.Test2 myTest2 = new com.exam.Test2();
		myTest2.test2StatMethod(); //calling static method in Test2
		
		staticMethod(); //can access the STATICS from Test3 directly, as we've imported all statics from it (line 20).
		//Test3.staticMethod(); //Cant create a member of the Test3 class during invocation though as statics are now part of the class. 
	}

}
