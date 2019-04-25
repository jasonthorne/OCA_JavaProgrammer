package com.android; //package statement

import com.animal.Cow; //imported the cow class from the com.animal package. MUST be AFTER the package statement

//import com.building.*; //import ALL classes from the com.building package. 

import com.animal.*; //this is importing all of the classes from the com.animal package (Cow, Duck and Zebra). NOT the packages in any sub package(Monkey, Horse, Behaviour, Ape). 

 //If you want to import everything from a sub package, you need to have a seperate import statement for it:
 import com.animal.mammal.*;

 
 
public class Person {
	
	Cow Bessie = new Cow(); //from com.animal
	
	//if we don't import a class, we can still create an object of the class by using its fully qualified name (if public) ++++++++++++++++++++++++++
	com.building.Apartment apt1 = new com.building.Apartment(); //from com.building
	com.building.Bungalow bung1 = new com.building.Bungalow(); //from com.building
	
}
