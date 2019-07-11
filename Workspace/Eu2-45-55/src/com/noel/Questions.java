package com.noel;

public class Questions {
	
	/*
	 * all instance and static variables
	 * of a class are given default values
	 * for numbers it is 0
	 * boolean false
	 * char empty space
	 * and objects it's null
	 */
		int a;
	   int b = 0;
	   static int c;
	static void q45(){
		 int d;
		 //d++;
	      int e = 0;
	      e++;
	      c++;
	      /*
	       * can't go 
	       * d++ as d is a local variable and
	       * local variables are not given default
	       * values
	       */	
	}
	
	static void q46(){
		/*
		 * methods m1() and m3()are both non
		 * static methods. so to call them
		 * you first need to create an instance of
		 * class and then call them.
		 * we are inside a static method and we
		 * can't access the methods by simply
		 * going m1()as you can in a 
		 * ordinary method
		 */
		Questions myQuestion = new Questions();
		myQuestion.m1();
		myQuestion.m3();
		
		/*
		 * you cannot do the following as we are
		 * trying to access an instance method
		 * in a static way
		 */
		//Questions.m1();
		/*
		 * we can do the following as m2()is a
		 * static method 
		 */
		Questions.m2();
		/*
		 * we are inside a static method so
		 * we can go
		 */
		m2();
		/*
		 * 
		 */
	}
	//for question 46
	void m1(){
		System.out.println("m1 called");
		/*
		 * can access both static and non static
		 * methods inside a instance method
		 */
		m3();
		m2();//static method
	}
	static void m2(){
		System.out.println("static m2 called");
	}
	void m3(){
		System.out.println("m3 called");
	}
	
	static void q47(){
		/*
		 * every class does not have to have a main method
		 * main method is just all about running a program
		 * from the command line (eclipse does away with 
		 * the need to manually type in commands, what it
		 * does it that is places a shell on top of the
		 * command line prompt). there are other ways
		 * to test code in a class (Junit testing)
		 * 
		 * every class does not have to belong to a package
		 * If we do not create any packages in our program
		 * classes are placed in a 'default' package, which
		 * is not really a package at all, as you can't
		 * import from it
		 * 
		 * A package can have just one class
		 * 
		 * a class can inherit from another class
		 */	
	}
	
	static void q48(){
		int var = 20, 
				i=0;
		/*
		 * a do while loop always excutes 
		 * at least once
		 */
	      do{
	         while(true){
	        	 /*
	        	  * keeps incrementing by 1
	        	  * until its bigger than
	        	  * var
	        	  * last time it checks
	        	  * i=21 
	        	  * 21>20
	        	  * then increments i by 1
	        	  */
	         if( i++ > var) break;
	         System.out.println("i is "+i);
	         }
	         //i is now 22  
	         System.out.println(i);//i is 22 
	         //22<20
	      }while(i<var--);
	      //var is now 19
	      System.out.println(var);
	}
	
	static void q49(){
		TestClass tc=new TestClass();
		//this will work fine
		tc.m1();
		/*
		 * as will this, we are casting
		 * tc to be of a I1 reference
		 * and access the M1()method
		 */
		((I1)tc).m1();
		/*
		 * will give an error as we have VALUE
		 * in both I1 and I2, so we dont' know
		 * which one to call
		 */
		//System.out.println(tc.VALUE);
		/*
		 * we can access variables of interface
		 * by the following method as these
		 * variables are final static and public
		 */
		System.out.println(I1.VALUE);
		System.out.println(I2.VALUE);
		/*
		 * can also access the variables by casting
		 * the object to be of interface type I1
		 */
		System.out.println(((I1)tc).VALUE);
		//or casting to be of interface type I2
		System.out.println(((I2)tc).VALUE);
	}
	
	static void q50(){
		int num=0;
		while(num<4){
			//label for the for loop
		ForLoop:for(int i=0;i<6;i++){
			if(i>3)
				/*
				 * can only access the label ForLoop inside
				 * the code block
				 */
				break ForLoop;
			System.out.println("i is "+i);
		}
		num++;
		System.out.println("outside forloop");
		/*
		 * we can't access the code represented by
		 * the ForLoop label as we are outside the 
		 * code block. the below will not compile
		 */
	/*	if(num>2)
			break ForLoop;*/
		}	
	}
	
	static void q51(){
		/*
		 * our object is created and we can
		 * refer to it by obj
		 */
		Object obj = new String("aaaaa");//1      
		Object objArr[] = new Object[1]; //2 
		/*
		 * the object created in line one
		 * can now be referred to by obj
		 * and objArr[0] */
		objArr[0] = obj; //3 
		/*
		 * can now only be referred to by
		 * objArr[0] */
		obj = null;//4  
		/*
		 * the object can no longer be referred to
		 * so it is at line five the object
		 * is liable for garbage collection    
		 */
		objArr[0] = null;//5      return obj;      //6
	}
	
	static void q52(){
		/*
		 * a exception is a object
		 * every time we create a dog a exception is
		 * also created so four objects in total are
		 * created
		 */
		Dog spot=new Dog();
		Dog lassie=new Dog();
		
		System.out.println("objects created "+Dog.counter);
	}
	
	static void q53(){
		/*
		 * when other classes can see the internals of
		 * another class that is weak encapsulation
		 * as strong encapsulation is making
		 * your methods and variables private
		 * see 
		 * http://stackoverflow.com/questions/3085285/cohesion-coupling
		 * for good definitions on cohesion and coupling
		 * Java is a strongly type langauge
		 * A strongly typed language simply means that 
		 * once assigned, a given variable will always 
		 * behave as a certain type until it is reassigned
		 * . in other words you have to give every variable
		 * a type i.e Int num, int is the type
		 * other language (such as php pile of piss) is
		 * not a strongly type language as you don't have
		 * to give your variables a type.
		 */
		
		int num;
	}
	
	static void q54(){
		/*
		 * can only be one public class per file
		 * "package" has to be the first statement in
		 * a file and nothing can be before it (bar a
		 * comment)
		 * next statement that has to be a file
		 * is the import statement if any are needed
		 * then the classes and interface, enums, can be
		 * placed in any order after the import 
		 * statements
		 * this package
		 * import java.lang.*;
		 * is imported automatically but it's not an error 
		 * to include it
		 */
	}
	
	static void q55(){
		/*
		 * see A class
		 */
	}

}
