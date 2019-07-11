package com.noel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Questions {
	static void q1(){
		Questions tc = new Questions();
		try{
	         tc.m1();
	      }
	      catch (MyException e){
	    	  /*
	    	   * the catch block is also
	    	   * throwing a MyException
	    	   * exception, which is a
	    	   * checked exception
	    	   * and it not been dealt with
	    	   */
	    	  try{
	    		 tc.m1(); 
	    	  }
	    	  catch(Exception myE){
	    		  System.out.println(myE);
	    	  }
	         
	      }
	      finally{
	    	  /*
	    	   * this is only a RuntimeException
	    	   * so it does not have to be dealt
	    	   * with
	    	   */
	         tc.m2();
	      }
		
	}
	/*
	 * for question 1
	 */
	public void m1() throws MyException{
	      throw new MyException();
	   }
	   public void m2() throws RuntimeException{
	      throw new NullPointerException();
	   }
	   
	   static void q2(){
		   short s = 9;
		   /*
		    * will not work as
		    * 9 is considered an int
		    * and there is no constructor
		    * in the Short wrapper class
		    * that takes an int
		    */
		   //Short k = new Short(9);
		   /*
		    * this is casting 9 to be of 
		    * type short, so this will work
		    */
		   Short k=new Short((short)9);
		   Byte bnum=new Byte((byte)12226);
		   System.out.println(bnum);
		   /*
		    * will return true, checks if k
		    * is a short, will return true
		    * if it is
		    */
		   System.out.println(k instanceof Short);
		   /*
		    * instanceof only works with object
		    * so this will not compile
		    */
		   //System.out.println(s instanceof short);
		   /*
		    * any two numbers can be compared
		    * by using ==
		    */
		   int i = 9; 
		   double dnum=9;
		   System.out.println(s == k);//true
		   System.out.println(dnum==i);//true
		   
		   Integer number=2;
		   Integer number2=new Integer(2);
		   Integer number3=2;
		   /*
		    * this is the one circumstance when you
		    * have two integers and one is created 
		    * using the new operator, then it
		    * is comparing if they are different
		    * objects, they are so it will print
		    * false
		    */

		   System.out.println(number==number2);//false
		   System.out.println(number==number3);
		   Double dNumber=(double)2;
		  // int num=4;
		   Short snum=3;
		 //  dNumber=4;
		   /*
		    * can't compare one wrapper type with
		    * another
		    */
		   //System.out.println(number==dNumber);
		   System.out.println("checking"
		   +number.equals(dNumber));
		   int num=2;
		   System.out.println(number==num);
		   /*
		    * can compare any wrapper number with
		    * any primitive number
		    */
		   System.out.println(dNumber==num);  
		   
		   Integer intNum=2;
		   Short shortNum=2;
		   System.out.println(shortNum==num);
	   }
	   
	   static void q3(){ 
		   /*
		    * if your method is returning
		    * nothing, you can't put it
		    * in a print statement
		    */
		   //System.out.println(out1());
		   int i = 10;
		   /*
		    * here we have the whole
		    * ternary operator equation
		    * that is attempting to print
		    * out one of two methods
		    * that return nothing, which
		    * you can't do
		    */
	/*	   System.out.println( i<20 ? out1() 
				   : out2() );*/
		   //i<20 ? out1(): out2();
		   
		   byte bnum=2;
		   short snum=3;
		   double count=3;
		   int counter=0;
		   //counter=(short) (counter>1? snum=4:snum=6++);
	//	   System.out.println(count>2?out1():out2());
		   
		//   System.out.println();
		   System.out.println(counter);
	   }
	   //for question 3
	   static void out1(){
		  // return 1;
		 // return "out1 called";
		   System.out.println("hello there");
		   return;
	   }
	   static void out2(){
		  // return "out2 called";
	   }
	   
	   static void q4(){
		   Object a, b, c ;
		   a = new String("A");
		   b = new String("B");
		   a.equals(b);
		   c = a;
		   a = b;
		   String myStr=new String("F");
		   myStr.charAt(0);
		   /*
		    * c=a is c="A"
		    * a=b is a="B"
		    */
		   System.out.println(""+c);
	   }
	   
	   static void q5(){
		   
		   int i=0, j=10;
		   int count = 0;
		   /*
		    * as both i and count start at
		    * 0 and both increment by 1 each
		    * time inside the loop, that 
		    * means that i and count HAVE 
		    * to be the same
		    * when j==i our loop no longer 
		    * executes so that means
		    * i==j==counter, they are
		    * all the same value at the end of
		    * our loop
		    */
		   while (i<j) {
			   i++;
			   j--;
			   count++;
			   System.out.println("inside loop"
			   +i+" "+j+" "+count);
			   }
		   System.out.println(i+" "+j+" "+count);
		//   }
	   }
	   
	   static void q6(){
		   /*
		    * when using the predicate interface
		    * to create lambda you have to 
		    * supply a data type with it, if 
		    * you do not it will assume that 
		    * the data type is object
		    */
		   //Predicate preg1=new Dog();
		   /*
		    * if i did not supply a type
		    * this would be an ArrayList of
		    * objects, we are supplying the
		    * Cat type, so this list can only
		    * take Cats and no other object
		    */
		   ArrayList<Cat>catList=new ArrayList<>();
		   catList.add(new Cat());
		   catList.add(new Cat());
		   /*
		    * class ArrayList<Object>{
		    * }
		    */
		   /*
		    * this is a predicate that
		    * uses a Cat object
		    */
		   Predicate<Cat>pred1=x->{
			   return true;
					   };
					   pred1=x->x.age==1;
		   /*
		    * Interface predicate<Object>{
		    * 	public boolean test(Object t);
		    * public boolean test(Cat t);
		    * }
		    * this is a method that takes
		    * a list and a predicate lambda
		    * this is implementation of the 
		    * predicate interface, which 
		    * has a method called test that
		    * can take any object and returns
		    * a boolean
		    * x->x.age==1 is the implementation
		    * of the predicate interface test
		    * method
		    */
		   takePred(catList,x->x.age==1);   
	   }
	   /*
	    * this is a method that takes an arrayList
	    * of cats and a Predicate that uses a 
	    * Cat object
	    */
	   static void takePred(ArrayList<Cat>listCat,
			   /*
			    * if i did not supply<Cat> it
			    * would assume that we are
			    * using the Object class 
			    */
			   Predicate<Cat>predCat){
		   /*
		    * going through each element
		    * in the arraylist and calls
		    * the implementation for the 
		    * predicate interfaces test() 
		    * method 
		    */
		   for(Cat c:listCat){
			   predCat.test(c);
		   }	   
	   }
	   
	   static void q7(){
		   String[]args=new String[0];
		   /*
		    * k is 1, as m1 returns the number
		    * sent to it plus 1, args.length
		    * is zero so 0+1 is 1
		    */
		   int k = m1(args.length);
		   /*
		    * k=k+3 + ++k
		    * k=1+3+2
		    * k=6
		    */
	        k += 3 + ++k;
	        System.out.println(k);   
	   }
	   /*
	    * for question 7
	    */
	   public static int m1(int i){
	        return ++i;
	    }
	   
	   static void q8(){
		   /*s is 5
		    * K is 9 does not have a match
		    * so the default block is executed
		    * K is NOT 10 so the else
		    * part is executed.
		    * s=s+4
		    * s=5+4
		    * s=9
		    */
		   int k = 9, s = 5;
		   switch(k){
		   default : 
			   if( k == 10) 
			   { 
				   s = s*2; 
				   }
			   else{
				   s = s+4;
				   break;
				   }
			   case 7 : 
				   s = s+3;}
		   System.out.println(s);
	   }
	   
	   static void q9(){
		   int x=24,y=2;
		   System.out.println(max(x,y));
		  
	   }
	   //for question 9
	   static int max(int x,int y){
		   if (x > y)
			   return x;
		   return y;
	   }
	   
	   static void q10(){
		   /*
		    * whenever you run a program that 
		    * we have created, that file
		    * must first be compiled (eclipse
		    * does all this automatically)
		    * the java compiler program
		    * is called javac.
		    * then to run the complied
		    * program we run a program called
		    * java on the compiled file
		    * so for a file called MyProgram
		    * to compile and run from the
		    * command line prompt we would
		    * have to do
		    * javac MyProgram.java
		    * java MyProgram
		    */
	   }
	   
	   static void q11(){
		   //see below for overloaded methods
	   }
	   public int sum(int i1, int i2) { return i1 + i2; }
	   
	   public int sum(long i1, long i2) { return (int) i1; }
	   
	   public int sum(int i1, long i2) { return (int) i2; }
	   
	   public long sum(long i1, int i2) { return i1 + i2; }
	   
	  

}
