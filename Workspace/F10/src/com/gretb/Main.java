package com.gretb;
/**
 * FOR LOOP
 * @author noelf
 *
 */
public class Main {
	
	public static void main(String[]args) {
		/*
		 * FOR LOOP allows for a great level of control than the other 
		 * loops. 
		 * for loop condition is made up of three parts
		 * first part is starting value
		 * second part is exit condition
		 * third part is what happens to value each time in loop
		 * each of these three parts are seperated by a semi colon
		 */
		
		for(int i=0;i<5;i++) {
			/*
			 * the variable i is a LOCAL VARIABLE that is only available
			 * within the loop
			 */
			System.out.println("inside for loop i is "+i);
		}//end of for loop
		
		//cannot access the variable i outside of the for loop curly brackets
		//System.out.println("i outside loop is "+i);
		
		
		/*
		 * the variable J is available everywhere within the main method
		 */
		int j;
		for(j=0;j<=6;j++) {
			System.out.println("j is "+j);
		}
		/*
		 * as j was created outside of the loop, it is available outside of
		 * the loop
		 * the loop exits when J has a final value of 6
		 */
		System.out.println("j outside loop is "+j);
		/*
		 * in the first intial part of the for loop, we can have as many
		 * initial values, of the same type, as we want
		 * you can only have ONE exit condition
		 * you can have as many as you want incrementers, decrementers, etc
		 * as you want
		 */
		for(int k=0,m=15;	k<10;	k++,m--) {
			System.out.println("k is "+k);
			System.out.println("m is "+m);
		}
		
		
	}//main method finishes

}
