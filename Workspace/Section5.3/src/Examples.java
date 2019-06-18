
public class Examples {
	
	static void ex1() {
		
		//FOR LOOPS
		
		/*
		 * A for loop consists of 3 distinct parts:
		 * Initialisation statements
		 * Termination condition
		 * update clause
		 */
		
		
		/*
		 * each part seperated by a semicolon:
		 * 1=0 initialisation statement
		 * i<5 termination condition, as soon as not true, loop terminates
		 * i++ update clause
		 */
		
		for(int k=0;k<5;k++) {
			System.out.println("k is: " + k);
		}
		
		/*
		 * You can have as many initialisation statements as you want, but they must all be the same dta type
		 * Here we are intiialsing three vars (i,j,m) of type int.
		 * You can only have ONE termination clause (i<4)
		 * You can have as many update clauses as you want.
		 */
		
		for(int i=0, j=1, m=2; //initialisation
				i<4; //termination condition
				i++, j--, ++m) { //update clause
			
			System.out.println("\ni is: " + i);
			System.out.println("j is: " + j);
			System.out.println("m is: " + m);
			
		} //end to scope of i,j & m
		
		int k = 9;
		
		/*
		 * You can use existing vars that are declared outside oof the loop. 
		 * That means that the loop executes k will be available outside the loop and the value will have changed.
		 * The update clause is executed only AFTER the code in the curly bracket executes
		 * so the sequence printed below is:
		 * 
		 * k inside the loop is: 0
		 * k inside the loop is: 1
		 * k inside the loop is: 2
		 * k outside the loop is:3
		 * 
		 */
		
		for(k=0;k<3;++k){
			System.out.println("k inside the loop is: " + k);
			//k--; //you can use incrementors and decrementors inside the loop, but NOT RECOMMENDED. (this here would be an infinate loop)
		}
		
		System.out.println("k outside the loop is: " + k);
		
		//---------------------------------
		//valid for loop (everything after this in the program is flagged as unreachable code)
		
		/*
		for(;;) {
			System.out.println("infinate loop");
		}
		*/ 
		
		//---------------------------------
		//valid as k already exists with an initial value:
		
		for(;k<10;k++) {
			System.out.println("k inside the loop is: " + k);
		}
		
		
		System.out.println("k outside the loop is: " + k);
		//---------------------------------
		
	}
	
	static void ex2(){
		
		//NESTED FOR LOOPS
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("I is: " + i + " j is: " + j);
			}
		}
		
		//------
		
		String[]names1 = {"harry", "george", "mary"};
		String[]names2 = {"laura", "michelle", "colm"};
		String[]names3 = {"patsy", "jack", "mick"};
		
		//a 2dim array, which is an array of 1 dim arrays 
		String[][]allNames = {names1, names2, names3};
		
		for(int i=0; i<allNames.length; i++) {
			System.out.println("row: " + i);
			
			for(int j=0;j<allNames[i].length; j++) {
				//System.out.println("col: " + j);
				System.out.println("name is: " + allNames[i][j]);
			}
			
		}
		
		//--------------------------
		//NESTED ENHANCED FOR-LOOP
		
		String[]name1 = {"harry", "george", "mary"};
		String[]name2 = {"laura", "michelle", "colm"};
		String[]name3 = {"patsy", "jack", "mick"};
		
		
		String[][]twoDName = {name1,name2,name3};
		System.out.println();
		for(String[]nameArr: twoDName) { //iterating through each string array element in the 2d array
			System.out.println();
			for(String name: nameArr) { //iterating through each string element in the targeted array
				System.out.println(name);
			}
		}
		
		
	}

}
