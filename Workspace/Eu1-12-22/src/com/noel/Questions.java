package com.noel;
/*
 * this will import the Cat and 
 * the Dog class. the .* imports all the 
 * classes from this package
 * to do with question 19
 */
import com.gretb.*;

public class Questions {
	static void q12(){
		
		/*
		 * loop never executes, but it does
		 * give initial values to i and j
		 */
		  int i;
	      int j;
	      for (i = 0, j = 0; j < i; ++j, i++){
	         System.out.println(i + " " + j);
	      }
	      //prints out 0 0
	      System.out.println(i + " " + j);
	}
	
	static void q13(){
		String str1=new String("noel");
		String str2=new String("noel");
		//only at this point, does "noel" go in the pool
		String str3="noel";
		String str4="noel";
		System.out.println("checking for equalivance");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println("check str3 and str2");
		System.out.println(str3==str2);
		System.out.println("check str3 and str4");
		System.out.println(str3==str4);
		
		String hello = "Hello", lo = "lo";
		String one="Hello";
		String two="Hello";
		String three="Hello";
		
		System.out.println("testing hello");
		System.out.println(hello=="Hello");
		System.out.println(one==hello);
		System.out.println(one==two);
		System.out.println(two==three);
		/*
		 * Strings computed by constant expressions 
		 * are computed at compile time and then treated 
		 * as if they were literals. so checks the pool
		 * and see's "Hello" is already there, so same
		 * object--TRUE
		 */
		 System.out.print((hello == ("Hel"+"lo")) + " ");  
		/*
		 * Strings computed at run time are newly created 
		 * and therefore are distinct. so this prints false
		 */
	      System.out.print((hello == ("Hel"+lo)) + " ");
	      /*
	       * prints true as intern returns the string value
	       * and it checks the pool and sees that "Hello" is
	       * already there, so same object
	       */
	      System.out.println(hello == ("Hel"+lo).intern());          //line 5
		
		String a = new String("abc"); 
		String b = new String("abc"); 
		//not the same object, will print false
	//	String c="abc";
		System.out.println(a==b);
		/*
		 if they have the same value, this will
		 return true
		 */
		
		
		System.out.println(a.intern() == b.intern());;
		
		
	}
	
	static void q14(){
		int[]numArray={45,67,89};
		int[][]tdArray={{1,22,33},{44,55,66}};
		//we access two arrays with the following syntax
		/*
		 * two seperate square brackets are used to 
		 * access
		 * a two dimensional array
		 */
		System.out.println(tdArray[0][1]);
		System.out.println(numArray[1]);
	}
	
	static void q15(){
		/*
		 * this creates an array of two Strings, 
		 * and each
		 * string is null as we do not assign any
		 * values to them
		 */
		String[] arr = new String[2];
		
		try{
			/*
			 * this will generate a nullpointer exception
			 * if we try to do anything with any of the
			 * null strings contained in the array
			 */
			arr[0].length();
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
	
	static void q16(){
		Integer number=new Integer(23);
		number=number+2;
		Integer number2=number;
		System.out.println(number==number2);
		/*
		 * wrappers are immutable and final
		 * this means when you change a wrapper
		 * you are creating a BRAND NEW wrapper
		 * object
		 */
		//this creates a new wrapper number
		System.out.println(++number);
		--number;
		System.out.println("number is "+number);
		System.out.println("number2 is "+number2);
		/*
		 * they are different objects so this will
		 * print false
		 */
		System.out.println("checking same object");
		System.out.println(number==number2);
		
		System.out.println("before passing wrapper");
		System.out.println(number);
		PassValues.passWrapper(number);
		System.out.println("after passign wrapper");
		System.out.println(number);
		/*
		 * assigns one wrapper object to another
		 */
		number=number2;
		/*
		 * so they are now the same object
		 */
		System.out.println(number==number2);
		/*
		 * this is assigning a new wrapper Integer
		 * object which contains the number 23 to
		 * the wrapper reference number (autoboxing)
		 */
		number=23;
		System.out.println(number==number2);
		
		int num=10;
		int num2=100;
		//will print out 11
		System.out.println(++num);
		//will print out 100
		System.out.println(num2++);
		//will print out 101
		System.out.println(num2);
		
		num=10;
		num2=100;
		/*
		 * 10 and 101 is passed as num is passed first, then
		 * incremented, num2 is incremented first and then
		 * passed
		 */
		PassValues.takeInts(num++, ++num2);
		/*
		 * primitive variables are not changed here
		 * they are still 11 and 101 at this point
		 */
		System.out.println("num is "+num);
		System.out.println("num is "+num2);
			
	}
	
	static void q17(){
		Zebra zee=new Zebra(12);
		/*
		 * this type of construct can only be used in a 
		 * constructor, as this is calling a blank
		 * constructor in the same class, it also
		 * has to be the first statement in a 
		 * constructor
		 */
		//this();
		/*
		 * a method is only overloaded with you have
		 * different method parameters types or order
		 * of parameters
		 */	
	}
	static void q18(){
		/*
		 * variables in a interface are always 
		 * Static, Final
		 * Public
		 * we can access them by the name of
		 * the interface, followed by name of
		 * the variable
		 */
		System.out.println(Behaviour.finalInt);
		/*
		 * can't change the value
		 */
		//Behaviour.finalInt++;
	}
	static void q19(){
		/*
		 we can create a dog as there is no 
		 constructor
		 the default constructor is blank and
		 public
		 Dog(){}
		 */
		Dog spot=new Dog();
		//Cat kitty=new Cat();
		/*
		 * even though we have imported the 
		 * com.gretb package
		 * we cannot create a cat as the only 
		 * constructor in 
		 * this class has only default level 
		 * access and is
		 * not accessible outside of the package 
		 * it is in. we are currently in a different
		 * package
		 */
		//Cat tibbles = new Cat();
		/*
		 * but you can create a cat reference as
		 * you are not creating a cat with this 
		 * statement
		 */
		Cat tibbles;
		/*
		 * we can also call static methods of
		 * the class even if we can't create
		 * an object of the class
		 */
		Cat.catStat();
		//tibbles.catStat();
	
	}
	
	static void q20(){
		/*
		 * strings are immutable so any method 
		 * acting on the string does not change
		 *  it
		 */
		String str1="noel";
		System.out.println(str1.concat("Johannsen"));
		System.out.println(str1);
	}
	
	static void q21(){
		/*
		 * this is an example of covariant returns
		 */
		Animal andy=new Cow();
		andy.eat();
		/*
		 * this object does not have access to the 
		 * drink() method as this method is only 
		 * defined in the Cow class. and it only 
		 * can have methods that are first defined 
		 * in the Animal class, but it takes
		 * it's implementation from the Cow class
		 */
	}
	
	static void q22(){
		/*
		 * IllegalArgumentException extends RuntimeException: 
		 * If a parameter passed to a method is not valid. Usually 
		 * thrown by the application.  
		 * IllegalStateException extends RuntimeException:
		 * Signals that a method has been invoked at an illegal 
		 * or inappropriate time. In other words, the Java 
		 * environment or Java application is not in an appropriate 
		 * state for the requested operation. Usually thrown by 
		 * the application.
		 * java.lang.SecurityException is a runtimeException usually
		 * thrown by the application programmer
		 * SecurityException extends RuntimeException: It is thrown 
		 * by the security manager upon security violation. 
		 * For example, when a java program runs in a sandbox 
		 * (such as an applet) and it tries to use prohibited APIs
		 *  such as File I/O, the security manager throws this 
		 *  exception. Since this exception is explicitly thrown 
		 *  using the new keyword by a security manager class, 
		 *  it can be considered to be thrown by the application programmer.
		 * classCastException is runtimeexcpetion as well
		 * NullPointerException
		 * IndexOutOfBoundsException
		 */
		/*
		 * java.lang.CloneNotSupportedException extends Exception
		 * Thrown to indicate that the clone method in class 
		 * Object has been called to clone an object, but 
		 * that the object's class does not implement the 
		 * Cloneable interface. Applications that override 
		 * the clone method can also throw this exception to 
		 * indicate that an object could not or should not be cloned.
		 */
	}

}
