package com.android;
/**
 * Exam Objective 5.5 use Break and Continue
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Break");
		/*
		 * break and continue are primarily used to break out of loops,
		 * but you can also break out of switch statements.
		 * Break breaks completely out of the loop and there are no
		 * more iterations of the loop.
		 * Continue breaks out of the current iteration of the loop and
		 * continues with the next iteration
		 */
		for(int i=0;i<11;i++) {
			System.out.println("i is "+i);
			/*
			 * when i gets to 6 it exits the loop completely
			 */
			if(i>5) {
				break;
			}
		}//control goes down to  here when loop is exits
		System.out.println("we are not outside the loop");
		
		System.out.println("Continue");
		
		for(int i=0;i<12;i++) {
			/*
			 * when i has the value 3 it will NOT PRINT OUT
			 * "second loop is 3" as it breaks out of the current
			 * iteration of the loop, but it will continue on the rest
			 * of the loop iterations. it skips the resat of the fourth
			 * iteration of the loop
			 */
			if(i==3) {
				continue;
				/*
				 * this generates a compiler error as this code
				 * can never be reached, and if you have unreachable
				 * this will generate a compilation error
				 */
			//	System.out.println("unreachable code");
			}
			System.out.println("second loop i is "+i);
		}//end of loop
		
		/*
		 * we are going to print out all of the even numbers between
		 * 1 and 20
		 */
		for(int i=0;i<21;i++) {
			/*
			 * if the remainder is 0 the modulus is 0, which means 
			 * a number divided by tw0 and the remainder is zero is 
			 * even. if it has remainder greater than zeros it's odd
			 */
			if(i%2>0) {
				/*
				 * whenever a number is odd, it skips the rest of the 
				 * loop
				 */
				continue;
			}
			System.out.println("number is "+i);
			
			//Inners.nested();
			Inners.breaking();
		}

	}

}
