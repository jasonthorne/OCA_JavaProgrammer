package com.android;

public class Examples {
	
	static void ex1() {
		
		//ways of declaring arrays:
		int[] myArray1 = new int[4]; //must give size of array in constructor call
		int myArray2[] = new int[5];
		
		/*arrays are given default values.
		ints: the number will be 0.
		floating point numbers: 0.0
		boolean: false
		char: ''
		objects; null
		*/
	
		//assigning values to (an already created) array:
		myArray1[0] = 56;
		myArray1[2] = 1000;
		
		//once the size of the array is set, it can't be changed. arrayOutOfBounds given if you try to add or read more:
		//myArray1[4] = 77; //only 4 positions in array, so we cant assign anything to the 5th pos.
		//System.out.println(myArray1[4]); //only 4 positions in array, so we cant acess anything to the 5th pos.
		
		//print an array element:
		System.out.println(myArray1[2]);
		
		//========
		
		//this array is given a length of 2:
		double dArray1[] = new double[] {45.67, 89.77};
		
		//this array is given a length of 3:
		double[] dArray2 = {45.67, 89.77, 7.99};
		
		//print array lengths:
		System.out.println(dArray1.length); //length 2
		System.out.println(dArray2.length); //length 3
		
		System.out.println(dArray1[dArray1.length-1]); //find last element of array (needs to be -1 as length is 0 indexed)
		
		
		//=========
		//An array is an object, so we can assign one array to another
		
		double[]copyArray = dArray1;
		System.out.println(dArray1 == copyArray); //same objects with same values
		
		dArray1[0]=4; //assigning an int to a double array element
		//dArray1 = myArray1; cant assign an int array to a double array.
		//myArray1 = dArray1; cant assign a double array to an int array.
		
		//===================================================================================looping through arrays:
		
		//enhanced for:
		for(double dNum: dArray2) {
			System.out.println("enhanced for: "+dNum);
		}
		
		String[] names = {"noel", "patsy", "nora"};
		
		for(String name: names) {
			System.out.println("name is: "+name);
		}
		
		
		dArray1 = new double[] {3.4,5.6,7.8};
		
		for(double d: dArray2) {
			System.out.println(d);
			d=4.56; //this doesn't effect the array, just the value of 'd'
		}
		
		
		//populate an array with 7 numbers:
		int[]numArray=new int[7];
		for(int i=0;i<numArray.length;i++) {
			numArray[i] = i+2;
		}
		
		for(int num:numArray) {
			System.out.println("num is: " + num);
		}
		
		
	}
	
	
	static void ex2() {
		System.out.println("Multi dimentsional arrays");
		
		int twoDArray1 [][] = new int[3][5];//x3 1 dim arrays with 5 elements in each (3 rows, 5 columns). 
		
		int twoDArray2 [][] = new int[3][3];//x3 1 dim arrays with 3 elements in each (3 rows, 3 columns). 
		
		double[]doubleD[]=new double[3][4];
		
		String[][]names = 
		{
			{"noel", "mick", "kevin"}, //first row
			{"patrica", "connie", "kate"}, //second row
			{"michele", "laura", "colm"} //third row
		};
		
		
		
				
	}

}
