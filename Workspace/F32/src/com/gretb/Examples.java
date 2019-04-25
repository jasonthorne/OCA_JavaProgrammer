package com.gretb;
/*
 * the difference between 
 * PASS BY VALUE
 * and 
 * PASS BY REFERENCE
 * all primitive variables are passed by value
 * all objects are passed by reference
 */
public class Examples {
	
	static void ex1() {
		int num=4;
		double dNum=4.5;
		/*
		 * the initial value of num is 4
		 * and dNum is 4.5
		 * when you pass a primitive variable to a method it is passed
		 * by VALUE, which means it's just the number 4 and the number
		 * 4.5 that is passed
		 * before the method the values will be 4 and 4.5
		 */
		System.out.println("before method call num "+num+" dNum "+dNum);
		byValue(num,dNum);
		/*
		 * after the method call the values are still 4 and 4.5
		 */
		System.out.println("After method call num "+num+" dNum "+dNum);
		
	}//end of ex1 method
	
	static void ex2() {
		//pass by reference
		Dog spot=new Dog();
		/*
		 * the dog just created has a name of "andy" and an age of 10
		 * so we will change both
		 */
		spot.age=50;
		spot.name="spot";
		System.out.println("age of spot "+spot.age);
		System.out.println("name of spot "+spot.name);
		/*
		 * when you pass an object into a method, you can't change what
		 * that object refers to inside of the method.
		 * if i pass my dog into a method, if i assign a different dog to
		 * this variable, it will still be my dog that returns, not the
		 * changed Dog
		 */
		byRef(spot);
		System.out.println("after method call "+spot.age);
		System.out.println("after method call "+spot.name);
		/*
		 * objects are passed to methods by reference, which means
		 * you can't change what an object refers too (if i pass my dog
		 * into a a method, it's my dog that comes back) but you can 
		 * change the atributes of the object (i can change the name, age
		 * , weight, height of the dog and all this will then be changed 
		 * outside of the method)
		 */
		byRef2(spot);
		System.out.println("after byRef2 method call age "+spot.age);
		System.out.println("after byRef2 method call name "+spot.name);
		
	}//end of ex2 method
	
	private static void byRef(Dog spot) {
		/*
		 * if you try to change what the object refers too inside a method
		 * the dog originally referred does not change
		 * the dog in ex2 will still be the Dog that is called Spot
		 * and has an age of 50.
		 * inside the method it will be a different dog with a name of
		 * Andy and an age of 10 
		 */
		spot=new Dog();
		System.out.println("inside method name is "+spot.name);
		System.out.println("inside method name is "+spot.age);
	}
	
	private static void byRef2(Dog spot) {
		spot.age=spot.age*2;
		System.out.println("inside byRef2 age is "+spot.age);
	}
	
	private static void byValue(int num, double dNum) {
		//we are changing the value of the int sent to this method
		num=num*2;
		//we are changing the value of the double sent to this method
		dNum=dNum*10;
		System.out.println("num inside method is "+num);
		System.out.println("dNum inside method is "+dNum);
	}

}
