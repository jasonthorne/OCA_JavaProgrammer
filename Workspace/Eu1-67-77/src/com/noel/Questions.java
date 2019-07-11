package com.noel;

public class Questions {
	static void q67(){
		Integer i = new Integer(1) ;
		Long m = new Long(1);
		if( i.equals(m)) 
			/*
			 * the equals method of All WRAPPER classes
			 * first checks if both objects are the
			 * same wrapper class, if they are not
			 * the same class then the will return false.
			 * two wrapper objects of different
			 * wrapper classes (as here Integer and 
			 * Long) with the same values can 
			 * NEVER return true with the equals()
			 * method
			 */
			System.out.println("equal");// 1 
		else System.out.println("not equal");
	}
	
	static void q68(){
		//bool not valid keyword
		//bool b = null;
		/*
		 * boolean can only be set to true or false
		 */
		//boolean b = 1;
		/*
		 * this might look strange but this is allowed
		 * true IS true and false IS false
		 * and this does not short circuit so both
		 * sides will be evaluated
		 */
		boolean b = true|false;
		System.out.println(b);
		/*
		 * bool not valid keyword,
		 * but (10>11) is a valid boolean value
		 * as this is false, 10 is NOT greater
		 * than 11
		 */
		//bool z=(10>11);
		b=(10>11);
		/*
		 * this is the short circuit operator, only the 
		 *left of the || will be performed if it is true,
		 *which is the case here
		 */
		b = true||false;
	}
	
	static void q69(){
		/*
		 * you can't override a non static method with a 
		 * static method or vice vearsa
		 * 
		 * an sub interface can re declare a default method 
		 * and also make it abstract
		 * 
		 * a interface can re declare a default method
		 * in a sub interface
		 * 
		 * static methods can NEVER be abstract
		 * 
		 * a static method in a interface has 
		 * to have a body
		 * 
		 * a default method in an interface
		 * has to have a body
		 * 
		 * 
		 */	
	}
	
	static void q70(){
		/*
		 * see interface ConsTest as
		 * all variables of a interface are
		 * implicitly public final and static
		 */
	}
	
	static void q71(){
		String str1="patsy";
		String str2="Margaret";
		str1.equals(str2);
		str1.equalsIgnoreCase(str2);
		//no such method as prune()
		/*
		 * append()is a method of the Stringbuilder
		 * and StringBuffer class
		 */
		//intern returns the string of a string
		String name=new String("mary");
		String name2=new String("mary");
		System.out.println(name==name2);
		//String name3="mary";
		//System.out.println(name3==name2.intern());
		System.out.println(name2.intern()==name.intern());
		System.out.println(name2==name.intern());
		/*
		 * When the intern method is invoked, 
		 * if the pool already contains a string 
		 * equal to this String object as determined 
		 * by the equals(Object) method, then the 
		 * string from the pool is returned. Otherwise, 
		 * this String object is added to the pool 
		 * and a reference to this String object is returned.
		 */
	}
	
	static void q72(){
		boolean greenLight = true; 
		boolean pedestrian = false; 
		boolean rightTurn = true;
		boolean otherLane = false;
		/*
		 * this evaluates to true
		 */
		System.out.println(rightTurn && !pedestrian || otherLane); 
		/*
		 * if the first part of this equation evaluates to true
		 * then the short circuit or || means that the second 
		 * part is not evaluated
		 */
	}
	
	static void q73(){
		String a="java";
		char[] b = { 'j', 'a', 'v', 'a' };
		String c = new String(b);
		String d = a;
		//will return true
		System.out.println((a == d));
		//cannot be compared as they are different types
		//System.out.println((b == d));
		System.out.println((a == "java"));
		System.out.println(a.equals(c));
	}
	
	static void q74(){
		/*
		 * A class can be extended unless 
		 * it is declared final. 
			An inner class can be declared static 
			and still be extended. Notice the distinction. 
			For classes, final means it cannot be extended, 
			while for methods, final means it cannot 
			be overridden in a subclass.
			The native keyword can only be used on methods, 
			not on classes and instance variables.
		 */
	}
	static void q75(){
		/*
		 * anything that trys to access i 
		 * in class B (outside of class B)
		 * or j in class A (outside of class A)
		 * will fail as both of these variables
		 * are marked private
		 */
	}
	
	static void q76(){
		
		System.out.println("test");
		
		String[] dataList = {"x", "y", "z"};
		/*
		 * will print x three times, with
		 * the number 1,2,3
		 * this process will be repeated
		 * for y and z
		 */
		for(String dataElement:dataList){
			int innerCounter=0;
			while(innerCounter<dataList.length){
				System.out.println(dataElement + ", " + innerCounter);
				innerCounter++;
			}
		}
	}//end of method
	
	static void q77(){
		Integer i1 = 1; 
		Integer i2 = new Integer(1); 
		int i3 = 1; 
		Byte b1 = 1; 
		Long g1 = 1L;
		/*
		 * will return false as different
		 * objects
		 */
		System.out.println(i1 == i2);
		/*
		 * will return true as i1 is an 
		 * integer, with the value of 1 
		 * and i3 is an int with the
		 * value of 1.The integer will
		 * be unboxed and it's value 
		 * compared with the int
		 */
		System.out.println(i1 == i3);
		/*
		 * will not compile as can't 
		 * compare two different wrapper
		 * data classes with each other.
		 * here it's the Integer i1 and
		 * the Byte b1
		 */
		//System.out.println(i1 == b1);
		/*
		 * equals can't take ANY data type
		 * The equals method of all wrapper classes 
		 * first checks if the two object are of same 
		 * class or not. If not, they immediately 
		 * return false.
		 * different objects but have same value,
		 * so will return true
		 */
		System.out.println(i1.equals(i2));
		/*
		 * unboxes the integer i1 value compares
		 * it with the int i3 value
		 */
		System.out.println(i1.equals(i3));
		/*
		 * if objects of different types
		 * equals will always return false
		 * even if the same numeric value
		 */
		System.out.println(i1.equals(g1));
		/*
		 * the equals method can take ANY 
		 * object
		 */
		Dog spot=new Dog();
		System.out.println(i1.equals(spot));
		/*
		 * will print false as pointing to 
		 * different objects
		 */
		
	}

}
