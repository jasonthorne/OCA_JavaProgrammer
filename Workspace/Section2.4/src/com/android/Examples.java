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
		 * Modulus is the remainder when we divide an int by another int. 
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
		
		//=========================================================
		
		//Friday questions:
		System.out.println("Friday questions:");
		
		/*
		order of precedence:
		()
		+ -
		* /
		
		*/
		
		System.out.println("\nExample 1:");
		num1=10;
		num2=100;
		sum = ++num1 - num2++;
		System.out.println("num1 is: " + num1 + " num2 is: " + num2 + " sum is: " + sum); //11, 101 (1 added after sum assignment), -89
		
		
		System.out.println("\nExample 2:");
		num1=10;
		num2=100;
		sum = ++num1 + num2++ + --num1 + --num2;
		System.out.println("num1 is: " + num1 + " num2 is: " + num2 + " sum is: " + sum); //
		
		
		System.out.println("\nExample 3:");
		num1=10;
		num2=100;
		sum = ++num1 + --num1 + num1++ + num1 - ++num2 + num2 + num2 - num2;
		System.out.println("num1 is: " + num1 + " num2 is: " + num2 + " sum is: " + sum); //
		
		
		//sum = 11 + 10 + 10 + 11 - 101 + 101 + 101 - 101 = 42
		//sum1: 11
		//num2: 101
		
		System.out.println("\nExample 4:");
		num1=10;
		num2=100;
		sum = num1-- + num2++ - num1 + num2 + ++num1 - num2 + num1--;
		System.out.println("num1 is: " + num1 + " num2 is: " + num2 + " sum is: " + sum); //
		
		//sum = num1--  num2++  num1  num2  ++num1  num2  10(9);
		//sum = 
		
		
		System.out.println("\nExample 5:");
		int i=0;
		System.out.println("loop sum");
		for(i=0;i<10;i++) { //0, 3
			int total = ++i + i + i++; //i: 1 + 1 + 1(2) = 3., 4 + 4 + 4(5) = 12
			System.out.println("total:" + total); //3, 12
			System.out.println("i is:" + i); //2, 5
		}
		
		
		
		//ASCII key values can be treated as numbers: //++++++++++++++++++++++++++++++++
		
		char char1 = 'a'; //a has the value of 97
		System.out.println("char is: " + char1);
		//add 1 to the ascii key value and it becomes 98:
		char1++;
		System.out.println("char is now: " + char1);
		
		
		//print alphabet:
		System.out.println("\nprint alphabet:");
		char aplh = 'a';
		
		for(int j=0;j<26;j++){
			System.out.print(aplh + " ");
			aplh++;
		}
		
		
		char1 = 'a';
		char char2 = 'b';
		System.out.println("\nboth numbers combined is: " + (char1+char2));
		
	}
	
	static void widening() {
		/*
		 * Certain numeric data types are larger than other numeric data types. 
		 * I.E a byte is smaller than a short. A short is smaller than an int. An int is smaller than a long. 
		 * Widening is the process where we have a number of smaller data types that are automatically upgraded to a larger data type.
		 * Shorts are WIDENED to be an int. Or ints are WIDENED to be a long.
		 * 
		 * When you use bytes or shorts in calculation the result is ALWAYS an int. 
		 * When you are doing calculations that ONLY has bytes, shorts or ints, then the answer will always be an int. 
		 */
		
		byte b1=2;
		byte b2 = 10;
		
		//this will produce an error as the answer will be given in an INT: 
		//byte newB = b1+b2; //correct way
		
		//here we have two bytes, the result of these two numbers is WIDENED to become an int. 
		int num = b1+b2;
		
		short sNum=230;
		//short newS = sNum+b1+b2; //when you have shorts and bytes, the answer is always going to be an int. 
		//int newS = sNum+b1+b2; //correct way
		
		
		//==========
				
		long lNum = 567;
		
		//If there is a larger data type than an int in the calculation then the answer is always to WIDEN to the largest primitive data type in the calculation: 
		//int sum=lNum+num+b1; //long+int+btye, meaning answer MUST be a long:
		long lSum=lNum+num+b1;
		
		//A double is the largest numeric data type.
		double dNum = 2.34;
		//lSum = dNum+lNum+num+sNum+b1; //double+long+int+short+byte //doesnt compile as a double is larger than a long
		
		double dSum = dNum+lNum+num+sNum+b1;
		
		
		//==========
		/*
		 * Adding two bytes and wanting the answer to be in bytes (not int by default)
		 */
		
		final byte fByte1=3;
		final byte fByte2=20;
		byte sumByte1 = fByte1+fByte2;
		
		//OR cast to a byte:
		
		byte sumByte2 = (byte)(fByte1+fByte2);
		
	}
	
	static void relationalOperators() {
		
		 // >,<,>=,<=,!, ==

		int a=10,b=10,c=100;
		
		double d =10;
		
		System.out.println(a>b); //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //true
		System.out.println(a==b); //true
		System.out.println(a!=b); //false
		System.out.println(a!=c); //true
		
		//System.out.println(a==d); //true
		
		
		for(int i=1;i<=4;i++) {
			System.out.println("i is: " + i);
		}
		
		
		boolean b1=false;
		System.out.println(b1==true); //asking if b1 is true. Its not, so prints false.
		System.out.println(b1==false); //true
		System.out.println(b1!=false); //false
		
		if(b1) {
			System.out.println("yo"); //doesn't print, as b1 is not true.
		}
		
		
		while(!b1) {
			System.out.println("yo dawg"); 
			b1 = true;
		}
		
		System.out.println(b1==true); //checking if b1 is true
		
		
		//======
		
		a=10;
		b1=false;
				
		//with relational operators you cant use incompatable data types with each other. eg boolean to an int. 
				
		//You CAN compare numbers of all primitive types
		double dNum = 33.33;
		System.out.println(dNum>a);
		
		//chars are treated as numbers:
		char myChar1 = 'a';
		char myChar2 = 'b';
		System.out.println(myChar1>myChar2);
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		/*precedence order: 
		1 ()
		2 ++, --
		3 *,/,%
		4 +,-
		5 >=,<=
		6 ==, !
		*/
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		
		int num1=4;
		int num2=4;
		System.out.println(num1*2>num2*3); //prints false as multiplication is done first. 
		
		System.out.println((num1=num2*2)==num1); //(8 == 8) if assigning a value in the middle of a calculation, you HAVE TO put the calculation in brackets. 
		
	}
	
	
	
	static void logicalOpperators() {
		
		 //These are AND '&&' and OR '||'
		
		/*
		 * For AND, both have to be true. 
		 * For OR, either can be true.
		 * ! is NOT
		 */
		
		int a=10, b=15;
		
		//Both have to be true:
		System.out.println(a>20 && b>5); //false
		System.out.println(a<20 && b<20); //true
		
		//either can be true:
		System.out.println(a>20 || b>5); //true
		System.out.println(a<20 || b>15); //true
		System.out.println(a<5 || b<15); //false
		
		//not operator:
		System.out.println(!(a>10)); //true (is 10 NOT greater than 100)	
		System.out.println(!(b>10)); //false (is 15 NOT greater than 10)
		System.out.println(!(a==b)); //true (is a NOT equal to b)
		
		
		/*//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 * Both && and || are short circuited operators, which means if the first part of the equation is NOT true, the second part is never evaluated.
		 */
		
		
		int c=50;
		a=10;
		b=15;
		
		System.out.println(a<=c && b>=a); //both are true so whole statement is true
		System.out.println("\n");
		System.out.println(a<=c || b>=a); //true
		System.out.println(a>b && b<=c && a<=c); //false
		System.out.println(a<b || b>=c && a<=c); //true
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		System.out.println(a>20 && ++a<100); //the first condition is false, so the rest of the check isnt evaluated, stopping 'a' being incremented
		System.out.println("value of a is: " + a); //a is still 10 as shortcut operator (&&) never gets to ++a, as first statement is false.  
	
		System.out.println(a>20 & ++a<100); //this WILL increment 'a', as this ISNT a short circuit operator, but still works for comparison 
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		String str = "hello";
		System.out.println(str);
		
		
		String myString; //a local var so has NO DEFAULT VALUE
		Dog spot = new Dog();
		System.out.println(spot.name); //a null object
		//System.out.println(spot.name.length()); //null pointer exception meaning the string is null, so can't call the length of itself.
		
				
		
	}

	
	static void questions() {
	
		System.out.println("problem 1");
		int num=4,num2=10,num3=5;
		System.out.println(num+num2*++num/num);
		
		num=4;num2=10;num3=5;
		System.out.println("problem 2");
		System.out.println(num++*++num+(num2- --num));
		
		num=4;num2=10;num3=5;
		System.out.println("problem 3");
		System.out.println(++num + --num *(num++ + --num2)+(num3++ - num3));
		
		System.out.println("problem 4");
		System.out.println(num + num2 *(++num%2)+(--num2 + num2--)+ num2);
		//4+10*(5%2)+(9+9)+8
		
		num=4;num2=10;num3=5;
		System.out.println("Problem 5");
		System.out.println(num+++num2*(num3-- +num++)+(num2%num)-num++
				+(--num * num2));

	}
	
	
	
	
}
