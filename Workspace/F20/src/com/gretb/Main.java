package com.gretb;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat tibbles=new Cat(2, 3.5, "tibbles");
		//calling our eat method
		tibbles.eat();
		
		//creating a dog
		Dog spot=new Dog(4,5.6,"spot");
		//this is the eat method that has no parameters
		spot.eat();
		//this is the eat method that takes a double
		spot.eat(3.4);
		//this is the eat method that takes a double and an int
		spot.eat(3.4, 2);
		//this is the eat method that takes an int and a double
		spot.eat(3, 2.3);
		/*
		 * creating an array of ints to use the the printMe method that takes
		 * an array of ints
		 */
		int[]myArray= {34,56,78};
		/*
		 * creating an array of doubles to use the the printMe method that takes
		 * an array of doubles
		 */
		double[]dArray= {34.56,78.99, 12.90};
		/*
		 * creating an array of Strings to use the the printMe method that takes
		 * an array of strings
		 */
		String[]strArray= {"pat","tom","mary","paddy"};
		/*
		 * creating an object of Maths class so we can use overloaded printMe()
		 * methods
		 */
		Maths myMaths=new Maths();
		//overloaded method that takes a array of ints
		myMaths.printMe(myArray);
		//overloaded method that takes an array of doubles
		myMaths.printMe(dArray);
		//overloaded method that takes an array of Strings
		myMaths.printMe(strArray);
		//any local variables, cannot have the same reference name, even
		//if totally different objects
		//both of these local objects are called rex, which we can't do
		Dog rex=new Dog(2,2.34,"rex");
	//	Cat rex=new Cat(2,2.34,"rex");

	}

}
