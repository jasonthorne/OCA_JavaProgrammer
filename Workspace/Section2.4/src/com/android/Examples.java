package com.android;


public class Examples {
	
	static void assignmentOperators() {
		System.out.println("the assignment operator: = "); //this is used for assigning values to variables.
		
		int num1 =56; //literal value
		int num2 = num1; //non literal value
		
		//You can declare as many variables as you like on the one line of the SAME TYPE:
		int a=3, b=4, d, c=66; //d doesnt have a value as it's a LOCAL variable. It has NO default value. +++++++++++++++++++++++++++++++
		//System.out.println(d); //error as it has NO value (not even 0 or null)
		
		//int z=5, double a=7; //different types, so doesnt work! 
		//===============
		
		//You cant give NEW values to more than one variable on the SAME line. 
		//b=34,e=55; //doesnt compile
		
		//the assigment operator reads from right to left
		a=10;
		b=100;
		c=1000;
		
		a=b=c; //all are now 1000
		
		boolean bool=false;
		//NEVER use the assignment operator for comparing values
		
		
		//Here it will print true
		if(bool=true) {
			System.out.println("bool is true");
		}else {
			System.out.println("bool is false");
		}
		
		
		if(bool==true) { //checks for comparison
			
		}
		
		if(bool) { //same as above. Checks for true
			
		}
		
		//=========================================
		
		a=100;
		b=10;
		a=a+b; //a is now 110
		a+=b; //same as above
		a-=b;
		a*=b;
		a/=b;
	
	}
	
	
	static void arithmeticOperators() {
		
		/*
		 * The arithmetic operators consist of some operators we are familiar with such as +,-,/,* 
		 * and some we might not be familiar with, such as:
		 * i++ post increment operator
		 * i-- post increment operator
		 * ++i pre increment operator
		 * --i pre increment operator
		 */
		
		
		/*
		 * Modulus is the remainderw when we divide an int by another int. 
		 * It DOESNT deal with doubles. 
		 * It is the remainder from integer division
		 */
		
		int num1=10;
		int num2=3;
		
		System.out.println("10 modulus 3 is: " + (num1%num2));
		
		System.out.println("\nIncrementors and decrementors:");
		
		num1 = 10;
		num2 = 3;
		
		//Pre-increment/decrement operators. First they do their thing THEN print results:
		System.out.println("\nPre-increment/decrement operators");
		System.out.println("Pre-increment (++num1): " + (++num1)); //adds, then prints 11
		System.out.println("Pre-decrement (--num2): " + (--num2)); //reduces, then prints 2
		
		num1 = 10;
		num2 = 3;
		
		System.out.println("\nPost increment/decrement operators");
		System.out.println("Post-increment (num1++): " + (num1++)); //prints, then adds (to 11)
		System.out.println("Post-decrement (num2--): " + (num2--)); //prints, then reduces (to 2)
		
		System.out.println("num1 is now: " + num1 + ". num2 is now: " + num2); //prints, then reduces (to 2)
		
		//Test operators:
		num1=10;
		num2=100;
		int sum = num1 + num2++;
		System.out.println("\nsum is: " + sum);
		System.out.println("num2 is: " + num2);
		
		num1=10;
		num2=100;
		sum = num1 + ++num2;
		System.out.println("\nsum is: " + sum);
		System.out.println("num2 is: " + num2);
		
		num1=10;
		num2=100;
		sum = ++num1 + ++num2;
		System.out.println("\nsum is: " + sum); //112
		System.out.println("num2 is: " + num2); //101
		
		
		
	}

}
