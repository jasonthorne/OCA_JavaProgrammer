package com.android;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class Examples {
	public static void twoD() {
		int[]nums= {45,89,100};
		int[]numbers=new int[3];
		/*
		 * this will not compile, as our array cannot be intiialised over two
		 * lines
		 */
		//numbers= {66,77,88};
		int[]numbers2=new int[] {56,99,100};
						//nums.length
	//	nums= {56,88,99};
		numbers=nums;
		int[]nums2=new int[4];
		int[]nums3=new int[5];//{56,78,99,100,200};
		nums=nums2;
		int[]lots= {3};
		int[]zeroArray=new int[0];
		nums=lots;
		for(int num:nums2) {//this is four zeros
			System.out.println(num);
		}
		/*
		 * this is two one dimensional arrays of length 3, or 
		 * 2 rows, 3 columns
		 */
		int[][]twoD=new int[2][3];
		int[][]twoD2= {
				{100,101,102},//first row of length 3
				{1000,1001,1002}//second row of length 3
		};
		/*
		 * asymetric multidimensional array,
		 */
		int[][]asyArray= {
				/*
				 * asyArray[0][0], [0][1],[0][2] and [0][3] is first row
				 * ayArray[1][0] is second array
				 * anything else is arrayindexoutofBounds
				 */
				{12,24,56,88},//first row of lenght 4
				{2}//second row of lenght 1
		};
		System.out.println(twoD2[0][0]);
		System.out.println(twoD2[1][2]);
		int[][]twoD3= {{2001,2003,2004},{301,302,303}};
		//this is the amount of rows
		System.out.println(twoD3.length);
		//this is teh amount of columns in the first row
		System.out.println(twoD3[0].length);
		/*
		 * because nums already exists we can't go
		 * nums={600,700,800};
		 */
		nums= new int[]{600,700,800};
		nums2=new int[] {222,333,444};
		
		int[][]make2D= {nums,nums2};
		for(int n:nums)
			System.out.println("n is "+n);
		/*
		 * it does not matter how you access this value, it's the same value
		 * whether you access it through the one dimensional or two dimensional
		 * array. if you change it via the one dimensional it is then changed
		 * in the two dimensional, as it is the same value
		 */
		nums[0]=777777;
		System.out.println("maked2D [0][0] is "+make2D[0][0]);
		/*
		 * our make2D array is made up of two one dimensional, which we can
		 * access by going
		 */
		int[]firstRow=make2D[0];
		int[]secondRow=make2D[1];
		System.out.println(make2D[0][0]);
		for(int n:firstRow) {
			System.out.println("first row n"+n);
		}
		for(int n:make2D[0]) {
			System.out.println("first array in 2DArray "+n);
		}
		
		//twoD3[0] is a one dimensional array which we assign to the array reference
		//numbers
		numbers=twoD3[0];
		//this is also a one dimensional array
		//twoD3[1];
		
		for(int i=0;i<twoD3.length;i++) {
			for(int j=0;j<twoD3[i].length;j++) {
				System.out.print(twoD3[i][j]+" ");
			//	System.out.println();
			}
		}
		for(int i=0;i<make2D.length;i++) {
			for(int j=0;j<make2D[i].length;j++) {
				System.out.println("make2d number is "+make2D[i][j]);
			}
		}
		/*
		 * you do not have to provide a length for the second dimension on
		 * the right hand side
		 */
	//	int
		int[][]noSecondSize=new int[3][1];
		noSecondSize[0]=new int[] {5,6};
		noSecondSize[1]=new int[] {88,99,1000,455};
		/*
		 * this syntax is NOT ALLOWED
		 */
	//	noSecondSize[1]= {56,77,99};
		noSecondSize[2]=numbers;
		noSecondSize[1]=new int[5];
		/*
		 * after this point we end up with an array of 
		 * 5,6
		 * 0,0,0,0,0
		 * 56,99,1002
		 */
		System.out.println(noSecondSize[1][1]);
		System.out.println(noSecondSize[1][4]);
		/*
		 * you can assign arrays of differing sizes to this two dimensional
		 * array, this creates a two dimensional array of 3 one dimensional
		 * arrays with 2 numbers, and each of those numbers is zero. so you
		 * end up with six zeros
		 */
		noSecondSize=new int[3][2];
		for(int i=0;i<noSecondSize.length;i++) {
			for(int j=0;j<noSecondSize[i].length;j++) {
				System.out.print("print me"+noSecondSize[i][j]);
			}
		}
		/*
		 * this is three one dimensional null array objects
		 */
		noSecondSize=new int[3][];
		for(int i=0;i<noSecondSize.length;i++) {
			//this line of code generates a nullPointerException
			//for(int j=0;j<noSecondSize[i].length;j++) {
				System.out.println(noSecondSize[i]);
		//	}
		}
		//this will print null 
		System.out.println(noSecondSize[0]);
		//same rules apply an array of [3][2] as to an array of [3][]
		noSecondSize[0]=new int[] {5,6};
		noSecondSize[1]=new int[] {88,99,1000,455};
		/*
		 * this syntax is NOT ALLOWED
		 */
	//	noSecondSize[1]= {56,77,99};
		noSecondSize[2]=numbers;
		noSecondSize[1]=new int[5];
		System.out.println(noSecondSize[1][2]);
		//will compile, but can't do anything with it
		int[][]noArray=new int[0][3];
		//this will NOT compile as you have to a number in the first dimension
		//even 0 will suffice
	//	noArray=new int[][5];
	}
	
	static void threeD() {
		//36 numbers in this array
		int threeD[][][]=new int[4][3][3];
		int twoD[][]= {{45,66,88},{100,102,103}};
		int threeD2[][][]= {twoD,twoD,twoD};
		int[]array= {88,99,10001};
		int[][][]noOtherSize=new int[3][][];
		//this will NOT compile
		//noOtherSize=new int[3][][3];
		noOtherSize=new int[3][4][];
		noOtherSize=new int[0][0][3];
		noOtherSize=new int[3][][];
		
		int[]nums= {56,78,99};
		//nums= {67,99,100};
		int[]nums2= {100,200,300};
		int[]nums3= {1000,2000,3000};
		//twoD={nums,nums2,nums3};
		twoD=new int[][] {nums,nums2,nums3};
		int[][][]new3D={
			twoD,//first two dimensional array
			{nums,nums2,nums3},//second two dimensional array
			{{999,998,997},{996,995,994}}//third two dimesional array
		};
		/*
		 * talking about the right hand side
		 * new3d[0] is the first two dimensional array
		 * new3d[1] is the second two dimensional array
		 * new3d[2] is the third two dimensional array
		 * new3D[0][0] is a one dimensional array
		 * new3D[0][0][0]
		 */
		int[][]twoD1=new3D[0];
		int[]oneD1=new3D[0][0];
		int num=new3D[0][0][0];
		
		/*
		 * a three dimensional array is an array of two dimesional
		 * and two dimensional array is an array of one dimensional array
		 */
		int[][][]threeD3= {twoD,//first two dimensional array
				{array,array,array},//second two dimensional array
		{{999,998,997},{996,995,994}}//third two dimensional array
		};
		System.out.println("printing out three d array");
		for(int i=0;i<threeD3.length;i++) {
			for(int j=0;j<threeD3[i].length;j++) {
				System.out.println();
				for(int k=0;k<threeD3[i][j].length;k++) {
					System.out.print(threeD3[i][j][k]+" ");
				}
			}
			
		}
		/*
		 * this creates a List that has all of these numbers
		 */
		List<Integer>intList=Arrays.asList(45,78,99,100,102);
		/*
		 * can only use this with a list reference, does not work with
		 * a ArrayList reference
		 */
		//ArrayList<Integer>intList2=Arrays.asList(999,999,1000);
		/*
		 * if you create a list this way, you cannot add new elements to
		 * this list
		 */
		//intList.add(45);
		//System.out.println(intList);
		/*
		 * also can't remove as this would be changing the size of the list
		 * which when you create a list using the above method, you
		 * cannot do
		 */
		//intList.remove(0);
		intList.set(0, 10000);
		System.out.println(intList);
		//ArrayList<Integer>intList=new ArrayList<Integer>();
		//intList.addAll(Arrays.asList(34,56,78));
		List<Integer>numbers=new ArrayList<>();
		/*
		 * addAll()this is for adding a list onto another list
		 */
		numbers.addAll(Arrays.asList(12,45,788,9999,1000,2,45));
		numbers.addAll(numbers);
		numbers.add(56);
		numbers.addAll(Arrays.asList(8888,9,671,1111,22222,9,123245));
		System.out.println(numbers);
		
	}

}
