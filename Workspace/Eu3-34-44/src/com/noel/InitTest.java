package com.noel;

public class InitTest {
	/*
	 * static intiialisers called first
	 * and in whatever order they are 
	 * in the file.
	 * next comes instance initialisers,
	 * instance initialisers can intialise both
	 * static and non statics
	 */
	static String s1 = sM1("a");//called first
	int num=5;
	//instance initialiser
	{
	      s1 = sM1("b");//called third
	      num=5;
	   }
	//static intializer
	static{
	      s1 = sM1("c");//called second
	      /*
	       * can't initialise a instance variables
	       * in a instance initialiser
	       */
	  //    num=6;
	   }
	   
	   private static String sM1(String s){
		      System.out.println(s);  
		      return s;
		      }

}
