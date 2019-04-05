package com.gretb;

public class Person {
	int age;//age of the person
	String name;//name of the person
	boolean sex;//sex of person
	String gender;//gender of person in string format (male or female)
	
	/*
	 * person constructor that takes only THREE	variables
	 * int age, String name and a boolean sex
	 */
	Person(int pAge,String pName,boolean pSex){
		age=pAge;
		name=pName;
		sex=pSex;
		
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
	}//end of constructor

}
