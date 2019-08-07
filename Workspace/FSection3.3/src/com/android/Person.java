package com.android;
/**
 * variable length arguments
 * @author noelf
 * in a method parameter list if we have the followinging
 * int...nums
 * this means we can pass in as many int variables as we like
 *so you can pass in no ints, one int, multiple ints, you can pass
 *in an array of ints
 */
public class Person {
	
	int daysWorked(int...days) {
		int count=0;
		System.out.println("daysWorked method");
		for(int i=0;i<days.length;i++) {
			System.out.println("number is "+days[i]);
			count++;
		}
		return count;
		
	}
	/*
	 * variables length arguments HAVE TO BE the LAST parameter in a
	 * method call
	 */
	void correctCall(String type,int...nums) {
		
	}
	/*
	 * this will not compile as the variable length arguement has to
	 * be the last parameter in the method
	 */
/*	void wrongCall(int...nums,String name) {
		
	}*/
	/*
	 * this will not compile as you can have only ONE variable length
	 * argument in a parameter and it has to be the last parameter
	 */
/*	void wrongCall2(int...nums,boolean...booleans) {
		
	}//will not compile
	*/
	//variable length arguments are only for parameters in a method
	/*int...holiday(int num){
		
	}*/
	
	
	int[]holiday(int num){
		int[]myArray=new int[num];
		return myArray;
	}
	/*
	 * this method is taking an array of ints and an array of doubles
	 * and returning a array of ints
	 */
	int[]methodArrays(int[]intArray,double[]doubleArray){
		
		return new int[5];
	}
	/*
	 * you can pass in a single variable and then a variable length
	 * argument of the same type, in this case and int
	 * so if we pass in the three numbes
	 * 1,4,5
	 * 1 becomes int
	 * 4,4 becomes nums
	 */
	void passIntVar(int[]numArray,int num,int...nums) {
		
	}
	/*
	 * can pass in variable length list of employees
	 */
	void myEmployees(Employee...empList) {
		
	}

}
