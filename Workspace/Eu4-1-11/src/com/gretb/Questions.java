package com.gretb;

public class Questions {
	
	static void q1(){
		/*
		 * java does not allowed CHAINED INITIALISATION
		 */
		/*
		 * chaining to use a value of a variable
		 *  is NOT allowed when you are creating 
		 *  and defining a variable
		 */
		//int a=b=c=10;
		int num=10,num2=34,num3=567;
		/*
		 * first declaring a variable and THEN
		 * giving the variable a value is 
		 * the correct way to do this
		 */
		int a, b, c; 
		a = b = c = 100;
		Dog spot;
		Dog lassie;
		Dog rex;
		spot=new Dog();
		lassie=rex=spot;
		/*
		 * this is allowed as you are not chaining
		 * a value, but declaring three variables
		 * and only giving a value to c
		 */
		//int a, b, c=100;
		/*
		 * this is allowed as declaring three
		 * int variables and only giving a value
		 * to the variable 'a'
		 */
		//int a=100, b, c;
		/*
		 * not allowed as this is chained 
		 * Initialisation
		 */
		//int a= 100 = b = c;
	}
	
	static void q2(){
		B b = new B(); 
		/*
		 * this is the fi variable in the B class
		 * which is not final and we can change
		 * and reassign values to
		 */
		b.fi = 20;
		//will print 20
		System.out.println(b.fi);
		/*
		 * here we are casting our b object to
		 * be of type A, A is a superclass
		 * of class B so we CAN do this.
		 * this accesses the fi varable
		 * from the A class
		 * will print 10
		 */
		System.out.println(((A)b).fi);
		//((A)b).fi;
		/*
		 * this is casting the method call
		 * b.fi to be of type A, and this will
		 * not work a b.fi is an int
		 */
		//(A)b.fi;
		A myBa=new B();
		/*
		 * calls the fi variable from the
		 * superclass A reference and myMethod() from
		 * the sub class B object
		 */
		System.out.println(myBa.fi);
		myBa.myMethod();
		
	}
	
	static void q3(){
		int index=3;
		int[]numArray={3,67,89};
		
		for(int i:numArray){
			if(index==3)
				/*
				 * if index is 3 break out of the loop
				 */
				break;
			else
				/*
				 * else break out of the current
				 * iteration of the loop, skips
				 * the rest of this loop
				 */
				continue;
			/*
			 * which means that this code can 
			 * NEVER be executed as ALWAYS we 
			 * either exit the loop or skip 
			 * this part the loop
			 */
		//	System.out.println("unreachable");
		}
	}
	
	static void q4(){
		/*
		 * this is a asymetric two dimensional array
		 * first row is of length 3
		 * second row is length 4
		 * third row is length 3
		 */
		int[][] twoD = { 
				{ 1, 2, 3} , 
				{ 4, 5, 6, 7}, 
				{ 8, 9, 10 } 
				};
		/*
		 * will get the length of the second row
		 */
		System.out.println(twoD[1].length);
		/*
		 * checks if this is an array,
		 * will print true
		 */
		System.out.println(twoD[2].getClass().isArray());
		/*
		 * will not compile as this is a primitive 
		 * variable and and not a class
		 */
		//System.out.println(twoD[2][1].getClass());
		/*
		 * these will both return class[i
		 * which is an array of ints
		 */
		System.out.println(twoD[2].getClass());
		int[]numArray={5,7,9};
		System.out.println(numArray.getClass());
		Dog[]dogList={new Dog(),new Dog()};
		/*
		 * will print out
		 *class [Lcom.gretb.Dog;
		 */
		System.out.println(dogList.getClass());
		String[]strList={"banana","orange"};
		System.out.println(strList.getClass());
		/*
		 * this is an int, it will print out
		 * value contained in the second row
		 * third column, which is 6
		 */
		System.out.println(twoD[1][2]);
	}
	
	static void q5(){
		int i1 = 1, i2 = 2, i3 = 3;
		/*
		 * do what is in the brackets first
		 * so it assigns the value of i3 to
		 * i2, so i2 is now 3 which is added
		 * to i1, which is 1
		 * so its
		 * i4=1+3
		 * i4=4 
		 */
		int i4 = i1 + (i2=i3 );
		//will print 4
		System.out.println(i4);
		
		i1=1;
		i2=2;
		i3=3;
		
		int i5=i2+(i2=i3);
		System.out.println(i5);
	}
	
	static void q6(){
		//true
		System.out.println("hello world".equals
				("hello world"));
		//true
		System.out.println("HELLO world".
				equalsIgnoreCase("hello world"));
		//true
		System.out.println(" hello".concat(" world").
				trim().equals("hello world"));
		/*
		 * if they are the same (including case) 
		 * compareTo returns 0
		 * compareTo() does a lexicographical 
		 * (like a dictionary) comparison. 
		 * It stops at the first place where the strings 
		 * have different letters.
		 */
		System.out.println("hello world".
				compareTo("Hello world") < 0);
		/*
		 * will give -32, there is a difference of 32 between
		 * upper and lower case version of numbers
		 */
		System.out.println("A".compareTo("a"));
		/*
		 * will give 2, as first place they are
		 * different is at the first position
		 * so the difference between "A" and "?"
		 * is shown, which is 2
		 */
		System.out.println("Abc def".compareTo("?bc"));
		/*
		 * toLowerCase converts all the text to lowercase
		 * so this will print true
		 */
		System.out.println("HeLlo World".toLowerCase( ).
				equals("hello world"));	
	}
	/*
	 * for question 7
	 */
	static int MAX=6;     //1
	static final String CLASS_GUID;
	//static initialisers 
	static{
		CLASS_GUID="HELLO";
		System.out.println("static init1 called");
	}//static intialiser
	static{
		System.out.println("static init2 called");
	}
	
	{
		System.out.println("instance init");
	}
	
	/*	{
		   CLASS_GUID="hello";
		   }*/
	static void q7(){
		/*
		 * statics can be accessed without creating
		 * an instance of the class.
		 * as soon as we access a static variable this
		 * way ALL of the static intialisers in that
		 * class are called, however static 
		 * initialisers are only called ONCE
		 */
	//	Questions myQ=new Questions();
		System.out.println(Questions.MAX);
		
		/*
		 * Notice how the static initialisers are
		 * not called for this
		 */
		System.out.println(Questions.CLASS_GUID);	
	}
	
	static void q8(){
		/*
		 * main method has to be static
		 * any method has to be part of a class
		 * public class has to be the same name
		 * as the file
		 * the main method CAN be final which
		 * means that this cannot be overriden
		 */
	}
	
	static void q9(){
		/*
		 * this simulates what happens when we
		 * pass in the arugments to main on
		 * the command line prompt
		 * java TestClass 111 222 333
		 * 111 is the first string
		 * 222 is the second string
		 * 333 is the third string
		 */
		String[]args={"111","222","333"};
		String tom = args[0];
		String dick = args[1];
		String harry = args[2];
		System.out.println(tom);//111
		System.out.println(dick);//222
		System.out.println(harry);//333
	}
	
	static void q10(){
		/*
		 * encapsulation 
		 * It helps make sure that clients have no 
		 * accidental dependence on the choice of representation
		 * see http://enthuware.com/forum/viewtopic.php?f=2&t=1602
		 * for explanation of above
		 * It helps avoiding name clashes as internal 
		 * variables are not visible outside.
		 * dynamic binding makes sure that messages 
		 * are sent to the right object at run time.
		 * Encapsulation is the technique used to 
		 * package the information in such a way as 
		 * to hide what should be hidden, and make 
		 * visible what is intended to be visible. 
		 * In simple terms, encapsulation generally 
		 * means making the data variables private 
		 * and providing public accessors.
		 */
	}
	
	
	static void q11(){
		/*
		 * simulates main with this array
		 * simulating when we send two arugments
		 * to the command line prompt
		 */
		String[]args={"hello","there"};
		/*
		 * this simulates when we send no
		 * string arguments to the command
		 * line prompt, as when we run
		 * from the command line prompt
		 * with no string arguments an 
		 * array of strings called args 
		 * of size zero is sent
		 */
		//args=new String[0];
		if (args.length == 0 ){
			System.out.println("no arguments") ;
			}
		else{
			System.out.println( args.length + " arguments");
			}
	}

}
