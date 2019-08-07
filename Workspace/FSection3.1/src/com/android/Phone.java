package com.android;

public class Phone {
	/*
	 * can't have two variables of the same name, even if one is static
	 * and the other is an instance variable
	 */
	String name="apple";
	//this does not compile
	//static String name="samsung";
	/*
	 * every phone will have this model id
	 */
	static int modelId=122;
	/*
	 * every phone will be black
	 */
	static String colour="black";
	/*
	 * can't have two variables with same name even if different data types
	 * 
	 */
	double weight=1.2;
	
	//Array[]weight=new double[4];
	/*
	 * can't have a local variable with the same name as a method
	 * parameter
	 */
	/*void dialUp(int number) {
		double number=0;
	}*/
	
	void dialUp() {
		/*
		 * this name here is the name ATRIBUTE of the phone
		 */
		System.out.println("name of phone is "+name);
		System.out.println("weight of phone is "+weight);
		/*
		 * this is the LOCAL VARIABLE called name which SHADOWS the 
		 * atribute name
		 * 	/*local variables with the same name as the instance or
		 * class variables is  allowed. this is called 
		 * SHADOWING. remember that the variable String name 
		 * is a LOCAL variables, meaning they only apply to inside
		 * these curly brackets, and you can't get at they're 
		 * value outside of these curly brackets
		 * if we choose to omit "String" from the name, we will
		 * then be referring to the "name" of the phone, and we
		 * will be changing the name of the phone that called
		 * this method 
		 */
		 
		String name="samsung";
		/*
		 * from this point forward when we use "name" we are talking about
		 * the LOCAL string name, not the atribute of the phone class
		 * called name
		 */
		System.out.println("name of shadow is "+name);//local string name
		/*
		 * the name of the phone that is calling the dialup() method
		 * which is Apple
		 */
		System.out.println("the name of the phone is "+this.name);
		/*
		 * accessing the static variable colour in this dialUp()
		 * method
		 */
		System.out.println("Colour of phone is "+colour);
		
		{/*
		Can't create a static variable inside a method. however you
		can shadow a static. this LOCAL STring colour is shadowing
		the static string colour.
		this colour is local to just these curly brackets. outside
		of these curly brackets, colour refers to the colour of the 
		phone, which is "Black"
		*/
			String colour="blue";
			System.out.println("local colour is "+colour);
		}//end of brackets, end of local colour blue
		System.out.println("phone colour "+colour);
	}//end of method
	
	static void statMethod() {
		System.out.println("static method called");
	}

}//end of phone class
