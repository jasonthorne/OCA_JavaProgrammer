package com.noel;

public class Questions {
	static void q12(){
		/*
		 * this line will throw an arrayIndexOutOfBounds
		 */
		int[] array = new int[10];
		array[10] = 1000;
		
	}
	
	static void q13(){
		int n=7;
		int radix = 2;
		int output = 0;
		output += radix*n;
		radix = output/radix;
		/*
		 * it should be if
		 * else if
		 * else
		 */	
	}
	
	static void q14(){
		 int x = 0;
		 /*
		  * x=3 can never be reached as
		  * while takes a boolean, so while false
		  * never executes
		  * while (false) 
		  * { x=3; }
		  */
		 if (false) { x=3; }//executes, x is now 3
		 /*
		  * do while always executed at least once
		  */
		 do{ x = 3; } while(false);
		 
		 x=0;
		 /*
		  * compiles fine
		  */
		 for( int i = 0; i< 0; i++) x = 3;	 
	}
	
	static void q15(){
		/*
		 * if we make a variable private it is not
		 * accessible outside it's own class
		 * if we make a variable with no
		 * access modifier it means it's only
		 * accessible inside it's own package
		 * (default or package level access)
		 */	
	}
	
	static void q16(){
		/*
		 * see teacher class for overloaded and overriden methods
		 * 
		 */
	}
	static void q17(){
		/*
		 * only two valid examples in this question 
		 * are
		 * java.io.FileNotFoundException
		 * and 
		 * java.lang.SecurityException
		 */
	}
	static void q18(){
		TestClass tc=new TestClass();
		/*
		 * we have three overloaded methods
		 * one takes a long, a object and 
		 * an integer. if we send a string
		 * it tries to find the closet match
		 * so it looks for a string, 
		 * can't find one, then it moves up
		 * the chain, and object is a super
		 * class of string.
		 * if we had no method that took a 
		 * object this would not compile
		 */
		tc.probe("hello there");
	}
	
	static void q19(){
		label1:for(int i=0;i<5;i++){
			System.out.println("all of the for loop "
					+ "is the label1");//label1 finishes
		}
	label2:System.out.println("label finishes at the end of "
			+ " block or at a semi colon");//label2 finishes
		
		label3:{
			int count=0;
			while(count<4){
				System.out.println("while loop");
				count++;
			}
		}//label3 finishes here	
		
		/*
		 * this question break jill is outside the block
		 * so you cannot break out of a block you 
		 * are not in
		 */
	}
	
	static void q20(){
		int k = 0;
	      int m = 0;
	      for ( int i = 0; i <= 3; i++){
	         k++;
	         if ( i == 2){
	          //  break;
	           // continue;
	           // i=m++;
	        	 i=4;
	         }    
	         m++;
	      }
	      System.out.println( k + ", " + m );
	}
	
	static void q21(){
		/*
		 * the structure of the classes in the
		 * question as follows
		 */
		/*java.lang.exception
		 * enthu.trans.ChannelException
              +-- enthu.trans.DataFloodingException, 
                    enthu.trans.FrameCollisionException
		 */
		/*
		 * a overriding method has to have the same
		 * method signature as the method it overrides
		 * (the return type can be a subclass)
		 * a overriding method can throw the same exception,
		 * a sub class of the exception or no exception
		 * at all. BUT IT CANNOT Throw a super class exception
		 */	
	}
	
	static void q22(){
		int index = 1; 
		/*
		 * in arrays of object by default
		 * every place in the array has
		 * a default value of null
		 * in array of numbers it will
		 * be zero
		 * in array of booleans it will
		 * be false
		 * in arrays of wrappers it will
		 * be null as wrappers are objects
		 */
		String[] strArr = new String[5]; 
		String myStr= strArr[index]; 
		//this is a null object
		System.out.println(myStr);
		
		System.out.println(strArr[1]);
		
		Integer[]numberList=new Integer[7];
		System.out.println(numberList[2]);	
	}

}
