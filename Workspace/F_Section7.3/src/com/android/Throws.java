package com.android;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {
	
	void readFile(String file)throws FileNotFoundException{
		boolean found=findFile(file);
		if(!found) {
			System.out.println("readFile runs ");
			/*
			 * this is how we explicity create an exception, we 
			 * "throw" a "new" "FileNotFoundException"
			 * and we can pass in a string that will be output whenever
			 * this exception is eventually caught
			 * this is a checked exception that either HAS to be in a try/catch
			 * or the method has to "throws" it out of of the method
			 */

			throw new FileNotFoundException("your are missing the file "+file);
		/*
		 * this line of code produces the same exception as 
		 * throw new FileNotFoundException
		 * this is unreachable code as the line 
		 * throw new FileNotFoundException() generates a checked exception
		 * and when a checked exception is generated the method exits at 
		 * that point, so this code can NEVER be executed, so it is u
		 *unreachable code and unreachable will NOT COMPILE	in java
		 */
	//	FileInputStream fis=new FileInputStream("myFile.txt");
			
		}
		else
			System.out.println("file found");
			
	}
	
	boolean findFile(String file) {
		
		return false;
	}
	
	void throwRuntime() {
		throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException exception is thrown in our method");
	}
	/*
	 * an error is a runTimeException, so calling this method does not
	 * need to be in a try catch block (you should NEVER deal with errors
	 * in this way, a software developer does NOT deal with errors)
	 * all this is saying is "if an error is produced, throw the error
	 * out of the method"
	 * no error is actually generated in this method, so this can be run
	 * without a try/catch and will not crash our program, this would
	 * NOT BE THE CASE	with a checked exception
	 */
	void method1()throws Error{
		System.out.println("method1 called");
		/*
		 * if we uncomment this line, we still DON'T HAVE TOO have
		 * method1()throws Error
		 * because a Error is a RuntimeException that is automatically
		 * throws out of the method it is declared 
		 */
	//	throw new StackOverflowError();
	}
	/*
	 * no runtimeException is generated, so this can be run without a try
	 * catch/block and will nto crash your program
	 */
	void method2()throws RuntimeException{
		System.out.println("method 2 called");
	//	int[]numbers= {45,67};
	//	System.out.println(numbers[3]);
	}
	/*
	 * this method does not throw a checked exception, however it can and
	 * anything that CAN THROW a checked exception has to be put in a try/catch
	 * block or the method  calling it has to throws it
	 */
	void method3()throws Exception{
		System.out.println("method3 called");
	//	throw new Exception("exception in method 3 created");
	}
	
	void method4()throws Throwable{
		System.out.println("method 4 called");
	//	throw new Throwable("Throwable in method 4 created");
	}
	/*
	 * this can deal with RuntimeException and all subclasses of 
	 * RutimeException
	 */
	void method5()throws RuntimeException{
		System.out.println("method 5 ");
		/*
		 * this CANNOT handle a super class of RuntimeException, which
		 * is what Exception() is
		 * also it cannot handle exceptions on different branches
		 */
		//throw new Exception();
		//this will produce an exception, because the file does not 
		//exist and throws RuntimeException cannot handle this
	//	FileInputStream fis=new FileInputStream("myFile.txt");
	}
	/*
	 * this is a sub class of Exception, so it is a checked exception and 
	 * is basically a superclass for all exception classes that deal wiht
	 * file handling. All sub exception classes of this are also 
	 * checked exceptions
	 * so when calling this  you either have to put it in a try/catch
	 * block or what is calling it has to have a "throws" in its 
	 * method signature
	 */
	void method6()throws IOException{
		System.out.println("method 6 called IOException");
	}
	/*
	 * this is a sub class of IOException and this is also a checked
	 * Exception, 
	 * so when calling this  you either have to put it in a try/catch
	 * block or what is calling it has to have a "throws" in its 
	 * method signature
	 */
	void method7()throws FileNotFoundException{
		System.out.println("method 7 called FileNotFoundException");
	}
	/*
	 * any exception generated will be thrown out of this method
	 */
	void method8()throws Exception{
		/*
		 * this will generate a checked exception
		 */
		//FileInputStream fis=new FileInputStream("myFile.txt");
		throw new Exception("our exception message in method 8");
	}

}
