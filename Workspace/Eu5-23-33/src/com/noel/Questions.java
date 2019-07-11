package com.noel;

public class Questions {
	static void q23(){
	/*
	 * replace creates a NEW string object so this
	 * will return false
	 */
	System.out.println("String".replace('g', 'G')==
			"String".replace('g','G'));
	/*
	 * if there is no change replace will return
	 * the same string
	 */
	System.out.println("String".replace('g','g')
			=="String");
	}
	
	static void q24(){
		int x=5;
		switch(x){
		
		case 1:
		case 2:
		case 0:
			/*
			 * default does not
			 * have to be the last
			 * option in a case switch
			 */
		default :
		case 4:
							}
	}
	
	static void q25(){
		byte b = 1;
		char c = 1;
		short s = 1;
		int i = 1;
		long lnum=5l;
		long lnum2=6l;
		/*
		 * any two whole numbers will
		 * return an int or long if
		 * either are long
		 * will not compile
		 */
		//s=b*b;
		i=b*b;
		//s=b+b;
		long lsum=i+lnum;
		//i=i+lnum;
		/*
		 * but compound statements do
		 * an explicit cast, in this
		 * cast to be of type short
		 */
		//s=s*b;
		s *= b;
		/*
		 * is the same as 
		 */
		s=(short)(s*b);
	}
	
	static void q26(){
		A[] a, a1;
		B[] b;
		a = new A[10]; 
		a1= a;
		b=new B[20];
		a = b;
		/*
		 * b is a sub class of A
		 * so we have to cast it, however
		 * b is actually an array 
		 * of B objects so this will
		 * compile and run
		 * "a" IS an array of B objects
		 * so we can cast this
		 */	
		b=(B[])a;
		/*
		 * this will compile, but will
		 * throw a classCastException as
		 * al is actually an array of 
		 * A objects and we are attempting
		 * to cast it to be an array of
		 * B objects
		 */
		b = (B[]) a1; // 3
	}
	
	static void q27(){
		/*
		 * trim is a method of the String
		 * class
		 */
		/*
		 * this are all methods of the 
		 * StrinBuilder class that are
		 * NOT methods of the string 
		 * class
		 * ensureCapacity(int )
		 * there are LOADS of append
		 * append(string)
		 * append(boolean)
		 * reverse( )
		 * setLength(int)
		 */
	}
	//for question 28
	static String s1 = "green mile";
	String s2;
	int myInt;
	static void q28(){
		int n=4;
		/*
		 * local is a local variable so
		 * by default it is not given any value
		 * n is 0, so n is not greater than 0
		 * so local will be given no value
		 * in this scenario
		 * even if n WAS greater than 0
		 * this will still not compile, as
		 * the compiler knows "n" can change
		 */
		String local;// 1
		if( n > 0 ) 
			local = "good";//2
		//System.out.println( s1+" = " + local );
		//System.out.println(myInt);
	}
	
	int x=4;
	static int myStat=6;
	
	void for29(){
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(myStat);
		System.out.println(this.myStat);
	}
	static void q29(){
		/*
		 * cannot access a non static variable
		 * directly from a static method
		 * and you can't use the "this" with
		 * a static variable
		 */
		//will not compile
		//System.out.println(x);
		//System.out.println(this.x);
		/*
		 * have to create an instance of class
		 * and access the variable that way
		 */
		Questions myQuestion=new Questions();
		System.out.println(myQuestion.x);
		/*
		 * myStat is a static variable
		 * which we can access directly from
		 * inside a static method
		 */
		System.out.println(myStat);
	}
	
	static void q30(){
		Questions ct = new Questions();
        ct.showOne(100);//prints 0
        ct.showTwo(200);//prints 200
		
	}
	//for question 30
private int myValue = 0;
    
    public void showOne(int myValue){
    	/*
    	 * myValue is the local variable
    	 * myValue which has a value of 100
    	 */
        myValue = myValue;
        /*
         * however this is the instance
         * variable myValue which has not
         * yet being given a value when first
         * called so it has the default value
         * of 0
         */
        System.out.println(this.myValue);
    }
    
    public void showTwo(int myValue){
    	/*
    	 * assigns the value 200 to the
    	 * instance variable myValue
    	 */
        this.myValue = myValue;
        /*
         * prints 200
         */
        System.out.println(this.myValue);
    } 
    
    static void q31(){
    	/*
    	 * none of the choices cases in the
    	 * switch statement are a match for
    	 * 5, so it chooses the default
    	 * value. there is NO BREAK after
    	 * the default option so case1 is 
    	 * triggered, case 0 and case 2 are
    	 * also triggered. After case 2 there
    	 * is a break. so it prints
    	 * 1 0 2 then exits
    	 */
    	int i=5;
    	 switch (i){
    	 default:
    	case 1:
    		System.out.println(1);
    	case 0:
    		System.out.println(0);
    	case 2:
    		System.out.println(2);
    		break;
    	case 3:
    		System.out.println(3); 
    						 }
    }
    
    static void q32(){
    	int x  = 0;
    	/*
    	 * this loop never excute as the loop
    	 * will only enter if i<0, but i
    	 * starts at 10, so it will never
    	 * be less than 0
    	 */
        labelA:   for (int i=10; i<0; i--){
           int j = 0;
           labelB:
           while (j < 10){
              if (j > i) 
            	  break labelB;
              if (i == j){
                 x++;
                 continue labelA;
              }
              j++;
           }
           x--;
           System.out.println(i);
        }
        System.out.println(x);    
    }
    
    static void q33(){
    	Questions n = new Questions();
    	int a = 'a';
    	char c = 97;
    	System.out.println(a);
    	System.out.println(c);
    	/*
    	 * will always look for its 
    	 * closest match amongst the
    	 * overloaded methods
    	 * So a is an int, so it
    	 * will choose the overloaded
    	 * method m(int a), the reference
    	 * type is what determines what method
    	 * is called
    	 */
    	n.m(a);
    	/*
    	 * will chooose the overloaded method
    	 * m(char c)
    	 */
    	n.m(c);
    	/*
    	 * which overloaded method depends
    	 * on the reference type,here 
    	 * the reference in a Animal reference
    	 * so it will call the takeThis()
    	 * method that takes a Animal
    	 */
    	Animal aDog=new Dog();
    	n.takeThis(aDog);	
    }
    //for question 33
    public void m(int a){
    	System.out.println("In int ");
    	}
    public void m(char c){
    	System.out.println("In char ");
    	}
    
    public void takeThis(Dog myDog){
    	System.out.println("taking Dog");
    }
    
    public void takeThis(Animal myAnimal){
    	System.out.println("taking Animal");
    }
}
