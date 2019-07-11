package com.noel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Questions {
	static void q56(){
		Float f = null; 
		try{
			f = Float.valueOf("2.3");
			String s = f.toString(); 
			/*
			 * this throws NumberFormatException
			 * as "s" is a string float and 
			 * we are parsing an int
			 */
			String sNum="45";
			int i = Integer.parseInt(sNum); 
			String myString="hello";
			myString+=+'a'+'b';
			
			/*
			 * and this line is skipped
			 */
			System.out.println("i = "+i); 
			} 
		/*
		 * the exception is then caught and
		 * prints out "trouble 12.3"
		 */
		catch(Exception e){
			System.out.println(e);
			System.out.println("trouble : "+f); 
			}
	}
	
	static void q57(){
		int ia[][] = { {1, 2}, null };
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				/*
				 * as soon as you try and acess
				 * a null object you will get
				 * a NullPointerException
				 * the second ROW in this two
				 * dimensional array is null
				 * (each row is an array and
				 * an array is an object, and any
				 * object can be given a literal
				 * value of null)
				 * so when our loop gets to
				 * ia[1][0], we are trying to 
				 * access the second row and the
				 * second row is null
				 */
				System.out.println(ia[i][j]);
		String myStr=null;
	}
	
	static void q58(){
		Data d = new Data(1, 1);
		/*
		 * assigns the value of 2 to the x
		 * variable of the data object d
		 * and does the same for the y
		 * value
		 */
		d.x = 2; 
		d.y = 2;
		/*
		 * we want to change the ORIGINAL object
		 * not create a new object
		 * which is what we are doing with
		 * the below statement
		 */
		//d = new Data(2, 2);
		/*
		 * setting x and y back to original
		 * values
		 */
		d.x = 1; 
		d.y = 1;
		/*
		 * adding one to the x and y
		 * value
		 */
		d.x += 1; 
		d.y += 1;
		//d.x++;
		/*
		 * this will not work,
		 * as d is not an int
		 * d is a data object
		 */
		//d=d+1;	
	}
	static int x=5;
	static void q59(){
		/*
		 * this refers to the static x
		 */
		System.out.println(x);
		/*
		 * from this point forwards x
		 * now refers to the local 
		 * int x
		 * x is given the value of 3
		 * and then multiplied by 4
		 * which is 12
		 */
		int x=(x=3)*4;
		System.out.println(x);
	}
	
	static void q60(){
		/*
		 * comment in and out first two
		 * statements to check for 
		 * that it prints out last element
		 * in array of two strings, and prints
		 * out nothing in an array of size 0
		 */
		//String args[]={"one","two"};
		String[] args=new String[0];
		if (args.length != 0)
			System.out.println(args[args.length-1]);
		/*
		 * if args is zero sized array,
		 * then an exception is generated and
		 * it is caught by the catch block.
		 * you are trying to access args[-1]
		 */
		try {      
			System.out.println(args[args.length-1]);        
			}
	       catch (ArrayIndexOutOfBoundsException e) {
	    	   System.out.println(e);
	       }
		/*
		 * if args is a zero sized array this
		 * will generate an arrayIndexOutOfBoundsException
		 * as you will be trying to access 
		 * args[-1]
		 */
		int i = args.length;
	     if (i != 0) 
	    	 System.out.println(args[i-1]);
	     /*
	      * this will generate an ArrayIndexOutOfBounds 
	      * exception, so this catch block WILL NOT
	      * catch the exception generated
	      */
	     try { 
	    	 System.out.println(args[args.length-1]); 
	    	 }
	       catch (NullPointerException e) {
	    	   
	       }	
	}
	
	static void q61(){
		/*
		 * will print "hello world"
		 */
		System.out.println(" hello world".trim());
		//no spaces just "helloworld"
		System.out.println("hello" + new String("world"));
		//hello world
		System.out.println("hello".concat(" world"));
		//hello world
		System.out.println(new StringBuilder("world")
				.insert(0, "hello ").toString());
		/*
		 * the append method does not take an 
		 * int as its first arguement and it 
		 * appends hello onto world
		 */
	/*	System.out.println(new StringBuilder("world")
				.append(0, "hello ").toString(););
				*/
		/*
		 * there is an append()method that takes two
		 * ints, but it takes from postion 0 to 6 and
		 * appends it to the end of the string world
		 * so you get worldhello
		 */
		System.out.println(new StringBuilder("world")
				.append("hello ", 0 , 6).toString());
		
	}
	
	static void q62(){
		try{/*
		E2 is sub exception of E1
		and E1 is a sub exception of 
		Exception so this is the correct
		order of exceptions, as you 
		sub exceptions come first
		*/
		
			throw new E2();
			}
		/*
		 * this can catch an E1 exception and
		 * subclasses of E1, and E2 is sub exception
		 * of E1
		 */
		catch(E1 e){
			System.out.println("E1");
			}
		catch(Exception e){
			System.out.println("E");
			}
		finally{
			System.out.println("Finally");
			}
		/*
		 * will print out "E1 finally"
		 */
	}
	
	static void q63(){
		/*
		 * see Myiface interface
		 */
		A a = new A();
		B b = new B();
		C c = new C();
		/*
		 * class B and C have no 
		 * relationship with each other
		 * so both these will not
		 * compile
		 */
		//b = c;
		//c = b;
		/*
		 * will work as C class implements the
		 * Myiface interface
		 */
		MyIface i = c;
		/*
		 * no relationship between c and b
		 * cannot even cast it
		 */
		//c = (C) b;
		/*
		 * will not complie as you can't have
		 * a sub class reference to a superclass
		 * object
		 */
		//b = a;
		/*
		 * you can cast it but this will
		 * give a classCastException as
		 * a is NOT a B object it is a
		 * A object
		 */
		//b=(B)a;
		/*
		 * this will work as you are casting
		 * a super class reference to a sub 
		 * class object
		 */
		a=b;	
	}
	
	static void q64(){
		/*
		 * this will create a DateTime exception as
		 * there is not Time component, 
		 * DateTime exception is a RuntimeException
		 * so it does not have to be in a 
		 * try catch block or thrown by the
		 * method, but it will throw a
		 * exception at runtime
		 */
		LocalDateTime greatDay = LocalDateTime
				.parse("2015-01-01");//2 
		/*
		 * ISO_DATE_TIME is the default date
		 * time formatter        
		 */
		String greatDayStr = greatDay.
				format(DateTimeFormatter.ISO_DATE_TIME); //3         
		System.out.println(greatDayStr);//4	
	}
	
	static void q65(){
		/*
		 * see interface I1
		 */
	}
	
	static void q66(){
		/*
		 * this throws IndexOutOfBounds exception
		 * As per the API documentation of 
		 * this method ( http://docs.oracle.com/
		 * javase/6/docs/api/java/lang/String.html#
		 * charAt(int) ), this method throws 
		 * IndexOutOfBoundsException. Although, in 
		 * practice the method throws 
		 * StringIndexOutOfBoundsException, which is 
		 * a subclass of IndexOutOfBoundsException, 
		 * the implementation is free to throw some 
		 * other subclass of IndexOutOfBoundsException. 
		 * Thus, you should rely only on the published 
		 * API documentation instead of what it 
		 * actually throws.
		 */
		System.out.println("12345".charAt(6));
	}
	
}
