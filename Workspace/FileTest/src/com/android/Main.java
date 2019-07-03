package com.android;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Below doesnt create a file, 
		 * it just tells java the name of the file we are creating and where to create it. 
		 * in this case a RELATIVE path is being given. (ie relative to where you are.) 
		 */
		
		File myFile = new File("myFile.txt"); //relative path
		
		//This file cant be created as the directories dont exist:
		//File myFile = new File("C:/great/mighty/myFile.txt"); //this is an absolute address. An exact address of where we want the file saved
		
		//file creation needs to be in a try-catch, as can cause a CHECKED EXCEPTION, so HAS TO BE put into a try-catch.
		try {
			System.out.println(myFile.createNewFile()); //this creates the file, and returns a boolean when done so (so returns false when file is already created)
		}catch(Exception e) {
			//System.out.println("Exception is: " + e);
			e.printStackTrace();
		}

	}

}
