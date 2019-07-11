package com.noel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

//for question 25
import com.gretb.Base;
//import com.gaa.*;
import com.animal.*;



public class Questions {
	
	static void q23(){
		/*
		 * the date here is the first day of 2015
		 * so we take away one month and we get
		 * the first day in December, then we minus
		 * a day, we get the last day in November,
		 * which is the 30. so the date is then
		 * 2014-11-30
		 * we then add one year and we get
		 * 2015-11-30
		 */
		java.time.LocalDate dt = java.time.LocalDate.
				parse("2015-01-01").minusMonths(1).
				minusDays(1)
				.plusYears(1);
		System.out.println(dt);	
	}
	
	static void q24(){
		int c = 0;
		  JACK: while (c < 8){
		    JILL: System.out.println(c);
		/*
		 * prints out 0,1,2,3,4
		 * when c=3 that is still 
		 * NOT bigger than 3
		 * so it continues, and
		 * increments to 4 
		 * and enters the loop again
		 * and prints 4
		 * but c>3 is not true so it
		 * exits the loop the label JACK
		 */
		    if (c > 3)
		    	break JACK; 
		    else c++;
		  }//prints 0 1 2 3 4	
	}
	
	static void q25(){
		/*
		 * we have imported the Base class
		 * from com.gretb package, see top of
		 * file
		 */
		Base myBase=new Base();
		/*
		 * we have not imported com.gaa.Base2 or
		 * imported all from the class by going
		 * com.gaa.*;
		 */
		com.gaa.Base2 myBase2=new 
				com.gaa.Base2();
		
		Shark jaws=new Shark();
		Snake sammy=new Snake();
		/*
		 * Ape is NOT available as we
		 * have imported only the classes
		 * from com.animal, which are
		 * Sharks and Snakes
		 */
		//Ape myApe=new Ape();
		com.animal.mammal.Ape magilla=
				new com.animal.mammal.Ape();
		
	}
	
	static void q26(){
		Automobile  a = new Automobile();
	      Truck t  = new Truck();
	      /*
	       * calls the Automobile drive method
	       * prints "Automobile: drive"
	       */
	      a.drive(); //1
	      /*
	       * calls the Truck drive() method
	       * prints "Truck: drive"
	       */
	      t.drive(); //2
	      /*
	       * a is a superclass of T
	       * Automobile is a superclass of Truck
	       * so we now have a Automobile 
	       * reference to a Truck object,
	       * what method is called depends
	       * on what type of object this is
	       * it is a truck
	       * so calls the Truck drive()method
	       */
	      a = t;     //3
	      //prints Truck:drive
	      a.drive(); //4
	}
	
	static void q27(){
		try{
			/*
			 * this is trying to format a LocalDate using
			 * a DateTimeFormatter so this will throw a
			 * UnSupportedTemporalTypeException which
			 * is a runtime exception
			 */
			System.out.println(LocalDate.of(2015, Month.JANUARY, 
				01).format(DateTimeFormatter.ISO_DATE_TIME));
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		LocalDateTime myLocalTime=LocalDateTime.of(2222, 
				Month.DECEMBER, 25, 13, 0);
		/*
		 * however we can format a dateTime with a 
		 * date formatter
		 * will print 2222 25 12
		 */
		System.out.println(myLocalTime);
		System.out.println(myLocalTime.format
				(DateTimeFormatter.ISO_DATE));	
	}
	
	static void q28(){
		int j = 1;
		try{
			/*
			 * doIt throws an exception
			 * so the rest of the calculation
			 * does not happen 
			 * so j keeps it's original value
			 * which was 1
			 */
			int i = doIt() / (j = 2);
			} catch (Exception e){
				//System.out.println(e);
				System.out.println(" j = " + j);
				}	
	}
	//for question 28
	public static int doIt() throws Exception {
		throw new Exception("FORGET IT");
		}
	
	static void q29(){
		/*
		 * a abstract method HAS NO BODY
		 * void abMethod();
		 * if a method has a body,you 
		 * have to remove the abstract keyword
		 * from it
		 */
	}
	
	static void q30(){
		//see below method
	}
	//for question 30
	/*
	 * this is a method called main that
	 * returns an int
	 */
	public static int main(String[]args){
		/*
		 * not valid provide data type only
		 * once if you have multiple variable
		 * declarations on the one line
		 */
		//double x=10,double y=8;
		//this is valid
		double x=10,  y=8;// 3         
		//System.out.println[]; // 4 
		for(int k =0; k<x; k++){ } //5 
		return 0;
	}
	
	static void q31(){
		int i = 0;
	      for (i=1 ;  i<5  ; i++) 
	    	  /*
	    	   * code will skip whatever 
	    	   * comes after continue during
	    	   * each iteration of loop
	    	   */
	    	  continue;  //(1)
	      System.out.println(i+" after first loop");
	      
	      for (i=0 ;       ; i++){
	    	  System.out.println("second loop");
	    	  /*
	    	   * this loop exits at this 
	    	   * point when it first enters
	    	   * i is not incremented
	    	   */
	    	  break; }      //(2)
	      System.out.println(i+" after second loop");
	      /*
	       * takes the last value of i which was
	       * 0
	       * second condition is false
	       */
	      for (    ; i<5?false:true;    ){
	    	  int count=0;
	    	  System.out.println(count++);
	      };     //(3)
	      System.out.println(i+" after third loop");	
	}
	
	static void q32(){
		/*
		 * protected members of a class can be
		 * accessed from the same package and
		 * also can be accessed from sub classes
		 * regardless of what package the class
		 * that is trying to access the variable
		 *  is currently in
		 */
	}
	
	static void q33(){
		Integer intNum=4;
		Double doubleNum=(double)4;
		Float floatNum=(float)4;
		//this will ALWAYS return true
		System.out.println(intNum.equals(intNum));
		/*
		 * if different classes this will always
		 * return FALSE
		 */
		System.out.println(intNum.equals(floatNum));
		Integer a;
		Integer b;
		Integer c;
		c=4;
		a=b=c;
		/*
		 * all combinations of equals with the a,b, and 
		 * c will return true
		 */
		System.out.println(a.equals(b));
		System.out.println(b.equals(a));
		/*
		 * == checks if same object
		 * when you use the "new" keyword you 
		 * are creating a new object
		 */
		a=new Integer(4);
		//will print false
		System.out.println(a==b);
		System.out.println("checking"+(b==c));
		//will print true as both 4
		System.out.println(a.equals(b));
	
	}
	

}
