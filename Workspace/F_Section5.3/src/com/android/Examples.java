package com.android;

public class Examples {
	
	static void ex1() {
		System.out.println("for loops");
		/*
		 * a for loop consists fo three distinct parts
		 * Initialisation statements
		 * Termination condition
		 * update clause
		 */
		/*
		 * each part is seperated by a semi colon
		 * i=0 initialisation statement
		 * i<5 termination condition, as soon as not true, loop
		 * terminates
		 * i++ update clause
		 */
		for(int i=0;i<5;i++) {
			System.out.println("i is "+i);
		}
		/*
		 * you can have as many iniitialistion statements as you want,
		 * but they must be all the same data type. here we are
		 * initialising three variables i,j,m of type int.
		 * you can have only ONE termination clause, in this case as
		 * long as i is less than 4
		 * you can have as many update clauses as you want
		 * 
		 */
		System.out.println("multiple conditions");
		for(int i=0,j=1,m=2; //initialisation
				i<4; //termination condition only one allowed
				i++,j--,++m) //update clause
		{
			System.out.println("i is "+i);
			System.out.println("j is "+j);
			System.out.println("m is "+m);
		}//end of for loop
		/*
		 * the variables i, j and m are only available inside the
		 * for loop curly brackets, i, j and m are local to the for 
		 * loop curly brackets
		 */
	//	System.out.println("i outside brackets is "+i);
		
		int k=9;
		/*
		 * you can  use existing variables that are declared outside of
		 * the loop. that means that the loop executes k will be 
		 * available outside of the loop and the value will have
		 * changed.
		 * the update clause is execute only AFTER THE code in the curly
		 * bracket executes
		 * so the sequence printed is 
		 * K inside loop is 0
		 * K inside loop is 1
		 * K inside loop is 2
		 * final value for k is 3
		 */
		for(k=0;k<3;k++) {
			System.out.println("k inside loop is "+k);
			//you can use incrementers and decrementers inside loop
			//but not recommended, here this will be an infinite loop
		//	k--;
			printMe();//calls method 3 times
			new Dog();//creates 3 dogs
		}
		System.out.println("final value for k is "+k);
		/*
		 * this is the simpliest for loop construct with no
		 * parts at all, so this will just enter and become an
		 * infinite loop. every for loop only has two semi colons in
		 * it
		 */
/*		for(;;) {
			System.out.println("nothing here");
		}*/
		k=5;
		/*
		 * we dont' need an initialisation part as k already exists
		 * and has a value of 5
		 */
		for(;k<10;k++) {
			System.out.println("k is "+k);
		}
		System.out.println("outside loop k is "+k);
		
	}
	
	static void printMe() {
		System.out.println("print me Method called");
	}
	
	static void ex2() {
		System.out.println("Nested for Loops");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("i is "+i+" j is "+j);
			}
		}
		
		String[]names= {"harry","george","mary"};
		String[]names2= {"laura","michelle","colm"};
		String[]names3= {"patsy","jack","mick"};
		/*
		 * this is a two dimensional array which is an array of
		 * one dimensional String arrays
		 */
		String[][]allNames= {names,names2,names3};
		
		for(int i=0;i<allNames.length;i++) {
			System.out.println("row "+i);
			for(int j=0;j<allNames[i].length;j++) {
				System.out.println("name is "+allNames[i][j]);
			}
		}
		//dont' overuse nested for loops as can get needlessly
		//complicated
		for(int i=0,j=4,m=7;i<5;i++,j--,m=+5) {
			for(int a=0,b=45,c=-14;a<60;a++,b--,c=-2) {
				for(int num=4,num2=56,num3=0;num<100;num++) {
					System.out.println("print me");
				}
			}
		}
		
	}

}
