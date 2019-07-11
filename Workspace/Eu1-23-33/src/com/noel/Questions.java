package com.noel;

public class Questions {
	static void q23(){
		/*
		 * can access variables the following
		 *  way
		 *  this will print out 100
		 */
		System.out.println(new Cow().age);
	}
	
	static void q24(){
		String str1 = "one"; 
		String str2 = "two"; 
		/*
		 * first str1 on left is evaluated, the value of 
		 * str1 is "one"
		 * then we do the equals part, 
		 * str1 now references
		 * str2. so str2 is now two and 
		 * one.equals.two is false
		 */
		System.out.println( str1.equals(str1=str2) );
	}
	
	static void q25(){
		/*
		 * break 
		 * breaks out of the loop
		 * continue
		 * breaks out of the current iteration
		 */
		String[] sa = {"a", "b", "c"};
		for(String s :sa){
			//the sys out is not part of the if
			if("b".equals(s)) continue; 
			System.out.println(s); 
			//the sys out is not part of the if
			if("b".equals(s)) break; 
			System.out.println(s+" again");
			/*
			 * prints 
			 * a
			 * a again
			 * c
			 * c again
			 * 
			 */
		}
	}
	
	static void q26()throws Exception{	
		try{
			/*
			 * the method m1()throws a checked exception
			 * and we place the call to the method in
			 * a try block, however the exception is
			 * not dealt with in the finally block.
			 * so the method q26()throws out the exception
			 * where it is deal with in the main in a try
			 * catch block. if the call in main()was not 
			 * in a try catch block, then the main method
			 * would also have to throw the exception back
			 * to the compiler which would crash the programs
			 */
			m1();
			System.out.println("A");
			}
		finally{
			/*
			 * a finally block is always executed, so this 
			 * will print "print b" and then print the 
			 * exception
			 */
			System.out.println(" print B");
			}	
	}
	//part of question 26
	static void m1()throws Exception{
		throw new Exception();
	}
	
	static void q27(){
		double dnum=2.49;
		float fnum=3.45f;
		/*
		 * rounds to the nearest integer
		 */
		//return a long
		System.out.println(Math.round(dnum));
		//return a int
		System.out.println(Math.round(fnum));
		
		String str="--0.50";
		/*
		 * round looks like this
		 * if we pass it a double it returns a long
		 * long round(double d)
		 * if we pass it a float it returns a int
			int round(float f)
		 */
		/*
		 * so the round()method here returns a long as it
		 * takes a double so we then have to cast it to be
		 * of type int
		 *///a long is produced of 0, 
		//so we have to cast it to be of type int
		int choice=(int)Math.round(
				//this produces a double 0.0
				Double.parseDouble(
						//will give us a string "-0.5"
						str.substring(
								//goes from position 1 to position 5
								1, str.length()-1)) );
		
		   switch(choice)
		   {
		      case 0 : System.out.print("Hello ");
		      case 1 : System.out.print("World"); break;
		      default : System.out.print("Good Bye");
		    }
	}
	
	static void q28(){
		/*
		 * see Calculate class for question 28
		 * we can have a main inside a abstarct class
		 */
	}
	static void q29(){
		/*
		 * variables are shadowed 
		 * methods are overriden
		 */
		Animal andyHeifer=new Heifer();
		/*
		 * cast andyHeifer to be of type cow so then 
		 * it takes its implementation of the 
		 * eat method from the Cow class
		 * but it takes the variable value of age
		 * from the Animal class
		 */
		Cow bessie=(Cow)andyHeifer;	
		/*
		 * can't go as andyHeifer is not a cow
		 * which is why we have to cast it
		 */
		//Cow daisy=andyHeifer;
		andyHeifer.eat();
		bessie.eat();
		//takes age from animal which is 10
		System.out.println(andyHeifer.age);
		//takes age from cow which is 100
		System.out.println(bessie.age);
		
		A o1 = new C( );
		B o2 = (B) o1;
		System.out.println(o1.m1( ) );
		System.out.println(o2.i );
	}
	/**
	 * COME BACK TO THIS ONE******************
	 */
	static void q30(){
		int[]numArray={100,33};
		int index = 1;
		try{
			/*
			 * setting the valule of index to 0
			 * FIRST, then it checks for the 
			 * first element in our array
			 */
			System.out.println(numArray[index=0]);
			/*
			 * will do the array reference 
			 * part FIRST
			 */
			numArray[index=44]++;
			//numArray[index=6]=56;
			}
		catch (Exception e)
		{
			System.out.println("exception caught "+e);
		}//empty catch       
		System.out.println("index = " + index);
	}
	static void q31(){
		 boolean b1 = false; boolean b2 = false; 
		 /*
		  * pay careful attention to the syntax
		  * b1
		  */
		 System.out.println(!b2);//will print true
		 System.out.println(b2);
		 /*
		  * = has a lower precdence so (has lowest precedence)
		  * so this is evaluated first
		  * b2 !=b1
		  */
		 System.out.println("b1 is "+b1);
		 System.out.println("b2 is "+b2);
		 //this is checking value
		 System.out.println("Equal"+(b2 !=b1));//will print false
		 System.out.println("b1 is "+b1);
		 System.out.println("b2 is "+b2);
		 //this is assigning a value to b2
		 b2=!b1;
		 System.out.println("b2 is now "+b2);
		 /*
		  * you can't then have a value on the left
		  * what you have is
		  * false= !b2;
		  */
		
/*		 if (b2 != b1 = !b2){
			 System.out.println("true"); } 
		 else{
			 System.out.println("false"); }
			
	}*/
		 if (b2 != (b1 = !b2)){
			 System.out.println("true"); } 
		 else{
			 System.out.println("false"); }
			
	} 
	/*
	 * statics can be accessed from inside static
	 * and non static block{}
	 * instance variables can only be accessed
	 * inside a non static block{}
	 */
	private static int loop = 15 ;
    static final int INTERVAL = 10 ;
    //instance variable
    boolean flag ;
    static {System.out.println("Static"); }
    static { loop = 1; }
    /*
     * can't access instance variables in
     * a static block
     */
    static { loop += INTERVAL;
    	/*flag=4;*/}
    /*
     * can access statics and non statics
     * in a non static block
     */ 
    { flag = true; loop = 0; }
	static void q32(){
		//comment out above for question 32
		
	}
	
	static void q33(){
		/*
		 * notice in this question it is a StringBuilder
		 * and something called a stringWrapper, which
		 * is a class of your own making
		 */
		StringWrapper sw = new StringWrapper(
				"How are you?");
		StringBuilder sb = new StringBuilder(
				"How are you?");
		/*
		 * sw is a stringWrapper object so it will look 
		 * in the 
		 * class for a toString method, there is none, 
		 * so it
		 * uses the object class toString()method which just
		 * prints out the address of the object
		 */
		System.out.println("Hello, "+sw);
		/*
		 * this will print the "hello how are you"
		 */
		System.out.println("Hello, "+sb);
	}

	

}
