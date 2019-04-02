package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		
		//modulus is when the remainder left over from dividing two numbers. ++++++++++++
		
		/*
		 * Modulus is the remainder in INTEGER division (no decimal places)
		 * IE 7/2 = remainder 1
		 * % is the modulus operator
		 */
		
		
		int num = 7;
		
		int mod = num%2; //the answer is 1. This produces the number 1 if our original number was odd, and produces 0 if our original number was even.
		
		
		/*
		 * 4/2 = 2. mod = 0
		 * 9/2 = 4. mod = 1
		 * 8/2 = 4. mod = 0
		 * 13/2 = 6. Mod = 1
		 */
		
		if(mod>0) {
			System.out.println("The number is odd");
		}else {
			System.out.println("The number is even");
		}
				 
		//loop 10 times, and check which numbers are even, and which are odd:
		for(int i=1;i<11;i++) { 
			
			/*
			 * each time it gets the modulus of i
			 * ie first time: in the loop it goes 1/2=0 remainder 1 (so this is odd)
			 * 2nd time: it goes 2/2=1 remainder 0 (so this is even)
			 * 3rd time: it goes 3/2=1 remainder 1 (so this is odd)
			 * 4th time: it goes 4/2=2 remainder 0 (so this is even)
			 */
			
			mod=i%2; //find modulus
			if(mod>0) {
				System.out.println(i +" The number is odd");
			}else {
				
				System.out.println(i +" The number is even");
			}
			
		}
		
		
		/*
		 * A break can be used in any type of loop:
		 */
		int m=0;
		for(int j=0;j<10;j++) {
			System.out.println("J is: " + j);
			m++;
			if(m==7) {
				//when m gets to 7 it will break from loop, it never gets to 8 or 9.
				break;
			}
		}
		System.out.println("Outside of loop");
		
		
		/**
		 * CONTINUE
		 * Continue breaks out of the current iteration of the loop
		 */
		
		for(int i=1;i<=10;i++) {
			if(i%2>0) { //if number is odd:
				//System.out.println("Our number is: " + i);
				continue; //jump to next iteration of the loop, so println below only works for even numbers
			}
			System.out.println("even number: " + i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main method

}
