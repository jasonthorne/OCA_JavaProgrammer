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
		int counter=6;
		/*
		 * this is the condition we are checking for, before each iteration
		 * of the loop is entered counter has to be less than 5. counter starts
		 * at 0
		 */
		while(counter<5) {
			System.out.println("counter is "+counter);
			/*
			 * each time the loop is entered, counter adds one to itself. As
			 * soon as counter gets to 5, the loop terminates
			 * our counter is AFTER our print statement so this counter starts
			 * at 0
			 */
			counter=counter+1;
		}
		/*
		 * with a while loop you are not guaranteed that the loop will be entered
		 * into at all. while loop is the simpliest form of loop
		 */
		int i=4;
		/*
		 * this will add 1 onto 4 and will become 5
		 */
		i=i+1;
		i=10;
		i++;//this adds one onto i, which is 10 and becomes 11;
		System.out.println("i is now "+i);
		i=10;
		int num=5;
		/*
		 * this is the same as i=i+num
		 */
		i+=num;
		System.out.println("i with num added is "+i);
		//i is the counter
		i=0;
		//while i is less than 10, the loop will continue looping
		while(i<3) {
			//i adds one to itself each time in the loop, i is the counter
			//our counter is BEFORE our print statement, so this starts at 1
			i++;
			//then prints out the value of i
			System.out.println("i in the loop is "+i);
			
		}
		

	}

}
