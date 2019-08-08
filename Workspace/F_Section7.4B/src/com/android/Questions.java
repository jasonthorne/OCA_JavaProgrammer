package com.android;

import java.io.FileInputStream;

public class Questions {
	/*
	 * this try with multiple catches will still only catch the FIRST
	 * exception generated, any exceptions generated after the first 
	 * exception, the code will be run so none of the other catches will
	 * also not be run
	 */
	static void q1() {
		/*
		 * you can't have multiple trys in the one try/catch block 
		 * (however you can have a inner try (which is a try inside a 
		 * try block or inside a catch block or inside a finally block)
		 */
		try {
			/*
			 * any exception generated will look for its closest match
			 */
			//throw new IndexOutOfBoundsException();
			/*
			 * this does not have a catch block that deals explicitly with
			 * IllegalArgumentException so it looks for a catch block
			 * that can take a super class of this
			 * super class of IllegalArgumentException is RuntimeException
			 * and we have a catch block block for this exception
			 */
			throw new IllegalArgumentException();
			/*
			 * this is a try/catch with a finally block inside the try
			 * block
			 * you can put this structure inside a try a catch or a finally
			 * block, this is a inner try catch finally block
			 */
		/*	try {
				
			}
			catch(Exception e) {
				
			}
			finally {
				
			}*/
		}
		/*
		 * when you have multiple catches, you always have to put a
		 * subclass before a superclass. So ArrayIndexOutOfBoundsException
		 * is a subclass of IndexOutOfBoundsException so this has to
		 * go first
		 */

		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("exception "+a+" is caught");
			a.printStackTrace();
			
		}catch(IndexOutOfBoundsException i) {
			System.out.println("exception "+i+" is caught");
			i.printStackTrace();
		}
		/*
		 * when you have exceptions that are at the "same level", i.e
		 * NullPointerException, IndexOutOfBoundsException,ClassCastException
		 * are all the same level the order does not matter
		 */
		catch(NullPointerException n) {
			System.out.println("exception "+n+" is caught");
			n.printStackTrace();
		}
		catch(ClassCastException c) {
			System.out.println("exception "+c+" is caught");
			c.printStackTrace();
		}
		catch(RuntimeException r) {
			System.out.println("runtimeException");
			System.out.println("exception "+r+" is caught");
			r.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception");
			System.out.println("exception "+e+" is caught");
			e.printStackTrace();
		}
		catch(Throwable t) {
			System.out.println("exception "+t+" is caught");
			t.printStackTrace();
		}
		finally {
			System.out.println("finally always runs and just one allowed");
		}
		
	}
	
	static void q2() {
		try {
			System.out.println("inside try block");
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("exception in q2 is "+e);
			e.printStackTrace();
			/*
			 * this return statement exits the method at this point
			 */
			return;
			/*
			 * any code after the return statement will not run, so it
			 * unreachable code and unreachable code will not compile in 
			 * java
			 */
			//System.out.println("unreachable code");
		}
		/*
		 * a finally block always runs, even if there is a return statement
		 * before it is supposed to run
		 * before this method exits, the finally has to be run
		 */
		finally {
			System.out.println("finally block called");
		}
		/*
		 * this code will not compile, as the only code that can compile
		 * after a return statement in the catch block, is code in the finally
		 * block
		 * this code is not in the finally block so it is unreachable code and
		 * will not compile
		 */
	//	System.out.println("some code");	
	}
	/*
	 * this method returns a number
	 * if an exception is generated this method will return an int value of
	 * 10
	 * if not excpetion is generated this method will return an int value of
	 * 20
	 */
	static int q3() {
		try {
			int[]numbers= {45,67,89};
			/*
			 * to return 20 comment out this line
			 * to return 10 comment in this line and ArrayIndexOutOfBoundsException
			 * is generated
			 */
			System.out.println(numbers[5]);
		}
		catch(Exception e) {
			/*
			 * if an exception is generated the value returned will be 10 and
			 * the method will exit at this point
			 */
			return 10;
		}
		/*
		 * if no exception is generated then the catch block will not run and
		 * the value returned will be 20 and the method will exit here
		 */
		return 20;
	}
	/*
	 * if an exception is genreated return 10
	 * if no exception generated return 100
	 * if you have a return in the try block YOU CANNOT have a return
	 * outside of the catch or finally, as it will NEVER RUN and is unreachable
	 * code and unreachable code will not compile
	 */
	static int q4() {
		try {
			/*
			 * if the code before this line returns an exception
			 * then it will return the number in that exception
			 * if this produces a runtimeException, then the number 5
			 * will be returned
			 * if this produces a Checked exception, then the number 10
			 * will be returned
			 */
			return 1;
		}
		catch(RuntimeException r) {
			return 5;
		}
		catch(Exception e) {
			return 10;
		}
		/*
		 * this will not compile as this is unreachable code because of 
		 * the return 1 in the try block
		 */
		//return 100;
		//this is also unreachable code
		//System.out.println("unreachable code");
		
	}
	
	static int q5() {
		
		int num=0;
		try {
			
			System.out.println("inside try block question 5");
			//FileInputStream fis=new FileInputStream("myText.txt");
			//num++;
			//return num;
			return 15;
		}
		catch(Exception e) {
			System.out.println(e+" exception in catch block caught");
			//num+=2;
			//return num;
			return 10;
		}
		finally {
			System.out.println("finally always runs");
			//num+=3;
			//return num;
			return 100;
		}
		//this is unreachable code and will not compile
	//	return 200;
	}
	/*
	 * this method will produce the number 90 if no exception is generated
	 * and 91 if an exception is generated
	 */
	static int q6() {
		int num=45;
		try {
			int[]numbers= {45,67};
			//this generates a ArrayIndexOutOfBoundsException
			System.out.println(numbers[5]);
		}
		//this catches the ArrayIndexOutOfBoundsException
		catch(Exception e) {
			//this adds 1 to num, so becomes 46
			num++;
			System.out.println(e);
			//prints out 46
			System.out.println("inside catch num is "+num);
			//before method exits with 46 checks for a finally
			return num;
		}
		finally {
			//adds 45 onto 46
			num=num+45;
			//prints out 91
			System.out.println("inside finally num is "+num);
			//exits with num at 91
			return num;
			/*
			 * if no exception is generated teh catch part never executes
			 * so num remains at 45. 45 is added to this number in the 
			 * finally and num becomes 90
			 */
		}
	}
	
	static Dog q7(Dog spot) {
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("exception in q7 is "+e);
			/*
			 * when you are returning a object from a method that has
			 * a try catch finally, you do not HAVE too put ina  return in
			 * a finally block, you can, but you don't have.
			 * here before we return spot, we run the code in the finally
			 * that changes the age of spot to 100 and then it exits the
			 * method with the same dog, but with a changed age
			 */
			return spot;
		}
		finally {
			spot.age=100;
		}
	}
	/*
	 * a checked exception is generated in the Try block, and there is
	 * no catch to deal with and a finally can't deal with it. So that
	 * means we have to have a "throws Exception" clause in the method
	 * signature of method q8()
	 */
	static void q8()throws Exception {
		/*
		 * you can have a try block with just a finally
		 * if an exception is generated in the try block the finally
		 * does not deal with it
		 * if we just have a try and a finally, any checked exception
		 * generated in the try block is NOT DEALT with. As finally can't
		 * catch an exception
		 */
		try {
			FileInputStream fis=new FileInputStream("myText.txt");
		}
		/*
		 * a finally block cannot catch an exception
		 */
		finally {
			System.out.println("finally always runs");
		}
	}

}
