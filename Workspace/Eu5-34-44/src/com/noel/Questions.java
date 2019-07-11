package com.noel;
/*
 * for question 35
 */
/*
 * this will import ONLY the 
 * statics from this class
 */
import static com.gretb.Foo.*;
/*
 * this will import the class Foo
 */
import com.gretb.Foo;
import com.gretb.InitClass;
public class Questions {
	static void q34(){
		/*
		 * if an instance variable is
		 * public there is NO WAY to 
		 * ensure that some other class,
		 * program or application will
		 * not modify this variable in
		 * some way.
		 * also if your initial code had
		 * public variables, if you change
		 * them to private it could break
		 * someone else's code, as they 
		 * developed code looking for your
		 * PUBLIC variables which they can
		 * no longer access as they are now
		 * private
		 */
	}
	
	static void q35(){
		/*
		 * when all statics of a class
		 * are imported we can access them
		 * like so in a static method
		 * when we import static using the
		 * import static command, we can
		 * access a static by the following
		 * method
		 */
		System.out.println(LOGICID);
		statMethod();
		System.out.println(Foo.LOGICID);
		Foo.statMethod();
		/*
		 * however if we do NOT have a
		 * import static you can only 
		 * access the stattic variable in 
		 * a non static way, see
		 * new Foo().LOGICID
		 * comment out 
		 * import static com.gretb.Foo.*;
		 * to see you will not longer be
		 * able to access LOGICID above
		 */
		System.out.println(Foo.LOGICID);
		System.out.println(new Foo().num);
		Foo myFoo=new Foo();
		System.out.println(myFoo.LOGICID);
		System.out.println(new Foo().LOGICID);	
	}
	
	static void q36(){
		/*
		 * SEE InitClass for explanation
		 * 
		 */
		InitClass obj = new InitClass(5);
	}
	
	static void q37(){
		int i = 5;
		float f = 5.5f;
		double d = 3.8;
		char c = 'a'; 
		/*
		 * i becomes 5.0 which is NOT
		 * the same as 5
		 */
		if (i == f) 
			c++;
		/*
		 * int(5.5+3.8)==int(5.5)+int(3.8)
		 * int(9.3)==5+3
		 * 9==8 is NOT true
		 */
		if (((int) (f + d)) == ((int) f + (int) d)) 
			c += 2; 
		/*
		 * neither if statements are true so c
		 * retains it's original values
		 */
		System.out.println(c);
	}
	
	static void q38(){
		/*
		 * will print out 1 4 2 3
		 * see A class for explantion
		 */
		B b = new B();
	    A a = new A(3);
	}
	
	static void q39(){
		/*
		 * a overriding method CANNOT throw 
		 * a super class checked exception
		 * i.e a method in a base class throws
		 * runtime exception, a overriding method
		 * in a sub class throws a Exception
		 * see Base class
		 */
	}
	
	static void q40(){
		int c = 0;
        A: for(int i = 0; i < 2; i++){
            B: for(int j = 0; j < 2; j++){
                C: for(int k = 0; k < 3; k++){
                    c++;
                    /*
                     * a break without any 
                     * identifying label will 
                     * break the innermost loop
                     */
                    System.out.println("i "+i+" j "+j+" "
                    		+ "k "+k+" c "+c);
                    if(k>j) break;
                }
            }
        }
        System.out.println(c);
	}
	
	static void q41(){
		XXX yourX=new XXX();
		try{
			/*
			 * this method throws
			 * a checked exception so
			 * has to be in a try
			 * catch block
			 */
			yourX.m();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
				XXX myXY=new YYY();
		/*
		 * whether a method needs to be in a 
		 * try/catch block depends on the REFERENCE
		 * and NOT the object.
		 * So even though its the YYY.m() that is called
		 * the the compiler needs to check if there is
		 * a m()method in the XXX class, and there is
		 * but it throws a checked exception, so this
		 * object needs to be in a try catch block 
		 */
				try{
					myXY.m();
				}
				catch(Exception e){
					System.out.println(e);
				}
		
		YYY myY=new YYY();
		/*
		 * YYY reference and the m()method in YYY
		 * class DOES NOT throw an exception
		 */
		myY.m();
	}
	
	static void q42(){
		/*
		 * see main
		 */
	}
	
	static void q43(){
		/*
		 * constructor can't call itself
		 */
		Barbie b = new Barbie("mydoll");
	}
	
	static void q44(){
		/*
		 * with indenting it is easier to 
		 * see what if belongs to what
		 * else
		 */
		boolean flag=true;
		/*
		 * if flag is true it goes to the
		 * second if
		 */
		if (flag)//1    
			if (flag)//2    
				System.out.println("True False");
			else// 3
				/*
				 * the way this if statement is 
				 * set up means that it can never
				 * be this option
				 */
				System.out.println("True True");
		else// 4    
			System.out.println("False False");
	}

}
