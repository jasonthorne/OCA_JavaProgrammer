package com.noel;

import java.util.Stack;

public class Questions {
	static void q1(){
	/*	int[]numList={23,4};
		System.out.println(numList[4]);
		*/
		
		/*
		 * Exception is a class, and this class has
		 * a constructor that takes a string, which
		 * we can use to convey messages
		 */
		Animal andy=new Animal();
		try{
			/*
			 * the eat()method throws a exception
			 * and we created the exception
			 * in the eat method with the constructor
			 * that takes a string with the string
			 * "eat exception thrown"
			 */
			andy.eat();
			/*
			 * we can throw a animalException as
			 * this class extends Exception so 
			 * it is a checked exception
			 */
			throw new animalException("animal Exception ");
		}
		catch(Exception e){
			/*
			 * this will just print out the name of the 
			 * exception as well as the message
			 */
			System.out.println(e);
			/*
			 * this is a method that prints out the
			 * StackTrace
			 */
			e.printStackTrace(); 
		}
		System.out.println("but our program can continue");
		System.out.println("the stack trace is printed when our"
				+ " program finishes");
	}
	
	static void q2(){
		byte bnum=2;
		byte bnum2=3;
		//will not work
		//byte bnum3=bnum+bnum2;
		byte bnum3=(byte)(bnum+1);
		//byte bnum3=2+3;
		int num=bnum+bnum2;
		char c=2;
		char c2=4;
		/*
		 * this will give an error
		 * as c+c2 is Widened to an int
		 * and an int can't fit inside a char
		 */
		//char c3=c+c2;
		num=5;
		char c3=5;
		bnum3=2+4;
		//as a int can't fit inside a char
		//c3=num;
		/*
		 * as soon as you do a calculation with
		 * a whole number, the product becomes an
		 * int, so c3+1, becomes a int
		 * this produces an error
		 */
		//c3=c3+1;
		//this does not
		c3=++c3;
		/*
		 * when dealing with whole numbers variables
		 /*when we do a calculation, by default the
		  * answer will always be an int, even
		  * if the calculation involves only 
		  * bytes,
		  */
		//no issue with calculations using literal numbers
		bnum=2+1;
		//results in error
		//bnum=bnum+1;
		//no error
		bnum=bnum++;
		/*
		 * bnum +bnum results in an int.
		 * bnum+bnum is WIDENED to an int
		 * so in order for this to work
		 * we have to cast the whole product
		 * to be of type byte
		 */
		//byte bnum2=bnum+bnum;
		 bnum2=(byte)(bnum+bnum);
		/*
		 * this will work as we are assigning an 
		 * int variable to an int value
		 */
		num=bnum+bnum;
		/*
		 * a char value can always be assigned to an
		 * int as an int is wider than a char
		 *a whole number can be assigned to a char
		 * but not a lon g number, even if it is only
		 * 1L, doubles or floats cannot be assigned
		 * to a char variable 
		 */
		 c=456;
		 //won't work as can't assign a long value to a char
		// c=1L;
		
	      int i;
	      c = 'a';//1
	      i = c;  //2
	      i++;    //3
	  //    c = i;  //4
	      c++;    //5
	      c=4;
	      
	    //  char newChar=1L;
	      Long lnum=1L;
	      
	     
	      //will also give an error
	    //  c=bnum;
	   //   c=snum;
	     
	     
	     
	    //  byte bnum = b + 1;
	      /*
	       * this will work as by default the calculation
	       * on the right is implicity widened to int
	       */
	 //   int num=b+1;
	   // bnum=bnum+bnum;	
	}
	
	static void q3(){
		//see in Animal file
		/*
		 * order is statics first, then
		 * called in the order they are 
		 * in file
		 * instance initialisers next,
		 * again in the order
		 * lastly constructors
		 * the method returnString is printing out
		 * the string sent to it and also returning the
		 * same string
		 */
		Order myOrder=new Order();
	}
	
	static void q4(){
		int i = 1, j = 10;
		   do {
			   /*
			    * the continue in effect is 
			    * doing nothing but confusing you
			    */
		      if (i++ > --j) 
		    	  continue;
		      /*
		       * when i is 4, i++ means that when i
		       * is next used it will be 5
		       * and then i<5 is not true and our
		       * loop will exit
		       */
		      System.out.println("i is "+i);
		      System.out.println("j is "+j);
		   } while (i < 5);
		   System.out.println("i=" + i + " j=" + j);	
		   /*
		    * final values are i=5,j=6
		    */
	}
	
	static void q5(){
		/*
		 * all wrapper classes (Except character)
		 *  have a constructor
		 * that takes a string and can convert that
		 * string to a desired data type
		 */
		Integer myInt=new Integer("123");
		Boolean myBool=new Boolean("true");
		System.out.println(myBool);
		//will not compile
		//Character myChar=new Character("a");
		/*
		 * parsers are also available for primitive data
		 * types (again except character)
		 */
		int num=Integer.parseInt("123");
		double dnum=Double.parseDouble("2.34");
		
		/*
		 * no wrapper class has a no args constructor
		 * this will not compile
		 */
		//Integer number=new Number();
		/*
		 * this will compile
		 */
		Integer number2=34;
		Double dNumber=new Double(4.56);
		/*
		 * doubleValue and intValue are NOT
		 * static methods, they are instance
		 * methods
		 * so you can't go
		 */
		//dnum=Double.doubleValue()
		/*
		 * you can only call them like the following
		 */
		dnum=dNumber.doubleValue();
		num=number2.intValue();
	
		
		/*
		Autoboxing is the automatic conversion that the 
		Java compiler makes between the primitive types 
		and their corresponding object wrapper classes. 
		For example, converting an int to an Integer, 
		a double to a Double, and so on. If the conversion 
		goes the other way, this is called unboxing.
		*/
		//unboxing
		num=number2;
		//autoboxing
		number2=num;
		/*
		 * if we go, this will work fine
		 * as unboxing occurs
		 */
		num=Integer.valueOf("34");
		/*
		 * unboxing does not need to occur here
		 * as it takes the Integer 34 and gets
		 * the intValue of this
		 */
		num=Integer.valueOf("34").intValue();	
	}
	
	static void q6(){
		/*
		 * chaining is allowed
		 */
		int i, j, k;
		i = j = k = 9;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);	
	}
	
	static void q7(){
		/*
		 * will keep going until it gets a match, which
		 * is our third option. there is no break
		 * after the third option so it will keep hitting
		 * every option after this until it gets to another
		 * break or the switch statement exits
		 */
		String input="B";
		 switch(input){
         case "a" : System.out.println( "apple" );
         case "b" : System.out.println( "bat" );
             break;
         case "B" : System.out.println( "big bat" );                
         default : System.out.println( "none" );
         /*
          * answer is "big bat
          * none"
          */
     }
	}
	
	static void q8(){/*
		An underscore can only occur in between two digits
		however this is a valid variable name
		*/
		int _123=234;
		long lnum=34_456_0L;
		//not valid
		//lnum=34_456_0_L;
		/*
		 * but a variable name cannot be made entirely of 
		 * numbers
		 */
		//int 5567=45;//will not compile
		//also not allowed
		//double dnum=3._56
		//hex
		int hexNum=0x45_b_e;
		Long longHex=0X456befab2L;
		//binary
		int bin = 0b1111_0000_1100_1100;
		//octal
		int oct=017;
	}
	static void q9(){
		/*
		 * at start of method both stacks are empty
		 * stack is another type of list not on 
		 * the exam
		 */
		Stack s1=new Stack();
		Stack s2=new Stack();
		/*
		 * so we send both our stacks to a method
		 * where a value is added to one of the stacks
		 * and one stack is put equal to anohter
		 */
		Dog spot=new Dog("spot",10);
		Dog lassie=new Dog("lassie",50);
		System.out.println("before method call");
		System.out.println("age of spot "+spot.age);
		System.out.println("age of lassie "+lassie.age);
		spot.changeDog(spot, lassie);
		System.out.println("After method call");
		System.out.println("age of spot "+spot.age);
		System.out.println("age of lassie "+lassie.age);
		/*
		 *   . Primitives are always passed by value.   
		 * . Object "references" are passed by value. 
		 * So it looks like the object is passed by reference
		 *  but actually it is the value of the reference 
		 *  that is passed.
		 *  you can't change a primitive variables in a method
		 *  you can't change what a object refers too, but you
		 *  can change the instance variables of the object
		 *  i.e the name and age of the Dog
		 *  
		 */
		
		
				
	}
	
	static void q10(){ 
		/*
		 * calls the toString()method for this class
		 * there is none so it takes the object class
		 * toString method
		 */
		Dog spot=new Dog("spot",10);
		System.out.println(spot);
		
	/* s is a string that calls the object's toString()method
		 */
		System.out.println(spot.s);
		Cat tibbles=new Cat("tibbles",45);
		/*
		 * s is a string that calls the Cat's toString()method
		 */
		System.out.println(tibbles.s);	
	}
	
	static void q11(){
		/*
		 * if we put a string equal to null and we 
		 * print it out, we get "null"
		 */
		String myStr = "good";
		char[] myCharArr = {'g', 'o', 'o', 'd' };
		String newStr = null; 
		System.out.println("our string is "+newStr);
		for(char ch : myCharArr){
			newStr = newStr + ch;
			System.out.println("newStr is now "+newStr);
			}
		System.out.println("myStr is "+myStr);
		System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
	}

}
