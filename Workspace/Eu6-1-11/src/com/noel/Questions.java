package com.noel;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Questions {
	
	static void q1(){
		StringBuilder sb = new StringBuilder(
				"12345678");
		/*
		 * this resizes the stringbuilder to 
		 * 12345
		 */
		sb.setLength(5);
		/*
		 * this resizes the stringbuilder to
		 * length 5, which is 12345
		 */
		System.out.println(sb);
		/*this sets length to 10 which is
		 * "12345     ", our original fives
		 * numbers plus 5 blank spaces at
		 * the end 
		 */
		sb.setLength(10);
		System.out.println(sb.length());
		//this shows our spaces
		System.out.println("space"+sb+"space");
	}
	
	static void q2(){
		/*
		 * the only class that is automatically
		 * imported is the java.lang package
		 * ArrayList is in the java.util
		 * package which is not imported
		 * automatically
		 * we have to import
		 * import java.util.ArrayList;
		 */
		ArrayList<Integer>myList=new ArrayList<>();
		
	}
	
	static void q3(){
		LocalDate id=LocalDate.of(2222, 12, 25);
		//gives todays date
		id=LocalDate.now();
		System.out.println(id);
		/*
		 * this will just add a month to the
		 * current date
		 */
		System.out.println(id.plus(Period.ofMonths(1)));
		System.out.println(id.plus(Period.ofWeeks(5)));
		System.out.println(id.plus(Period.ofDays(200)));
		System.out.println(id.plus(Period.ofYears(2)));
		id=LocalDate.of(2016, 02, 29);
		System.out.println("leap year");
		System.out.println(id.plus(Period.ofYears(1)));
		/*
		 * you can't chain the "of" static methods.
		 * In this example only one day is added
		 * to the the 29th of February 2016
		 */
		System.out.println(id.plus(Period.ofMonths(1)
				.ofDays(1)));
		/*
		 * for a date period of one month and one
		 * day you have to create a period of
		 * one month and one day.
		 * you can't directly create a period
		 * as there are no public constructors.
		 *you also can't directly creates a date,
		 *datetime or time
		 */
		//LocalDate myDate=new LocalDate();
		/*
		 * and you can't do this for
		 * the previous stated reason as 
		 * the period class has no public
		 * constructor
		 */
		//id=id.plus(new Period(0,1,1))
		/*
		 * we use the 'of' method
		 * this is a period of 0 years
		 * 1 month
		 * and 1 day
		 */
		id=id.plus(Period.of(0, 1, 1));
		System.out.println("new date is "+id);
		
	}
	
	static void q4(){
		/*
		 * a main method has to be public static
		 * void main. for this exam assume
		 * that the main method MUST be public
		 * for some older versions of java 
		 * private or protected have 
		 * been known to work
		 * The return type and the mehtod
		 * name have to be 
		 * return type+method name
		 * A main method can be final as all
		 * final just means the method cannot
		 * be overriden.
		 * see below
		 */	
	}
	
	static public void myMethod(){
		
	}
	public static void myMethod2(){
		
	}
	final public static void myMethod3(){
		
	}
	static final public void myMethod4(){
		
	}
	/*
	 * the first four keywords can change position
	 * but the return type and method name
	 * have to be in this position
	 */
	public static strictfp final 
	void myMethod5()throws Exception{
		double dnum=100/3;	
	}
	
	static void q5(){
		/*
		 * see method1 and method2
		 */try{
			 method1();
			 method2();
		 }
		 catch(Exception e){
			 System.out.println(e);
		 }
		 catch(Throwable t){
			 System.out.println(t);
		 }	
	}
	/*
	 * throwable is a checked exception
	 * so a call to this has to be put
	 * in a try/catch block
	 * and its "throws" not "throw"
	 */
	public static void method1()throws Throwable{
		/*
		 * throwing a new throwable the keyword
		 * is "throw"
		 */
		throw new Throwable();
	}
	public static void method2()throws Exception{	
	}
	
	static void q6(){
		int x=0;
		loop: for (int i = 1; i < 5; i++){
	         for (int j = 1; j < 5; j++){
	            System.out.println(i);
	            /*
	             * x does not change and is 
	             * always 0 so J will 
	             * NEVER print as continue
	             * breaks out of the current 
	             * iteration of the OUTER loop
	             * so it only prints out one
	             * iteration of the inner loop
	             * each time and prints out
	             * the value of i
	             * so it prints 1,2,3,4
	             */
	            if (x == 0) {  
	            	continue loop;  }
	            System.out.println(j);
	         }
	      }	
	}
	
	static void q7(){
		/*
		 * when overriding a method that 
		 * returns a primitive variable
		 * the overriding method HAS to 
		 * return the SAME data type
		 * see A class
		 */
	}
	static void q8(){
		/*
		 * An abstract method can ONLY exist in
		 * a abstract class or an interface.
		 * If you mark a method as final
		 * you cannot override it.
		 * If you declare a constructor
		 * in a class that takes any 
		 * variable type, you no longer
		 * have a constructor in the class
		 * that takes no arguments (the 
		 * default constructor).
		 * You cannot access a private variable
		 * outside it's own class
		 */	
	}
	
	static String str = "Hello World";
	static void q9(){
		changeIt(str);
		System.out.println(str);
		
	}
	//for question 9
	public static void changeIt(String s){
	//	System.out.println(Questions.str);
	//	String str="000";
		/*
		 * only inside the method does "s"
		 * refer to "Good bye wordl"
		 */
		s = "Good bye world"; 
		//str=s;
		}
	
	public static void q10(){
		int num,num2,num3;
		num=num2=num3=4;
		boolean b1 = false; 
		boolean b2= false; 
		/*
		 * b1!=b2 is asking is b1 NOT 
		 * THE SAME  as b2, this is 
		 * FALSE
		 * b2=false
		 * so
		 * if(false) will print
		 * "false"
		 */
		if (b2 = b1 != b2){
			System.out.println("true"); 
			} 
		else{
			System.out.println("false"); 
			}	
		b1=true;
		b2=true;
		/*
		 * this is CHECKING if
		 * b1 is NOT THE SAME
		 * as b2
		 */
		System.out.println(b1!=b2);
		System.out.println("b1 is "+b1);
		System.out.println("b2 is "+b2);
		/*
		 * this is ASSIGNING the value
		 * to b1 that is NOT b2
		 */
		b1=!b2;
		System.out.println("b1 is now "+b1);
		int age=18;
		b1=age!=18;
		
		if(age!=18){
			System.out.println("not 18");
		}
	}
	
	static void q11(){
		String []args={"2"};
		System.out.println(args[0]);
		int x = Integer.parseInt(args[0]);
		/*
		switch(x){
		 * the case statement
		 * is evaluating to a boolean
		 * and in the switch statement
		 * we are telling to use an int.
		 * also you can't have a boolean 
		 * as part of the case statement
		case x<5:
			System.out.println("BIG");
		break;
		case x > 5 :
			System.out.println("SMALL");
		default :
			System.out.println("CORRECT");
		break;      
		}
		*/	
	}

}
