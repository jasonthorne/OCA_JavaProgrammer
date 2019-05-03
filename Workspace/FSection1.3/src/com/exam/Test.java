package com.exam;
/*
 * we need to make all these variables public, as we are trying to
 * access these variables in a different class and there is NO
 * inheritance relationship
 */
public class Test {
	public int num=100;
	int number=67;
	
	public String myString="hello there";
	
	public static int score=-10;
	
	public static String statStr=" my Static STring";
	
	public void testMethod() {
		System.out.println("non static Test testMethod called");
	}
	
	public static void statMethod() {
		System.out.println("static Test statMethod called");
	}
	
	

}
