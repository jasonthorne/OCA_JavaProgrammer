package com.gretb;

class Car{
	   public int gearRatio = 8;
	   public String accelerate() {  
		   return "Accelerate : Car";  
		   }  
	}

class SportsCar extends Car{
	public int gearRatio = 9;
	   public String accelerate() {  
		   return  "Accelerate : SportsCar"; 
	   } 
	   public String brake(){
		   return "Brake Car";
	   }
	
}

