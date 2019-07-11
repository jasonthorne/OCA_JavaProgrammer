package com.noel;

public class Questions {
	static void q45(){
		int i;
	      int j;
	      for (i = 0, j = 0 ; j < 1 ; ++j , i++){
	    	  /*
	    	   * first time and only time in loop
	    	   * i and j, both zero so j<1
	    	   * prints out 0 0. both increment
	    	   * so j<1 is false when it checks
	    	   * to see if it enters the loop.
	    	   * there is no second increment
	    	   * of the loop
	    	   * then prints out the values
	    	   * of i and j, which are both
	    	   * 1, so prints 1 1
	    	   */
	         System.out.println( i + " " + j );
	      }
	      System.out.println( i + " " + j );	
	}
	
	static void q46(){
		String blank= " ";// one space       
		String line = blank + "hello" + blank + blank;
		System.out.println("word"+line+"word");
		System.out.println(line.concat("world"));
		String newLine=line.trim();
		System.out.println("length of line "
				+ ""+line.length());//8
		System.out.println("lenght of newline "
				+newLine.length());//5
		System.out.println((int)(line.length()
				+ newLine.length()));//13
	}
	
	static void q47(){
		try {
			m();
			} 
		catch (Exception e){
				
			}
		System.out.println(s);
		
	}
	//for question 47
	static String s = "";
	public static void m0(int a, int b) {
		/*
		 * s is now equal to the stirng
		 * value "1"
		 */
		s += a;
		/*
		 * m2()throws a 
		 * NullPointerException which
		 * although will compile, will
		 * crash the program if it
		 * is not dealt with. so it
		 * progegates upwards until 
		 * it comes to the try catch
		 * block in q47.This also
		 * means that m1(b) is never
		 * called, so 's'value stays at
		 * "1"
		 */
		m2();
		m1(b);
		}
	public static void m1(int i) { 
		s += i;
		}
	public static void m2() { 
		throw new NullPointerException("aa");
		}
	public static void m() { 
		m0(1, 2); 
		m1(3);
		}
	int num=5;
	//int j=5;
	static void q49(){
		/*
		 * this is assigning a value to
		 * i, whereas in the second argument
		 * in a for loop it is testing for a
		 * condition so it has to evaluate to
		 * a boolean
		 */
	//	for (int i=5; i=0; i--) { }//1
		
		/*
		 * this is declaring int i=0
		 * and int j+=5
		 * but we have already declared j
		 * and we can't declare it twice
		 */
		//int j=5;
	    //  for(int i=0, j+=5;  i<j ; i++) {  j--;  }//2
	      int num,num2,num3=5;
		/*
		 * this is also illegal as we are trying
		 * to declare num twice in the same
		 * method
		 */
	/*	int num=4;
		for(int m=0;m<4;m++){
			int num=3;
			
		}*/
		/*
		 * i is not given any initial value
		 * so you can't go in the loop
		 * i+=2
		 */
	/*	int i, j;//3
	    for (j=10; i<j; j--) { i += 2; }
		*/
		//this is valid
	/*	int i=10;
	    for (;  i>0 ; i--) { }//4
	    */
		/*
		 * you can have as many as you
		 * like in the initialisation part
		 * of a loop and in the incrementation
		 * part of the for loop
		 * but the condition part can only
		 * consist of one argument that 
		 * evaluates to a boolean
		 * so this is valid
		 */
		//for (int i=0, j=10; i<j; i++, --j) {;}//5	
	}
	
	static void q50(){
		//4 references
		TestClass t1, t2, t3, t4; 
		/*
		 * a object is created each time
		 * the "new" keyword is used
		 */
		t1 = t2 = new TestClass(); 
		t3 = new TestClass();
	}
	
	static void q51(){
		/*
		 * overridng involves an inheritance 
		 * relationship, it can only occur in 
		 * subclass or a class implementing an
		 * interface.
		 * so at it's simplest a subclass has
		 * the behavior of a base class but 
		 * can implement this behavior any 
		 * way it see's fit.
		 * i.e life class has a reproduce() method
		 * but how a subclass Plant and a subclass
		 * Animal implement this method will be
		 * totally different.
		 * with overloading you have two totally 
		 * different methods that have the same 
		 * name but there is no relationship between
		 * the method bar the name (although they
		 * usually in practise are doing very
		 * similar or same functions)
		 */
		String str="hello";
		
	}
	
	static void q52(){
		calculate(2); 	
	}
	//for question 52
	/*
	 * this will compile for ANY number 
	 * sent to this method as if it is
	 * any number it will go to the default
	 * option, set val to "def" and print it. 
	 * if it is 2 it will also
	 * compile and print "def" and print as
	 * there is no break after case 2, so
	 * everything after that will also run
	 */
	public static void calculate(int x){
	      String val;
	      switch(x){
	         case 2:
	         default:
	         val = "def";
	      }
	      System.out.println(val);
	   }
	
	static void q53(){
		/*
		 * see Car class
		 */	
	}
	
	static void q54(){
		//returns 8
		System.out.println( switchTest(4) );	
	}
	//for q54
	public static int switchTest(int k){
	     int j = 1;
	     switch(k){//k is 4
	        case 1: j++;
	        case 2: j++;
	        case 3: j++;
	        case 4: j++;//2
	        case 5: j++;//3
	        default : j++;//4
	     }
	     return j + k;//return 4+4
	  }
	
	static void q55(){
		int [] [] array = {{0},//twoD array 
				{0, 1}, 
				{0, 1, 2}, 
				{0, 1, 2, 3}, 
				{0, 1, 2, 3, 4}
				}; 
		int[] arr1 = array[4];//one dimensional array
		/*
		 * will not compile as trying to access
		 * a one dimensional array in a two 
		 * dimensional way. arr1 is a one
		 * dimensional array so can onlly access
		 * it, for example, 
		 */
		//System.out.println (arr1[4][1]);
		System.out.println(arr1[3]);
		 
		System.out.println (array[4][1]);
	}

}
