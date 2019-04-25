package com.android;
/*
 * this will import the Cow class ONLY, NOT THE other classes
 * of the package
 */
import com.animal.Cow;
/*
 * the asterix (*) means ALL, so this will import ALL of the classes
 * of the com.building package, so this imports both the Apartment
 * and Bungalow class
 */
//import com.building.*;
/*
 * this is importing all the of the classes of the com.animal package
 * so now we can create a Duck and a Zebra.
 * this will import ONLY the classes in com.animal package NOT THE 
 * packages in any sub package, So the Ape, horse, monkey class and 
 * Behaviour interface are not currently accessible as they are in
 * the package com.animal.mammal
 */
import com.animal.*;
/*
 * if i want to import everything from a sub package, you have to have
 * a seperate import statement for it
 */
import com.animal.mammal.*;

public class Person {
	
	Cow Bessie = new Cow();
	/*
	 * if we don't import a class, we can still create a an object of 
	 * the class by using the fully qualified name. in our case we
	 * An apartment and a Bungalow class in a differnet package (both
	 * public classes) and we are not going to import the the package
	 * or a class
	 */
	com.building.Apartment apt1=new com.building.Apartment();
	com.building.Bungalow bung1=new com.building.Bungalow();
	

}
