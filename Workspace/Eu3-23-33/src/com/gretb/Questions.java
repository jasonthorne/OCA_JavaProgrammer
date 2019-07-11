package com.gretb;

public class Questions {
	static void q23(){
		int i = 0 ;
	      boolean bool1 = true;
	      boolean bool2 = false;
	      boolean bool  = false;
	      /*
	       * && and || are short circuit operaters
	       * && if first argument is false then
	       * the second argument is not evaluated
	       * || if first argument is true then
	       * second argument is not evaluated
	       * &
	       * |
	       */
	      /*
	       * both agruments evaluated
	       */
	      bool = (bool2 &  method1("1"));  //1
	      /*
	       * bool2 is false and is short circuit
	       * argument so will not evaluate second
	       * arguement
	       */
	      bool = (bool2 && method1("2"));  
	      //both arguments evaluated
	      bool = (bool1 |  method1("3"));  //3
	      /*
	       * bool1 is true and is short circuit
	       * Argument so will not evaluate
	       * second argument
	       */
	      bool = (bool1 || method1("4")); 
		
	}
	//for question 23
	public static boolean method1(String str){
	      System.out.println(str);
	      return true;
	   }
	
	static void q24(){
		//see MyException class for explanation
		TestClass tc=new TestClass();
		try{
			tc.myMethod4();
			tc.myMethod();
			tc.myMethod2();
		//	tc.myMethod3();
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
	
	static void q25(){
		int sum = 0;
		/*
		 * sum is less than 20 at the very start so
		 * the loop never executes, so sum is 
		 * still 0
		 */
	      for (int i = 0, j = 10; sum > 20; ++i, --j)      // 1
	      {
	         sum = sum+ i + j;
	      }
	      System.out.println("Sum = " + sum);	
	}
	
	static void q26(){
		/*
		 * have to initialise a final variable
		 * see below code
		 */	
	}
	//for question 26
	   static int si = 10;
	   int  i;
	   /*
	    * as this is a final it HAS to be 
	    * initialised, if not you will
	    * get a compilation error
	    */
	   final boolean bool;
	   /*
	    * this initializer gives an initial
	    * value to our final boolean bool
	    */
	   { 
		   bool = (si > 5); 
		   i = 1000; 
		   }
	   
	   static void q27(){
		   final Dog spot=new Dog(10,"spot");
		   /*
		    * you can't change what spot refers
		    * to, but you can change the internals
		    * of spot
		    */
		   //spot=new Dog(12,"lassie");
		   spot.age=56;
		   /**
		    * COME BACK TO THIS ONE
		    */
		   final Holder a = new Holder(5);
			Holder b = new Holder(10);
			/*
			 * link is a holder object
			 * so a.link now has a value
			 * its the holder object b
			 */
			a.link = b;
			/*
			 * the link variable in the b
			 * class is at this point only
			 * a reference
			 * in the setIt()method we
			 * are assigning the b holder 
			 * link variable to a and b
			 * does not have any value
			 * so then we get a nullpointer
			 * exception
			 */
			b.link = Holder.setIt(a, b);
			try{
				System.out.println(a.link.value+" "+b.link.value); 
			}
			catch(Exception e){
				System.out.println(e);
			}
			  
	   }
	   
	   static void q28(){
		   /*
		    * see class A
		    * a overriding method cannot be less visible
		    * it has to be the same visibilty at least
		    * default/package level access has
		    * a lower visibilty than protected
		    * 
		    */
	   }
	   
	   static void q29(){
		   /*Polymorphic methods are Overridden methods
		    * Polymorphism encourages code reuse
		    * and it makes the code more dynamic as
		    * which method that is called is dependant
		    * on what type of object you have.
		    * Extension is how Polymorphism is acheieved
		    */
	   }
	   
	   static void q30(){
		   int num=2_123_567_000;
		   try{
			   //stackOverFlowError
			 //  new Questions().factorial(num);
			   /*
			    * this also generates a StackOverflowerror
			    */
			   callMe();	   
		   }
		   /*
		    * you should NEVER deal with errors in
		    * your code, this is only to display error
		    * thrown
		    */
		   catch(Error e){
			   System.out.println(e);
		   }	
		   
		   try{
			   //NullPointerException
			  // new Questions().printMe(null);
			   //classCastException
			   new Questions().m2();
		   }
		   catch(Exception e){
			   System.out.println(e);
		   }
	   }
	   //for question 30
	   int factorial(int n){
		   if(n==1) 
			   return 1;
		   else
			   /*
			    * when you get a recursive method
			    * call and no way to exit you get
			    * a stackOverflowerror
			    */
			   return n*factorial(n-1);
		   }
	   static void callMe(){
		   /*
		    * this generates a stackOverflowerror as 
		    * well
		    */
		   callMe();
	   }
	   //for second exception
	   void printMe(Object[] oa){
		   for(int i=0; i<=oa.length; i++)
			   System.out.println(oa[i]);
		   }
	   //for third exception
	   Object m1(){
		   return new Object();
		   } 
	   void m2(){ 
		   /*
		    * will generate a classCastException()
		    * casting a superclass object to be
		    * of type subclass is not allowed
		    */
		   String s = (String) m1();
		   }
	   
	   static void q31(){
		   int i = 0;
		   int j = 1;
		   /*
		    * i is 0, j is not 2
		    * this is NOT the short circuit and (&)
		    * so both sides are evaluated, if both
		    * are true then its true, so its false
		    * i then become 1 and j becomes 2
		    */
		   if( (i++ == 0) & (j++ == 2) )//false
		   {
			   i = 12;
			   }
		   //prints 1 2
		   System.out.println(i+" "+j);	   
	   }
	   
	   static void q32(){
		   Student s = new Student("Vaishali", "930012"); 
		   s.grade();
		   System.out.println(s.getName());
		   /*
		    * object originally held by s is liable
		    * for garbage collection after this point
		    */
		   s = null; //line 6
		   s = new Student("Vaishali", "930012");
		   s.grade();
		   System.out.println(s.getName());
		   s = null;	   
	   }
	   
	   static void q33(){
		   int rate = 10;
		   int t = 5;
		   /*
		    * only double or Double wrapper if it
		    * was one of the options in the question
		    * can't be float as by default this is
		    * a double (if a Double wrapper auto boxing
		    * would occur which would also be valid)
		    */
		   double amount = 1000.0;
		   for(int i=0; i<t; i++){
		      amount = amount*(1 - rate/100);
		   }
	   }
	   

}
