package com.gretb;
/*
 * only allowed one public class per file, and the public class HAS TO BE
 * SAME name as the file
 * this file is called Swan, so the public class also has to be called
 * Swan
 */
public class Swan {
	int age;//age of swan
	String name;//name of swan
	//swan constructor
	Swan(int sAge,String sName){
		age=sAge;
		name=sName;
	}
	//method for a swan to swim
	void swim() {
		System.out.println("swan swimming");
	}	
}//end of swan class

class Zebra
{
	
}//end of Zebra class

class Pig
{
	int age;
}//end of Pig class
class Cow{

	Cow(){
		System.out.println("cow constructor called");
	}
}//end of cow class

