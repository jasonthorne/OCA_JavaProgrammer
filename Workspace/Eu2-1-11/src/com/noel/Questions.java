package com.noel;
/*
 * question 1
 * this imports all the statics of the Integer class
 * MAX_VALUE is a static final int value of the 
 * Integer class which is the max allowable value
 * for Ints
 */
import static java.lang.Integer.*;
/*
 * in question 1 we are using out.println and
 * NOT system.out.println
 * out.println is a static method in the
 * java.lang.System package
 */
import static java.lang.System.*;
//this would also have worked
//import static java.lang.Integer.MAX_VALUE;
import java.util.ArrayList;

public class Questions {
	
	static void q1(){
		/*
		 * out.prinln is a static method in the
		 * java.lang.System class
		 * MAX_VALUE is a final public static
		 * variable in java.lang.Integer class
		 */
		out.println(MAX_VALUE);
	}
	//for question 2
	/*
	 * instance variables are given default values
	 * j is given the default value 0
	 */
	private int j;
	void q2(){
		/*
		 * goes from 0 to 5 including 5
		 * so this will go 6 times
		 */
		while(j<=5){
			/*
			 * prints out 1 to 5
			 */
			for(int j=1; j <= 5;){
				System.out.print(j+" ");
				j++;
				}
			j++;
			}
		/*
		 * prints out 1 to 5 6 times
		 */	
	}
	/*
	 * for question 3
	 */
	private int id=3;
	static void q3(){
		/*
		 * to make a instance variable of a class
		 * invisible to all other classes is
		 * to mark the variable as being private.
		 * to make it readonly we need to define a
		 * public get()method for the private variable
		 * id
		 */
	}
	//for question 3
	public int getId(){
		return id;
	}
	
	static void q4(){
		ExceptionTest myTest=new ExceptionTest();
		try{
			myTest.myMethod();
		}
		/*
		 * if we just have single catch of
		 * the throwable this will work.
		 * if we have subclasses of this 
		 * in subsequent catches, this will
		 * not compile as you HAVE to put
		 * sub classes first, then 
		 * super classes and throwable
		 * is a super class of ALL exceptions
		 * and errors (you can't catch or
		 * throw an object)
		 */
		/*
		 * this will work as MyException
		 * extends throwable
		 */
		catch(MyException me){
			System.out.println(me);
		}
		catch(Throwable t){
			System.out.println(t);
		}
	
	}
	
	static void q5(){
		/*
		 * when you want to change a private variable
		 * the general accepting way of doing this
		 * is via setters
		 */
		Teacher myTeach=new Teacher();
		myTeach.setValues(2, 2);
	}
	
	static void q6(){
		Behaviour behavePerson=new Person();
		/*
		 * accesses the final static int from
		 * the Behaviour interface, not the 
		 * instance variable from the Person
		 * class
		 */
		System.out.println(behavePerson.location);
	}
	
	static void q7(){
		/*
		 * answer is double double as when you
		 * are overriding you have to have the
		 * same data types in both the parameter
		 * list and the return type (and you
		 * can't subclass 
		 */
		
		Animal andy=new Animal();
		Dog spot=new Dog().returnObj(new Dog());
		
	}
	
	static void q8(){
		int i = 0 ;
		int[] iA = {10, 20} ;
		//does whatever is in the [] brackets first
		iA[i] = i = 30 ; 
		System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i) ;
		/*
		 * will be processed as follows
		 * iA[i] = i = 30; => 
		 * iA[0] = i = 30 ;=>  
		 * i = 30; 
		 * iA[0] = i ; =>   
		 * iA[0] = 30 ;
		 */
	}
	
	static void q9(){
		OverloadingTest t1=new OverloadingTest();
		t1.method1(2);
		t1.method1(2.0);
	}
	
	static void q10(){
		/*
		 * to improve the encapsulation of a class you should
		 * make the instance variables private (or protected
		 * if you want to allow sub classes to access these
		 * variables or inherit from this class).
		 * 
		 */
		
		Student myStudent=new Student();
		//ArrayList<Integer>intList=new ArrayList<Integer>();
		//intList.add(45);
		/*
		 * both intList and scores in the student
		 * class now point to the same variables
		 * in they're lists, so we can change the
		 * list by adding to it here 
		 */
		ArrayList<Integer>intList=myStudent.changeArray();
		System.out.println(intList);
		intList.add(100000);
		/*
		 * prints out the scores arraylist
		 * and we see that 1000 is added
		 */
		myStudent.printArray();
		
	//	intList=myStudent.changeArray();
	//	System.out.println(intList);	
	}
	
	static void q11(){
		/*
		 *   if (args[0].equals("open"))          
		 * if (args[1].equals("someone"))             
		 * System.out.println("Hello!");       
		 * else System.out.println("Go away "+ args[1]);
		 */
		//open is the only string that will workd
		String myStr="closed";
		if(myStr.equals("open"))
			/*
			 * the else is associated with the second
			 * if, if "open" then the "inner" if
			 * will execute
			 */
			if(myStr.equals("someone"))
				System.out.println("hello");
			else
				System.out.println("go away");
	
		
		
	}
	

}
