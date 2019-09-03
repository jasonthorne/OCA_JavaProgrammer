package com.android;

//Import below (com.apple.Cat) is importing the statics AND non statics of the Cat class. We only have direct acces to the public variables. 
//If we were in a derived(sub) class, then we'd also have access to the protected variables.
import com.apple.Cat; //Imports both STATICS and non statics +++++++++++++

import com.windows.*; //Imports all of the public members of the com.windows package (from ALL classes in that package)

//import com.apple.Cat.name; //CANT import an instance member of a class (method or var) 

import static com.windows.microsoft.Tower.floorNumber; //you CAN import a static member though! ++++++++++++++++++++++++++++
import com.windows.microsoft.Bungalow; // a NON STATIC import.

import static com.unix.Ape.*; //importing all of the STATICS from the ape class. NONE of the non statics though!! ++++++++++++++++++++++
//import com.unix.*; 


//import static com.unix.*;//you CANT import only ALL static members from a package +++++++++++++++++++

import com.unix.*; //you CAN however import all public members +++++++++++++++++++++

public class Main {

	public static void main(String[] args) {
		
		System.out.println(apeCounter); //accessing the static var due to the import above which imports ALL statics. 
		//System.out.println(Ape.apeCounter);
		gather(); //this is a public static method in the Ape class.
		
		//Ape myApe = new Ape(); //You cannot create an Ape as the constructor is not static. You cant have a static constructor. 
		//Ape.gather();//you can't access statics in this way when you use a static import
		
		System.out.println("tower loor is: " + floorNumber); //print a static import member (from import above)+++++++++++++++++++++++++++++
		
		//System.out.println("bungalow number is: " + bungalowNumber); //cant be targeted this way with the regular import above
		System.out.println("bungalow number is: " + Bungalow.bungalowNumber); //MUST be targeted this way
		
		Cat myCat = new Cat(); //accessing the public Cat constructor
		
		//accessible members:
		System.out.println(myCat.name); //public String name
		myCat.eat();
		Cat.fight(); //accessing the STATIC fight method in a static way
		myCat.fight(); //accessing the STATIC fight method in a NON static way (not recommended!)
		
		
		
		/*
		 * We have imported all the PUBLIC members from the Daisy class. 
		 * The only one we have acces to is the static int "daisyCounter".
		 * This will cause the static 
		 */
		System.out.println(Daisy.daisyCounter); //this WILL RUN the static initialisers! 
		//If you access the static var of a class, all of the static initialisers will then run. (they only run ONCE each session).
		System.out.println(Daisy.daisyCounter); //static initialisers WONT be called here, as they already were above. 
		
		
		
		
		Collie colm = new Collie("colm");
		
		

	}

}
