package com.android;

import java.util.function.Predicate;

//import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		/*
		 * lambda work only for interfaces that have ONE abstract
		 * method contained within them. If you have more than one
		 * abstract method, you can't create a lambda for that interface
		 * The Behaviuor interface has ONE abstract which is
		 * boolean mad(String myString), so we can create a lambda
		 * for this interface. with a lambda we can directly implement
		 * the method contained within the interface, we do not need
		 * a class to implement the interface.
		 * a lambda has as a reference the interface that contains
		 * the method mad, here it's a Behaviour reference on the
		 * left hand side.
		 * on the right hand side we first have the parameter list
		 * of the mad method, which is a just a string, here we 
		 * surround the parameter list with a pair of braces (). 
		 * we follow the parameters ALWAYS with a a arrow (->). we then
		 * follow the arrow with the body of the mad() method. The
		 * mad method has to return a boolean, so here we simply 
		 * write "return false". if you have more than one line of code
		 * in your lambda body, you have to have curly brackets {}.
		 * if you have a return statement in your lambda, you have to
		 * have curly brackets
		 */
			Behaviour myBehave=(String myStr)->{
				System.out.println("myBehave lambda that implements "
						+ " the mad method of the Behaviour interface");
				return false;
			};
			myBehave.mad("hello there");
			/*
			 * this is the shortest form of lambda you can have for
			 * the mad method in the Behaviour interface
			 * you have to give the parameter in your parameter list
			 * a name, but you dont' have to give a type, because java
			 * knows that myStr is a String. you do not have to put
			 * a pair of braces around the parameter list like so
			 * (str)
			 * as soon as you put in a type in the parameter list
			 * you have to surround the parameter list with a pair
			 * of braces, like so (String str)
			 * the body does not have to have curly braces if only
			 * one line of code, also it does not have to have a 
			 * return statement as long as whatever is after the arrow
			 * returns a boolean in this case
			 */
			Behaviour myBehave2=str->false;
			System.out.println(myBehave2.mad("hello"));
			//this lambda also works, as 12>30 evaluates to false
			Behaviour myBehave3=str->12>30;
			Behaviour myBehave4=(String str)->14<20;
			//as soon as  you have the keyword "return" your body
			//has to be enclosed in curly brackets
			Behaviour myBehave5=str->{
				return false;
			};//has to be a semi colon at the end of your code
			/*
			 * in this case as soon as we have curly brackets, we have
			 * to have a return statement in the curly brackets
			 */
			Behaviour myBehave6=str->{
				System.out.println("myString is "+str);
				return false;
			};
			myBehave6.mad("Apple");
			/*
			 *overriding the void run() method in the Movement interface.
			 *the parameter list has to be a pair of empty braces
			 */
			Movement myMove=()->System.out.println("myMove run lambda");
			Movement myMove2=()->{
				System.out.println("myMove2 run lambda");
				return;
			};
			myMove.run();
			myMove2.run();
			//generic types can ONLY BE objects, not primitives
			Box<Dog>boxDog=new Box(new Dog());//type T will be a Dog
			//type T will be a String
			Box<String>boxStr=new Box("hello");
			//the int 15 will be autoboxed into an Integer wrapper object
			Box<Integer>boxInt=new Box(15);
			//type T here is a dog
			System.out.println(boxDog.myT.getClass().getSimpleName());
			//type T here is a String
			System.out.println(boxStr.myT.getClass().getSimpleName());
			//type T here is an Integer wrapper object
			System.out.println(boxInt.myT.getClass().getSimpleName());
			
			//Box<Dog>boxDog=new Box(new Dog());
			//System.out.println(boxDog.myT.getClass().getSimpleName());
			/*
			 * here we are overriding the test() method in the Actions
			 * interface that takes a type t and returns a boolean
			 * Actions<String> determines type T to be a String.
			 */
			int age=15;
			String myStr="hello";
			Actions<String>strAction=(String Str)->{
				System.out.println("strAction lambda test method");
				boolean test=age>18;
				return test;
			};
			System.out.println(strAction.test(myStr));
			/*
			 * this is the simpliest lambda you can have for the test
			 * method, this takes a Dog object and returns true
			 */
			Actions<Dog>dogAction=spot->true;
			System.out.println(dogAction.test(new Dog()));
			Actions<Dog>dogAction2=rex->age>18;
			System.out.println(dogAction2.test(new Dog()));
			/*
			 * all of these are implementing the test(T t) method of the
			 * predicate interface which takes an object and returns a
			 * boolean
			 */
			Predicate<String>strPred=(String str)->{
				System.out.println("predicate test method strPred with String");
				return false;
			};
			
			Predicate<Dog>dogPred=spot->{
				System.out.println("predicate test method dogPred with Dog");
				return true;
			};
			
			Predicate<Integer>intPred=num->age<18;
			
			Integer number=new Integer(34);
			Integer number2=new Integer(34);
			Integer number3=new Integer("34");
			Integer number5=34;
			Double dnum=34.0;
			System.out.println(dnum.equals(number5));
			int num=34;
			System.out.println(number5==num);
			System.out.println(number.equals(number2));
	}

}
