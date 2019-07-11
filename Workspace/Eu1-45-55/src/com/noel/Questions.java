package com.noel;

import java.util.concurrent.SynchronousQueue;

public class Questions {
	static void q45(){
		/*
		 * overriding methods the method signature has 
		 * to be the exact same, meaning the 
		 * return type and 
		 * method parameter types and positioning 
		 * must match, but you can have covariant
		 * return types (you can return a subclass)
		 * but primitives MUST match EXACTLY
		 * see Employee class
		 */
	}
	
	static void q46(){
		/*
		 * when dealing with a Exception a try catch block
		 * that catchs a RuntimeException will not
		 * deal that exception
		 */
			Fireman.throwException2();	
	}
	
	static void q47(){
		/*short circuit operator
		 The && operator returns true only if both 
		 the operands are true. If the first operand
		to this operator evaluates to false, 
		the result can never be true. Therefore, &&
		does not evaluate the second operand.
		the & always evaluates both operands
		 */
		int i = 0 ;
		boolean bool1 = true ;
		boolean bool2 = false;
		boolean bool= false;
		/*
		 * both sides are evaluated
		 * even though bool2 is false
		 * both sides will be evaluated
		 * as this is NOT the short circult
		 * operator
		 */
		bool = ( bool2 & method1(i++) ); //1  
		System.out.println("line 1 "+bool+" i is "+i);
		/*
		 * if first is false, does not bother evaluating
		 * second argument
		 */
		bool = ( bool2 && method1(i++) ); //2 
		System.out.println("line 2 "+bool+" i is "+i);
		//both sides are evaluated
		bool = ( bool1 | method1(i++) ); //3
		System.out.println("line 3 "+bool+" i is "+i);
		/*
		 * if first is true, will not bother evaluating
		 * second, short circuit OR
		 */
		bool = ( bool1 || method1(i++) ); //4
		System.out.println("line 4 "+bool+" i is "+i);
		System.out.println(i);		
	}
	//method for question 47
	//returns true if int sent to method > 0
	public static boolean method1(int i)
	{
		return i>0?true:false;
		}
	
	public static void q48(){
		/*
		 * we need to import the classes from
		 * the differing packages that are needed to
		 * get the program to run and also tell the compiler
		 * what package we are currently in
		 * Bad syntax
		 * package com.enthu.rad.*;
		 * 
		 * for using the static method
		 * Util.store(stock);
		 * we insert
		 * import com.enthu.*;
		 * 
		 * for creating a member of the Stock class
		 *  Stock stock;
		 * and as we have not import statement
		 * we must be in the same package
		 * package com.enthu.rad;
		 * 
		 * for using the Helper static method
		 *  return Helper.getPricer(stock).price();
		 * we insert
		 * import com.*;
		 * 
		 * since we are using IOException in the line
		 * public void store() throws IOException{
		 * we insert
		 * import java.io.*;
		 */	
	}
	
	public static void q49(){
		
		String s = "MINIMUM";
		System.out.println(s);
		/*
		 * returns a substring that starts at 
		 * position 4 and goes UP TO BUT 
		 * DOES NOT INCLUDE 7
		 */
		//1  prints MUM
		System.out.println(s.substring(4, 7)); 
		//2  prints UM
		System.out.println(s.substring(5)); 
		//returns position of first 'I'
		System.out.println(s.indexOf('I'));// prints 1
		/*
		 * returns the position of the first 'I'
		 * starting at position 3
		 */
		System.out.println(s.indexOf('I',3));// prints 3
		//prints IMUM
		System.out.println(s.substring(s.indexOf('I', 3))); 
		/*
		 * if indexOf cannot find your char, then it returns
		 * -1, there is no 'I' after position 4 so  the 
		 * effect of this is s.substring(-1) which will  
		 * throw StringIndexOutOfBoundsException    
		 */
		try{
		System.out.println(s.substring(s.indexOf('I', 4)));
		}
		catch(Exception e){
			System.out.println(e);//4
		}
	}
	
	public static void q50(){
		/*
		 * the string class is final so all of its methods
		 * are also implicitly final
		 * 
		 * StringBuffer and StringBuilder are final classes
		 * so you can't extend them
		 * 
		 * StringBuilder extends Object, not String
		 * which you can't extend as String is a 
		 * final class
		 * 
		
		 * 
		 * 1. Remember that wrapper classes (java.lang.
		 * Boolean, 
		 * java.lang.Integer, java.lang.Long, 
		 * java.lang.Short etc.) 
		 * are also final and so they cannot be extended. 
		 * 
		 * 2. java.lang.Number, however, is not final. 
		 * Integer, 
		 * Long, Double etc. extend Number.
		 * 3. java.lang.System is final as well.
		 */	
		System.out.println();
	}
	
	public static void q51(){
		/**
		 * COME BACK TO THIS ONE!!!!!!
		 */
		//see behaviour interface
		Dog spot=new Dog();
		spot.sleep();
	}
	
	public static void q52(){
		/***
		 * COME BACK TO 52***********
		 */
	}
	
	public static void q53(){
		/*
		 * this is valid
		 */
		Object o = new java.io.File("a.txt");
		/*
		 * this is autoboxing
		 */
		Boolean bool = false;
		/*
		 * numbers can fit into a char
		 */
		char ch = 10;
		//you can't instantiate a interface object
		//Behaviour behave=new Behaviour()
		/*
		 * but you can have a interface reference to a
		 * object that implments the interface 
		 */
		Behaviour behaveDog=new Dog();
		behaveDog.drink();
		behaveDog.eat();
		behaveDog.sleep();
		/*
		 * you are creating a object that provides
		 * an implementation for the eat() and drink
		 * method, you have to provide it for both
		 */
		Behaviour behave=new Behaviour(){
			/*
			 * eat and drink are two abstract
			 * methods in the Behaviour class
			 */
			@Override
			public void eat() {
				System.out.println("eat outside");
			}
			public void drink(){
				System.out.println("drink outside");		
			}
			/*
			 we do not have to provide implementation
			 for this as this has a defaul implementation
			 */
			public void sleep(){
				System.out.println("sleep outside");
			}
			
		};
		behave.eat();
		behave.sleep();
		
	}
	//for question 54
	  private Object o;
	  /*
	   * o becomes the object sent to the method
	   * so we can access the method this way
	   */
	   void doSomething(Object s){  o = s;   }
	static void q54(){
		// answer is at line 6
		  Object obj = new Object(); // 1
	      Questions tc = new Questions(); //2
	      tc.doSomething(obj); //3
	      obj = new Object();    //4
	      obj = null;    //5
	      /* up to this point we can access
	       * it through the private variable
	       * o
	       */
	      tc.doSomething(obj); //6	
	}
	
	static void q55(){
		/*
		 * It can iterate over an array or a Collection 
		 * but not a Map.
		 * 
		 * Using an enhanced for loop 
		 * prevents the code from going into an infinite loop.
		 * 
		 * You cannot find out the number of the current 
		 * iteration while iterating.
		 */
	}


}
