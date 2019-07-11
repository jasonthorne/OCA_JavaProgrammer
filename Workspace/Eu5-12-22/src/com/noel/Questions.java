package com.noel;

import java.util.ArrayList;
import java.util.List;

public class Questions {
	static void q12(){
		//an ArrayList of objects
		List list = new ArrayList();
		   list.add("val1"); //1
		   /*
		    * this throws IndexOutOfBoundsException
		    * as this position does not exist yet
		    */
		   //list.add(2, "val2"); //2
		   list.add(1,"val3"); //3
		   //will add at position 0
		   list.add(0,"val4");
		   System.out.println(list);
	}
	
	static void q13(){
		String myStr="well hello";
		String myStr2=" there";
		String str3=myStr+myStr2;
		str3+=myStr;
		str3=str3+myStr;
		System.out.println(str3.length());
		/*
		 * can't go str3++
		 * or str3*myStr
		 * str3-myStr
		 */
	}
	int k=5;
	static void q14(){
	//	new Questions.
		new Questions().printThem();
		
	}
	public boolean checkIt(int k){
		/*
		 * this is decrementing k after it
		 * comparing it to 0
		 * but this is shadowing the instance
		 * variable k, so this is a Local
		 * variable k which will always
		 * be 5 each time it is called
		 * so k-- is never greater 
		 * than 0
		 */
		return k-- >0?true:false;
		}
	
	public void printThem(){
		/*
		 * this will result in an 
		 * infinite loop as k does
		 * not change and keeps sending 
		 * 5 to the method
		 */
		while(checkIt(k)){
			System.out.print(k);
			/*
			 * if you decement the instance
			 * variable k by 1 each time
			 * then this will execute
			 */
		//	System.out.print(k--);
			}
		}
	
	static void q15(){
		/*
		 * id is in the Super class
		 * so java does not need to run
		 * the Sub class at all to access
		 * the variable, so the static
		 * instance initialser is NOT
		 * called
		 */
		//Statics myStatics=new Statics();
		//Statics myStatics2=new Statics();
		//System.out.println(Statics.statNum);
		System.out.println(Sub.ID);
		System.out.println(Super.ID);
		//System.out.println(new Sub());
	}
	
	static void q16(){
		/*
		 * see below for explanation
		 */	
	}
	//for question 16
	/*
	 * return type has to be double 
	 */
	public double methodX( byte by){
	    double d = 10.0;
	    /*
	     * we are only casting "by" to
	     * be a long, we are then dividing
	     * by d which is a double, so 
	     * in a calculation the result
	     * is promoted to the highest
	     * data value
	     * */
	    return (long)by /d*3;
	}
	
	static void q17(){
		new Questions().m1();
	}
	/*
	 * for question 17
	 */
	/*
	 * given the default value of 0
	 */
	char c;
    public void m1(){
        char[ ] cA = { 'a' , 'b'};
        /*
         * after this method call the
         * variable char c is still ''
         * which when we convert to an
         * int is 0, as a primitive
         * variable is passed by VALUE
         * so the value here does not
         * change, it is ONLY changed
         * inside method m2()
         * cA[0] and cA[1] now have the
         * value of 'm' as when we change
         * these values in method m2(), 
         * they are also changed here in method
         * m1()
         */
        m2(c, cA);
        /*
         * will print out 0,m
         */
        System.out.println( ( (int)c)  + "," + cA[1] );
    }
    public void m2(char c, char[ ] cA){
    	/*
    	 * the character c is only 'b'
    	 * inside this method, it is 
    	 * not changed from it's original
    	 * value of '' in method m1()
    	 */
        c = 'b';
        /*
         * values contained within array 
         * are passed by REFERENCE, so
         * if you change one of these values
         * the changes ARE reflected in
         * the method m1()
         */
        cA[1] = cA[0] = 'm';
    }
    
    static void q18(){
    	char i;
        LOOP: for (i=0;i<5;i++){
        	/*
        	 * first time in loop i is
        	 * 0, it does not hit on 
        	 * anything, nothing printed out 
        	 * ('0' is a character), but
        	 * i is now 1 as after the switch
        	 * i increments by 1, the loop now
        	 * also increments by 1, so i is now
        	 * 2, will print out "C",
        	 * i goes through the same process
        	 * and has 2 added to it and becomes
        	 * 4, prints "E"(notice how one of the
        	 * options is NOT "E"), there is 
        	 * no break after case 4 so it falls
        	 * through to print "F"
        	 * i is incremented by 2 again so
        	 * i=6 and 6 >5 and the for loop
        	 * exits
        	 * prints C E F
        	 */ 
        	char myChar=0;
            switch(i++){
                case '0': System.out.println("A");
                case 1: System.out.println("B"); 
                break LOOP;
                case 2: System.out.println("C"); 
                break;
                case 3: System.out.println("D"); 
                break;
                case 4: System.out.println("E");
                case 'E' : System.out.println("F");
            }
        }   	
    }
    
    static void q19(){
    	//see runnable interface
    	A a = new A() ;
    	B b = new B();
    	
    	Object o = a;
    	
    	Runnable myR=a;
    	/*
    	 * compiler does not know that o
    	 * can implement the runnable 
    	 * interface so you have to explicitly
    	 * cast it
    	 */
    	//Runnable r = o;
    	Runnable r=(Runnable)o;
    	/*
    	 * this will compile
    	 */
    	o=a;
    	/*
    	 * but this will generate a class
    	 * cast exception as the o object
    	 * does not implement the Observer
    	 * interface
    	 */
    	Observer ob = (Observer) o ;
    	/*
    	 * same problem as option 1
    	 * you have to cast o to be 
    	 * of type Observer
    	 */
    	o = b; 
    	//will not compile
    	//Observer o2 = o;
    	//have to cast this
    	Observer o2 = (Observer)o;
    	/*
    	 * this will compile as a b is a
    	 * subclass of the A class and the
    	 * A class implements the Runnable
    	 * interface
    	 */
    	r = (Runnable) b;
    }
    
    static void q20(){
    	TestClass tc = new TestClass();
    	/*
    	 * can refer to a static variable
    	 * in an interface in the following ways
    	 * the first is accessing a static
    	 * variable in a non static way
    	 * (and not generally recommended)
    	 */
    	System.out.println(tc.INTERNUM);
    	/*
    	 * this is referring to a static
    	 * variable in an interface in a
    	 * static way, the name of the 
    	 * interface+the name of the static
    	 * variable in the interface
    	 */
    	System.out.println(T1.INTERNUM);
    	/*
    	 * accessing a static interface variable
    	 * in a static way and using the class
    	 * that implements the T1 interface
    	 */
    	System.out.println(TestClass.INTERNUM);
    	/*
    	 * this is not ambigious as this is 
    	 * accessing the VALUE static variable
    	 * in the T1 interface
    	 */
    	System.out.println(T1.VALUE);
    	/*
    	 * does not know which VALUE to use
    	 * as both interfaces t1 and t2 
    	 * have a static variable VALUE 
    	 * and testClass implements
    	 * both interfaces
    	 */
    	//System.out.println(TestClass.VALUE);
    	//System.out.println(tc.VALUE);
    	/*
    	 * so we have to cast it and this
    	 * tells the compiler we are taking 
    	 * the VALUE static from the T1
    	 * interface
    	 */
    	System.out.println(( (T1) tc).VALUE);
    	//System.out.println((T1)tc.VALUE);
    }
    
    static void q21(){
    	
    	Animal andy=new Animal();
    	Dog spot=new Dog();
    	spot.eat();
    	try{
    		andy.eat();
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
    	
    	/*
    	 * every java program that is 
    	 * run has two distinct steps in 
    	 * this order
    	 * 1 compile time
    	 * 2 runtime
   	 At compile time the compiler 
   	 has to check to see does Animal
   	 have a eat() method, it does, but it also
   	 see's that the method signature throws an
   	 expecption, and its only at runtime that
   	 the eat() method for the dog class is called.
   	 So that is why this has to be enclosed in 
   	 try catch block
   	 */
    	Animal aDog=new Dog();
    	//aDog.eat();
    	try{
    		aDog.eat();
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
    	/*
    	 * this tells the compiler at compiler
    	 * time that this is a Dog object and
    	 * to compile and then use the eat()
    	 * method from the Dog class
    	 */
    	((Dog)aDog).eat();	
    }
    
    static void q22(){
    	TestClass tc = new TestClass(); //3       
    	MyClass x = tc.getMyClassObject(); //4       
    	System.out.println("got myclass object"); //5 
    	/*
    	 * line 4 calls the getMyClassObject()
    	 * method that creates a new MyClass
    	 * object returns it and assigns it
    	 * to x
    	 * line 6 then assigns a new MyClass
    	 * object to x, so the original object
    	 * x referred now can no longer be
    	 * referenced so it is liable for
    	 * garbage collection at this point      
    	 */
    	x = new MyClass(); //6       
    	System.out.println("done"); //7
    }
}
