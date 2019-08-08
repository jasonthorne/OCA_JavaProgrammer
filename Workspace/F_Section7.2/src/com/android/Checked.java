package com.android;

import java.io.FileInputStream;

public class Checked {
	
	void checked1() {
		/*
		 * when you have a try block it has to be accompanied by a catch
		 * or a finally or both
		 */
		try {
			System.out.println("inside try block before file");
			/*
			 * this file does not exist, so this will generate an
			 * exception
			 * if you have multiple exceptions, only the first one is
			 * dealt with and the code after where the exception is generated
			 * will not run, so here after this line, no other code will
			 * run in the try block
			 */
			FileInputStream fis=new FileInputStream("myFile.txt");
			/*int[]numbers= {5,7,8};
			System.out.println(numbers[4]);
			System.out.println("inside try block after file");*/
			/*
			 * code inside here may or may not produce an Exception
			 * if an exception is generated, we wish to catch it in the
			 * catch block
			 */
		}//end of try block
		/*
		 * this can catch all exceptions, both checked and unchecked because
		 * Exception is the super class of all Exceptions
		 * if this only catches RuntimeExceptions then it CANNOT catch
		 * Checked exceptions whihc are the types of exceptions that can
		 * be generated when dealing with files
		 */
	//	catch(RuntimeException e){
		catch(Exception e) {
			System.out.println("no such file");
			System.out.println("exception is "+e.toString());
		}
		System.out.println("code after catch block runs");
	/*	finally {
			
		}*/
	}
	/*
	 * we are telling the compiler that if an exception is generated, we 
	 * are NOT dealing with it inside this method, but whatever is calling
	 * this method has to deal with it. So when we call this method we
	 * can put it in a try/catch block
	 */
	void checked2() throws Exception{
		System.out.println("checked2 method");
		FileInputStream fis=new FileInputStream("myFile.txt");
	}
	
	void checked3()throws Exception{
		System.out.println("checked3 method");
		/*
		 * this does NOT deal with any exception that may be created in 
		 * checked4, instead it throws out the exception and expects 
		 * whatever calls this to deal with the exception
		 */
		checked4();
	}
	/*
	 * this throws out an exception that may have been created in this 
	 * method, it does not deal with any exception and expects whatever
	 * is calling this method to deal with 
	 */
	void checked4()throws Exception{
		System.out.println("checked4 method");
		FileInputStream fis=new FileInputStream("myFile.txt");
		//checked3();
	}

}
