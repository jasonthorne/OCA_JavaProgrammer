package com.android;

import org.omg.Messaging.SyncScopeHelper;

public class Examples {
	
	static void ex1() {
		int age=5;
		/*
		 * the order is 
		 * IF
		 * ELSE IF
		 * ELSE
		 * If you have only one line of code after an if, else
		 * or else if,you do not have to have curly brackets {}
		 * the if and else if, always has opening and closing
		 * braces after them ()
		 * what goes in the braces is a boolean
		 */
		if(age>=18) {
			System.out.println("you are an adult");
		}//finish of if
		else if(age>12) {
			System.out.println("you are a teenager");
		}
		//else is the default case
		else //you can put in curly brackets if you want
			System.out.println("you are a child");//finish of else
		
		double weight=14.5;
		/*
		 * you can have an if statement all by itself, this
		 * will only trigger if the weight is greater than 20
		 * an if statement, does not have to have a else if
		 * or an else
		 */
		if(weight>20)
			/*
			 * one thing you cannot do if you only have one line
			 * of code after an if statement is declare a local
			 * variable. reason being you can't do anything
			 * with this LOCAL variable
			 */
		//	int num2=45;
			System.out.println("you are heavy");//if statement finishes here
			//if statement finishes here
		/*
		 * you can't have an else by itself, this does NOT belong
		 * to the previous if
		 */
		System.out.println("test prints ");
		/*
		 * you can't have any code of any type between an 
		 * if and and else, as else has to "belong" to an if
		 */
		//else {
			//this is just an else all by itself which you cannot have
		//}
		/*
		 * same rule for an else also applies to an else if
		 * if has to "belong" to an if, and there can be no
		 * code between it and an if or another else if or an
		 * else
		 */
	/*	else if() {
			//will not compile
		}*/
		/*
		 * you can have just an if and an else if
		 * if the weight is greater than 20, this will print
		 * nothing as we have no else (no default case)
		 */
		if(weight<15) {
			System.out.println("less than 15");
		}
		else if(weight<20) {
			System.out.println("less than 20");
		}
		/*
		 * you can have just an if and an else (you can only have
		 * 	ONE	 else, but you can MULTIPLE else if)
		 * else has to be last one
		 */
		if(weight>20) {
			System.out.println("weight is greater than 20");
		}
		else {
			System.out.println("weight is less than 20");
		}
		/*
		 * whatever you put in the testing condition of an if
		 * () or if else() has to evaluate to a boolean
		 * this is not valid as syso evaluates to a string
		 */
	//	if(System.out.println("this is not valid")) {}
		weight=45;//assigning 45 to the double variable weight
		System.out.println(weight==45);
		//this evaluates to true, so will print out
		//this will only evaluate to true in ONE circumstance
		//if weight is 45
		if(weight==45) {
			System.out.println("your weight is 45");
		}
		/*
		 * this will evaluate to true in an infinite amount
		 * of circumstances, as long as weight is NOT 45 this 
		 * will evaluate
		 */
		if(weight!=45) {
			System.out.println("the number is not 45");
		}
		String myString="hello";
		String myString2=new String("hello");
		/*
		 * any equals method of any object every created will
		 * return a boolean, so any equals method of any object
		 * can be used directly in a if statement
		 */
		if(myString.equals(myString2)) {
			System.out.println("two strings are the same");
		}
		/*
		 * this does not compile, because weight=45 is NOT A 
		 * BOOLEAN, this is in effect
		 * if(45){}
		 */
		/*if(weight=45) {
			
		}*/
		Dog spot;
		spot=null;
		int num=25;
		System.out.println(spot);//will print out fine
		/*
		 * this generates a NullPointerException as
		 * spot is a null object and a null object has not
		 * atributes. only a real Dog object has a name
		 */
		//System.out.println(spot.name);
		if(spot==null) {
			/*
			 * here we assign a Dog to the null Dog reference
			 * spot. that means that from this point onwards,
			 * everywhere in ex1() method, spot will refer
			 * to this Dog, a real honest to goodness Dog
			 */
			spot=new Dog();
			/*
			 * int num was created outside the curly brackets
			 * which means it's available inside these brackets
			 * and it also means that when we change it here, 
			 * it will be changed everywhere from this point 
			 * onwards in the ex1() method
			 */
			num=1000;
			/*
			 * this is a LOCAL variable, that is LOCAL to the
			 * curly brackets of this if statement, it will
			 * 	NOT	be available outside of the curly brackets
			 */
			double dnum=34.56;
		}
		//now spot has name, he no longer is null
		//spot himself is no longer, but his name is
		//as we have not assigned a name to spot
		System.out.println(spot.name);
		/*
		 * can't access dnum as it's local to the above if
		 * statements curly brackets
		 */
		//System.out.println(dnum);
		
		weight=5;
		if((weight+=40)>30) {
			System.out.println("will print out");
		}
		/*
		 * an if statement can check a boolean directly
		 */
		boolean test=true;
		if(test) {
			System.out.println("boolean is true");
		}
		if(test==true) {
			System.out.println("boolean true again");
		}
		/*
		 * this is assigning false to test thenc checking if
		 * test is true, which its not so this evaluates
		 * if(false)
		 */
		if((test=false)==true) {//this is false
			System.out.println("test is true");
		}
		else//so this prints out
			System.out.println("test is false");
		int num1=10,num2=50;
		if((num1+num2)>50) {
			System.out.println("number greater than 50");
		}
		
	}//end of ex1
	
	static void ex2() {
		int age=18;
		/*
		 * you don't have to have a body after an if statement
		 * however if you don't, you must have a semi colon after
		 * the closing braces
		 */
		if(returnMe());
		/*
		 * as soon as you use a else or an else if you can no
		 * longer use the semi colon at the end of the if 
		 * statement
		 */
	/*	if(returnMe());
		else*/
		if(returnMe()) {
		/*
		 * if you want nothing to appear after an if in if else
		 * statement, you have to put in empty curly brackets	
		 */
		}
	//	System.out.println("cannot put code in here");
		else {
			
		}		
	}
	
	static boolean returnMe() {
		int num=56;
		Dog spot=new Dog();
		String myStr="invisible";
		System.out.println("first line of code");
		System.out.println("second line of code");
		System.out.println("third line of code");
		return true;
	}
	
	static void ex3() {
		/*
		 * if no curly brackets, the body of  your if, else
		 * and else if can only have one line of code
		 */
		String name="lion";
		String name2=new String("lion");
		//should not use this
		System.out.println(name==name2);
		//use equals() insteead
		System.out.println(name.equals(name2));
		//use equals() instead
		if(name.equalsIgnoreCase("LION"))
			//one line of code don't have to have curly brackets
			System.out.println("I am a lion feed me meat");
		//this will not compile as this is a second line of 
		//code and we have not curly brackets after the if
		//statement
			//System.out.println("this line of code will not run");
		else if(name.equalsIgnoreCase("horse"))
			//one line of code don't have to have curly brackets
			System.out.println("I am a horse feed me hay");
		else {
			//more than one line of code, need curly brackets
			System.out.println("feed me cabbages ");
			System.out.println("I assume this animal is a hippo");
		}
		
		
		name="ostritch";
		/*
		 * if you have no curly brackets after an if statement you c\n only have one line of code
		 * HOWEVER the whole lopp is treated as one line of code. 
		 * The if statement will treat a loop, another if, a switch statement, an anonymous inner class, a lambda as a single line of code. 
		 */
		
		if(name.equals("ostritch"))
			for(int i=0;i<4;i++) {
				System.out.println(i);
				System.out.println("print me");
			}
		else {
			for(int j=0;j<4;j++) {
				System.out.println("not an ostritch");
				System.out.println("print me" + j);
			}
		}
		
	}
	
	
	static void ex4() {
		
		//NESTED IFS
		
		/*
		 * nested if statements are if statements within an if statement
		 */
		
		int score = 456;
		
		if(score<400) {
			if(score > 300) {
				System.out.println("less than 400, but greater than 300");
			}else {
				System.out.println("less than 400 and less than 300");
			}
		}else {
			System.out.println("greater than 400");
		}
		
		
		
		//-----------
		
		//same loop as above, but without braces or formatting:
		
		score = 456;
		
		if(score<400) 
		if(score>300) 
		System.out.println("less than 400, but greater than 300");
		else 
		System.out.println("less than 400 and less than 300");
		else
		System.out.println("greater than 400");
	
	}
	
	
	static void ex5() {
		
		/* TERNARY OPPERATORS:
		 * 
		 * These are a simple if-else, but using a question mark symbol instead of an if-else
		 */
		
		int age = 18;
		
		//traditional if-else:
		if (age>18) {
			System.out.println("you are over 18");
		}else {
			System.out.println("you are under 18");
		}
		
		/*
		 * A ternary constuct has to be assigned to something. 
		 * The first part of the ternary construct has to be evaluated to a boolean (just like an if)
		 * here it is: age>18
		 * followed by a question mark ?
		 * followed by if true part
		 * followed by colons :
		 * followed by false part
		 * if boolean is true, message is "you are over 18"
		 * if boolean is false, message is "you are under 18"
		 */
		
		age = 10;
		String msg;
		
		msg = (age>18)? "you are over 18": "you are under 18";
		System.out.println("msg is: " + msg);
		
		//-------------
		
		//if bill is > 2000: discount is 25 euro
		//if not: discout is 10 euro
		int bill = 1200;
		int discount; 
		discount =(bill>2000)? 25:10;
		
		System.out.println("discount is: " + discount);
		System.out.println("bill is: " + (bill-discount));
		
		
		//------------
		
		//if bill is > 200, take 200 from bill. else, take 300 from bill:
		bill = (bill>1500)?bill-200:bill-300;
		System.out.println("bill is: " + bill);
		
	}
	
	

}
