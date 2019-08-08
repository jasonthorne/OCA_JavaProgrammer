package com.android;

public class Athlete implements Jumpable,Moveable{
	
	void getValues() {
		//can acess static variables of interface like a variabel of 
		//athlete class
		System.out.println("max in jumpable is "+max);
		/*
		 * you can access this in a static way, which is name of the
		 * interface, followed by name of variable
		 */
		System.out.println(Jumpable.max);
		/*
		 * If you have two variables of the same name, in unrelated 
		 * interfaces and a class implements both of these interfaces,
		 * you can no longer access that named variable in a non static
		 * way
		 * here it does not know if you are going for the Jumpable.min
		 * or the Moveable.min
		 */
		//System.out.println("min is "+min);
		//can only be accessed in a static way
		System.out.println("movable min "+Moveable.min);
		System.out.println("Jumpable min "+Jumpable.min);
	}

}
