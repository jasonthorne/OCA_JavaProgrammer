package com.noel;

import java.util.ArrayList;
import java.util.List;

public class Questions {
	
	static void q34(){
		/*
		 * constructors cannot return anything 
		 * even void
		 * constructors have to have a body
		 * constructors can be private, public
		 * and protected BUT NOT 
		 * Final, Abstract,synchronized, 
		 * or native
		 * extra semi colons at the end of a statement
		 * are usually ignored by the compiler
		 */
		{
			System.out.println("print me");
		};;;//no need for any semi colons here, but are ignored
		System.out.println("ignored");;;;;
	}
	
	static void q35(){
		/*
		 * don't run this code on a slow machine
		 * or this will take a long time to
		 * complete
		 */
		int x = 10;/*
			 * this keeps decreasing, so will
			 * keep going until it reaches
			 * the min_value which is
			 * -2147483648
			 * when you try to apply the 
			 * decrement operator on this number
			 * it Flips the number
			 */
		x=10;
		do{	
			//x--;
			x=x-1000000;
			System.out.println(x);  // 1
		}while(x<10);
		
		
		/*
		 * this keeps flipping
		 */
		
		System.out.println("max is "+Integer.MAX_VALUE);
		System.out.println("min is "+Integer.MIN_VALUE);
		x=-2147483648;
		x--;
		System.out.println(x);//goes to 2147483647
		x++;
		System.out.println(x);//goes to -2147483648
		x--;
		System.out.println(x);//goes to 2147483647
		
		
	}
	
	private int side=4;
	private static int stats=5;
	static void q36(){
		/*
		 * can only access static variables inside a
		 * static method
		 */
		System.out.println(stats);
		/*
		 * can't access a instance variable like
		 * so inside a static method
		 */
		//System.out.println(side);
		/*
		 * have to create an instance of the Questions
		 * class to access this variable
		 */
		Questions myQuestions=new Questions();
		System.out.println(myQuestions.side);	
	}
	
	static void q37(){
		int expr1 = 3 + 5 * 9 - 7;//41
		int expr2 = 3 + (5 * 9) - 7;//41
		int expr3 = 3 + 5 * (9 - 7);//13
		int expr4 = (3 + 5) * 9 - 7;//65
	}
	
	static void q38(){
		/*
		 * strings are immutable
		 * StringBuilder are mutable
		 */
		String s = "hell";
		StringBuilder sb = new StringBuilder("well");
		s.replace('h', 's');
		sb.append("o");//wello
		System.out.println(s + sb);//hellwello
	}
	
	static void q39(){
		Animal andy=new Animal();
		Animal animDog=new Dog();
		Behaviour beCat=new Cat();
		/*
		 * getClass()gets the class of the object
		 */
		System.out.println(andy.getClass());//animal class
		System.out.println(animDog.getClass());//Dog class
		System.out.println(beCat.getClass());//cat class
		//just gets the class name
		System.out.println(beCat.getClass()
				.getSimpleName());
		
		List<String> list = new ArrayList<>();//ArrayList object
		StringBuilder sb = new StringBuilder("mrx"); 
		/*
		 * toString method returns a string, so
		 * this is a String object
		 */
		String s = sb.toString();//String object 
		list.add(s);
		System.out.println(s.getClass());//String class
		System.out.println(list.getClass());//ArrayList class
		System.out.println(sb.getClass());//stringBuilder
	}
	
	static void q40(){
		Integer i = new Integer(42); 
		Long ln = new Long(42); 
		Double d = new Double(42.0);
		/*
		 * can't compare two different classes to
		 * see if they are the same object
		 */
		/*
		 * none will compile
		i==ln;
		d==ln;
		i==d;
		*/
		/*
		 * will compile but will print false
		 * as when different classes equals()
		 * always returns false even if they
		 * contain the same number
		 */
		System.out.println(i.equals(d));
		/*
		 * autoBoxing occurs here, so 42 is 
		 * boxed in an Integer object,
		 * so comparing an Integer to a Long
		 * which will return false
		 */
		
		System.out.println(ln.equals(42));
		
		/*
		 * will return true as the autoboxed
		 * wrapper object containing 42 is
		 * an Integer
		 */
		System.out.println(i.equals(42));
	}
	
	static void q41(){
		/*
		 * will not compile as while loop expression
		 * has to take a boolean
		 */
		int k = 2;
	/*	while(--k)
		{
			System.out.println(k);         
			}*/
	}
	
	static void q42()throws Exception{
		int[] a = null;
		/*
		 * 
		 * what is inside the []brackets is 
		 * first evaluated before everything
		 * else, M1 throws a Exception
		 * which the q42()method throws
		 * it out to main where it is 
		 * dealt with in a try/catch block
		 */
		int i = a [m1()];
		//this will generate a NullPointerException
		//int i=a[0];
		//System.out.println(a[0]);
		
	}
	//for question 42
	public static int m1() throws Exception
	{
		throw new Exception("Some Exception");
		}
	
	static void q43(){
		/*
		 * all wrapper classes are final and 
		 * can't be extended
		 * the Number class is NOT final so
		 * this can be extended. All wrapper
		 * number classes(Integer,Byte, Short,
		 * Double, Float) all extend the Number
		 * class.
		 * String is a final class
		 * StringBuilder is a final class
		 * System is a final class
		 * ArrayList is NOT final
		 * Array is Final
		 */
	}
	//for question 44
	int x=4;
	static void q44(){
		
		{//this X shadows the instance variable x
			int x=0;
			System.out.println("local x is "+x);
			Questions myQuestion=new Questions();
			int y=myQuestion.getX();
			System.out.println("instance variable x "+y);			
		}	
	}
	//for question 44
	int getX(){
		return x;
	}
	
}
