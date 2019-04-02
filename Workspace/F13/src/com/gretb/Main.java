package com.gretb;
/**
 * Modulus
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		int num=12000000;
		/*
		 * Modulus is the remainder in INTEGER division (no decimal places)
		 * i.e 7/2 remainder 1
		 * % is the modulus operator
		 */
		/*
		 * this produces the number 1 if our original number was odd
		 * and produces 0 if our orginal number was even
		 */
		int mod=num%2;//the answer is 1
		
		if(mod>0) {
			System.out.println("the number is odd");
		}
		else {
			System.out.println("the number is even");
		}
		//this will loop ten times, and the counter i starts at 1
		for(int i=1;i<11;i++) {
			/*
			 * each time it gets the modulus of i
			 * i.e first time in loop it goes 1/2=0 remainder 1
			 * so this is odd
			 * second time in loop it goest 2/2=1 remainder 0
			 * so this is even
			 * third time in loop it goes 3/2=1 remainder 1
			 * so this is odd
			 * fourth time in loop it goes 4/2=2 remainder 0
			 */
			mod=i%2;
			if(mod>0) {
				System.out.println(i+" the number is odd");
			}
			else {
				System.out.println(i+" the number is even");
			}
			/*
			 * a break can be used in any type of loop
			 */
			
		}//end of for loop
		int m=0;
		for(int j=0;j<10;j++) {
				System.out.println("j is "+j);
			//	m++;
				if(j==7) {
					/*
					 * when j gets to 7 it will break totally out of the 
					 * loop, it never gets to 8 or 9
					 */
					break;
				}//end of if statement
			}//end of for loop
		//this is just to show it breaks totally out of the loop
		System.out.println("outside of loop");
		
		/**
		 * CONTINUE
		 * continue breaks out of the current iteration of the loop
		 */
		for(int i=1;i<=10;i++) {
			//this is s chekc for odd numbers
			if(i%2>0) {
			//	System.out.println("our number is "+i);
				//if the number is odd, the rest of the current iteration
				//the loop will not happen
				//i.e at number 3 no print for number 3
				//at number we have both print statements
				continue;
			}
			//this only prints if even
			System.out.println(i +" even number");
			System.out.println("something else");
		}

	}//end of main method

}
