package com.noel;

import java.util.ArrayList;

public class Questions {
	
	static void q56(){
		/*
		 * these are not overriden as they
		 * are static method
		 */
		Animal.pack();
		Dog.pack();
		/*
		 * a final class cannot be extended
		 * a final method cannot be overriden
		 * the native keyword can only be used 
		 * in methods
		 */
	}
	
	static void q57(){
		int k = 0;
	      try{
	    	  // this is 1/0
	    	  //generates ArithmeticException
	         int i = 5/k;
	      }
	      //will catch the exception
	      catch (ArithmeticException e){
	         System.out.println("1");
	      }
	      catch (RuntimeException e){
	         System.out.println("2");
	         return ;
	      }
	      catch (Exception e){
	         System.out.println("3");
	      }
	      //finally will always run
	      finally{
	         System.out.println("4");
	      }
	      //runs after finally
	      System.out.println("5");		
	}
	
	static void q58(){
		//cannot give a size and then give values
		//String[] sA0 = new String[1] { "aaa"};
		//all valid
		String[] sA = new String[] { "aaa"};
		String[] sA2 = new String[1] ; sA2[0] = "aaa";
		String[] sA3 = {new String( "aaa")};
		String[] sA4 = { "aaa"};
	}
	
	static void q59(){
		/*args[]is the array passed to the main
		 * method that takes string arguments passed
		 * in by the user via the command prompt.
		 * These arguments are strings, so if 
		 * we wish to change them to Integers we
		 * have to parseInt them.
		 * this command is changing the second 
		 * argument sent to an Integer
		 * Integer.parseInt(args[1])
		 */
		
		int choice=1;
		
		switch(choice){
		case 0:
			System.out.println("choice 0");
			System.out.println("variable only available within "
					+ " switch");
			double dnum=5.6;
			System.out.println("dnum is "+dnum);
			break;
		case 1:
			/*
			 * has to be given a new value to be 
			 * visible in this part of the case
			 */
			dnum=7.89;
			System.out.println("choice 1");
			System.out.println("dnum available here as well"+dnum);
			break;
			default:
				System.out.println("1 or 0 not picked");
		}
		/*
		 * dnum cannot be accessed outside of the case
		 * block as it is local to the switch 
		 * statement
		 */
		//System.out.println(dnum);	
	}
	
	static void q60(){
		/*
		 * an SUV is a vehicle so we can add it
		 * to an ArrayList of Vehicles
		 */
		ArrayList<Vehicle> al1 = new ArrayList<>(); 
		al1.add(new SUV());
		/*
		 * Car implments the Drivable interface
		 * so objects that implements this interface
		 * can be added to the arryList
		 * and the Car class implments the Drivable
		 * interface
		 */
		ArrayList<Drivable> al2 = new ArrayList<>(); 
		al2.add(new Car());
		/*
		 * SUV extends Car which implements the Drivable
		 * interface
		 */
		ArrayList<Drivable> al3 = new ArrayList<>(); 
		al3.add(new SUV());
		/*
		 * SUV is NOT a subclass of car so you 
		 * can't add a superclass to a arraylist
		 * of sub class objects (A car is NOT just
		 * a SUV)
		 */
		//ArrayList<SUV> al4 = new ArrayList<>(); 
		//al4.add(new Car())
	/*
	 * a Car is a Vehicle (Vehicle extends Car), so
	 * we can add a car to an arrayList of Vehicles
	 */
		ArrayList<Vehicle> al5 = new ArrayList<>(); 
		al5.add(new Car());
	}
	
	static void q61(){
		/*
		 * will compile and print out
		 * -128 -128
		 * range of a byte is -128 to 127
		 */
		byte b = -128 ;
		/*
		 * a byte can always be assigned to
		 * an int
		 */
	      int i = b ;
	     // int i=306;
	      /*
	       * but casting an int to byte
	       * can have unpredictable results
	       * if the int is out of range
	       * but it will compile
	       */
	      b = (byte) i;
	      System.out.println(i+" "+b);
	      
	      i=306;
	      b=(byte)i;
	      System.out.println(b);
	}
	
	static void q62(){
		//global does not exist in java
		//global int x = 10;
		final int x = 10;
		//it's int not Int
		//also if inside a method public is not valid
		//public Int x = 10;
		//it's int not Int
		//Int x = 10;
		//correct and allowed
		//static int x = 10;	
	}
	
	static void q63(){
		/**
		 * COME BACK TO THIS ONE
		 */
		Baap b = new Beta();
		System.out.println(b.h);
		System.out.println(b.getH());
		System.out.println(b.h+" "+b.getH());
		//System.out.println(b.h + " " + b.getH());
	//	Beta bb = (Beta) b;
	//	System.out.println(bb.h + " " + bb.getH());
		
		Bird chickBird=new Chicken();
		
		System.out.println(chickBird.age);
		chickBird.eat();
	}
	
	static void q64(){
		/*
		 * see interface Behaviour
		 */
		Animal andy=new Animal();
		andy.drink();
		andy.pack();
		/*
		 * can't access a static method in an interface
		 * by a member of a class that implements it
		 * so we can't go
		 */
		//andy.statMethod();
		//or this does not work
		//Animal.statMethod()
		//can only access this way
		Behaviour.statMethod();
	}
	
	static void q65(){
		/*
		 * as this is a checked exception IT HAS TO be dealt
		 * with, the only option we are given
		 * is that all of our methods throws the
		 * exception, if we were given the option
		 * we could have also had a try catch block
		 * in any one of the methods
		 */
	}
	
	static void q66(){
		int x = 1;
		int y = 0;
		/*
		 * a if condition has to produce a boolean
		 * (true or false) and x/y (1/0) does not
		 * produce a true or false.
		 * so this will not compile
		 */
	/*	if( x/y ) 
			System.out.println("Good");
		else
			System.out.println("Bad");*/
	}
	
	

}
