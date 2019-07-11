package com.noel;

import java.util.ArrayList;

public class Questions {
	static void q45(){
		/*
		 * will not compile as a while loop
		 * has to take a boolean
		 */
	/*	while(int k = 5; k<7){
			System.out.println(k++);
			}*/
	}
	
	static void q46(){
		/*
		 * can't have a sub class reference
		 * to a superclass object without an
		 * explicit cast
		 */
		A myA=new A();
		B myB=new B();
		myA=myB;
		//have to cast it
		//myB=myA;
		myB=(B)myA;
	}
	
	static void q47(){
		int a = 1; 
		/*
		 * in an array of numbers, if
		 * each position in the array is
		 * not given an explicit value 
		 * it is given the default value
		 * of 0
		 * so this array is an array of 10 
		 * numbers and each number is 0
		 */
		int[] ia = new int[10]; 
		//b is 0
		int b = ia[a]; 
		/*
		 * c=0+1 so c is 1
		 */
		int c = b + a; 
		/*
		 * b is assigned the value of c
		 * and printed out 
		 * which is 1
		 */
		System.out.println(b = c);
	}
	
	static void q48(){
		int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
                for (int k = 0; k < 3; k++) {
                	System.out.println("i="+i+" "
                			+ "j="+j+" k="+k);
                    if (k - j > 0) {
                    	System.out.println(""
                    			+ "breaking middle "+j);
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);
	}
	
	static void q49(){
		/*
		 * an array of objects can take ANY object
		 * including arrays, arraylists, String, 
		 * your own user defined classes.
		 * an array of objects can also take primitives
		 * as the primitives will be boxed into
		 * they're wrapper class
		 */
		Object[]oaArray={"hello",new int[5],
				new A(),
				/*
				 * here we are creating a
				 * new array of doubles and 
				 * inserting two doubles into
				 * the array at the same time
				 */new double[]{2.3,5,6},
				new Object(),true,12,23.4,
				new<Integer>ArrayList(),
				new ArrayList()
				};
	}
	static void q50(){
		/*
		 * a Constructor CANNOT return anything
		 * not even void
		 * 
		 * a Constructor CANNOT be final, static
		 * or abstract
		 * 
		 */
	}
	
	static void q51(){
		int[] values = { 10, 30, 50 };
        for( int val : values ){
            int x = 0;
            while(x<values.length){
            	/*
            	 * will print out 0 10,1 10,2 10
            	 * then repeat that process for 30
            	 * 0 30, 1 30, etc
            	 * so will print 2 three times
            	 */
             System.out.println(x+" "+val);
              x++;
            }
        }
	}
	
	static void q52(){
		int[] data = {1, 2, 3, 4, 5};
	
		for (int i : data) 
		{
			/*
			 * this will skip the number
			 * 2
			 */
			if (i < 2) {
				continue;
			}
			System.out.print(i);
			if (i == 3){
			//	continue;
			}
		}
	}
	
	static void q53(){
		Super mySuper=new Super();
		System.out.println(mySuper);
		SubClass mySub=new SubClass();
		System.out.println(mySub);
		/*
		 * this will call the toString()method
		 * for the SubClass class which
		 * also calls the toString method
		 * for the super class Super
		 * prints 
		 */
		System.out.println( new SubClass() );
	}
	
	static void q54(){
		 boolean b = false;
	      int i = 1;
	      do{i++ ;
	         /*
	          *  
	          */
	      System.out.println("i is "+i);
	         /*
	          * use print statements
	          * to find out what is happening
	          * within a loop.
	          * here we are printing out
	          * the value of b in each iteration
	          * of the loop
	          */
	         System.out.println(b);
	         /*
	          * then we create another boolean
	          * to show the value in the 
	          * condition of the do while loop
	          */
	         boolean a=b;
	         System.out.println("not "+(a=!a));
	         /*
	          * b is false and what it asking first
	          * time in loops is "do while b is 
	          * NOT true", so the loop continues
	          * but b is now set to false.
	          * second time in loop it is saying
	          * "do while b is NOT false", but
	          * b IS false so this is not true
	          * so loop exits
	          */
	      } while (b = !b);
	      System.out.println( i );
	   }
	
	static void q55(){
		String[]args={"1","2"};
		//num1 is 1
		int num1=Integer.parseInt(args[0]);
		//num2 is 2
		int num2=Integer.parseInt(args[1]);
		/*
		 * our args array only goes from from 
		 * index 0 to 1
		 * so if we go
		 */
		int num3=Integer.parseInt(args[num2]);
		/*
		 * we get arrayIndexOutOfBounds as num2
		 * is 2
		 */
	}
	}
	


