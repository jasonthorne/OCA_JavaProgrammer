package com.android;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Examples {
	
	
	public static void twoD() {
		int[]nums1 = {45,89,100};
		int[]nums2 = new int[4];
		
		for(int num: nums2) {
			System.out.println(num); //4 zeros
		}
		
		
		//------------
		
		int[][]twoD1 = new int[2][3]; //x2 1 dim arrays of length 3 (or 2 rows 3 cols). ++++++++all holding 0's+++++++++++++ 
		
		int[][]twoD2 = {
					{56, 77, 100}, //1st row of length 3
					{100, 345, 88} //2nd row of length 3
		};
		
		//Asymmetric multidim array:
		int[][]asyArray = {
				{12,24,56,88}, //1st row of length 4
				{2} //1st row of length 1
				
				/*
				 * locations of elements:
				 * asyArray[0][0], [0][1], [0][2], [0][3]
				 * asyArray[1][0]
				 */
		};
		
		//print array values:
		System.out.println(twoD2[0][0]);
		System.out.println(twoD2[1][2]);
		
		
		int[][]twoD3 = {{56, 77, 99},{100, 345, 88}};
		
		//print array values:
		System.out.println(twoD2.length); //amount of rows (how many arrays in this array)
		System.out.println(twoD2[0].length); //amount of columns in the first row (how many elements in the first array within this array)
		
		int[]numbers = twoD3[0]; //assigning the value of the array at pos 0 in twoD3
		
		
		//looping through rows in multi dim array:
		for (int i=0;i<twoD3.length; i++){
			
			//loop through cols in multi dim array
			for (int j=0;j<twoD3[i].length; j++){
				System.out.print(twoD3[i][j] + ",");
			}
			
		}
		
		////////////////////////////////////////////////
		
		int[] num1 = new int[] {600,700,800};
		int[] num2 = new int[] {222,333,444};
		
		int[][]new2dArray = {num1, num2};
		
		/*
		 * new2dArray is made of two 1 dim arrays. which we can access by going:
		 * 
		 */
		
		int[]firstRow = new2dArray[0];
		int[]secondRow = new2dArray[0];
		
		System.out.println("\new2dArray: " + new2dArray[0][0]); //access 1st row 
		
		System.out.println("\n-------loop through new2dArray----------------");
		
		for (int i=0;i<new2dArray.length; i++){ //number of rows (arrays) inside the new2dArray
			
			for(int j=0; j<new2dArray[i].length; j++) { //loop through each element inside each inner array
				System.out.println("new2dArray number is: " + new2dArray[i][j]);
				
			}
			
		}
		
		System.out.println("----------------------------------------------");
		
		int[][]noSecondSize=new int[3][2]; //having a value in the second row makes no difference (could be [3][1]) other than it fills the array with 0's according to row num. 
		//you can assign arrays of differing sizes to this, AS LONG AS the new values have been instantiated.
		noSecondSize[0]=new int[] {5,6};
		noSecondSize[1]=new int[] {5,6, 34, 666, 67};
		noSecondSize[2]= num1; //OVERRIDING the size of [2] (which holds 2 0's) with another pre-existing array.
		//noSecondSize[2]= {5,6}; //CANT BE DONE as were trying to change the value of the already instantiated array. 
		
		/*array is now:
		 * 
		{5,6}
		{5,6, 34, 666, 67}
	 	{600,700,800}
		 
		*/
		
		
		int[][]nullArrayObjs=new int[3][]; //this is 3 1 dimensional null array objects +++++++++++++++++
		
		
		
	}
	
	
	//-----------------------------
	
	
	static void threeD() {
		
		//36 number in this. 4x3x3
		int threeD1[][][] = new int[4][3][3]; //3 dim array - DEPTH, ROW, COL
		
		
		
		
		int twoD[][]= {{45,66,88},{100,102,103}};
		
		int threeD2[][][] = {twoD, twoD, twoD};
		
		int array1[] = {88,99,10001};
		
		int another3DArray[][][] = new int[3][][]; //this holds nums in the empty brackets +++++++++++++++++++++++++++++++++++++++++++++++
		//another3DArray = new int[3][][3]; //CANT BE DONE. (assignment chain cant be broken)
		another3DArray = new int[3][3][]; //CANE DONE (chain not broken)
		another3DArray = new int[0][0][3]; //CANE DONE (chain not broken - as 0's are obviously values!)
		
		
		//--------------
		int[]nums1 = {56,78,99};
		int[]nums2 = {100,200,300};
		int[]nums3 = {1000,2000,3000};
		
		twoD = new int[][] {nums1, nums2, nums3};
		
		//assigning values to 3d array:
		int[][][] new3DArray = {
				twoD, //first 2d array
				{nums1, nums2, nums3},  //2nd 2d array
				{{67,12,80},{277,268,226}} //3rd 2d array

		};
		
		//Targeting arrays in 3d array:
		int[][] first2D = new3DArray[0]; //gets the first 1d array
		int[] oneD = new3DArray[0][0]; //gets the first 1d array 
		int num = new3DArray[0][0][0]; //grabs the 1st element in the 1st 2d array at the 1st depth.
		
		
		//--------------
		
		
		int threeD3[][][] = {
				twoD,
				{array1, array1, array1}, //an array of arrays (ie a 2 dim array) ++++++
				{{999,998,997},{996,995,994}} //another array of arrays
		};
		
		
		//--------
		System.out.println();
		//looping through rows in multi dim array:
		for (int i=0;i<threeD3.length; i++){
			
			//loop through cols in multi dim array
			for (int j=0;j<threeD3[i].length; j++){
				
				for (int k=0;k<threeD3[i][j].length; k++){
					
					System.out.print(threeD3[i][j][k] + ",");
				}
				
				System.out.println("");
			}
			
		}
		
		
		//=======================.asList +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		System.out.println("\n.asList:");
		
		//this creates an ARRAY object with a list reference, that has all of these numbers:
		List<Integer>intList=Arrays.asList(45,78,99,100,102);
		
		//intList.add(45); //CANT BE DONE AS intList is an ARRAY object 
		//intList.remove(0); //CANT BE DONE AS intList is an ARRAY object
		
		System.out.println(intList);
		intList.set(0, 1000);
		System.out.println(intList);
		
		
		//----------
		
		List<Integer>numbers = new ArrayList<>();
		numbers.addAll(Arrays.asList(12,45,788,999,1000,3,45));
		numbers.addAll(numbers);
		System.out.println(numbers);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
