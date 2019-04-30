package com.building;
/*
 * The access levels are:
 * Private - Only in same class
 * Default - Only in same package (no keyword)
 * Protected - Avaliable in same package OR in a child class within another package
 * Public - Avaliable to ALL packages. You still have to import or use the smae fully qualified name.
 * 
 * Only two access levels allowed for top level classes (A class that isnt a child of another class)
 * The access levels allowed are public and default. 
 */

public class Animal {
	
	private class Heart{
		
	}
	
	protected class Lungs{
		
	}
	
	//If the ONLY constructor in your class is private, its impossible to create a member of this class.
	private Animal() { //can only be created within this class.
		
	}
	
	

}
