package com.noel;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Question 39
/*
 * this would import all methods of the class
 * with this line included we could then
 * go Statics.statInt
 */
//import com.gretb.Statics;
/*
 * this will import all classes in this package
 * but not the sub classes
 */
//import com.gretb.*;
/*
 * import satements have to inserted at top
 * of file, after the package statement
 * This will just import the static members 
 * that 
 * are public or protected if we have a 
 * derived
 * class in this file
 */
import static com.gretb.Statics.*;
/*
 * this command will import everything thats public or 
 * protected if we currently are in a 
 * derived class
 */
//import com.gretb.Statics.*;
/*
 * we can import individual static members as 
 * long as 
 * they are public, or protected if in a 
 * derived class.
 * the publicAccess method has public 
 * access level
 * so we can import it
 */
//import static com.gretb.Statics.publicAccess;
/*
 * we have no access to the static method accessMe
 * as this has default level access
 */

public class Questions implements Behaviour {
	
	static void q34(){
		/*
		 * Return type can be any class since all 
		 * objects can be cast to Object.
		 */
		/*
		 * also covariant return types are allowed, 
		 * which
		 * are subclasses of the return type
		 */
		/*
		 * but the return type CANNOT be a primitive
		 * overriden methods cannot be any less
		 * visible i.e if method in super class
		 * is public, it MUST be public in the sub
		 * class
		 */
		}
	
	static void q35(){
		//can access static final variables of an 
		//interface
		System.out.println(Behaviour.beInt);
		//or if the class implments the interface you can also go
		System.out.println(beInt);	
	}
	static void q36(){
		//careful that main has to be
		/*
		 * public static void main(String args[]){
		 * }
		 *anything else will give an error, as in this question
		 *this main returns a long
		 */
	}
	static void q37(){
		/*
		 * make sure it is 
		 * import java.util.List;
		 * you import
		 */
		 List s1 = new ArrayList();
	      s1.add("a");
	      s1.add("b");
	      //adds C at position 2
	      s1.add(1, "c");
	      /*
	       * this is a new list from position 1 to position 1
	       * a empty list
	       */
	      List s2 = new ArrayList(s1.subList(1, 1) );
	      //so this is adding nothing to our list
	      s1.addAll(s2);
	      //prints out a,c,b
	      System.out.println(s1);
	      
	      ArrayList<Integer> numList=new ArrayList<>();
	      numList.add(34);
	      numList.add(56);
	      System.out.println(numList);
	}	
	static void q38(){
		/*
		 * see class super and class sub at end of
		 * file
		 */
		Animal andy=new Animal();
		Dog spot=new Dog();
		//will not work
		/*
		 * can't have a superclass object
		 * and a sub class reference
		 */
		//spot=andy;
		/*
		 * a sub class can always be cast to
		 * be a superclass
		 */
		andy=(Animal)spot;
		andy=spot;
		Super s1 = new Super(); //1
	      Sub s2 = new Sub(); 
	      //a subclass can ALWAYS be cast to be of type superclass
	      s1 = (Super)s2;   
	      //likewise this also works
	      s1=s2;
	}
	
	static void q39(){
		/*
		 * see Top of file for code relating to this 
		 * question
		 */
	//System.out.println(Statics.);
		//we are only importing the static members of this 
		//class
		/*
		 * this is the proper way to then access
		 * statics
		 * the only available methods and variables 
		 * are then the methods and variables that
		 * have the public access level
		 * import static com.gretb.Statics.*;
		 */
		System.out.println(statInt);
		//System.out.println(Statics.statInt);
		/*
		 * as we are only importing the statics
		 * members  of a class we do not have access to 
		 * Statics class itself, hence this will 
		 * an error
		 */
		//System.out.println(Statics.statInt);
		/*
		 * answer is 
		 * import com.foo.*;;
		 */
}
	
	static void q40(){
		
		Cat tibbles = new Cat();
		Siamese sam=new Siamese();
		/*
		 * tibbles is a Cat class reference that
		 * points to a Siamese object. its the
		 * same object sam points to
		 */
		tibbles=sam;
		/*
		 * so both objects are the same class,
		 * but have different references
		 */
		System.out.println(tibbles.getClass());
		System.out.println(sam.getClass());
		/*
		 * takes implementation of eat() from
		 * the Siamese class
		 */
		tibbles.eat();
		sam.eat();
		/*
		 * tibbles does not have access to the
		 * drink method as tibbles is a Cat 
		 * reference and there is no drink()
		 * method in the Cat class.
		 * there is only a drink method in the
		 * subclass of Cat, Siamese
		 */
		sam.drink();
		//tibbles.drink();
	}
	
	static void q41(){
		/*
		 * create objects of each class
		 * see Animal class
		 */
	}
	static void q42(){
		/*
		 * this is a object reference to a wrapper
		 * object
		 */
		Object t = new Integer(107);
		Integer number=new Integer(23);
		/*
		 * you have access to all the methods
		 * of the Integer class as this is a
		 * integer reference to an Integer 
		 * object
		 */
		number.intValue();
		Animal andy=new Animal();
	/*
	 * t only has access to the methods of 
	 * the object class, and if these objects
	 * are overriden in the Integer class, it 
	 * will take the implementation from the 
	 * Integer class
	 */
		/*
		 * this calls the object class
		 * toString()method, which prints
		 * out the address
		 */
		System.out.println(andy);
		/*
		 * there is a a Overriden toString
		 * method in the Integer class
		 * that returns a int to display
		 */
		System.out.println(t.toString());
		System.out.println();
		/*
		 * the . operator has a higher precedence
		 * than the cast operator, so t.intValue is
		 * attempted to call first
		 * the Object t only has access to the methods 
		 * defined in the Object class, there is no 
		 * method in the object class called intValue
		 * so this will not compile
		 */
		//int k = (Integer) t.intValue()/9;
		/*
		 * we have to surround t and the cast with
		 * a bracket first to force the cast to be 
		 * called first
		 */
		int k = ((Integer) t).intValue()/9;
		/*
		 * we do the exact same with the follwing example
		 * returnInt()is only defined in the Siamese
		 * class, so the catSiamese object is not able
		 * to access any implmentation of this method
		 */
		Cat catSiamese=new Siamese();
		//Siamese sam=(Siamese)catSiamese;//
		/*
		 * the . operator has higher precedence than 
		 * cast, so we have to put the cast in a bracket
		 * to force the cast to come first
		 */
		int num=((Siamese)catSiamese).returnInt();
		/*
		 * has no access to the method returnInt as the
		 * .operator is called before the cast
		 */
		//num=(Siamese)catSiamese.returnInt();
			
		/*
		 * can't have a primitive reference to 
		 * a object, so we can't have a int reference
		 * to a Integer
		 */
		//int k=t;
		//we have to cast it
		k=(int)t;
		//this also works
		k=(Integer)t;
		Short snum=45;
		/*
		 * converting between Integers and ints is no issue
		 */
		number=new Integer(222);
		k=number;
		number=k;
		k=snum;
		//snum=k;
		/*
		 * can't assign one wrapper type to another
		 * and you can't even cast it.
		 * as they are classes that have no relationship
		 * to one another
		 */
		//number=(Integer)snum;
		/*
		 * but you can do this
		 */
		number=(int)snum;
		//can't do this as an int cannot fit inside a short
		//snum=(short)number;
		
		short snum2=2;
		byte byteNum=34;
		/*
		 * can only be cast to be of type int	
		 */
		//number=(short)snum2;
		number=(int)snum2;
		//not an integer as a byte has no relatship to a Integer
		//number=(Integer)byteNum;
		number=num;
		
		Short shortNumber=45;
		Byte byteNumber=23;
		number=(int)shortNumber;
		number=(int)byteNumber;
		//this will not work
		//number=(Integer)shortNumber;
		//this will work
		number=(Integer)num;
		System.out.println(number);
		System.out.println(k);
		System.out.println(snum);
	}
	
	static void q43(){
		/*
		 * looking for a lambda expression that takes
		 * a list and a predicate that acts on a 
		 * arraylist and returns a boolean
		 */
		/*
		 * this takesn a arrayList and the method 
		 * isEmpty returns a boolean to state
		 * if the list is empty or not
		 */	
		boolean b=checkList(new ArrayList(), al -> al.isEmpty());
		/*
		 * wrong syntax al is  a list not arrayList and 
		 * has (List al) has to be surrounded by brackets
		 */
		//b=checkList(new ArrayList(), ArrayList al -> al.isEmpty());
		/*
		 * body needs to be put in curly brackets
		 */
		/*b=checkList(new ArrayList(), 
		al -> return al.size() == 0);*/
		/*
		 * so we use this instead
		 * if size is 0 will return true
		 */
		b=checkList(new ArrayList(), al -> 
		{ 
			return al.size() == 0; 
			}
		);
		/*
		 * returns true if something
		 * is added to the list
		 */
		b=checkList(new ArrayList(), al -> al.add("hello"));
		
		//b=checkList(new ArrayList(), (ArrayList al) -> al.isEmpty());
		b=checkList(new ArrayList(), (List al) -> al.isEmpty());
	}
	
	public static boolean checkList(List list, Predicate<List> p)
	{
		return p.test(list);
		}
	
	static void q44(){
		/*
		 * in main we have
		 * public class MyFirstClass{   
		 * public static void main(String[] args)
		 * 
		 *we are accessing the second argument sent to 
		 *main, if we do not send to arguments to main
		 *we get arrayIndexOutOfBounds as when we 
		 *send two arguments to main, we are then
		 *sending it an array of size two
		 *and the below command can only access 
		 *an array of size two and the second
		 *argument in the array
		 *
		 * {      System.out.println(args[1]);   } }
		 */
		/*
		 * javac MyFirstClass.java
			java MyFirstClass hello hello
		 */
	}
}
//question 38
class Super {  }
class Sub extends Super {  }
//question 40
class Cat{
	void eat(){
		System.out.println("cat eat");
	}
}
class Siamese extends Cat{
	@Override
	void eat(){
		System.out.println("siamese eat");
	}
	void drink(){
		System.out.println("siamese drink");
	}
	
	int returnInt(){
		return 0;
	}
}




