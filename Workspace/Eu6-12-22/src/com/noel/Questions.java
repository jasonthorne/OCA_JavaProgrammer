package com.noel;

public class Questions {
	
	static void q12(){
		/*
		 * exceptions are a mechanism that are 
		 * all about what to do when something
		 * out of the ordinary,unexcpeted
		 *  or exceptional happens.
		 *  Exceptions also allows you to "log"
		 *  the details of the exception (the details
		 *  can be printed out or saved to a file 
		 *  for further investigation)
		 *  They ARE NOT for dealing with unexpected
		 *  inputs from a user of the program(use
		 *  other mechanisms for this, something as
		 *  simple as an IF statement can do this)
		 *  Exceptions are also not About keeping
		 *  the program running when something 
		 *  unexpected happens, they are a way 
		 *  to keep these exceptional conditions
		 *  seperate from the rest of your program.
		 *  If in a try/catch block or the calling
		 *  method throws the exception to another
		 *  method that takes care of the exception
		 *  the program will NOT exit
		 *  
		 */
	}
	
	static void q13(){
		/*
		 * java.lang.RuntimeException   
		 * +-------- IndexOutOfBoundsException                   
		 * 		+---------ArrayIndexOutOfBoundsException, 
		 *		 StringIndexOutOfBoundsException
		 */
		/*
		 * ArrayIndexOutOfBounds and 
		 * StringIndexOutOfBoundsException
		 * are both RuntimeException so they do not 
		 * have to be dealt with, so no need to have
		 * a try catch block or the method does not
		 * need a "throws" clause in the method
		 * signature, but you CAN but you don't
		 * HAVE TO
		 */	
	}
	
	static void q14(){
		/*
		 * encapsulation means your variables
		 * are declared private and public 
		 * getter and setter methods are
		 * provided to access and change
		 * the values if needed
		 */
	}
	
	static void q15(){
		//see AX class
		try{
			/*
			 * this will not create
			 * a AX object as a error
			 * or an arrayIndexOutOfBounds
			 * exception is generated
			 */
			AX ax=new AX();
		}
		catch(Exception e){
			System.out.println("exception "+e);	
		}
		catch(Throwable t){
			System.out.println(t);
		}
		System.out.println("print me out");	
	}
	/*
	 * this will compile fine provided whatever
	 * is calling this method is either
	 * in a try/catch block or also has
	 * a throws clause in the method
	 * signature
	 */
	static void q16()throws SomeThrowable{
		try{
			m1();
			}
		catch(SomeThrowable e){
				throw e;
				}
		finally
		{
			System.out.println("Done");
		}
	}
	//for question 16
	public static void m1() throws MyThrowable{
		throw new MyThrowable();
		}
	
	static void q17(){
		/*
		 * the instance variable w of
		 * the w class is given an 
		 * initial value of 10 when
		 * you create a wrapper 
		 * object
		 */
		Wrapper w = new Wrapper();
        w.w = 20;
        changeWrapper(w);
        /*
         * after the method call
         * w still refers to the original
         * w, so it still has the 
         * value w.w=20
         * so here we are going
         * w.w=20+30
         * w.w=50
         */
        w.w += 30;
        System.out.println(w.w);
        /*
         * the changeWrapper()method
         * returns a NEW object
         * with 9 added onto the
         * original value of the w
         * instance variable, which
         * was 10, so its 
         * w.w=10+9
         * w.w=19
         */
        w = changeWrapper(w);
        System.out.println(w.w);	
	}
	//for question 17
	static Wrapper changeWrapper(Wrapper w){
	    w = new Wrapper();
	    w.w += 9;
	    return w;
	    }
	
	static void q18(){
		/*
		 * arrays are SET at time of creation
		 * and CANNOT change length
		 * Arrays can have both primitive and
		 * objects contained within them
		 * Each array has a "length" built
		 * in property, this is NOT a method
		 * size()is method and for ArrayList
		 * array numbering starts at 0
		 */	
	}
	
	static void q19(){
		try{
			/*
			 * the reference is checked at compile
			 * time, the object is checked at runtime
			 * so it can see that the play() method
			 * in the Game class throws an exception.
			 * but the method actually calls the
			 * play()method from the Soccer class
			 * which does not throw an exception 
			 */
			Game g = new Soccer();
		       g.play();
		}catch(Exception e)
		{
			System.out.println(e);
		}	
	}
	
	static void q20(){
		/*
		 * simulating running a program from the
		 * command line prompt
		 * the command is java TestClass 1 2 3
		 */
		String[]args={"1","2","3"};
		//will print out Values :1 2
		System.out.println("Values : "+args[0]+
				args[1]);	
	}
	
	static void q21(){
		/*
		 * see A class for explanation
		 */		
	}
	
	static void q22(){
		/*
		 * valid as long as its positive integer
		 * less than 65000 approx
		 */
		char c = 320;
		//an int can fit inside a float
		float f = 320;
		/*
		 * if we have a decimal point 
		 * by default it is a double
		 * so we have to cast it
		 */
		f=3.45f;
		/*
		 * an int can fit inside a double
		 */
		double d=340;
		/*
		 * a float can fit inside a double
		 */
		d=f;
		/*
		 * but a double cannot fit inside an
		 * float as it is "bigger"
		 */
		//f=d;
		/*
		 * byte only goes from -127 to 128
		 * so outside that range will not 
		 * compile
		 */
		//byte b=320;
		/*
		 * you can cast it but the
		 * number is NOT 320
		 */
		byte b=(byte)320;
		System.out.println(b);
		/*
		 * both floats so the answer
		 * will be a float
		 */
		f=22.2f*1.2f;
		/*
		 * this will not compile
		 * as the sum defaults to the
		 * largest data type in the 
		 * equation, which is a double.
		 * 22.3 is by default a double
		 */
		//f=22.3*1.2f;
		d=22.3*1.2f;
	}

}
