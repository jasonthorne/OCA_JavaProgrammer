package com.noel;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class Questions {
	static void q66(){
		ArrayList<Vehicle> al1 = new ArrayList<>();
		
		Vehicle[]vehArray=new Vehicle[3];
		Car myCar=(Car)vehArray[0];
		//will not compile, have to cast
		//SUV s = al1.get(0);
		/*
		 * this will compile but NOT run
		 * as there are no vehicles in 
		 * our arraylist
		 */
		SUV s = (SUV) al1.get(0);
		/*
		 * Drivable is NOT a Car so you 
		 * can't assign it to a Car reference
		 * without a cast
		 */
		ArrayList<Drivable> al2 = new ArrayList<>(); 
		//Car c1 = al2.get(0);
		Car c1 = (Car)al2.get(0);
		/*
		 * Car is an abstract class so you can't
		 * create an instance of Car class
		 * but you can have a Car reference to
		 * a sub class SUV object
		 */
		Car carSub=new SUV();
		
		ArrayList<SUV> al3 = new ArrayList<>(); 
		/*
		 * SUV implements Drivable as its 
		 * superclass Car does, so you
		 * can have an interface reference
		 * to a class that implements that
		 * reference
		 */
		Drivable d1 = al3.get(0);
		
		ArrayList<SUV> al4 = new ArrayList<>(); 
	/*
		 * SUV is a car or in other words
		 * you can have a superclass reference
		 * to a subclass object
		 */
		Car c2 = al4.get(0);
		
		ArrayList<Vehicle> al5 = new ArrayList<>(); 
		/*
		 * Drivable is not a vehcile so you can't
		 * assign this, also vehicle does not
		 * implement Drivable so even if you
		 * cast al5.get(0) to vehicle it 
		 * still won't compile
		 */
		//Drivable d2 = al5.get(0);
		//Drivable d2 = (Vehicle)al5.get(0);	
	}
	
	static void q67(){
		int a = 10;
		int b = 20;
		/*
		 * a=a+(a=4)
		 * a=10+4
		 * a=14
		 */
		a += (a = 4);
		/*
		 * b=b+(b=5)
		 * b=20+5
		 * b=25
		 */
		b = b + (b = 5);
		System.out.println(a+ ",  "+b);
	}
	
	static void q68(){
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int counter = 0;
		for (int value : arr) { 
			if (counter >= 5) {
				break;
				} 
			else 
				{
				continue;
					}
			/*
			 * this loop will ALWAYS either
			 * break or continue before it
			 * comes to this point, so this
			 * is unreachable code so this
			 * will not compile
			 */
	/*		if (value > 4) {
				arr[counter] = value + 1;
				}
			counter++;*/
			}
		System.out.println(arr[counter]);
	}
	
	static void q69(){
		TestClass tc = new TestClass();
	      tc.method(null);
	      tc.method(new Object());
	}
	
	static void q70(){
		/*
		 * can't use commas (1,000,000) in numbers
		 * can't have two same case values in a 
		 * switch statement
		 * 1000
		 * is the same as
		 * 1_000
		 */
	}
	
	static void q71(){
		Object t = new Integer(106); 
		/*
		 * 106/10 is integer division
		 * so the answer is 10 (decimal
		 * point is just chopped off)
		 */
		System.out.println(106/10);
		System.out.println((Integer)t/10);
		/*
		 * this casts the Object t to be of
		 * type integer and gets the intValue
		 * (which is unecessay as we can
		 * see from above) and divides it by
		 * the int 10 so we get k=10
		 */
		int k = ((Integer) t).intValue()/10;
		System.out.println(k);
		/*
		 * when one is a double answer will
		 * be promoted to double
		 * answer is 10.1010101010101
		 */
		System.out.println(100/9.9);
		/*
		 * one is a double so answer will
		 * be promoted to double
		 * answer is 10.0
		 */
		System.out.println(100/10.0);
		/*
		 * whole numbers are by default 
		 * ints in java
		 */
		System.out.println(100/10);
		/*Multipication and division before 
		 * addition and subtraction
		 * 3+(100/10*2)-13
		 * 3+(10*2)-13
		 * 3+20-13
		 * 23-13
		 * 10
		 */
		System.out.println(3 + 100/10*2-13);
	}
	
	static void q72(){
		Object a=new Object();
		Object b = new Object();//XXX  
		Object c, d = new Object();//1 
		c = b;//2 
		b = a = null; //3
		/*
		 * we can still access the object through
		 * the c reference
		 */
	}
	
	static void q73(){
		try{
			m1();
			}
		/*
		 * the method m1() prints "m1 starts"
		 * and throws a IndexOutOfBoundsException
		 * which is caught by the first catch
		 * block which then prints out "1".
		 * and throws a new NullPointerException
		 * . This exception is NOT dealt with
		 * and is then thrown back to main and
		 * halts our program. before this
		 * happens though finally is called
		 * which prints "4"
		 * so the printout is "m1 starts 1 4"
		 */
		catch(IndexOutOfBoundsException e){ 
			System.out.println("1"); 
			throw new NullPointerException(); 
				}
		catch(NullPointerException e){ 
			System.out.println("2"); 
			return; 
					}
		catch (Exception e) {
			System.out.println("3");
			}
		finally{
			System.out.println("4");
			}
		System.out.println("END");
		
	}
	//for q73
	static void m1(){
		System.out.println("m1 Starts");
		throw new IndexOutOfBoundsException( "Big Bang " );
		}
	
	static void q74(){
		/*
		 * see Triange class
		 */
	}
	
	static void q75(){
		String str=null;
		int i=4;
		if ( (str != null) | ( i == str.length() ) );
		
		if ( (str == null) | ( i == str.length() ) );
		
		if ( (str != null) || (i == str.length() ) );
		
		if ( (str == null) || (i == str.length() ) );		
	}
	
	static void q76(){
		boolean flag=true;
		/*
		 * the way this is constructed
		 * it can never get to "True True"
		 */
		if (flag)   //1
			if (flag)   //2
				if (flag)   //3
					System.out.println("False True");
				else        //4
					System.out.println("True False");
			else        //5
				System.out.println("True True");
		else        //6
			System.out.println("False False");
	}
	
	static void q77(){
		LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);  
		ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern")); 
		date = date.plus(Duration.ofDays(1)); System.out.println(date);  
		date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern")); 
		date = date.plus(Period.ofDays(1)); System.out.println(date);
	}
	

}
