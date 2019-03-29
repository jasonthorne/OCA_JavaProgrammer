package com.gretb;
/**
 * DO WHILE LOOP
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * 	Do while loops
		 * while loop checks for a certain conditions BEFORE IT ENTERS
		 * DO WHILE checks for a certain condition AFTER IT ENTERS
		 * no matter what a Do WHILE loop ALWAYS EXECUTES AT LEAST ONCE
		 */
		int counter=6;
		/*
		 * this loop will never execute because counter is bigger than 
		 * 5 before it even starts
		 */
		while(counter<5) {
			counter++;
			System.out.println("counter is "+counter);
		}
		/*
		 * a do while loop will always execute at least ONCE as it only chekcs
		 * AFTER each iteration
		 * if you want to ensure some process ALWAYS runs at least ONCE you
		 * would use a DO WHILE loop
		 */
		counter=6;
		do{
			System.out.println("counter is "+counter);
			counter++;
		}while(counter<5);
		/*
		 * as well as increment you can decrement
		 */
		int i=245;
		while(i>0) {
			i--;
			System.out.println("i is "+i);
		}
		/*
		 * if you don't provide an exit condition, you will get an 
		 * INFINITE LOOP, this is a loop with no exit condition
		 */
		int j=0;
	//	while(j<34) {
			/*
			 * j is never incremented so it can never reach 34
			 */
			System.out.println("j is "+j);
	//	}

	}

}
