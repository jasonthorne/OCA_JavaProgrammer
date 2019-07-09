package com.android;

import java.util.ArrayList;

public class Questions {
	
	static void outOfBounds() {
		int[]numbers = {45,67,89};
		
		ArrayList<Integer>listNum = new ArrayList<>();
		listNum.add(567);
		listNum.add(677);
		listNum.add(999);
		
		//Exceptions:
		
		//System.out.println(listNum.get(5)); //gives an IndexOutOfBoundsException
		//System.out.println(numbers[5]); //gives an ArrayIndexOutOfBoundsException
		
	}
	
	static void classCast() {
		System.out.println("classCastException");
		
		
		Animal[]farm = new Animal[3];
		
		farm[0]= new Dog(); //An Animal reference to a Dog class.
		farm[1]= new Dog(); //..
		farm[2]= new Dog();
		farm[3]= new Dog();
		
		
		//dog reference to a Dog object:
		Dog myDog = (Dog)farm[0];
		
		//Animal reference to a Dofg object:
		Animal anDog = new Dog();
		
		//-----
		
		Dog myDog2 = (Dog)anDog;
		myDog.eat();
		
		
		//this code wil only compile if farm[2] could be a cat. It could be as this is an Animal reference.
		//This WILL compile but it will produce a ClassCastException because farm[2] is a Dog and so you cant cast it to be a Cat.
		Cat myCat=(Cat)farm[2];
		
		Cat catAnimal = (Cat) new Animal();
		
	}
	
	static void illegalArguement(String pwd) {
		if(pwd==null || pwd.length()<6) {
			System.out.println("illegal password format");
			throw new IllegalArgumentException("password cannot be shorter than 6 characters");
		}
	}
	
	
	static void nullPointer() {
	
		/*
		 * When you create an array and dont give them any explicit value, each item in the array is null.
		 */
	
		Dog[]kennel = new Dog[3]; //3 null dog objects in this kennel
		
		
		//I create a Dog object, this then has access to all the methods in the Dog (the eat method)
		
		Dog spot = new Dog();
		spot.eat();
		System.out.println(spot);
		
		//not an error to access a null object:
		System.out.println(kennel[0]);
		
		
		//however if you attempt to do anything with a null, ie call a method of its class ()a NULL object CAN call a static method)
		//you will get a NullPointerexception:
		//kennel[0].eat();
		
		
		//similarly, here is a null object, and trying to call its eat will cause a nullPointerExceptiion:
		Dog rex = null;
		//rex.eat(); //causes nullpointerException
		
	}
	
	
	
	static void arithmetic() {
		/*
		 * easiest one to show is divide by 0:
		 * 
		 * This is when you carry out illegal arithmetic operations
		 */
		
		//System.out.println(45/0);
		
		//a double in the calculation does NOT give an arithmetic exception, you get the answer of "infinity"
		System.out.println(4/0.0); //4 divided by 0.0
		
		//gives NaN:
		System.out.println(0.0/0.0);
		
		//if you have an int and divide by a larger int, your answer is always 0, as whatevers after the decimal point is removed 
		//so 0.04 becomes 0
		System.out.println(4/5);
		
	}

}
