package com.android;


//This is what a stringBuilder class looks like, in that it is a final class, so you cant extend from it. BUT you can change the vars of this class.
final public class God { //class is final (CANT BE EXTENDED)
	
	int num1 = 6; //class is final (cant be extended, BUT member can be changed)
	//final int age = 10; //member is final (so CANT be changed)

}


//This is what the string class looks like in that it is a final class, and the vars inside the class are also final. So you CANT CHANGE the age, once set.
final class SupremeBeing{
	final int age;
	SupremeBeing(int age){
		this.age=age;
		
	}
}

/*
 * All a final class means is you cant extend a final class, so you cant have a subclass of a final class. 
 * A stringBuilder class is final and you can't extend it. 
 * Whereas a String class is final and immutable (you cant change it).
 */

/*
class Diety extends God{
	
}
*/



