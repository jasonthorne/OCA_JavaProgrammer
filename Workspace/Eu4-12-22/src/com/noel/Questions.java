package com.noel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class Questions {
	
	static void q12(){
		int c = 0;
        boolean flag = true;
        for(int i = 0; i < 3; i++){
            while(flag){
            	/*
            	 * first time in while loop
            	 * c keeps incrementing until
            	 * c>5 (c is now 6)then sets flag to 
            	 * false
            	 * then it goes to next 
            	 * iteration of the for loop
            	 * but flag is now false
            	 * so the while loop never
            	 * enters from this point
            	 */
                c++;
                if(i>c || c>5) 
                	flag = false;
            }
        }
        //c is 6
        System.out.println(c);
	}
	
	static void q13(){
		/*
		 * cannot have two methods with the same method
		 * signature in the same file
		 * method signature is a combination of name
		 * and parameter list
		 * also you cannot have a static method overriding
		 * a non static method or vice versa
		 * see TestClass
		 */
	}
	
	
	static void q14(){
		/*
		 * for is a keyword so we can't use
		 * it as the name of a label
		 */
	/*	for : for(int i = 0; i< 10; i++){
	        for (int j = 0; j< 10; j++){
	             if ( i+ j > 10 )  break for;
	        }
	        System.out.println( "hello");
	     }*/
		/*
		 * you can use the word "String"
		 * it will print hello 2 times
		 * String is not a reserved keyword
		 * but this would be confusing
		 */
		String : for(int i = 0; i< 10; i++){
	        for (int j = 0; j< 10; j++){
	             if ( i+ j > 10 )  break String;
	        }
	        System.out.println( "hello");
	     }
	}
	
	/*
	 * this is valid for an lambda as lambda only 
	 * work with interfaces that have one method
	 * in them
	 */
	interface Runner {
		public void run(); 
		}
/*	interface Behaviour{
		public void mad(int num);

		public static void sad() {
			// TODO Auto-generated method stub
			
		}
	}*/
	
	static void q15(){
/*		Behaviour behave=(a)
				->System.out.println("a is "+a);
		Behaviour behave2=(int a)
				->System.out.println("behave 2");
		Behaviour behave3=(int a)->{
			System.out.println("a is "+a);
			return;
		};*/
		/*
		 * to implement the method in the interface Runner
		 * the lambda has to have nothing in the parameter 
		 * list and return nothing
		 */
		Runner myRunner=() -> System.out.println("running1...");
		Runner myRunner2=() -> { 
			System.out.println("running2..."); 
			return; 
			/*
			 * when you are returning void from
			 * a method you can just go
			 * "return" in your method body
			 * however you CANNOT go
			 * "return void"
			 */
			};
			/*
			 * calling the two lambdas
			 */
			myRunner.run();
			myRunner2.run();	
	}
	
	static void q16(){
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 1, 0 };
		/*
		 * a is assigned the array b
		 * then goes b[3] which is 0
		 * so what is inside the [] is done 
		 * first so its a[0]
		 * and a[0] is 1
		 */
		System.out.println( a [ (a = b)[3] ] );
	}
	
	static void q17(){
		/*
		 * creating a c object calls at least one
		 * constructor in the B class (c extends b)
		 * and at least in one constructor in 
		 * class A (B extends A)
		 * there is no user defined constructor 
		 * in the B class, so the default
		 * no argument constructor is used
		 * instead(there is a method called 
		 * B that returns an int)
		 * see A class
		 */
	}
	
	static void q18(){
		/*
		 * the strucure and inheritance tree of
		 * ArrayList is as follows
		 * java.lang.Object
 			-  java.util.AbstractCollection<E>
   			-    java.util.AbstractList<E>
     		-      java.util.ArrayList<E>
     		
     		the ArrayList class implements the 
     		following
     		interfaces
     		Serializable, Cloneable, Iterable<E>, 
     		Collection<E>, List<E>, RandomAccess
		 */
		/*
		 * you can access elements of the arraylist in
		 * random order, using the get()method
		 */
		/*
		 * you do not have to specifiy the class of
		 * the objects you are storing in your 
		 * arraylist
		 */
		ArrayList myList=new ArrayList<>();
		ArrayList myList2=new ArrayList<Integer>();
		ArrayList<Integer>myList3=new ArrayList<>();
		ArrayList<Integer>myList4=new ArrayList<Integer>();
		/*
		 * ArrayList as already mentioned does implement
		 * the RandomAccess interface
		 */
		
		myList4.add(45);
		myList4.add(12);
		myList4.add(1234);
		myList4.add(2);
		System.out.println(myList4.get(0));
		/*
		 * you can use methods of
		 * the Collections methods
		 */
		System.out.println(myList4);
		Collections.reverse(myList4);
		System.out.println(myList4);
		Collections.shuffle(myList4);
		System.out.println(myList4);
		Collections.sort(myList4);
		System.out.println(myList4);
		
	//	Behaviour.sad();
			
	}
	
	static void q19(){
		/*
		 * overriding methods allow co variant 
		 * return types
		 * Overriding methods allow a subclass 
		 * of the object
		 * to be returned
		 * Overriding methods cannot return a 
		 * superclass
		 * object
		 */
	}
	
	static void q20(){
		System.out.println(getMsg((char)10));
	}
	//for question 20
	public static String getMsg(char x){
		/*
		 * strings are immuatable and cannot
		 * be changed but you can assign new
		 * values to a string
		 * msg is now "input value must be"
		 */
		String msg = "Input value must be ";
		/*
		 * msg is "input value must be"+"smaller
		 * than X"
		 * so msg is now "input value must be
		 * smaller than X"
		 */
		/*
		 * all of the remaining method calls
		 * do not effect msg as msg is a string
		 * and string cannot be changed
		 */
		msg = msg.concat("smaller than X"); 
		msg.replace('X', x); 
		String rest = " and larger than 0"; 
		msg.concat(rest);
		/*
		 * returns 
		 * "input value must be
		 * smaller than X"
		 */
		return msg;
		}
	
	static void q21(){
		
		/*
		 * default methods in a interface HAVE
		 * to have a body
		 * methods without a body in an interface
		 * are by default public and ABSTRACT
		 * 
		 */
		Account acct = new BankAccount(); 
		System.out.println(acct.getId());
		System.out.println();
	}
	
	static void q22(){
		try {
			/*
			 * this throws an checked exception so this 
			 * has to be caught or the method throws
			 * it
			 */
			PortConnector pc = new PortConnector(10);
			} 
		catch (RuntimeException re) {
				re.printStackTrace();
				}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	

}
