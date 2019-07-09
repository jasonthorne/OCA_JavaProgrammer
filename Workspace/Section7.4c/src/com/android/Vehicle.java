package com.android;

public class Vehicle {
	
	Vehicle()throws ArrayIndexOutOfBoundsException{
		System.out.println("Vehicle constructor");
	}

}


class Car extends Vehicle {
	
	Car()throws IndexOutOfBoundsException{ //doesnt need to be in a try/catch as this is a runtime exception, so is thrown automatically when hit.
		System.out.println("Car constructor");
	}

}


/*
 * If we create a gferrari using new Ferrari, we have ot put the creation of the ferrari into a try/catch
 * OR whatever methosd is creating the ferrari has to "throws" the exception.
 */
class Ferrari extends Car {
	
	Ferrari()throws Exception{
		System.out.println("Ferrari constructor");
	}

}