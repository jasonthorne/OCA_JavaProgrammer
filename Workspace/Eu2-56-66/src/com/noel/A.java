package com.noel;

public class A {
	
	A() 
	{  
		print();   
		}
	   void print() 
	   { 
		   System.out.println("A"); }
	}

	class B extends A{
	   int i =   4;
	   public static void main(String[] args){
		   /*
		    * The A constructor calls a print()method
		    * but its a B object and its the object
		    * that determines which print()method it
		    * should call so it calls the print method
		    * for the B class which prints out i, but
		    * i does not have any value yet as we are 
		    * only still in the process of creating
		    * a A object first, so it will print out
		    * 0 for i
		    * then a.print() calls the B class 
		    * print()method
		    * 
		    */
	      A a = new B();
	      a.print();
	   }
	   void print() { System.out.println(i); }

}
