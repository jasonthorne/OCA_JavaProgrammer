package com.android;

public class Inners {
	
	static void nested() {
		/*
		 * if you put a break or continue inside the inner loop
		 * it will only break out of the inner loop
		 * or with continue will only break out of the current 
		 * iteration of the inner loop
		 */
		int counter=0;
		for(int i=0;i<5;i++) {
			System.out.println("i is "+i);
			for(int j=0;j<4;j++) {
				System.out.println("j is "+j);
				counter++;
			}
		}
		System.out.println("counter is "+counter);
	}
	
	static void breaking() {
		for(int i=0;i<5;i++) {
			System.out.println("i  is "+i);
			for(int j=0;j<4;j++) {
				/*this will break out of the inner loop if j is
				 * greater than 2
				 * 
				 */
				if(j>2) {
					break;
				}
				System.out.println("j is "+j);
			}
		}
	}//end of inners() method
	
	static void labels() {
		/*
		 * you can label ANY block of code (a block of code is code
		 * in curly brackets). In this example "outer" refers to all
		 * of the outer for loop, it is everything that is enclosed
		 * in the curly brackets of the outer loop. "inner" refers to
		 * the inner loop and everything enclosed withing it's 
		 * curly brackets
		 * you can break or continue out of a particular loop
		 * by using the keyword break followed by the label name
		 * of the loop, continue operates the same way
		 */
		outer://label for outer loop
		for(int i=0;i<4;i++) {
			System.out.println("i is "+i);
			inner://lable for inner loop
			for(int j=0;j<6;j++) {
				if(j>4) {
					break outer;
				//	continue outer;
				}
				System.out.println("j is "+j);
			}
		}//end of outer for loop
	/*
	 * you can label any block of code, but you can really only break
	 * out of a labelled loop, not a block of code like this.
	 * you can use something called goto, to go to these labels, 
	 * but this is NOT RECOMMENED as makes code very difficult to 
	 * follow
	 */
	myCode:{
			System.out.println("print me out");
			System.out.println("print me out2");
		}
		
	}

}
