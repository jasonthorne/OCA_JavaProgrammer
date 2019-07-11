package com.gretb;

import java.util.Set;

public class Questions {
	
	static void q34(){
		int amount = 100, seed = 6;
		switch( new Test().luckyNumber(6) )
		{//7 is returned
		case 3: amount = amount * 2;
		/*
		 * there is no break after case 7
		 * so case 6 is also executed
		 */
		//100*2 amount is now 200
		case 7: amount = amount * 2;
		//200+200 amount is now 400
		case 6: amount = amount + amount;
		default :
			}
		System.out.println(amount);
	}
	
	static void q35(){
		//this will give a nullPointerException
		//int[][] a = new int[2][];
		int[][] a = new int[2][4];
		/*
		 * this has to be at least 2 rows and 
		 * 4 columns
		 */
		//row 1
		a[0][0] = 1;
		a[0][1] = 2;
		//row 2
		a[1][0] = 3;
		a[1][1] = 4; 
		a[1][2] = 5; 
		a[1][3] = 6;
		//this has a null reference for the 
		//columns, 2 rows, null columns
		int[][] a2 = new int[2][];
		/*
		 * this is a two d array, on the first row
		 * we have two columns and on the second row
		 * we have four columns, this is Asymetric 
		 * multidimensional array
		 */
		int[][] a3 = new int[2][]; 
		a3[0] = new int[2]; 
		a3[1] = new int[4];
		/*
		 * another asymetric array of 3 rows
		 * row one is 2 columns
		 * row two is three columns
		 * row three is one column
		 */
		int[][]asyArray={{2,2},{45,78,99},{1}};
	}
	
	static void q36(){
		/*
		 * a catch block cannot follow a 
		 * finally block
		 */
	}
	
	static void q37(){
		/*
		 * sets are not on the exam
		 * briefly sets are sort of like a list
		 * sub classes of set are
		 * SortedSet, TreeSet, HashSet,
		 */
	}
	/*
	 * for question 37
	 */
	public Set getSet(int a) {
		/*
		 * any method that overrides this
		 * can return set, a sub class of
		 * set or null.
		 * any method that overrides this
		 * cannot Throw a Exception, as this
		 * is a checked exception and a 
		 * overriding method can only throw
		 * an exception if the original 
		 * method also throws an exception
		 * a overriding method can throw a
		 * runTimeException.
		 * a overriding method can be abstract
		 * even if the orginal method was
		 * concrete (remember you would
		 * have to make the class abstract 
		 * if you have a abstract method contained
		 * in it)
		 */
		return null;
	}
	
	static void q38(){
		String str="hello there";
		/*
		 * at this point the object 
		 * created at str is liable
		 * for garbage collection as
		 * there is no other variable
		 * accessing it 
		 */
		str=null;
	}
	
	static void q39()throws Exception{
		/*
		 * when a checked exception is generated
		 * IT HAS to be dealt with, either by 
		 * having it inside a try/catch block
		 * or methods that calls the offending
		 * code throws Exception. it has to continue
		 * this up the chain until it gets to main
		 * if it has too
		 */
		//comment this in an out
		throw new Exception();
	}
	
	static void q40(){
		/*
		 * trim trims the spaces at the beggining and 
		 * end of the string
		 */
		System.out.println("    hello java guru   ".trim());	
	}
	
	static void q41(){
		BandWidth bw = new BandWidth(100);
		bw.available=0;
		//this will also set avaialble to 0
		/*
		 * the addMore method is 
		 * public void addMore(int more){
		available += more;
		we are sending a minus value to 
		this method, we are sending -100
		available is orginally 100
		so available +=more
		is avaialble = available+more
		but "more" is a -100 and plus and minus becomes
		a minus so
		it is 
		avaiable=100-100
		}
		 */
		bw.addMore(-bw.getAvailable());
		System.out.println(bw.getAvailable());
	}
	
	static void q42(){
		/*
		 * static and final are valid modifiers 
		 * for both member field and method 
		 * declarations within a class. transient 
		 * and volatile modifiers are only valid 
		 * for member field declarations. abstract 
		 * and native are only valid for member methods.  
		 * Note: a class declaration can have only 
		 * final, abstract and public as modifiers, 
		 * unless it is a nested class, in which case, 
		 * it can be declared private or  protected 
		 * as well. Within a method, a local variable 
		 * may be declared as final, but not public,
		 * protected.
		 * variables can't be declared abstract
		 */
	}
	
	static void q43(){
		/*byte goes from -128 to
		 * 127
		 */
		byte x='b';
		x=-2;
		x=80;
		switch(x){
	      case 'b':   // 1
	      default :   // 2
	      case -2:    // 3
	      case 80:    // 4
	   }
	}
	
	static void q44(){
		String str="086-999-9999";
		/*
		 * no append method in the string class
		 */
		/*
		 * a StringBuilder and a string gives us a 
		 * string
		 */
		String myString=new StringBuilder("xxx-xxx-")
				+str.substring(8);
		System.out.println(myString);
		myString=new StringBuilder(str)
				.replace(0, 7, "xxx-xxx-").toString();
		System.out.println(myString);
		myString="xxx-xxx-"+str.substring(8, 12);
		System.out.println(myString);		
	}
	
	
	


}
