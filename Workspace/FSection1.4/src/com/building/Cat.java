package com.building;
/*
 * public class means that we can access the Cat class anywhere
 */
public class Cat {
//this can only be accessed inside the Cat class	
	private String  name;
	double height;

}
/*
 * this is a package access level class, which means we can only access
 * this class within its own package, which is com.building.
 * IT DOES NOT INHERIT THE PRIVATE STRING name
 * it will inherit height
 * your class is package level access and in that class you have public
 * variables. it does not matter what the access levels is of the variables
 * you still will NOT be able to access them outside of the com.building
 * package
 */
class Siamese extends Cat{
	public int age=34;
	public double weight=9;
	
	public static int siamStat=89;
}
