package com.noel;

import java.util.ArrayList;
import java.util.List;

public class Questions {
	/**
	 * COME BACK TO QUESTION
	 */
	static void q45(){
		String myString="hello there kjlkjl lkjdflkjdlfkjs"
				+ "kjlj kljlkjlk kljlkj lkjlkj lj lkjlkj ljjl"
				+ "kljlkj lkjlkj lkj lkj lkj lkj l";
		//returns a char at index postion 2, which is l
		System.out.println(myString.charAt(2));
		/*
		 * this converts the Character 'A' to a int
		 * which is 66 and then goes to index position
		 * 66
		 */
		System.out.println(myString.charAt('A'));
		/*
		 * assigns 4 to ch (numbering starts at 0)
		 */
		char ch = "12345".charAt(3);
		
		String str="12345";
		/*
		 * will give five
		 */
		System.out.println(str.length());
		/*
		 * will give indexOutOfBoundsException
		 * as this is looking for the character at
		 * str[5] and str goes from [0] to [4]
		 */
		ch=str.charAt(str.length());
		/*
		 * why is it IndexOutOfBoundsException instead of
		 * StringIndexOutOfBounds??
		 */
	}
	
	static void q46(){
		//see Animal class
	}
	
	static void q47(){
		//see main for question
		 
	}
	
	static void q48(){
		Base b=new Sub(); //1
		/*
		 * methodA is first defined in the base 
		 * class, and the reference determines 
		 * what classes are available to this object.
		 * this is a Base class reference and MethodA
		 * exists within the Base class
		 */
		b.methodA(); //2
		/*
		 * methodB() is not defined in the base 
		 * class so it is not available to this
		 * object
		 */
		//b.methodB();
	}
	
	static void q49(){
		/*
		 * the method func(String[]args) takes
		 * an array of strings and assigned it
		 * to the instance variable string 
		 * arguments[], so we are passing the 
		 * string[]args array that is used in
		 * the main method when we pass in string
		 * arguments in the command line prompt
		 */
	}
	
	static void q50(){
		/*
		 * local variables have to Be given
		 * DEFINATE values, see
		 * discounter class
		 */
	}
	
	static void q51(){
		/*
		 * the throw is what causes the
		 * code not to compile, as this
		 * is a checked exception
		 * and when a checked exception
		 * is thrown it has to be put 
		 * in a try/catch block or a throws
		 * clause has to be put in the
		 * method signature
		 */
		Exception a=null;
		Exception myException=new Exception();
		//throw a;	
		try{
			Exception e = null;
			/*
			 * comment out this and we get 
			 * NullPointerException
			 */
			throw e;
			}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	static void q52(){
		 int i = 1;
		  int j = i++;//i is 1 j is 1
		  //i is now 2
		  if( (i==++j)/* i is 2 j is now 2
		  */ | (i++ == j)/*i is same j
		  */ ){
		    i+=j;//i is now 3 j is 2
		    //3+2=5
		  }
		  System.out.println(i);
	}
	
	static void q53(){
		System.out.println(someInt);//print 10
		changeIt(someInt);
	    System.out.println(someInt);//print 10	
	}
	//for question 53
	static int someInt = 10;
	public static void changeIt(int a)
	{
		a = 20;
		System.out.println("inside method "+a);
		/*
		 * the value is only changed
		 * in method, not back in the method
		 * that called it. As if you send
		 * a primitive variable to a method
		 * you cannot change it's value.
		 * if you send a object to a method
		 * you can't change what it refers 
		 * to (i.e spot will still be spot),
		 * but you can change the instance
		 * variables(also called fields) of
		 * an object (i.e you can change the
		 * age, name, weight, etc of spot)
		 */  
	  }
	
	static void q54(){
		/*
		 * Inner classes ARE NOT ON this 
		 * exam so topic will not be covered
		 */	
	}
	
	static void q55(){
		/*
		 * reference type on left
		 * object type on right.
		 * reference type is List
		 * object type is ArrayList
		 */
		List students = new ArrayList();	
	}

}
