package com.gretb;

public class Questions {
	
	static void q56(){
		/*
		 * a three dimesional array, which has
		 * 3 two dimensional arrays
		 */
		double threeD[][][] = new double[3][2][5];
		/*
		 * you have give a value to the left
		 * most square bracket
		 */
		double daaa[][][] = new double[3][][]; 
		double d = 100.0; 
		double []dArray=new double[3];
		/*
		 * this is a two dimensional array of 
		 * 1 row and 1 columnt
		 */
		double[][] daa = new double[1][1];
		/*
		 * incorrect as this is a two dimesional
		 * array
		 */
		//daaa[0] = d;
		/*
		 * is correct, as daa is a two dimensional
		 * array 
		 */
		daaa[0]=daa;
		//daaa[1],daaa[2]
		/*
		 * daaa now has a structure of 
		 * three dimensional array
		 * which has one two dimensional 
		 * array inside it 
		 */
		/*
		 * is correct as d is a double
		 * and the array reference is a
		 * actual value
		 * if we remove daaa[0]=daa; 
		 * from the above code we will
		 * get a NullPointerException
		 */
		daaa[0][0][0]=d;
		System.out.println(daaa[0][0][0]);
		/*
		 * daaa[0] is a two dimensional 
		 * array
		 * daa[0] is an array
		 * will not compile
		 */
		//daaa[0] = daa[0];
		daaa[0][0] = daa[0];
		/*
		 * will give ArrayIndexOutOfBounds
		 * as daa[][]length is only 1
		 * so it only has index postion
		 * [0][0]
		 */
		try{
			daa[1][1]=d;
		//	daa[0][0]=d;
		}
		catch(Exception e){
			System.out.println(e);
		}
		/*
		 * daa is a two dimensional array
		 * daaa is a three dimensional array
		 * which is a array of two two dimensional
		 * arrays, which means that the first
		 * element of daaa is a two dimensional
		 * array, so this will compile
		 */
		daa = daaa[0];	
	}
	
	static void q57(){
		String str="hello";
		System.out.println(null+"hello there");
		//System.out.println(34+null+"hello there");
		System.out.println(str+null+34);
		System.out.println(str+34+null);
		System.out.println(null+str+34);
		System.out.println(34+24+str+null);
		System.out.println(null+str);
		System.out.println(new StringBuilder("hi")+str);
		//System.out.println(null);
		/*
		 * if a null and any other data type
		 * are side by side and
		 *  comes before a string in a print 
		 *  statement, it will not compile.
		 *  a print statement cannot just print
		 *  out a null without a string being
		 *  present
		 */
		//System.out.println(null);
	}
	
	static void q58(){
		/*
		 * see Animal class
		 */
	}
	
	static void q59(){
		/*
		 * when running a java program from
		 * the command line prompt the command
		 * is always 
		 * Java 
		 * name_File
		 * String_variables_to_be_passed
		 * so for this program it would
		 * be 
		 * java 
		 * Main (this is the file in which
		 * we have our main method)
		 * one two three.
		 *one two three can be any strings
		 *that are now passed into the array
		 *string[]args in main
		 * 
		 */
	}
	
	static void q60(){
		/*
		 * when we run main without any
		 * arguments sent to it from the 
		 * command line prompt we are not sending
		 * a null array of strings, but 
		 * an array of size 0.
		 * and a finally is always run
		 */
		String[]args;
		args=new String[0];
		try{
			if (args.length == 0) 
				return;
			else throw new Exception("Some Exception");
			}
		catch(Exception e){
			System.out.println("Exception in Main");
			}
		finally{
			System.out.println("The end");
			}
	}
	
	static void q61(){
		//switch can't be a boolean
		//will not compile
/*		boolean flag= true;	
		switch (flag){
		case true : System.out.println("true");
		default: System.out.println("false");
		
		}*/
	}
	
	static void q62(){
		/*
		 * a method HAS to have a return type,
		 * if a method is returning nothing then
		 * the return type is void.
		 * whereas a Constructor CANNOT have
		 * a return type
		 */
	}
	
	//for question 63
	private StringBuilder sb = new StringBuilder();
	static void q63(){
		/*
		 * the delete method is the only valid
		 * method of the stringbuilder class
		 * all other methods mentioned do not
		 * exist for the StringBuilder clas
		 */	
	}
	public void logMsg(String location, String message){
		sb.append(location);
		sb.append("-");
		sb.append(message);
		}
	
	public void dumpLog(){
		System.out.println(sb.toString());
		//Empty the contents of sb here
		/*
		 * The substring begins at the specified 
		 * start and extends to the character at 
		 * index end - 1 or to the end of the sequence 
		 * if no such character exists    
		 */
		sb.delete(0, sb.length());
		}
	
	static void q64(){
		int k = 1;
		int[] a = { 1 };
		k += (k = 4) * (k + 2);
		/*
		 * k=1+(4)*(4+2)
		 * k=1+4*6
		 * k=1+24
		 * k=25
		 */
		a[0] += (a[0] = 4) * (a[0] + 2);
		/*
		 * a[0]=1+(4)*(4+2)
		 * a[0]=1+4*6
		 * a[0]=1+24
		 * a[0]=25
		 */
		System.out.println( k + " , " + a[0]);
	}
	
	static void q65(){
		
		int i = 0, j = 5;
	    lab1 : for( ; ; i++){
	    		for( ; ; --j){
	    			System.out.println("i is "+i+" j is "+j);
	    	  /*i is 0
	    	   * j keeps decrementing to -1
	    	   * and at this point i > j
	    	   * which causes our label lab1
	    	   * to break which exits out of
	    	   * the outer loop and
	    	   * the final values for
	    	   * i are 0
	    	   * j is -1
	    	   */
	    	  if( i >j ) break lab1;
	      }    	  
	    }
	    System.out.println(" i = "+i+", j = "+j);	
	}
	
	static void q66(){
		/*
		 * underscores allowed in java for 
		 * numbers, but not allowed at 
		 * beginning or end of numbers
		 * spaces, commas and dashes(-)
		 * not allowed
		 * 1000000000
		 */
		int num=1_000_000_000;
		double dnum=1_00.00;
		//int num2=0x_12e;
		/*
		 * variable names allow underscores
		 * at beginning and end of
		 * name
		 */
		int _num=45;
		int num_=67;
		//float f-num;
		
	}
	}


