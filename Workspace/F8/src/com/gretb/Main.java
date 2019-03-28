package com.gretb;
/**
 * Loops
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * Loops are repeating pieces of code
		 * all loops needs some sort of counter to keep track of the current 
		 * iteation of the loop and when the loop should finish
		 */
		int counter=0;
		
		while(counter<5) {
			System.out.println("counter is "+counter);
			counter=counter+1;
		}

	}

}
