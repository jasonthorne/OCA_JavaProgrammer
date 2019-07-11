package com.noel;

import java.util.ArrayList;

public class Questions {
	
	static void q12(){
		int INT1=1;
		int INT2=3;
		/*
		 * will print out 1,2
		 */
		for(int i=INT1; i<INT2; i++)
		{
			System.out.println(i);
			}	
		INT1=1;
		INT2=3;
		//Prints out 2,3
		for(int i=INT1; i<INT2; 
				System.out.println(++i));
		INT1=1;
		INT2=3;
		//prints out 2,3
		for(int i=INT1; i++<INT2; 
				System.out.println(i));
		INT1=1;
		INT2=3;
		//prints out 1,2,3
		int i=INT1; 
		do { 
			System.out.println(i); 
			}while(i++<INT2);	
	}
	
	static void q13(){
		
		Soccer soc=new Soccer();
		Game gam=new Game();
		Game g = new Soccer();
		/*
		 * g is a soccer object so we can
		 * cast it to be of type soccer
		 */
		Soccer s = (Soccer)g;
		//gam.play();
		/*
		 * in question the calling method
		 * throws the exception so here
		 * we just place it in a try/catch
		 * block instead
		 */
		try
		{
			/*
			 * the s object has access to
			 * a play()method that takes
			 * a string and a play method
			 * that takes nothing
			 */
			g.play();
			s.play("O'Neills");
			s.play();
			//see last option	
		}
		catch(Exception e){
			System.out.println(e);
		}	
		}
	
	static void q14(){
		/*
		 * a valid method HAS to have a 
		 * return type, even it it is void
		 * void method2( ) { }
		 */	
	}
	
	static void q15(){
		/*
		 * checked exceptions are
		 * exceptional conditions external to an 
		 * application that a well written 
		 * application should anticipate and 
		 * from which it can recover.
		 * IOException
		 * 
		 * errors are
		 * exceptional conditions from which 
		 * recovery is difficult or impossible.
		 * 
		 * Generally, if the exception is caused 
		 * by problems internal to the program, 
		 * a RuntimeException is used.
		 */	
	}
	
	static void q16(){
		int x1 = -4;
		int x2 = x1--;
		System.out.println("x1 is "+x1+
				" x2 is "+x2);
		int x3 = ++x2;
		System.out.println("x1 is "+x1+
				" x2 is "+x2+" x3 is "+
				x3
				);
		//x2 is -3 x3 is -3 so not true
		if(x2 > x3){
			--x3;}
		/*
		 * so else executes
		 * x1 is -4 after this
		 */
		else{
			x1++;
			}
		//-4 -3 -3 is -10
		System.out.println(x1+x2+x3);
	}
	
	static void q17(){
		/*
		 * this is an arrayList of Double
		 * wrapper objects
		 */
		ArrayList<Double> al = new 
				ArrayList<>();
		/*
		 * the Wrapper class Double has
		 * a constructor that takes a 
		 * string, the string may be complete
		 * rubbish but this will still compile
		 * but it will throw a 
		 * NumberFormatException
		 */
		//al.add(new Double("muck"));
		al.add(new Double("1.2"));
		System.out.println(al);
		/*
		 * can't do this as 23 is 
		 * primitive int
		 */
		//Double double1=23;
		/*
		 * decimals are by default doubles
		 * and a wrapper reference can be 
		 * assigned to its primitive version
		 * i.e Double assigned to double
		 */
		Double double2=2.3;
		Byte bnumer=2;
		Short snumber=5;
		Integer number=45;
		/*
		 * can't box a int into a Double
		 * wrapper
		 */
		//al.add(23);
		al.add(1.0);
		/*
		 * will print out -1 if can't find 
		 * the value
		 */
		System.out.println(al.indexOf(1.0));
		System.out.println(al);
		System.out.println("contains harry");
		/*
		 * contains() checks if your arrayList
		 * contains a certain value
		 * can take a string or a number
		 * or a object, even though this 
		 * arraylist only has Double wrapper objects
		 */
		System.out.println(al.contains("harry"));
		Dog spot=new Dog();
		/*
		 * false as this is an arrayList of wrapper
		 * objects
		 */
		al.contains(spot);	
		/*
		 * to get the SIZE of an arraylist we use
		 * size()
		 */
		System.out.println(al.size());
		int[]numArray={34,67,89};
		/*
		 * to get the LENGTH of an array we use 
		 * length; length is not a method
		 */
		System.out.println(numArray.length);
	}
	
	static void q18(){
		TestClass tc = new TestClass();
		/*
		 * the method tester() has to return a
		 * boolean or a wrapper Boolean as 
		 * the while()condition has to evaluate
		 * to true or false
		 */
		while(tc.tester()){
			System.out.println("running...");
			}
	}
	
	static void q19(){
		/*
		 * see below methods and variables
		 */	
	}
	/*
	 * for question 19
	 */
	int num=4;
	/*
	 * can't have two variables of the
	 * same name regardless of type
	 */
	//long num=5;
	{
		/*
		 * but local variables can be 
		 * the same name, as this is a 
		 * LOCAL variables and this definition
		 * of num only applies inside these
		 * curly brackets
		 */
		int num=7;
	}
	static int statInt=5;
	void nonStat(){
		/*
		 * not static method can refer to
		 * both static and non static members
		 * of a class
		 */
		System.out.println(num);
		System.out.println(statInt);
		//nonStat2();
		//statMethod();
		//can also refer to static methods this way
		//Questions.statMethod2();
	}
	void nonStat2(){
		
	}
	static void statMethod(){
		/*
		 * static methods can only refer to
		 * static members of a class
		 */
		statMethod2();
		System.out.println(statInt);
		/*
		 * will not compile as can't
		 * refer to a non static member in
		 * a static method
		 */
		//System.out.println(num);
		/*
		 * only way to refer to a non static
		 * member in a static method
		 * is to create a object of
		 * that class and refer to the 
		 * instance variables that way
		 */
		Questions myQuestion = new Questions();
		System.out.println(myQuestion.num);	
		myQuestion.nonStat();
	}
	static void statMethod2(){
		
	}
	
	static void q20(){
		String String = "string isa string";
		System.out.println(String.substring(3, 6));
		/*
		 * will print "ing", no space after "g"
		 */
	}
	
	static void q21(){
		/*
		 * methods with no body can only
		 * be in a abstract class
		 * as they are abstract methods and
		 * a abstract method can only occur
		 * in an abstract class or an inteface
		 * also the main method is "main" not
		 * "Main", as java is case sensitive
		 * these are two different methods
		 * see below methods eat() and EAT()
		 */
	}
	/*
	 * for question 21
	 */
	void eat(){
		
	}
	void EAT(){
		
	}
	
	static void q22(){
		Object obj1 = new Object();
		Object obj2 = obj1;
		/*
		 * invokes the object class equals()method
		 * which will return true if the two references
		 * point to the same object
		 * this will print true as obj1 and obj2
		 * refer to the same object
		 */
		if( obj1.equals(obj2) ) 
			System.out.println("true");
		else
			System.out.println("false");
	}
	
}
