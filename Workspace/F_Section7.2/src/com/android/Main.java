package com.android;

import java.util.concurrent.SynchronousQueue;

/*
 * Exam objective 8.1 Differentiate among checked exceptions, unChecked
 * Exceptions (also called runtimeExcpetions) and errors
 * 
 */
public class Main {
	/*
	 * there are two broad types of Exception
	 * Checked exception - these are exceptiosn that HAVE TO be put in a
	 * try/catch block, or they have to be thrown
	 * e.g IOException
	 * this is a subclass of FileNotFoundException - and when we are
	 * connecting to a file the connection to the file HAS TO be put in a 
	 * try/catch block, the code will NOT compile if you don't. If you want
	 * to create, read, write or close a file, the code for this HAS TO be
	 * place in a try/catch block or it has to be thrown. This code MAY
	 * generate a checked, and anything that MAY generate a checked exception
	 * has to be put in a try catch
	 * even if the file exists, you still have to put the code in a try
	 * catch block - as it may produce a IOException - i.e your trying to 
	 * connect to a file on machine in australia, you don't even know if the
	 * machine exists
	 * Errors are NOT a subclass of Exception and should NOT BE dealt with
	 * in a try/catch, you as a software developer should not deall with it.
	 * . An error is something  usually you can't do ANYTHING
	 * ABOUT, i.e hardware error
	 * you have to deal with an exception in one of two ways
	 * either in a try/catch block or have a "throws" statement in your mehtod
	 * signature. Ultimately you still have to have a try/catch block 
	 * somewhere dealing with the exception, if you don't, it eventually
	 * finds its way back to your compiler and crashes the program
	 */

	public static void main(String[] args)/*throws Exception */{
		// TODO Auto-generated method stub
		Checked check=new Checked();
		check.checked1();
		/*
		 * this method void checked2()throws Exception{
		 * }
		 * what this means is that the method is not going to deal with 
		 * any exception, if one generated inside the method, but it is
		 * instead going to throw it out to whatever is callign this method
		 */
		try {
			check.checked2();
		}
		catch(Exception e) {
			System.out.println("exception is "+e);
			System.out.println("exception dealt with in main");
		}
		System.out.println("some code after the try catch in main");
		
		/*
		 * checked3 calls checked4 which may produce an exception
		 * so checked4 throws it to checked3 and checked3 throws it to
		 * this mehtod main. However if we notice in main we have
		 * public static void main(String[]args)throws Exception, which
		 * means the exception is basically thrown at the compiler which
		 * crashes our program when run, but the program will run
		 */
		
		//check.checked3();	
		
		
		
		

	}

}
