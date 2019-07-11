package com.noel;

import java.util.ArrayList;

public class Questions {
	
	static void q56(){
		double grossIncome=19_000;
		double taxRate = grossIncome<=18000 ? 0 
				: (grossIncome<=36000) ? .1 : .2;
		
		taxRate = 0; if(grossIncome>36000) taxRate = .20; 
		if(grossIncome>18000 && grossIncome<=36000) 
			taxRate = .10;
		
		taxRate = 0; 
		taxRate = grossIncome>18000
				?grossIncome<=36000?.1:.2:0;
	}
	
	static void q57(){
		/*
		 * encapsulation means keeping
		 * variables private so only certain
		 * features and characteristics of a class
		 * are available
		 */
	}
	
	static void q58(){
		 if (true)
			 //this will run
		      if (false)
		    	  System.out.println("True False");
		      else
		    	  //as it's false, will print this
		    	  System.out.println("True True");
	}
	
	static void q59(){
		
		try{Dog spot=new Dog();
		/*
		 * an exception is an object
		 * so it can be null, what exception
		 * that is caught depends on
		 * what type of object it is. So
		 * this is a null object, so the 
		 * exception that is caught is a
		 * NullPointerException
		 */
	         RuntimeException re = null;
	         throw re;
	      }
	      catch(Exception e){
	    	  //will print NullPointerException
	         System.out.println(e);
	      }
		
		try{
			/*
			 * this is a RuntimeException reference
			 * to a RuntimeException object, so
			 * what is caught is a RuntimeExceptin
			 */
			RuntimeException re=new RuntimeException();
			throw re;
		}//will throw RuntimeException
		catch(Exception e){
			System.out.println(e);
		}	
	}
	
	static void q60()throws Exception{
		try{
			m2();
		}
		/*
		 * finally is always called, so this
		 * is the exception that is thrown
		 * by this method
		 * m3 throws AnotherException
		 */
		finally{
			m3();
		}
	}
	/*
	 * for question 60
	 */
	public static void m2() throws NewException{
		throw new NewException();
		}
	public static void m3() throws AnotherException{
		throw new AnotherException();
		}
	
	static void q61(){
		ArrayList<String> al = new ArrayList<String>();
        al.add("111");
        al.add("222");
        /*
         * al.size()will return 2
         * so al.get(2) is trying to access
         * the third element in an arraylist
         * that only has two things in it.
         * so will get IndexOutOfBoundsException
         */
        System.out.println(al.get(1));//will compile
        //will generate exception
        System.out.println(al.get(al.size()));
	}
	
	static void q62(){
		/*
		 * if there is no package statment in
		 * the file that means you are in
		 * the default package. you can't 
		 * import from the default package
		 * but you can import "into" the
		 * default package
		 * so we are using the Helper class
		 * so we have to import the package
		 * import com.*; as the helper class
		 * is in that package
		 * we also have to import the 
		 * import com.enthu.rad.*; package
		 * as the stock class exists within
		 * that
		 */	
	}
	
	static void q63(){
		/*
		 * localDate, localdatetime, localtime does
		 * NOT contain any timezone information
		 * and the ISO_ZONED_DATE_TIME requires
		 * it so it will throw a DateTimeException
		 * and this is a runtimeException so it
		 * will compile and does NOT HAVE to be
		 * in a try/catch block
		 */
	}
	
	static void q64(){
		//see TestClass for explanation
		Integer a = 4; 
		new TestClass().probe(a); //5
        int b = 4; 
        new TestClass().probe(b); //6
        new TestClass().probe(a,b);
        new TestClass().probe();
	}
	
	static void q65(){
		/*
		 * a final method CANNOT be overridden
		 * static methods are NOT overridden they
		 * are SHADOWED
		 * if a method is private it cannot be
		 * Overridden as this method cannot be
		 * accessed outside of its own class
		 */
	}
	//for question 66
	static String statNum="hello there";
	int num=45;
	static void q66(){
		/*
		 * getStatics returns a Questions object
		 * but getStatics returns a null object
		 * so if we tried to do anything with
		 * a null object we would get a nullPointer
		 * exception. however this is a static variable
		 * and this variable exists even without 
		 * a object of the class. notice this
		 * method calls the variable statNum 
		 * defined just before this method
		 * q66()
		 */
		System.out.println(getStatics().statNum);
		/*
		 * this will print null as this method
		 * returns a null object
		 */
		System.out.println(getStatics());
		/*
		 * a null object by itself will NOT
		 * generate a NullPointerException.
		 * it's when we try to do something
		 * with a null object we get
		 * an NullPointerException
		 * here we are trying to access the instance
		 * variable num, but getStatics()returns a null
		 * object. so we are trying to use a null
		 * object to access a NON STATIC instance 
		 * variable, and instance variables CANNOT
		 * exist without a instance of class
		 * being created first.This will
		 * throw a NullPointerException
		 */
		System.out.println(getStatics().num);
	}
	
	static Questions getStatics(){
		System.out.println("getStatics called");
		/*
		 * any method that returns a object of
		 * any type can return null
		 */
		return null;
	}

}
