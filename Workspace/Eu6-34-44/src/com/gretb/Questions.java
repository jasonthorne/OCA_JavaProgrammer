package com.gretb;

import java.util.ArrayList;
import java.util.List;

public class Questions {
	static void q34(){
		List s1 = new ArrayList( ); 
		s1.add("a"); 
		s1.add("b"); 
		s1.add("c"); 
		s1.add("a"); 
		/*removes returns false if 
		 * does not find the object,
		 * returns true if object is found
		 * and then removes it.
		 * removes first instance of "a"
		 * which is the a at position[0]
		 */
		if(s1.remove("a")){
			/*
			 * removes second instance of
			 * "a" at position[3]
			 */
			if(s1.remove("a")){ 
				/*
				 * removes "b" at position[1]
				 */
				s1.remove("b");}
			else{
				s1.remove("c");
				} 
			/*
			 * only "c" left in our arrayList
			 * so prints "c"
			 */
			} System.out.println(s1);	
	}
	
	static void q35(){
		Dog[]kennel={new Dog(),new Dog(),
				new Dog(),new Dog(),new Dog()};
		/*
		 * you can't directly access in reverse order
		 * or you can't directly access those
		 * dogs at even indexes or odd indexes
		 * (i.e only dogs at 2,4 position or
		 * dogs at 1,3 position
		 */
		for(Dog spot:kennel){
			spot.eat();
		}
	}
	
	static void q36(){
		/*
		 * a main method can be final,
		 * just means the method cannot
		 * be overriden
		 * public and static can swap places
		 * but main has to be before the 
		 * method name and the return type 
		 * has to come just before method name
		 */
	}
	
	static void q37(){
		/*
		 * this is an array of length 2 rows and 3 columns
		 * means cA[1][2] is the very last value you 
		 * can have
		 */
		char[][] cA = {
				{ 'a', 'b', 'c' },//first row
				{ 'a', 'b', 'c' }//second row
				};
		/*
		 * this has three rows, and at this point the 
		 * columns are not defined
		 */
		cA= new char[3][];
		for (int i=0; i<cA.length; i++) 
			/*
			 * this gives each row a length
			 * of 4 columns
			 * so the very top value you can
			 * have it cA[2][3]
			 */
			cA[i] = new char[4];	
	}
	
	//for question 38
	int[] ia = new int[1]; 
	Object oA[]= new Object[1];
	boolean bool;
	static void q38(){
		int num;
		Integer number=null;
		Questions test=new Questions();
		/*
		 * will print 0 null false
		 * as 0 default value in array of
		 * ints
		 * null default value in array
		 * of objects
		 * false default value in array
		 * of booleans
		 */
		System.out.println(test.ia[0] + "  " 
		 + test.oA[0]+"  "+test.bool+" "+number);	
		//System.out.println(number.equals(number));
	}
	
	static void q39(){
		/*
		 * see Great class for 
		 * explanation
		 */
	}
	
	static void q40(){
		boolean b1 = false; 
		boolean b2= false; 
		/*
		 * if b1 IS false, which is TRUE
		 * so then b2 is then assigned
		 * the value TRUE
		 * so its if(TRUE)
		 * prints "true"
		 */
		if (b2 = b1 == false){
			System.out.println("true"); 
			} 
		else
			{
			System.out.println("false"); 
			}
	}
	
	static void q41(){
		String s = "blooper"; 
		StringBuilder sb = new StringBuilder(s);
	/*
	 * appends the string 'per' to blooper which
	 * becomes "blooperper" and then deletes
	 * from position 3 up to BUT NOT INCLUDING
	 * 5, removes "op"
	 * we get "bloerper"
	 */
		System.out.println(sb.append
				(s.substring(4)).delete(3, 5)); 
		System.out.println(sb);
		sb = new StringBuilder(s);	
	}
	
	static void q42(){
		Questions ct = new Questions();
		/*
		 * sets the value of the instance
		 * variable myValue to 200
		 */
        ct.showTwo(200);
        System.out.println(ct.myValue);
        /*
         * this is only setting a local
         * value within the showOne
         * method to be 100
         */
        ct.showOne(100);
        System.out.println(ct.myValue);	
	}
	//for q42
private int myValue = 0;
    /*
     * this is setting the LOCAL
     * variable myValue
     */
    public void showOne(int myValue){
        myValue = myValue;
    }
    /*
     * this is setting the instance
     * variable myValue
     */
    public void showTwo(int myValue){
        this.myValue = myValue;
    } 
    
    static void q43(){
    	//wrapper objects are immutable
    	Integer dataWrapper = new Integer(5);
    	/*datawrapper is 5
    	 * 5 is sent to wiggler method
    	 * and inside the method it increments
    	 * this value by 1 and prints out
    	 * 6, the returned value 15 is assigned
    	 * to the Integer value variable.
    	 * you cannot change what a object
    	 * refers to, so the dataWrapper
    	 * value object in this methods is still
    	 * 5 after the method call
    	 */
        Integer value = wiggler(dataWrapper);
        /*
         * so datawrapper is 5
         * value is 15
         * so 5+15=20
         */
        System.out.println(dataWrapper+value);
    }
    //for question 43
    public static Integer wiggler(Integer x){
	       Integer y = x + 10;
	       x++;
	       System.out.println(x);
	       return y;
	    }
    
    static void q44(){
    	/*
    	 * multiplication and division
    	 * done before addition and
    	 * subtraction
    	 * a=15
    	 */
    	int a = 1 + 2 + 3 * 4; 
    	//b=10
    	int b = 2 * 3 + 4; 
    	//total=15+10, total is 25
    	int total = a + b;
    	
    }

}
