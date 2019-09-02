package com.android;

//Import below (com.apple.Cat) is importing the statics AND non statics of the Cat class. We only have direct acces to the public variables. 
//If we were in a derived(sub) class, then we'd also have access to the protected variables.
import com.apple.Cat;


public class Main {

	public static void main(String[] args) {
		
		Cat myCat = new Cat();

	}

}
