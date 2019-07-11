package com.noel;

public class Questions {
	
	static void q34(){
		try 
		{
			doSomething();
			} 
		catch (Exception e) 
		{
			System.out.println(e);
				}	
	}
	//for question 34
	static void doSomething() 
	{
		int[] array = new int[4];
		/*
		 * this throws ArrayIndexOutOfBounds
		 * exceptions, so we don't get to
		 * the doSomethingElse() method
		 * call
		 */
		array[4] = 4;//exits here 
		/*
		 * this is never called so NullPointerException
		 * is never thrown
		 */
		doSomethingElse();
		}
	//for question 34
	static void doSomethingElse() 
	{
		throw new NullPointerException(
				"Sorry, can't do something else");
		}
	
	static void q35(){
		/*
		 * to ensure better encapsulation in a class
		 * we make our variables, also called fields,
		 * PRIVATE and our getter methods either 
		 * public or protected. it's depends on what
		 * your customer wants from your product
		 * whether you make the setter public, protected
		 * or even private
		 */
	}
	
	static void q36(){
		//see TestClass for explanation
		new TestClass();
	}
	
	static void q37(){
		
		int[][] a = { { 00, 01 }, { 10, 11 } };
	      int i = 99;
	      try {
	    	  /*[] done first and this generates
	    	   * an exception (method val()generates
	    	   * an exception.so the rest of
	    	   * the statment [i=1]++ is never
	    	   * executed
	    	   */
	         a[val()][i = 1]++;
	      } catch (Exception e) 
	      {
	    	  /*
	    	   * the exception is caught and 
	    	   *  i is 99 and a[1][1] is 11
	    	   *  so prints 99 11 
	    	   */
	         System.out.println( i+", "+a[1][1]);
	      }		
	}
	//for question 37
	 static int val() throws Exception {  
	     throw new Exception("unimplemented");  
	   }
	 
	 static void q38(){
		 /*
		  * see class A for examples
		  */
	 }
	 
	 static void q39(){
		 InitTest myTest=new InitTest();
		 //print a c b
	 }
	 
	 static void q40(){
		 /*
		  * package has to be the first statement 
		  * in a file and only one per file
		  * comments can come first as they are
		  * ignored by the compiler
		  * then import statements 
		  * (as many as you want)
		  * then class/interface declarations 
		  * (as many as you want)
		  */
	 }
	 
	 static void q41(){
		 //10 is unboxed and becomes the int 10
		 System.out.println(63 + new Integer(10));;
		 System.out.println("a"+'b'+63);
		 /*
		  * when you have a string
		  * everything after that is considered 
		  * a string
		  * this will print 300a26322
		  */
		 System.out.println(100+200+"a"+63+22);
		 System.out.println('b'+new Integer(63));
		 String s = 'b'+63+"a";
		 System.out.println(s);
		 
		 s=34+"a"+'b'+100+200;
		 //this will print 34ab100200
		 System.out.println(s); 
	 }
	 
	 static void q42(){
		 /*
		  * public can be accessed from outside
		  * the package by anyone and anything
		  * protected is package level access 
		  * and also available to sub classes
		  * regardless of where the sublclasses 
		  * are located
		  */
	 }
	 
	 static void q43(){
		 /*
		  * both of these references can
		  * hold an array of size 10
		  */
		 int[]myArray;
		 int myArray2[];
		 //will not work myArray has not been
		 //assigned
		 //myArray[0]=1;
		 /*
		  * size of the array is always
		  * on right hand side
		  */
		 myArray=new int[10]; 
	 }
	 
	 static void q44(){
		 /*
		  * 1+2=3
		  * 3 +String 3
		  * 33
		  */
		 System.out.println(1 + 2 + "3");
		 /*
		  * after string all become string
		  * string 1 + string 2 + string 3
		  * 123
		  */
		 System.out.println("1" + 2 + 3);
		 /*
		  * 4 is promoted to float
		  * 5.0
		  */
		 System.out.println(4 + 1.0f);
		 /*
		  * Integer divison has no decimal
		  * places and just removes everything
		  * to right of decimal place
		  * answer is 1
		  */
		 System.out.println(5/4);
		 /*
		  * both promoted to int
		  * a is 97
		  * 97 + 1=98
		  */
		 System.out.println('a' + 1 );
		 /*
		  * in a calculation the answer will
		  * be the highest variable type contained 
		  * in the calculation
		  */
		 int num=67;
		 long lnum=56;
		 /*
		  * try and make sum an int and 
		  * we get an error as a num is
		  * a int an lnum is a long
		  * and int + long = long
		  */
		// int sum=num+lnum;
		 long sum=num+lnum; 
		 double dnum=2.3;
		 float fnum=45.5f;
		 //double is bigger than a float
		 //float dSum=dnum+fnum;
		 double dSum=dnum+fnum;
		 

		 
	 }

}
