package com.jay;

public class Inners {

	
	static void nested() {
		
		
		/*
		 * If you put a break or continue inside the inner loop
		 * it will only break out of the the inner loop.
		 */
		int counter = 0;
		for(int i=0;i<5;i++) {
			System.out.println("i is: " + i);
			for(int j=0;j<4;j++) {
				System.out.println("j is: " + j);
				counter++;
			}
		}
		
		System.out.println("counter is: " + counter);
	}
	
	//-----------------------------------
	
	
	static void breaking() {
		
		for(int i=0;i<5;i++) {
			System.out.println("i is: " +i);
			for(int j=0;j<4;j++) {
				//This will break from the inner loop if j is greater than 2
				if(j>2) {
					break;
				}
				System.out.println("j is: " +j);
			}
		}//for
	}
	
	
	static void lables() {
		
		//LABELS - can be used on ANY block of code ({})
		
		outer: //give the outer for-loop a label of "outer"
		for(int i=0;i<4;i++) {
			System.out.println("i is: " + i);
			
			inner: //give the inner for-loop a label of "inner"
			for(int j=0;j<6;j++) {
				if(j>4) {
					break outer; //break from outer loop (could use continue here too - making it just leave the current iteration of i)
				}
				System.out.println("j is: " + j);
			}
		}//for
	
		//you can lavel ANY block of code, but can only break from a labeled loop, not a block of code like this.
		myCode:{
			System.out.println("print me");
			System.out.println("print me 2!");
		}
		
		//GOTO can also be used to jump to labels. +++++++++++++++++++++++++++++++++++++++++ 
	
	
	}
	
}
