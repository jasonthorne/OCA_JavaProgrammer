package com.android;

import java.util.concurrent.SynchronousQueue;

public class Local {
	
	void eat() {
		System.out.println(name);
	}
	/*
	 * these are instance variables/atributes i.e age, weight, height, etc
	 * we say the variable "name" is available the full LENGTH of the class.
	 * a instance variables is ALWAYS LONGER than a local variable or
	 * a method paramter. name and address is available ANYWHERE in the 
	 * Local class. 
	 * Access modifiers (private, protected, public) DO NOT AFFECT the
	 * scope of the variable. The String variable "name" is private and 
	 * is still available throughout the Local class
	 */
	private String name="mary";
	protected String address="Galway";
	/*
	 * where you declare a atribute does not matter, it is still available
	 * throughout the class
	 * however you usually declare your atributes of a class at the top
	 * of your class
	 */
	/*
	 * class variables or static variables belong to a a class, not to
	 * an individual object, a class variable is shared accross all objects
	 * (i.e everyone in this course has the same course id). So there is
	 * only ONE COPY per class of this variabl. whereas with an instance 
	 * variable every object has it's own copy. 
	 * i.e every person has an age, weight,height, etc
	 */
	static int courseId=78965;
	
	/*
	 * the method parameter, int num, can only be as long as the method
	 * accessLocal
	 * num is available ONLY in the accessLocal method
	 */
	void accessLocal(int  num) {
		//the number sent to the method is now doubled
		num=num*2;
		//we cannot access dnum before we create
		//FORWARD REFERENCEING is not allowed for local variables
		//System.out.println(dnum);
		/*
		 * a local variable is a variable that is declared inside curly
		 * brackets
		 * (a method, a loop,a enum, a inner class,an if, else, else)
		 * this is a local variable that is available from this point onwards
		 * ONLY in the accessLocal method. 
		 * Local variables can be as long as a method parameter, but never
		 * longer.
		 * we have a line of code BEFORE we declare these variables, that
		 * means that num is LONGER than dnum and doubleNumber
		 */
		double dnum=24,doubleNumer=4.5;
		//System.out.println(age);
		/*
		 * we can access any atributes of the local class in this method
		 */
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		/*
		 * instance methods can access all static and not static atributes
		 * of the class Local
		 */
		name="paddy";
		System.out.println(this.name);
		/*
		 * dnum is longer than dnum2
		 * this line will not compile as "FORWARD REFERENCING" to local
		 * variables is not allowed. can't access dnum2 before it is
		 * declared
		 */
		//System.out.println(dnum2);
		double  dnum2=3.45;
		
		Cat newCat=new Cat();
		if(age>19) {
			/*
			 * this is a local variable, that is only available inside
			 * the curly brackets of the if statement
			 */
			double weight=34.5;
			System.out.println(dnum2);
			System.out.println(dnum);
			dnum2=dnum2*2;//changes dnum to 6.9
			System.out.println(newCat);
			{
				/*
				 * this variable is local to this set of curly brackets
				 * which are inside the if statement curly brackets
				 */
				int newInt;
				/*
				 * we can access the variables of the enclosing scope
				 */
				System.out.println(weight);
			}
			/*
			 * can't access newInt as this is local to the above curly
			 * brackets
			 */
		//	System.out.println(newInt);
		}//end of if statement
		/*
		 * can't access weight as weight is local to to the if statement
		 * curly brackets
		 */
	//	System.out.println(weight);
		System.out.println(dnum2);
	//	int i=0;
		for(int i=0;i<4;i++) {
			/*
			 * the variable i is ONLY available within the for loop
			 * curly brackets
			 */
			System.out.println("i is "+i);
			/*
			 * when i is less than 2 do the following
			 * it will do this when i is 0 and i is 1
			 */
			if(i<2) {
				/*
				 * local variable j, which is o nly available within
				 * the If statement curly brackets.
				 * every variable outside of these curly brackets is
				 * available within here
				 */
				int j=4;
				System.out.println("j is "+j);
				System.out.println("we can access i"+i);
			}
			/*
			 * can't access j outside of the if statement
			 */
			//System.out.println(j);
		}//
		/*
		 * can't access i outside of the for loop
		 */
		//System.out.println(i);
	}//end of accessLocal method
	
	void accessMethod(int num, double dnum) {
		/*
		 * method parameters are accessible only in the method that 
		 * defines them. The scope of the method parameter may be as long
		 * as that of a local variable or longer, but it can NEVER be
		 * shorter
		 */
		int localInt=23;
		/*
		 * localInt has the same length as the method parameters num and
		 * dnum
		 */
		System.out.println(num+""+dnum+""+localInt);
		System.out.println(name);
	}
	/*
	 * a non static method can access both statics and non statics
	 */
	void accessStatic() {
		System.out.println(name);//instance variable
		System.out.println(courseId);//static variable
	}
	/*
	 * a static method CAN ONLY DIRECTLY ACCESS statics, so we can't access
	 * the atributes such as name, address and age in this method
	 */
	static void accessStatic2() {
		int number;
		//can only access statics
		System.out.println(courseId);
		//can't access non statics
		//System.out.println(name);
		//System.out.println(address);
		//System.out.println(weight);
		/*
		 * only way to access non static variables in a static method
		 * is to create a object of the class, and access the atributes
		 * through the object
		 */
		Local myLocal=new Local();
		System.out.println(myLocal.name);
		System.out.println(myLocal.address);
		System.out.println(myLocal.age);
	}
	
	
	int age=67;
}
