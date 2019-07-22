package com.android;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Landas work only for interfaces that have ONE abstract method contained within them.
		 * If you have more than 1 abstract method, you cant create a lambda for that interface.
		 * The Behaviour interface has 1 abstract method which is:
		 * boolean mad(String mystr), so we can create a lambda for this interface.
		 * With a lambda, we can directly implement the method contained within the interface.
		 * We do not need a class to implement the interface.
		 * 
		 * A lambda has a reference that contains the method mad. Here its a Behaviour reference on the left hand side. 
		 * In the right hand side we first have the param list of the mad method, which is just a string. 
		 * Here we surround the param list with a pair of brackets().
		 * We follow the params ALWAYS with an arraow.
		 * The mad method has to return a boolean so here we simply write "return false". 
		 * If you have more than one line of code in your lambda body, you have to have curly brackets.
		 */
		
		
		//basic structure of a lambda:
		Behaviour myBehave = (String myStr) ->{
			System.out.println("myBehave lambda that implements the mad method of the Behaviour interface");
			return false;
		};
		
		myBehave.mad("yo");
		
		
		
		Behaviour myBehave2 = myStr -> false;
		
		/*Above is te shortest form of lambda you can have. 
		You have to give the param in you param list, but you dont have to give a type, because java knows that myStr is a string.
		You dont have to put a pair of braqckets around the the param list like so (str)
		As soon as you put in a type in the param list you HAVe to surround the param list with a pair of brackets. 
		The body doesnt need to have curly bracket,as long as theres only one line of code.
		*/
		
		
		System.out.println(myBehave2.mad("yo"));
		
		//This lamda also works as 12>20 evaluates to false
		Behaviour myBehave3 = myStr -> 12>30;
		
		Behaviour myBehave4 = (String myStr) -> 14<20;
		
		//As soon as you have a return statement, you need curly brackets:
		Behaviour myBehave5 = myStr -> {
			System.out.println("hi");
			return false;
		};
		
		myBehave5.mad("apple");
		
		//============================================
		
		
		Movement myMove = () -> System.out.println("myMove run lambda");
		
		myMove.run();
		
		
		Movement myMove2 = () -> {
			System.out.println("myMove run lambda");
		};
		
		myMove.run();
		myMove2.run();
		
		
		//==========================================
		
		//Generic types can ONLY be objects, (not primitives)
		
		Box <Dog>boxDog = new Box(new Dog()); //a Box reference which takes Dogs
		System.out.println(boxDog.myT.getClass().getSimpleName()); //check object type of boxDog
		
		Box <Integer>boxInt = new Box(3); //a Box reference which takes Dogs (passed string is AUTOBOXED into an INTEGER)
		System.out.println(boxInt.myT.getClass().getSimpleName()); //check object type of boxDog
		
		
	}

}
