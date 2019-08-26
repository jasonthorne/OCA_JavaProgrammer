package com.android;

import java.io.File;
import java.io.FileWriter;

public class Vehicle {
	
	Vehicle(){
		System.out.println("vehicle created");
	}
	
	
	//++++++++++++++++++++++++++++++++++++++++method with a throws (which obviously then needs handled)
	void drive() throws Exception{ 
		System.out.println("Vehicle driving");
	}
	
	void speed() throws Exception {
		File myFile=new File("c:/myFile.txt"); ///this COULD generate a checked exception. 
		FileWriter fw = new FileWriter(myFile); //This WILL generated a checked exception. (both obv need handled)
	}

}
