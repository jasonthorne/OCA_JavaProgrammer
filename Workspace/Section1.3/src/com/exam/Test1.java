package com.exam;

public class Test1 {
	
	//We need to make these variables public as were trying to access these vars in a different class.
	
	int num=100;
	public String myString = "Sup dawg!";
	public static int score = -10;
	public static String statStr = "My static string";
	
	public void testMethod() {
	System.out.println("Non static Test1 method called");
	}
	
	public static void statMethod() {
		System.out.println("Static Test1 method called");
	}
	
	
	

}
