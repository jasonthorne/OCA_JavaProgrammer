package com.noel;

public class PassValues {
	
	static void passWrapper(Integer num){
		/*
		 * so if we do anything to a wrapper object
		 * in a method we are actually changing what
		 * the reference refers to, a different object
		 * so changes are not reflected back in main
		 */
		num=45;
	}
	
	static void takeInts(int num,int num2){
		/*
		 * our ints in the calling method are not changed
		 */
		num=num*10;
		num2=num+num2*10;
	}

}
