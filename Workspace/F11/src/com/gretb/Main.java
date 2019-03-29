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
		 * name of this arry is 'myArray', you can call it anything you
		 * want
		 * there are two primary ways of giving values and size to an 
		 * array. the first way is to use the 'new' keyword followed by
		 * the data type of the array - in this case an 'int' followed
		 * by the size of the array, in this case 4.
		 * once you give a size to an array, you cannot change the size
		 * it
		 */
		int[]myArray=new int[4];
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
		myArray[1]=100;//seconld element on our list
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
			System.out.println("array number is "+dArray[i]);
		}
		
		
		
		

	}

}
