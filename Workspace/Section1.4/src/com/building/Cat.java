package com.building;
//This is a public class, which means we can access the cat class anywhere. 

public class Cat {
	
	private String name; //this can ONLY be accessed inside the Cat class.
	double height; 
}


//This is a package level class, which means we can only access this class within its own package. it DOES NOT INHERIT THE PRIVATE STRING! +++++++++++++++++
class Siamese extends Cat{
	
	//public variables inside the package level class. They still only have package level access.
	public int age = 34;
	public double weight = 9;
	
	public static int siamStat = 89;
}