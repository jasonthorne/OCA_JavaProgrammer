package com.jay;

public class Main {
	
	/*
	 * Exam objective 5.1:
	 * 
	 * Create & use while loops
	 * Create & use do-while
	 */

	public static void main(String[] args) {
		
		//WHILE LOOPS
		
		/*
		 * While(condition to test is true) 
		 * 		do stuff..
		 * 
		 * 
		 * You need some sort of incementor or decrementor or some test inside the while loop.
		 */
		
		int age=12;
		
		while(age<18) {
			age++; //increment here will print 18
			System.out.println("age is: " + age);
			//age++; //increment here WONT print 18
		}
		
		//-----------------------
		
		int count = 0;
		
		boolean bunsAvaliable = true;
		
		while(bunsAvaliable) {
			if(count > 4) {
				bunsAvaliable = false;
			}else {
				System.out.println("nice buns");
			}
			count++;
		}
		
		//------------------------
		
		//reset count:
		count = 0;
		
		bunsAvaliable = false;
		
		while(!bunsAvaliable) {
			//count++; //prints 4 times
			if(count>4) {
				bunsAvaliable = true;
			}else {
				System.out.println("no buns avaliable");
			}
			count++; //prints 5 times
		}
		
		//------------------------
		count = 5;
		
		//loops will not be triggered if condition is false:

		while(count<5) {
			System.out.println("this will not trigger");
		}
		
		
		for( ;count<5; count++) {
			System.out.println("this will not trigger");
		}
		
		
		//------------------------
		
		//========================================================================
		
		//SECTION 5.6
		
		//DO-WHILES (ALWAYS trigger at least once)
		
		count = 12;
		
		do {
			System.out.println("triggered at least once");
		}while(count<11);
		
		
	}

}
