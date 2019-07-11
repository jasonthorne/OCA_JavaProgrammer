package com.noel;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class Questions {
	static void q45(){
		int size = 10; 
		/*
		 * this is an array of size 10
		 * and its an array of 10 zeros
		 * as an array of numbers will
		 * be each given a default 
		 * value of 0
		 */
		int[] arr = new int[size]; 
		for (int i = 0 ; i < size ; ++i) 
			System.out.println(arr[i]);
	}
	
	static void q46(){
		/*
		 * unsigned int is a positive integer
		 * there is NO unsigned keyword in java
		 */
		//unsigned byte b = 0;
		//char c=-1;
		//System.out.println(c);
	}
	
	static void q47(){
		String str = "111";
		/*
		 * by default an array of boolean
		 * the values are all false
		 */
		boolean[] bA = new boolean[1];
		//this is false
		if( bA[0] ) 
			str = "222"; 
		/*
		 * so str has not changed 
		 * value, it has the original
		 * value "111
		 */
		System.out.println(str);
	}
	
	static void q48(){
		//see class A
	}
	
	static void q49(){
		/*
		 * dividing 199 by 200
		 * it's integer, so no decimal places
		 * so just a remainder of 199
		 */
		System.out.println(150%200);
		int count = 0, sum = 0;
		do{
			System.out.println("count is "+count);
		       if(count % 3 == 0) 
		    	   continue;
		       System.out.println("we add "+sum+"+"+count);
		       sum+=count;
		       System.out.println("sum is "+sum);
		}
		while(count++ < 11);
		System.out.println(sum);
	}
	
	static void q50(){
		/*
		 * the reference type is not
		 * the important thing here what 
		 * is important is the actual object
		 * and it is a Z object which extends
		 * Y which extends X, and a call to 
		 * a super class is done before 
		 * a object of a sub class is created
		 * so the Z object calls the Y
		 * constructor that calls a X
		 * constructor that creates this object
		 */
		Y myY=new Z();
	}
	/**
	 * do seission on dates
	 */
	static void q51(){
		//todays date
		System.out.println(LocalDate.now());
		//replaces todays date with the 4 of this month
		System.out.println(LocalDate.now().
				withDayOfMonth(4));
		System.out.println(LocalDate.now().
				withDayOfYear(100));
		//System.out.println(LocalDate.now().);
		
		//System.out.println(LocalDate.now().with);
		
		/*
		 * this is just a TemporalAdjuster object so just
		 * having this in a print statement will print out
		 * its address*/
		  System.out.println(TemporalAdjusters.
		 next(DayOfWeek.TUESDAY));
		 
		
		System.out.println(LocalDate.now().with(
				TemporalAdjusters.lastInMonth
				(DayOfWeek.FRIDAY)));
		
		System.out.println(TemporalAdjusters.
				next(DayOfWeek.TUESDAY).
				adjustInto(LocalDate.now()));
		
	}
	
	static void q52(){
		Animal a = new Animal();
		Mammal b = new Mammal();
		/*
		 * will compile and run
		 */
		a=(Animal)(I)b;
		b.eat();
		/*
		 * will compile but not run
		 */
		//b=(Mammal)(I)a;
		//will not compile
		//a=(I)b;
		//will compile but not run
		I i=(Cat)a;
		/*
		 * this will compile as a
		 * is an Animal and Animal
		 * implements the i interface
		 */
		I i2=a;
	}
	
	static void q53(){
		 B b = new B();
		 /*
		  * B1 and B2 both 
		  * extend B
		  */
	     B1 b1 = new B1();
	     B2 b2 = new B2();
	     //will compile and run
	    // b = b1;
	     /*
	      * b could refer to a B object,
	      * or a B1 object or a B2 
	      * object, so will not compile
	      */
	     //b2 = b;
	    /*
	     * will give a ClassCastException
	     * as b is a B and NOT a B1
	     */
	    b1=(B1)b;
	}
	
	static void q54(){
		/*
		 * calls the OrderManager constructor
		 * which calls the CobraComponent constructor
		 * which calls the startUp("IOR"). as this is
		 * a OrderManger object that is sent by the 
		 * start method, it calls the startUp method
		 * in the OrderManager class
		 */
	
		start(new OrderManager());
	}
	/*
	 * for question 54
	 * this can take a CobraComponent object
	 * or a subclass which is a OrderManager 
	 * object. 
	 */
	static void start(CorbaComponent cc)
	{ 
		cc.print(); 
		}
	
	static boolean a;
	   static boolean b; 
	   static boolean c;
	   
	   static void q55(){
		   /*
		    * in an short circuit or || if
		    * the left hand side is true then
		    * the right hand is not even evaluated.
		    * there are no brackets of || &&
		    * together(
		    * i.e (b=true||b=false)&&(a=true&&b==true) 
		    * so it 
		    * is simply evaluated from left
		    * to right
		    * a=true so first argument is true
		    * the rest is NOT evaluated
		    * so a=true
		    * b=false
		    * c=false
		    */
		   boolean bool = (a = true) || (b = true) 
				   && (c = true);
		   System.out.print(a + ", " + b + ", " + c);
	   }

}
