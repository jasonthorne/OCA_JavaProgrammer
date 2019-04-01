package com.gretb;
/**
 * arrays
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * arrays are lists of variables i.e list of ints, doubles, chars
		 * ,strings and objects
		 * this is creating an array of 4 ints
		 * arrays take the following format from left to right
		 * always start with a data type - in this 'int'
		 * always have square brackets after the data type []
		 * has to be given a name after the square brackets - the 
		 * 
		 * 
		 * name of this arry is 'myArray', you can call it anything you
		 * want
		 * there are two primary ways of giving values and size to an 
		 * array. the first way is to use the 'new' keyword followed by
		 * the data type of the array - in this case an 'int' followed
		 * by the size of the array, in this case 4.
		 * once you give a size to an array, you cannot change the size
		 * it
		 */
		int[]myArray=new int[4]; ////////+++++++++++++++++++Exam questions sometimes have numbers on left! (Size should ALWAYS be on the right!) Or different data types on both sides!
		/*
		 * this is created an array, called dArray, that is of size 4, 
		 * and it was given a size by putting 4 floating numbers into the
		 * array when we created
		 */
		double[]dArray= {3.45,6.78,9.23,10.44};
		/*
		 * array numbering starts at 0
		 * when you create an array of a certain, you cannot change the 
		 * size of that array
		 */
		myArray[0]=34;//first number on our list
		myArray[1]=100;//second element on our list
		myArray[2]=234;//third element on our list
		myArray[3]=1000;//fourth element on our list
		
		System.out.println("first number in myArray is "+myArray[0]);
		System.out.println("fourth number in myArray is "+myArray[3]);
		/*
		 * this generates an arrayIndexOutOfBoundsException, which means
		 * basically we are trying to access an array element that does
		 * not exist. there are only 4 numbers max allowed in this array.
		 * so if we try to add a fifth, we will get an error
		 */
		//myArray[4]=789;
		/*
		 * this changes the fourth number in this array to 1233456
		 */
		myArray[3]=1233465;
		
		System.out.println(myArray[3]);
		
		for(int i=0;i<4;i++) {
			System.out.println("in for loop array, number is "+dArray[i]);
		}
		
		
		int size=57;
		double[] weights = new double[size]; //an array of weights
		int i = 0; //counter to populate weights array
		
		
		//giving values to each position of the array.
		//i starts at 0, so weights [i] = i+10 is actually weights[0]=0+10, next one is weights[1]=1+10
		//Goes up to 56 which will be weights[56]=56+10;
		
		while(i<size) { //loop 57 times
			System.out.println("i is: " + i);
			weights[i] = i+10;
			i++;
		}
		
		
		//printing out the values of an arrray:
		for (int j=0; j<weights.length; j++) {
			System.out.println("Weight is: " + weights[j]);
		}
		
		//this is our first method, and this method gives us the length of the array:
		System.out.println("length of weights: " + weights.length);
		
		i=0;
		
		//even though we may not know the amount of numbers in this array, we can use the length method to get he amount of numbers in the array, 
		//and the loop will execute for each number in the array. 
		while(i<weights.length) {
			System.out.println(weights[i]);
			i++;
		}
		
		
		//As this is done, the original array is gone:
		weights = new double[54];
		i=0;
		
		System.out.println("Blank double array:");	
		while(i<weights.length) {
			System.out.println(weights[i]);
			i++;
		}
		
		
		//double[]dArray= {3.45,6.78,9.23,10.44};
		
		int counter = 0;
		
		while(counter<4) {
			System.out.println("counter is " + counter);
			System.out.println("double is " + dArray[counter]);
			counter++;
		}
		//at the end of this loop, counter is 5 //++++++++++++++++
		//so needs reset for use below:
		
	
		counter = 0;
		
		//This loop will cause an array index out of bounds exception, bcause counter goes from 0 - 4, but our array only goes from 0 - 3. Last item in list is 'dArray[3]'
		/*
		while(counter<=4) {
			System.out.println("counter is " + counter);
			System.out.println("double is " + dArray[counter]);
			counter++;
		}
		*/
		
		
		

	}

}
