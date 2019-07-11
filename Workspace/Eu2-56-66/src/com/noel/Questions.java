package com.noel;
/*
 * this is for file input 
 * importing all the classes
 * from the java.io package
 */
import java.io.*;
import java.lang.*;
public class Questions {
	
	static void q56(){
		//see A class for explanation	
	}
	
	static void q57(){
		/*
		 * return type does not matter for 
		 * overloaded methods
		 * different parameter lists are what 
		 * make a method overloaded
		 * method signature is the name combined 
		 * with the position and variable type 
		 * of your parameters.
		 * same name with different parameters is 
		 * overloaded. Order matters
		 * same method name and method parameter and
		 * return type is overriden
		 * overriden method HAS to be in a different
		 * class
		 * Overloaded method CAN be in the same 
		 * class
		 * Overriden method is a polymorphic 
		 * method
		 */
	}
	
	static void q58(){
		int i = 0;
	      loop :         // 1 okay to do this
	      {
	         System.out.println("Loop Lable line");
	         try{
	            for (  ;  true ;  i++ ){
	            	/*
	            	 * even if the loop is
	            	 * broken out of, the finally
	            	 * will still execute
	            	 */
	               if( i >5) break loop;       // 2
	            }
	         }
	         catch(Exception e){
	            System.out.println("Exception in loop.");
	         }
	         //finally nearly always executes, one exception
	         finally{
	            System.out.println("In Finally");      // 3
	         }
	      }//end of label
	}
	
	static void q59(){
		Data d1 = new Data(10);
        d1.strVal = "D1";
        Data d2 = d1;
        d2.intVal = 20;
        System.out.println("d2 val = "+d2.strVal);
        /*
         * prints 
         * d2 val = D1
         */
	}
	
	static void q60(){
		/*
		 * import java.io.*; is the answer
		 * there is no include keyword in java
		 * this is imported automatically
		 * import java.lang.*;
		 */
		PrintWriter pw = new PrintWriter(System.out);
		OutputStreamWriter osw=new 
				OutputStreamWriter( System.out );
		pw.print("hello");
	}
	
	static void q61(){
		Square mysq = new Square(10);
        mysq.color = "red";
        mysq.setSide(20);
	}
	
	static void q62(){
		/*
		 * will print out cat
		 * none
		 */
		String input="c";
		switch(input){
			case "a" : System.out.println( "apple" );
			case "b" : System.out.println( "bat" );
			break;
			case "c" : System.out.println( "cat" );
			default:
				System.out.println( "none");
		}
	}
	
	static void q63(){
		C1 o1=new C1();
		C2 o2;
		C3 o3=new C3();
		/*
		 * need explicit cast
		 * and  yes this will compile but
		 * it will throw a class cast 
		 * exception as you can't cast
		 * a subclass reference to a superclass
		 * object
		 */try{
			 o3 = (C3)o1;
		 }
		 catch(Exception e){
			 System.out.println(e);
		 }
		
		/*
		 * no relationship between
		 * a C3 and a C2 object
		 */
		//o3 = o2;
		/*
		 * o3 is a C3 object which implements
		 * both the I1 and I2 interface so 
		 * both can be true
		 */
		I1 i1 = o3; 
		I2 i2 = (I2) i1;
		/*
		 * o3 is a C3 class object which implements
		 * the I1 interface as its superclass C1 implements
		 * the I1 interface
		 */
		I1 b = o3;
	}
	
	static void q64(){
		/*
		 * 43.0 moves decimal point one place
		 * to right
		 */
		double dnum=43e1;//430
		System.out.println(dnum);
		dnum=43e3;//43000
		System.out.println(dnum);
		/*
		 * 43.0 moves decimal point one place
		 * to the left
		 */
		dnum=43e-1;//4.3
		System.out.println(dnum);
		dnum=43e-3;//0.043
		System.out.println(dnum);	
	}
	
	static void q65(){
		
		//int m=34;
		char m=34;
		/*
		 * a long can't be in a switch statement
		 * can't be a byte as byte goes from
		 * -128 to 127, you can use a byte but
		 * not in this case as one of choices is
		 * 128
		 * A short can hold all values and shorts
		 * can be used in switch statement
		 */
		switch( m ){
		case 32: 
			System.out.println("32");
		break;
		case 64: 
			System.out.println("64");
		break;
		case 128://this will not allow byte
			System.out.println("128");
			break;
			}		
	}
	
	static void q66(){
		/*
		 * can have an enhanced for loop
		 * or this structure
		 * does not do anything but it is legal
		 */
		for(;;){		
		}
		
	}

}
