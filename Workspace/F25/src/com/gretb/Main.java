package com.gretb;

public class Main {

	public static void main(String[] args) {
		/*
		 * creates a car by calling the blank Car constructor
		 */
		Car myCar=new Car();
		/*
		 * creates a Car by calling the Car constructor that takes a 
		 * String, String and an int
		 */
		Car myCar2=new Car("Porsche","911",233456);
		/*
		 * when you put an object, any object, in a print statement, the toString()
		 * method, from the Object class is called, automatically. 
		 * the toString() method of the Object class, just prints out the 
		 * address i.e
		 * com.gretb.Car@7852e922
		 * always called implicitly if not explicitly called
		 */
		System.out.println("mycar is "+myCar.toString());//this calls toString method
		System.out.println("myCar2 is "+myCar2);//this calls the toString() method
		
		Animal andy=new Animal(2,"Andy",4.5);
		Animal angela=new Animal(3,"Angela",6.7);
		/*
		 * This Animal object will look in it's own class FIRST for a overriden 
		 * toString method. there is one, which returns the age and name and weight
		 * of the Animal as a string
		 */
		System.out.println(andy);
		System.out.println(angela);
		

	}

}
