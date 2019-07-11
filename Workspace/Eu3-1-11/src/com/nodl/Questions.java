package com.nodl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Questions {
	static void q1(){
		B c=new C();
		System.out.println(c.max(10, 20));
		/*
		 * calls the c class max()method
		 * calls the b class max() which 
		 * calls the a class max()
		 * 2*10, 2*20
		 * 20,40
		 * 40 is bigger
		 * 40 *2=80
		 */
	}
	
	static void q2(){
		/*
		 * both of these are doubles by default
		 * so will call the printSum(double,
		 * double);
		 */
		printSum(1.0, 2.0);
		/*
		 * a float is closer to an int than
		 * a double so this will call the
		 * printSum(float,float) method
		 * a float is smaller than a double
		 */	
		printSum(2,3);
		/*
		 * order of size is
		 * byte
		 * short
		 * int
		 * long
		 * float
		 * double
		 */
	}
	//for question 2
	public static void printSum(double a, 
			double b)
	{
		System.out.println("In double "+(a+b));
		}
	public static void printSum(float a, 
			float b)
	{
		System.out.println("In float "+(a+b));
		}
	
	static void q3(){
		/*
		 * if a class has no user defined 
		 * constructor that it has a Default
		 * constructor
		 */	
	}
	
	static int q4(){
		/*
		 * if code is unreachable then your
		 * program will not compile.
		 * return exits the current method
		 */
		try{
			//return 0;
			throw new Exception();
		//	return 0;
		}
		catch(Exception e){
			System.out.println(e);
			return 1;
		//	System.out.println("not compile");
		}
		finally{
			return 2;
		}//unreachable code
		//return 1;
	}
	
	static void q5(){
		/*
		 * will always try and find the 
		 * closest match when it comes to
		 * overloading and widening is 
		 * preferred to unboxing, boxing
		 * with the printSum(int, int) method
		 * commented out this will go to the
		 * printSum(double,double)method
		 */
		ParamTest.printSum(1,2);	
	}
	
	static void q6(){
		//set to todays date
		//using a parser
		LocalDate d1 = LocalDate.parse("2017-01-26", 
				DateTimeFormatter.ISO_DATE);
		//using the of()method of the LocalDate clas
		LocalDate d2 = LocalDate.of(2017, 01, 26);
		LocalDate d3 = LocalDate.now();
		System.out.println(d1);
		System.out.println(d2); 
		System.out.println(d3);
		LocalDateTime nowTime=LocalDateTime.now();
		System.out.println(nowTime);
		/*
		 * will print out yyyy-mm-dd
		 */
	}
	
	static void q7(){
		 int i = 4;
	      int ia[][][] = new int[i][i = 3][i];
	      /*
	       * ia.length=4
	       * i is assigned the value 3
	       * ia[0].length=3
	       * ia[0][0].lenght is now three
	       * our array is 
	       * ia[3][4][4]
	       */
	      System.out.println( ia.length + ", " 
	      + ia[0].length+", "+ ia[0][0].length);	
	}
	
	static void q8(){
		/*
		 * if you don't give an ArrayList
		 * a type, this means any object
		 * can be inserted into the list
		 */
		List s1=new ArrayList();
		/*
		 * can add any object to list
		 */
		s1.add("hello");
		s1.add(new Dog());
		System.out.println(s1);
		try{/*
		will eventually throw a
		OutOfMemoryError, which is NOT
		an exception so it will not 
		be caught by the catch block
		*/
			while(true){
				s1.add(new Dog());
				System.out.println("print me");
				}
		}
		catch(Exception e){
			System.out.println(e);
			}
	/*	catch(Error er){
			System.out.println(er);
		}*/
	/*	catch(Throwable t){
			System.out.println(t);
		}*/
	}
	
	static void q9(){
		/*
		 * Java's exception mechanism allows
		 * us to create new exceptions that
		 * are particular to a application
		 * you are developing
		 * 
		 * error handling of code is handled
		 * seperately from the program logic
		 * of your code
		 */	
	}
	
	static void q10(){
		String str1="noel";
		String str2=new String("noel");
		String str3="NOEL";
		System.out.println(str1.equals(str2));
		//different strings so false
		System.out.println(str1==str2);
		System.out.println("ignore case "+
		str1.equalsIgnoreCase(str3));
		//there is no match method	
	}
	
	static void q11(){
		/*
		 * there is NO append method in
		 * the string Class, append()is a 
		 * stringbuilder method
		 */
		String str="tim";
		StringBuilder sb=new StringBuilder(str);
		/*
		 * comparing a StringBuilder to a String
		 * is always false
		 */
		System.out.println(str.equals(sb));
		/*
		 * append is only avaiable to StringBuilder
		 * objects
		 */
		sb.append("tiny");	
	}

}
