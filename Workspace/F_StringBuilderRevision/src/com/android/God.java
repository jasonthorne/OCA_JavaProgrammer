package com.android;
/*
 * this class is what a StringBuilder class looks like in that it is
 * a final class and you can't extend but you can change the variables
 * of this class, you can change the age
 */
final public class God {
	int age=10;

}
/*
 * this class is what a String class looks like in theory in that it is
 * a final class and also the variables inside the class are also final,
 * so you can't change the Age once the age has been set
 */
final class SupremeBeing{
	final int age;
	SupremeBeing(int age){
		this.age=age;
	}
}
/*
 * all a final class means is that you can't extend a final class, so
 * you can't have a sub class of a final class. A stringBuilder class
 * is final and you can't extends. Whereas a String class is Final
 * and immutable (you can't change it) 
 */
/*class Diety extends God{
	
}*/
