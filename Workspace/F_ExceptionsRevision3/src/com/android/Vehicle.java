package com.android;

import java.io.File;
import java.io.FileWriter;

public class Vehicle {
	Vehicle(){
		System.out.println("Vehicle created");
	}
	//this has to be put in try catch block or method calling it has to have a
	//throws exception
	void drive(){
		System.out.println("vehcile driving");
	}
	/*
	 * this is dealt with in the try/catch block in the main method
	 */
	void speed() throws Exception{
		File myFile=new File("c:/myFile.txt");
		//this throws an exception
		FileWriter fw=new FileWriter(myFile);
	}
	
	void getFuel()throws Exception{
		System.out.println("getFuel method");
	}

}
