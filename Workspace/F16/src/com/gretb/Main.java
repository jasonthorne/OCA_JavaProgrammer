package com.gretb;
/*
 * Methods
 */
public class Main {

	public static void main(String[] args) {
		//this creates a new Dog
		Dog spot=new Dog();
		spot.name="spot";
		spot.age=4;
		spot.weight=14;
		Dog dog2=new Dog();
		dog2.age=3;
		dog2.weight=7;
		dog2.name="lassie";
		/*
		 * when you want to call a method of a particular object we
		 * go the name of the object.name of method()
		 */
		spot.run();
		dog2.run();
		//calling lick method for both dogs
		spot.lick();
		dog2.lick();
		//calling eat method for both dogs
		System.out.println("before eat method called weight "+spot.weight);
		spot.eat();
		dog2.eat();
		System.out.println("after eat method called weight "+spot.weight);
		//creates a Maths object so we can do calculations
		Maths myMaths=new Maths();
		//these are the two variables that will be sent to our add() method
		int num=25,num2=50;
		/*
		 * the add method in the maths class, returns a double, the number
		 * 75, which we can then assign to double in this method
		 * and print out
		 */
		double sum=myMaths.add(num, num2);
		System.out.println("our sum from the method call is "+sum);
		//can use literal values
		sum=myMaths.add(23, 89);
		
		int total=myMaths.multiply(num, num2);
		System.out.println("our total from the method call is "+total);
		
		double divisor=myMaths.division(num, num2);
		System.out.println("our two numbers divided is "+divisor);
		

	}

}
