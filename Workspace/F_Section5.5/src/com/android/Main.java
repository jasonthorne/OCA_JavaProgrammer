package com.android;

import java.util.concurrent.SynchronousQueue;

/*
 * Exam objective 5.1
 * Create and use while loops
 * create and use Do while
 */
public class Main {
	public static void main(String[]args) {
		System.out.println("While loops");
		/*
		 * while loops are the most basic form of loop
		 * while(condition to test is true)
		 * 			do work
		 * need some sort of incrementer or decrementer or
		 * some test inside of the while lopp
		 * you need code inside the curly brackets to increment 
		 * the loop, which will eventually provide an exit
		 */
		int age=12;
		while(age<18) {
			//age++;
			/*
			 * be careful where you put your incrementer in a while loop
			 * this will print out 12 to 17
			 * if we have age++ before print statment it will print
			 * out 13 to 18
			 */
			System.out.println("age is "+age);
			age++;
		}
		
		int count=0;
		/*
		 * the while always evaulates to true or false
		 * if there are more than 4 buns (5) bunsAvailable will be
		 * set to false and the loop will exit
		 */
		boolean bunsAvailable=true;
		while(bunsAvailable) {
			if(count>4) {
				bunsAvailable=false;
			}
			else {
				System.out.println("nice buns");
			}
			count++;		
		}//end of loop
		
		count=0;
		bunsAvailable=false;
		/*
		 * while this is NOT TRUE, 
		 * Which is false
		 * so this is say while this is false keep looping
		 * as soon as its true, exit
		 * this will print off 5 times 
		 */
		while(!bunsAvailable) {
			if(count>4) {
				bunsAvailable=true;
			}
			else {
				System.out.println("no buns at all");
			}
			count++;
		}
		
		count=5;
		//this loop will not enter
		while(count<5) {
			System.out.println("loop will not enter");
		}
		//this loop will not be entered
		for(;count<5;count++) {
			System.out.println("for loop will not enter either");
		}
		System.out.println("this is section 5.6 Do while loop");
		count=12;
		do {
			System.out.println("the do while is entered always at "
					+ "least once");
			System.out.println("even though count is greater than 11");
		}while(count<11);

	}

}
