package com.noel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class Questions {
	//question 23
	/*
	 * same method as have same name
	 * and same parameter list of one
	 * int, return type DOES NOT
	 * matter
	 */
	void myMethod(int num){
		
	}
/*	int myMethod(int number){
		return 1;
	}*/
	/*
	 * both these are correctly overloaded
	 * method as different method signatue
	 */
	void myMethod(double dnum,String name){
		
	}
	double myMethod(String name){
		return 0.0;
	}
	static void q23(){
		/*
		 * overloaded methods cannot have the
		 * same method signature.
		 * method signature is the name in
		 * combination with the parameter list
		 * return type does not matter
		 */
	}
	
	static void q24(){
		try{
			/*
			 * this does NOT throw any exception,
			 * so the catch block is not
			 * executed, but the finally
			 * block is always executed
			 * so will print try
			 */
			amethod();
			System.out.println("try ");
			}
		catch(Exception e){
			System.out.print("catch ");
			}
		finally
		{
			//will print finally
			System.out.print("finally ");
			}
		//will print out
		System.out.print("out ");
		/*
		 * will print "try finally out"
		 */	
	}
	//for question 24
	public static void amethod(){ }
	
	static void q25(){
		/*
		 * lines 1 and 2 are correct and will
		 * compile and run
		 * if you don't give an ArrayList
		 * a type, its an ArrayList of
		 * objects and you can add anything
		 * to it
		 */
		List al = new ArrayList(); //1
        al.add(111); //2
        /*
         * you can add any object to this 
         * List
         */
       // al.add("hello there");
        /*
         * this will get the first and 
         * only element in this arrayList
         */
        System.out.println(al.get(0));
        /*
         * the size of the list is 1
         */
        System.out.println(al.size());
        /*
         * do inner brackets first
         * al.size is 1
         * so we then have 
         * al.get(1)
         * and our list only has one element
         * so you can only go al.get(0)
         * so this will generate IndexOutOfBoundsException
         */
        System.out.println(al.get(al.size()));  //3
	}
	
	static void q26(){
		/*
		 * see SuperClass for example and
		 * super constructors being called
		 */
		SubClass subbie=new SubClass(2);
		subbie = new SubClass(4,5);
	}
	
	static void q27(){
		int k = 2;
        do{//prints 2 1
            System.out.println(k);
            /*
             * first time takes one
             * from k so k is 1
             * 1>0 is true
             * so it loops again
             * and prints 1
             * k-1 then become 0 and
             * 0>0 is not true so it
             * exits
             */       
        }while(--k>0);
	}
	
	static void q28(){
		/*
		 * can't use a double in a case statment
		 * so this will not compile
		 * only whole numbers, strings
		 * ,characters  and
		 * enums are allowed
		 */
		Dog spot=new Dog();
		Dog lassie=new Dog();
		Dog rex=new Dog();
		
		Dog choice=spot;
		char myChar='a';
		Integer number=4;
		
		switch(number){
			
		}
		switch(myChar){
		case 'a':
			System.out.println("case a");
			break;
		case 'b':
			System.out.println("case b");
			break;
		default:
			System.out.println("default ");
			break;
		
		}
	}
	
	static void q29(){
		Questions ct = new Questions();
        ct.showOne(100);
        //will print 0
        System.out.println(ct.myValue);
        ct.showTwo(200);
        //will print 200
        System.out.println(ct.myValue);
		
	}
	//for question 29
	private int myValue = 0;
	public void showOne(int myValue){
		/*
		 * myValue refers to the myValue
		 * inside the showOne method, 
		 * NOT the myValue instance variable
		 * so all this is doing is 
		 * assigning a variable to itself
		 */
        myValue = myValue;
    }
    
    public void showTwo(int myValue){
    	/*
    	 * "this" refers to this particular object
    	 * so this.myValue refers to the instance
    	 * variable of this Questions object (in
    	 * our example ct) and the myValue is
    	 * the int value sent to this method
    	 * which was 200
    	 * so the instance variable myValue is
    	 * now 200
    	 */
        this.myValue = myValue;
    } 
    
    static void q30(){
    	//both valid ways to create array
    	int[]myArray;
    	int myArray2[];
    	/*
    	 * both i and j are arrays
    	 * j, x and y are also arrays
    	 */
    	int [] i, j,x,y;
    	j=new int[3];
    	i=new int[3];
    	
    	int i2[], j2;
    	/*no square bracket before i2
    	 * so j2 is just an int
    	 * i2 is an array
    	 * j2 is an int
    	 */
    	i=new int[3];
    	j2=7;
    	/*
    	 * array1 is an array of ints
    	 * array2 is an array of a array of 
    	 * ints, array2 is a two dimensional
    	 * array
    	 */
    	int[] array1, array2[]; 
    	int[][] array3={{2,3,4},{5,6,8}}; 
    	/*
    	 * array5 is a two dimesional array.
    	 * when multiple arrays of different
    	 * dimensions all defined in the same
    	 * line the rule is all other elements
    	 * in the list have the same data type
    	 * as the first element(in this case 
    	 * an int) and what directly follows
    	 * the data type declaration determines
    	 * if subsequent variables are arrays.
    	 * in this example we have 
    	 * int[]array4
    	 * this means that array5[]is an
    	 * array of arrays, and num7
    	 * is an array of ints
    	 */
    	int[] array4[], array5[],num7;
    	//twoD is a two dimesional
    	int [][]threeD[],twoD;
    	twoD=array3;
    	int fourD[][][][],notFour;
    	//notFour is an int
    	notFour=5;
    	
    	array1=new int[3];
    	array1[0]=4;
    	array1[1]=9;
    	array1[2]=23;
    	
    	array5=array3;
    	array4=array3;
    	
    	
    	//both are two dimensional arrays
    	array2 = array3;
    	array2 = array4;
    	
   // 	array1 = array2;
    //	array4 = array1;
    //	array5 = array3;
    //	array3=array4;
    }
    
    static void q31(){
    	/*
    	 * there are all legal
    	 * can never have size on the left
    	 */
    	int[ ] a[ ] = new int [5][4] ;
    	int a2[ ][ ] = new int [5][4] ;
    	int[ ] a3[ ] = new int[4][] ;
    	int[ ][ ] a4 = new int[5][4] ;
    	/*
    	 * can only use this when you are 
    	 * first creating an array
    	 */
    	int numlist[]={34,56,23};
    	/*
    	 * can't have this
    	 * as most left square bracket has
    	 * to have a value
    	 */
   // 	int numList2[][][]=new int[][3][]
    }
    
    static void q32(){
    	String str="hello there";
    	//prints everything from 2 onwards "llo there"
    	System.out.println(str.substring(2));
    	//goes from 2 UP TO BUT NOT INCLUDING 7 "llo t"
    	System.out.println(str.substring(2, 7));
    	System.out.println(str.equals("hello there"));
    }
    
    static void q33(){
    	/*
    	 * with a while loop you have to provide
    	 * a condition
    	 */
    	//this will compile
    	do { 
    		System.out.println("just loop once");
    		break ; 
    		} while (true) ;
    	/*
    	 * you can't break out of a if statement
    	 * however if they 'if' statement is contained
    	 * withing a loop then you can break out
    	 * of the loop
    	 */
   /* 	int age=18;
    	if(age>21){
    		System.out.println("age is "+age);
    		break;
    	}*/
    	for(int i=0;i<3;i++){
    		System.out.println(i);
    		if(i>2)
    			/*
    			 * this is beaking out of the 
    			 * for loop
    			 */
    			break;
    	}
    	//you can use a constant in a switch
    	int num=1;
    	switch (1) { 
    	default : 
    		break; 
    	}
    	//infinite loop
    	for(;;){
    		System.out.println("hello");
    	}
    }
	
	

}
