package com.animal;

import com.animal.mammal.Reptile; //this is importing ALL the classes in the com.animal.mammal package.

/*
 * If on imports, Cow class only has access to public classes in same package,
 * so only has access to com.animal.
 */

public class Cow {
	
	Duck daffy = new Duck(); //Duck is a class in the same package
	
	Reptile ralf = new Reptile(); //Reptile is from imported class
	
	//Horse harry = 

}
