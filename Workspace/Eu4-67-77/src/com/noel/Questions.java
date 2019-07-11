package com.noel;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Questions {
	static void q67(){
		/*
		 * overloaded methods have a different
		 * parameter list or order of parameters
		 * and return type DOES NOT matter
		 * if the method name differs in
		 * only the case of the words, then
		 * they are DIFFERENT methods
		 * i.e void eat() is a different
		 * method from void Eat()
		 */
	}
	
	static void q68(){
		int x = 10, y = 20;
		int dx, dy;
		try{
			/*
			 * dx is 0 as
			 * x is 10
			 * so 10%5 is 0
			 */
			dx = x % 5;
			/*
			 * this throws AritmeticException
			 * as dx is 0, y is 20
			 * dy=20/0
			 */
			dy =y/dx;
			}catch(ArithmeticException ae){
				System.out.println("Caught AE"); 
				dx = 2; 
				/*
				 * dy =20/2
				 * dy=10
				 */
				dy = y/dx; 
				}
		x = x/dx;//x=10/2 x is 5
		y = y/dy;//y=20/10 y is 2
		System.out.println(dx+" "+dy);
		System.out.println(x+" "+y);	
	}
	
	static void q69(){
		/*
		 * you do not have to worry about size of
		 * an arraylist when adding elements to 
		 * the ArrayList
		 * if you array is only half full then it
		 * does consume less memory, however every
		 * arraylist has an initial size of 10, so
		 * when you add a element to any arraylist
		 * bigger than this, what you are actually
		 * doing is in the background creating another
		 * array of +1 size and adding the element
		 * to it
		 * Arrays and arraylist are NOT thread safe
		 */
		/*
		 * this is type safe code, which arrays and 
		 * arraylist allow you to do
		 * so you can only add a String to this
		 * arraylist, that is what being type
		 * safe is
		 */
		ArrayList<String> al = new ArrayList<>();
		/*
		 * if you do not supply a type for
		 * an arraylist, it then has a type by
		 * default of Object and can store
		 * ANY object
		 */
		ArrayList al2=new ArrayList<>();
		System.out.println(al2);//
		/*
		 * you have to supply a type to
		 * to an array or it will not compile
		 */
		//[]myArray;//will not compile	
	}
	/*
	 * for question 70
	 */
	static String j = "";
	public static void method( int i){
		try{
			if(i == 2){
				throw new Exception();
				}
			j += "1";
			}
		catch (Exception e){
			j += "2";
			return; 
			}
		finally{
			j += "3";
			}
		j += "4";
		}
	static void q70(){
		method(1);
		method(2);
		System.out.println(j);	
	}
	
	static void q71(){
		/*
		 * an abstract method has no body.
		 * an abstact method can only exist in 
		 * an abstract class or an interface, so the
		 * class has to be also declared abstract.
		 * for a method to be considered abstract
		 * in a abstract class you have to use
		 * the keyword "abstract" before the 
		 * method name.
		 * you do not have to use the keyword
		 * "abstract" for methods in a interface
		 * as all methods without a body in a
		 * interface are abstract and public
		 * by default
		 * 
		 */
	}
	
	static void q72(){
		/*
		 * a condition has to be initialised 
		 * before it can be used in a switch
		 * 
		 * you can only use byte, short, ints,
		 * chars,strings and enums in a switch.
		 * the wrapper equalivent of the above
		 * primitvie variables can also be 
		 * used
		 * you can also assign a literal
		 * value to wrapper, like
		 * we do with the Integer wrapper
		 * condition
		 */
		Integer condition=12;
		switch( condition ){ 
		case 1: 
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3 :
			System.out.println("3");
			break;
			}
		/*
		 * here the number 1 is an int
		 * and you can't create a Short
		 * wrapper object with an int
		 * so you have to cast 1 to 
		 * be of type primitive short
		 */
		Short myShort=new Short((short)1);
		/*
		 * all wrapper objects can take
		 * a string object and try and parse
		 * it to the correct wrapper type
		 */
		Short myShort2=new Short("2");
		/*
		 * so it can take any rubbish
		 * , but this wil generate a
		 * NumberFormatException
		 */
		//Short myShort3=new Short("banana");
		Byte myByte=new Byte((byte)1);
	}
	
	static void q73(){
		String[][][] arr={{{"a", "b" , "c"}, 
			//we are accessing this null
			{ "d", "e", null } },
				{ {"x"}, null },
				{{"y"}},
				{ { "z","p"}, 
					{} }};
		System.out.println(arr[0][1][2]);
	}
	
	//for question 74
	String global = "111";
	static void q74(){
		Questions ct = new Questions();
		System.out.print(ct.parse("333"));	
	}
	//for question 74
	public int parse(String arg){
		int value = 0;
		try{
			String global = arg;
			value = Integer.parseInt(global);
			}
		catch(Exception e){
			System.out.println(e.getClass());
			}
		System.out.print(global+" "+value+" ");
		return value;
		}
	
	static void q75(){
		/*
		 * creating our ArrayList of Data objects
		 * and adding three new Data objects
		 * to the arraylist with the value variables
		 * of 1,2 and 3
		 */
		ArrayList<Data> al = new ArrayList<Data>();
		al.add(new Data(1));
		al.add(new Data(2));
		al.add(new Data(3));
		
		Questions myQuestion=new Questions();
		/*
		 * method takes a data arrayList
		 * and predicate lambda (this could
		 * also take a class that implements
		 * the predicate interface)
		 * see Cat class
		 */
		myQuestion.printUsefulData(al,
				(Data d)-> { 
					return d.value>2; 
					});
		myQuestion.printUsefulData(al, d-> d.value>2 );
		/*
		 * Cat implements the Predicate interface
		 * so we can use this as well
		 */
		myQuestion.printUsefulData(al,new Cat());
		/*
		 * if you write return java is 
		 * expecting the full message
		 * body, so you need to include
		 * the curly brackets if including
		 * return, this will not compile
		 * myQuestion.
		 * printUsefulData(al, (d)-> return d.value>2;  );
		 */	
		/*
		 * this will no work, as the Data d, has
		 * to be surrounded by a bracket
		 * myQuestion.printUsefulData(al, 
		 * Data d-> d.value>2  );
		 * this will work
		 */
		myQuestion.printUsefulData(al, 
				(Data d)-> d.value>2);
		/*
		 * semi colons only exist within
		 * a lambda if you have curly brackets,
		 * curly brackets signifiy a method
		 * body
		 * myQuestions.printUsefulData(al, 
		 * d -> d.value>2;);
		 */
	}
	/*
	 * for question 75
	 */
	/*
	 * this method takes an array and a predicate
	 * that uses a Data object, a predicate is lambda
	 * or class that implements the predicate interface
	 * that has one method inside it called test.
	 * this abstract method takes any object
	 * and returns a boolean. in this example
	 * our predicate can only take a Data object
	 */
	public void printUsefulData(ArrayList<Data> 
	dataList, Predicate<Data> p){
		for(Data d: dataList){
			/*
			 * if p.test returns true
			 */
			if(p.test(d)) 
				System.out.println(d.value);
			} 
		}
	
	static void q76(){
		
	}
	
	static void q77(){
		int i = 1;
	       int[] iArr = {1};
	       incr(i) ;
	       incr(iArr) ;
	       System.out.println( "i = " + i + "  "
	       		+ "iArr[0] = " + iArr [ 0 ] ) ;	
	}
	/*
	 * for question 77
	 */
	public static void incr(int   n ) { n++ ; }
    public static void incr(int[ ] n ) { n [ 0 ]++ ; }
	
	

}
