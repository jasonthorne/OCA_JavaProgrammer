package com.jay;

public class Main {
	
	/**
	 * 
	 * Exam objective 5.5 - Use break & continue
	 */

	public static void main(String[] args) {
		
		/*
		 * break & continue are primarily used to break out of loops. 
		 * But you can also break out of switch statements.
		 * 'Break' breaks completely out of the loop. And there are no other iterations of the loop. 
		 * 'Continue' breaks from the current iteration of the loop, then continues with the next iteration.
		 */
		
		//---------------------------
		//break:
		
		for(int i=0;i<11;i++) {
			System.out.println("i is: " + i);
			
			if(i>5) { //when i is 6, break from loop
				break;
			}
		}
		System.out.println("outside the loop\n");
		
		//---------------------------
		//continue:
		
		for(int i=0;i<12;i++) {
			
			
			if(i==3) { //when i is 3, break from current iteration (preventing sysout)
				continue;
				//System.out.println("this is unreachable code, generating a compilation error");
			}
			System.out.println("i is: " + i);
		}
		System.out.println("outside the loop\n");
		
		//---------------------------
		
		/*
		 * We are going to print out all of the even numbers between 1 & 20
		 */
		
		for(int i=0;i<21;i++) {
			
			if(i%2>0) { //is the remainder of diving by 2 is greater than 0
				continue;
			}
			System.out.println("number is: " + i);
		}
		
		
		//-------------------------------
		Inners.nested();
		
		Inners.breaking();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
