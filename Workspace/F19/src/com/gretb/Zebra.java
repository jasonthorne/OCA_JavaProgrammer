package com.gretb;

public class Zebra {
	
	int age;//age of the person
	String name;//name of the person
	boolean sex;//sex of person
	String gender;//gender of person in string format (male or female)
	
	
	Zebra(int pAge,String pName,boolean pSex){
		age=pAge;
		name=pName;
		sex=pSex;
		/*
		 * this method can be called within the Zebra class and when
		 * we are calling
		 */
		getGender();
	///	eat();
	}//end of Zebra constructor
	
	/*
	 * this is a method to determine the gender of the Zebra based on
	 * the boolean sex of the Zebra
	 * private means that nothing can access this method outside of the
	 * Zebra class
	 */
	private void getGender() {
		/*
		 * as sex is a boolean, that means it's either true or false
		 * so we say just if(sex), what we are saying is if(sex==true)
		 */
		if(sex==true) {
			//could also go, because sex is a boolean and evaluates to 
			//true or false
			//if(sex){
			gender="female";
		}
		else
			gender="male";
	//	eat();
	}//end of getGender
	
	void eat() {
		System.out.println("Zebra eating "+name);
	}

}
