package com.android;


/**
 * 
 * Variable length arguements.
 * 
 * In a method parameter list, if we have the following: 
 * int...nums
 * this means we can passi n as many int variables as we like. 
 *
 */
public class Person {

	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
		int daysWorked(int...days) { //receives as many vars as you want, and creates an array ofthese elements. 
			int count=0;
			System.out.println("daysWorked method");
			
			for(int i=0;i<days.length;i++) {
				System.out.println("number is; " + days[i]);
				count++;
			}
			return count;
		}
		
		
		//This wont compile as the variable length arguement HAS to be the LAST parameter in the method:
		/*void wrongCall1(int...nums, String name) {
			
		}*/
		
		//You can ONLY HAVE 1 variable length method AS A PARAMETER, So this wont compile:
		/*void wrongCall2(int...nums, int...nums) {
		
		}*/
		
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//taking an int and returning an array
		int[]holiday(int num){
			int[]myArray=new int[num];
			return myArray;
		}
		
		
		//taking two arrays, and returnng an array
		int[]methodArrays(int[]intArray, double[]doubleArray){
			return new int[5];
		}
			
		
		//calling the method above: methodarrays(myArray, 33.3,45.5,67.7);		
		
}
