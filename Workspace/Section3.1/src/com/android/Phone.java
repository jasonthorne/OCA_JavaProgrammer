package com.android;

public class Phone {
	
	//Rules 
	
	 
	//1: CANT HAVE " VARS WITH THE SAMNE NAME. EVEN IF ! IS STATIC AND OTHER IS NON STATIC.
	String name="bob";
	//static String name="tim";
	
	static int modelId = 122; //Every phone will have this model id
	
	static String colour="Black"; //Every phone will be black
	
	//2: CANT HAVE TWO VARS WITH THE SAME NAME, EVEN IF THEY ARE DIFFERENT DATA TYPES:
	
	double weight = 1.2;
	//Array []weight=new Double[4];
	
	
	void dialUp(int number) {
		//double number=0; //3: CANT HAVE A VAR WITH THE SAME NAME AS A METHOD PARAM 
		System.out.println("name of phone is: " + name);
		System.out.println("weight of phone is: " + weight);
		
		//This is the LOCAL VARIABLE called 'name' which SHADOWS the attribute 'name'. 
		String name="samsung"; //'String' established it as a BRAND NEW variable, that ONLY has scope to this method. 
		//Any references in here to 'name' will refer to the var here. To target the global name var, use 'this' +++++++++++++++++++++++++++ 
		System.out.println("name of local name var is: " + name);
		System.out.println("name of global name var is: " + this.name);
		
		System.out.println("colour of phone is: " + colour);
	
		
		{
			//You can't create a static var inside a method, but you can shadow a static.  
			String colour = "blue"; //creating a colour var which shadows the static var, and is local ONLY to these brackets
			System.out.println("local colour is: " + colour);
		}
		
		System.out.println("colour of phone is: " + colour);
		
	}
	

}
