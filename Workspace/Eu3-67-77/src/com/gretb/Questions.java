package com.gretb;

public class Questions {
	/*
	 * for question 
	 * 67
	 */
	final int finalNum=45;
	final double FinalDnum;
	Questions(){
		FinalDnum=4.45;
	}
	static void q67(){
		/*
		 * a final variable HAS to be given
		 * a value at the time of creation
		 * of a object and once given a 
		 * value it CANNOT be changed
		 */
	}
	
	static void q68(){
		/*
		 * strings are immutable and cannot
		 * change whereas StringBuilders CAN
		 * change
		 */	
	}
	
	static void q69(){
		/*
		 * java.lang package is always imported
		 * automatically
		 * if there is no package statement in
		 * a file it means that the class belongs
		 * to the default package.
		 * you cannot import from the default 
		 * package into another package so you
		 * cannot access any of the classes,
		 * static or instance members contained
		 * in the default package from another
		 * package
		 */
	}
	
	static void q70(){
		/*
		 * this object only has access to
		 * a method FIRST  defined in the 
		 * Speak class. there is no
		 * Up()method in the speak
		 * class
		 */
		Speak s = new GoodSpeak();
		/*
		 * will not compile as not available
		 */
		//s.up();
		/*
		 * so you have to cast "s" it to be of
		 * type GoodSpeak or cast it to
		 * be of type inteface Tone as the
		 * GoodSpeak class implements Tone
		 */
		((Tone)s).up();
		((GoodSpeak)s).up();
		//this is also valid
		((Tone)(GoodSpeak)s).up();	
	}
	
	static void q71(){
		/*
		 * arrays of primitives are
		 * given default values
		 * for all numeric values they
		 * are all given a value of 0
		 * for boolean it's false
		 * for characters its a blank
		 * space
		 * for objects its null
		 * this is an array of 2 booleans
		 * and each is given the value of
		 * false
		 */
		boolean[] b1 = new boolean[2]; 
		boolean[] b2 = {true , false}; 
		/*
		 * b1[0] is false
		 * b2[0]is true
		 * so this is false as NOT same
		 * b1[0] == b2[0]
		 * b1[1]=false
		 * b2[1]=false
		 * so this is true as same
		 * b1[1] == b2[1]
		 */
		System.out.println( "" + (b1[0] == b2[0]) + 
				", "+ (b1[1] == b2[1])
				);
	}
	
	static void q72(){
		/*
		 * Math.random()returns a random double between
		 * 0.1 and 1.0, but not including 1.0
		 * first part of a for loop is our starting
		 * condition,second part has to evaluate
		 * to a boolean and the loop continues while
		 * this condition is true, third part of loop
		 * is what happens in each iteration of loop
		 */
		/*
		 * second part evaluates to a boolean 
		 * and this does so this does compile
		 * as long as the product of Math.random()
		 * is less than 0.5
		 */
		for(;Math.random()<0.5;){
			System.out.println("true"); 
			}
		/*
		 * Illegal third argument
		 */
	/*	for(;;Math.random()<0.5){
			System.out.println("true");}
			*/
		/*
		 * this will compile but produce
		 * a infinite loop
		 */
		/*for(;;Math.random()){
			System.out.println("true"); }
			*/
		/*
		 * a teranary operator has to return
		 * some value, and in this example
		 * it is not returning anything it
		 * is just a break and a continue
		 */
	/*	for(;;){
			Math.random()<.05? break : continue; }
			*/
	/*
	 * this is valid and will compile	
	 */
	/*	for(;;){ 
			if(Math.random()<.05) break; 
			}*/
	}
	
	static void q73(){
		/*
		 * there is no print() method in the A class
		 * so when a method is not present in a 
		 * class the compiler checks the Object 
		 * class to see if such a method exists,
		 * e.g equals()method exist in the object
		 * class. there is NO print()method in 
		 * the object class so this will not 
		 * compile. to print the contents of
		 * a object you can override the 
		 * toString()method of the object class
		 */
	}
	
	static void q74(){
		/*
		 * i is local to both for loops,
		 * however if you define a i 
		 * before you enter the for loops
		 * the for loops will try and 
		 * take the value of i from there
		 * and will not compile
		 */
		//int i=4
		for (int i = 0; i < 10; i++) 
			System.out.print(i + " ");  //1
	      for (int i = 10; i > 0; i--) 
	    	  System.out.print(i + " ");
	      /*
	       * you cannot refer to i at this point as 
	       * the two above i are only accessible in the
	       * for loops
	       */
	      /*
	       * so this is a different i, so from
	       * this point onwards we can refer to 
	       * i as this i
	       */
	      int i = 20;                  //3
	      /*
	       * if you try to refer to i before
	       * it is defined you will get an error
	       */
	      System.out.print(i + " ");   //4
	}
	
	static void q75(){
		Dog spot=new Dog();
		spot.eat();
		spot.recurMethod();
	}
	
	static void q76(){
		/*
		 * what type of constructor that is called
		 * is dependant on what type of object this
		 * is, this is a B object so it will look
		 * in the B class for a construtor that
		 * takes one String
		 */
		A b = new B("good bye");
	}
	
	static void q77(){
		
	}
	
	

}
