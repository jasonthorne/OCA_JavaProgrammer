package com.android;
/*
 * this is importing the statics and non statics of the Cat class.
 * we only have direct access to public members. If we are in a derived
 * class (sub class) we will also have access to protected members
 */
import com.apple.Cat;

/*
 * this will import all of the public members of the com.windows package
 * (both statics and non statics)
 */
import com.windows.*;
/*
 * can't import a instance member of a class (variable, method)
 */
//import com.apple.Cat.name;//will not compile
/*
 * you CAN import an individual static member
 */
import static com.windows.microsoft.Tower.floorNumber;
import com.windows.microsoft.Bungalow;
//import com.windows.microsoft.Tower;
//this only imports the statics of the Ape class
import static com.unix.Ape.*;
//import com.unix.*;
/*
 * you can't import only all statics from a package
 * this will not compile
 */
//import static com.unix.*;
/*
 * you can import all public (or protected if you are in a subclass)
 * members from a package
 */
//import com.unix.*;//this will compile and import all public members

public class Main {

	public static void main(String[] args) {
		/*
		 * you cannot create an Ape, as the constructor is NOT static.
		 * (you can't static constructor)
		 * you can only access the public static members of the Ape
		 * class
		 */
		//Ape myApe=new Ape();//will not compile
		//accessing the static varaible apeCounter from the Ape class
		//Ape static intiialiser also runs at this point
		/*
		 * this is the public static int apeCounter variable in the 
		 * Ape class
		 */
		System.out.println(apeCounter);
		/*
		 * this is the public static void gather() method in the 
		 * Ape class
		 */
		gather();
		/*
		 * you can' access statics in this way, when you use a 
		 * static import
		 */
		//System.out.println(Ape.apeCounter);
		/*
		 * this will compile as you can't access statics in this way
		 * when  you only have a static import
		 */
		//Ape.gather();
		
		
		//static initialiser does not run at this point as it only
		//runs once
	//	System.out.println(Ape.apeCounter);
	
		
		//this will compile, but can only access statics in this way
		//if you only have a static import
		System.out.println("tower flooNumber is "+floorNumber);
		//this will not compile as we have only imported the statics
		//System.out.println(Tower.floorNumber);
		//this will not compile
	//	System.out.println("bungalow floorNumber is "+bungalowNumber);
		System.out.println(Bungalow.bungalowNumber);
		// TODO Auto-generated method stub
		/*
		 * can access the public Cat(){
		 * constructor
		 * this runs static intiailisers in cat, only once, and non static
		 * intisiliser in Cat class each time a Cat is created
		 */
		Cat myCat=new Cat();
		//accessing the public String name
		System.out.println(myCat.name);
		//public void eat() method
		myCat.eat();
		//public static void fight() method
		//and accessing it in a static way
	//	Cat.fight();
		//accessing same method in non static way (not recommended)
	//	myCat.fight();
		//no access to drink() as this is a package leve access method
		//myCat.drink();
		/*
		 * no access to this static method as this is package level access
		 * static void attack(){
		 */
		//Cat.attack();
		/*
		 * we have imported all the public members from the Daisy
		 * class, the only one we have access too is the static int
		 * daisyCounter. the static initialisers are only called once
		 */
		System.out.println(Daisy.daisyCounter);
		//static initialiser are not called for this one
		System.out.println(Daisy.daisyCounter);
		/*
		 * 
		 */
		Collie colm=new Collie("colm");

	}

}


