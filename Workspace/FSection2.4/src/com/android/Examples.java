package com.android;

public class Examples {
	
	static void assignmentOperators() {
		System.out.println("the Assignment operator =");
		/*
		 * =, is NOT CALLED "equals", this symbol is the Assignment operator
		 * This is used for assigning values to a variables. You can
		 * assign both literal and non literal values to a variable of
		 * any type
		 */
		int num=56;//literal value
		int num2=num;//non literal value
		/*
		 * you can declare as many variables as you like on the one line 
		 * of the same type
		 * you dont' have to give a value to every variable
		 * however if you do not give a value to a LOCAL variable, it wil
		 * have NO DEFAULT VALUE,  atributes of a class have a default
		 * value
		 */
		int a=3,b=78, dummy ,e=999;
		//this will generate an error, because dummy is a local variable
		//that was not given a value, and local variables have NO default
		//values
		//System.out.println(dummy);
		/*
		 * you can't assign more than one variable type per line of 
		 * code, i.e a double and a int
		 */
		//double dnum=4.5,int num=6;//will not compile
		/*
		 * you can't give new values to more than one variable on the 
		 * same line, you to give them new values on seperate lines
		 */
		a=5;//this will compile
		//b=34,c=89;//this will not compile
		a=10;
		b=100;
		e=1000;
		/*
		 * with the assignment operator you read from right to left
		 * so this will read as follows
		 * e is assigned to b
		 * b is assigned to a
		 * this means that a,b and e all have the same value of 1000
		 */
		a=b=e;
		System.out.println(a);
		System.out.println(b);
		System.out.println(e);
		
		boolean bool=false;
		/*
		 * NEVER use the assignment operator for comparing values
		 * in this case, it does what is in the brackets of the if statement
		 * FIRST, so bool is set to be TRUE, so then it reads
		 * if(TRUE)
		 * this will always print 
		 * "bool is true
		 */
		if(bool=true) {
			System.out.println("bool is true");
		}
		else
			System.out.println("bool is false");
		/*
		 * this is how we check to see if bool is set to true
		 */
		if(bool==true) {
			
		}
		/*
		 * this is also checking to see if bool is set to true
		 */
		if(bool) {
			
		}
		else {
			
		}
		
		a=100;
		b=10;
		/*
		 * this goes from right to left
		 * add original value of a, which was 100, to b, which was 10
		 * and assign the result to a
		 * so a becomes 110
		 */
		a=a+b;//a is now 110
		a=100;
		b=10;
		a+=b;
		a-=b;
		a*=b;
		a/=b;	
	}
	
	static void arithmeticOperators() {
		/*
		 * the arithmetic operators consist of some operators we are 
		 * familiar with such as +,-,/,* and some we might not be familiar
		 * such as 
		 * Modulus %
		 * i++ post increment operator
		 * i-- post decrement operator
		 * ++i pre increment operator
		 * --i pre decrement operator
		 */
		/*
		 * modulus is the remainder wehn we divide an integer by another
		 * integer. Modulus deals with integer division, it does NOT
		 * deal with doubles which will always give you a decimal place.
		 * modulus is the remainder from integer division
		 */
		
		int num=10;
		int num2=3;
		//the remainder is 1, so the modulus is 1
		System.out.println("10 modulus 3 is "+(num%num2));
		/*
		 * this will print out all the even numbers between 1 and 20 
		 * inclusive
		 * modulus is the same level of precedence as multipication 
		 * and division
		 */
		for(int i=1;i<21;i++) {
			if(i%2<1)
				System.out.println("number is "+i);		
		}
		
		System.out.println("Incrementers and Decrementers");
		num=10;
		num2=3;
		/*
		 * the pre increment/decrement operators first increments/decrements
		 * out number than prints out the new number
		 */
		System.out.println("pre increment "+ (++num));//will print 11
		System.out.println("pre decrement "+(--num2));//will print 2
		//change values back to original values
		num=10;
		num2=3;
		/*
		 * this first prints out the valueof num and THEN increments
		 * by one. so the first line will print out 10
		 */
		System.out.println("post increment "+(num++));
		//this line will print out 3
		System.out.println("post decrement "+(num2--));
		//but after the value of num is 11, the value of num2 is 2
		System.out.println("num is now "+num+" num2 is now "+num2);
		
		num=10;
		num2=100;
		int sum=num +num2++;
		System.out.println("sum is "+sum);
		System.out.println("num2 is "+num2);
		
		num=10;
		num2=100;
		sum=num + ++num2;
		System.out.println("sum is "+sum);
		System.out.println("num2 is "+num2);
		
		num=10;
		num2=100;
		sum=++num + ++num2;
		System.out.println("sum is "+sum);
		System.out.println("num2 is "+num2);
		System.out.println("num is "+num);
		
		System.out.println("***sum 2");
		num=10;
		num2=100;
		sum=++num -num2++;
		System.out.println("num is "+num+" num 2 is "+num2+" sum is "+sum);
		
		System.out.println("****sum 3");
		num=10;
		num2=100;
		sum=++num + num2++ + --num + --num2;
		System.out.println("num is "+num+" num 2 is "+num2+" sum is "+sum);
		
		System.out.println("****sum 4");
		num=10;
		num2=100;
		sum=++num + --num + num++ +num - ++num2 + num2 +num2 -num2;
		System.out.println("num is "+num+" num2 is "+num2+" sum is "+sum);
		
		System.out.println("sum 5");
		num=10;
		num2=100;
		sum=num-- + num2++ -num + num2 + ++num - num--;
		System.out.println("num is "+num+" num2 is "+num2+" sum is "+sum);
		
		System.out.println("sum 6");
		int i=0;
		System.out.println("loop sum");
		for(i=0;i<10;i++) {
			int total=++i +i + i++;
			System.out.println("total "+total);
			System.out.println("i is "+i);
			
		}
		System.out.println("final value for i is "+i);
		
		char char1='a';
		//'a' is the ascii key value 97
		System.out.println("char1 is "+char1);
		//we add one to teh ascii key value and it becomes the value 98
		char1++;
		//so char1 is now the character 'b'
		System.out.println("char1 is now "+char1);
		//sets first character to be the character 'a', which is 97
		char1='a';
		for(int j=0;j<26;j++) {
			/*
			 * will increment our char by one each time so will print out
			 * a,b,c,d,e
			 */
			System.out.println(char1++);
		}
		/*
		 * the numeric ascii values of 'a' is 97 and 'b' is 98, so we can
		 * add the two values
		 */
		
		char1='a';
		char char2='b';
		System.out.println("both numbers combined is "+(char1+char2));
	}
	
	static void Widening() {
		/*
		 * certain numeric data types are larger than other numeric data
		 * types.
		 * i.e a byte is smaller than a short
		 * a short is smaller than an int
		 * an int is smaller than a long
		 * widening is the process where we a number of smaller data types 
		 * that are automatically upgraded to a larger data type, we say
		 * shorts are WIDENED to be a int
		 * ints are WIDENED to a long
		 */
		/*
		 * when you use bytes or shorts in calculations the result is 
		 * ALWAYS an int
		 * when you are doing any calculations that only has bytes, shorts
		 * or ints, the answer will always be an int
		 */
		byte b1=2;
		byte b2=10;
		/*
		 * this will produce an error, as the answer will be the INT 
		 * number 12
		 */
	//	byte newB=b1+b2;
		/*
		 * there we have the two bytes b1 and b2, the product of these two
		 * numbers is WIDENED to become an int
		 */
		int num=b1+b2;
		short snum=230;
		/*
		 * when you have shorts and bytes the answer is always going to
		 * an int, this will not compile
		 */
	//	short newS=snum+b1+b2;
		//the answer for this calculation has to be an int
		int product =snum+b1+b2*num;
		
		long lnum=567;
		/*
		 * if there is a larger data type than an int in your calculation
		 * then the answer is always to WIDEN to the largest primitive
		 * data type in the calculation.
		 * in this example we an int, a long and a byte. so that means
		 * our answer HAS to be a long
		 */
		//int sum=lnum+num+b1;//will not compile
		long lsum=lnum+num+b1;
		/*
		 * a double is the largest numeric data type
		 * if we have a double in our calculation, the answer is 
		 * WIDENED to be a double
		 */
		double dnum=2.34;
		//lsum=dnum+lnum+num+snum+b1;
		double dSum=dnum+lnum+num+snum+b1;
		/*
		 * we want to add up two bytes and we want the answer to be a
		 * byte
		 * by inserting FINAL, you can ensure that if you do a calculations
		 * with these varables, the answer will always be a byte
		 */
		final byte fByte1=3;
		final byte fByte2=20;
		
		byte sumByte=fByte1+fByte2;
		/*
		 * a double and a int so your answer will be a double
		 */
		System.out.println(7.0/4);//answer is 1.75
		/*
		 * 7 and 4 are ints so your answer will be the int number 1
		 * (integer division)
		 */
		int sum=7/4;
		System.out.println(sum);//sum is 1
		/*
		 * the assignment operator has the lowest precedence, so 7/4 is 
		 * done first, 7 and 4 are integers, so this is integer division
		 * and the answer is 1
		 * 1 is then assigned to variable dsum and becomes 1.0
		 */
		double dsum=7/4;
		System.out.println(dsum);
	}
	
	static void realationalOperators() {
		/*
		 * >,<,>=,<=,!(not operator), ==(equalivance operator)
		 */
		int a=10,b=10,c=100;
		System.out.println(a>b);//prints false
		System.out.println(a>=b);//prints true
		System.out.println(a<=b);//prints true
		System.out.println(a==b);//prints true
		System.out.println(a==c);//prints false
		System.out.println(a!=b);//print false
		System.out.println(a!=c);//print true
		//will print out 4 times, 0,1,2,3
		for(int i=0;i<4;i++) {
			System.out.println("print me "+i);
		}
		//will print out five times, 0,1,2,3,4
		for(int i=0;i<=4;i++) {
			System.out.println("print me "+i);
		}
		
		boolean b1=false;
		/*
		 * this is asking the question, is b1 true, it's not, so this prints
		 * out false
		 */
		System.out.println(b1==true);//false
		System.out.println(b1==false);//true
		System.out.println(b1!=true);//true
		System.out.println(b1!=false);//false
		/*
		 * this is asking 
		 * if(b1==true)
		 * it's not so this if statement will never enter
		 * b1 is FALSE
		 */
		if(b1) {
			System.out.println("print me out");
		}
		/*
		 * similarily here this is asking
		 * while(b1==true)
		 * it's not so the while loop never enters
		 */
		while(b1) {
			System.out.println("loop never enters");
	
		}
		/*
		 * what this is saying is the following
		 * if b1 is NOT true
		 * b1 is false, so this is true
		 * so the if statement WILL execute
		 */
		if(!b1) {
			System.out.println("B1 is NOT TRUE");
		}
		/*
		 * this is checking to see if b1 is set to TRUE
		 * relational opearators never change a value, they are just
		 * checking the value
		 */
		System.out.println(b1==true);//false
		/*
		 * this is NOT checking if b1 is true, this is ASSIGNING true to
		 * the boolean b1, so after this statement b1 is now TRUE
		 */
		System.out.println(b1=true);
		
		a=10;
		b1=false;
		/*
		 * with relational operators you can't use incompatiable data types
		 * with each other
		 * for instance you can't compare a boolean to an int
		 */
		//System.out.println(a>b1);
		/*
		 * you can compare numbers of all primitive types
		 */
		double dnum=34.5;
		System.out.println(dnum>a);
		/*
		 * myChar is a char and in this case is treated as a number
		 */
		char myChar='a';
		System.out.println(myChar>a);
		char myChar2='b';
		System.out.println(myChar>myChar2);
		
		int num=4;
		int num2=4;
		/*
		 * will print false as multipication is done first
		 * and num*2 is 8 
		 * num2 * 3 is 12
		 * so we are asking
		 * 8>12, which is false
		 */
		System.out.println(num*2>(num2*3));
		
		num=4;
		num2=4;
		/*
		 * if you are reassigining a value in the middle of a calculation
		 * you have to put the reassinging in brackets
		 */
		System.out.println((num=num2*2)==num);
	}
	
	static void logicalLOperators() {
		/*
		 * there are the AND (&&) and the OR (||, sometimes called pipes)
		 * for AND both have to be true
		 * for OR either can be true
		 * ! is NOT
		 */
		int a=10,b=15;
		//both have to be true
		System.out.println(a>20 && b>5);//false
		System.out.println(a<20 && b<20);//true
		//|| eitehr can be true
		System.out.println(a>20 || b>5);//true
		System.out.println(a<20 || b>15);//true
		System.out.println(a<5 || b<10);//false
		//not true !
		System.out.println(!(a>10));//true
		System.out.println(!(b>10));//false
		System.out.println(!(a==b));//true
		/*
		 * both && and || are short circuited operators, which means
		 * if the first part of the equation is NOT TRUE, the second
		 * part is never evaluated
		 */
		int c=50;
		a=10;
		b=15;
		System.out.println(a<=c || b>=a);
		
		System.out.println(a>b && b<=c && a<=c );
		/*
		 * if you do the && part first, you get a false on right hand side
		 * of the ||
		 * a<b on the left hand side is true, so if one of the condiitions
		 * are true, then the whole statement is true
		 */
		System.out.println(a<b || b>=c && a<=c);
		
		c=50;
		a=10;b=15;
		/*
		 * && and || are called short circuit operators
		 * with && if the first condition we are testing for equates to
		 * false, it does not bother to evaluate the second or subsequent
		 * statements
		 * so the second part of ++a<100 is never evaluated and a is 
		 * never incremented by 1
		 * with || if the first condition we are testing for equates to 
		 * 	TRUE, it does not bother to evaluate the second or subsequent
		 * statements
		 */
		System.out.println(a>20 && ++a<100);
		System.out.println("the value of a is "+a);//so this value is still 10
		
		c=50;
		a=10;b=15;
		/*
		 * the single & ensures that both sides of the & are implmented,
		 * even if the first statement is false. So here a>20 is false, 
		 * but ++a is implmented, so a become 10+1, which is 11.
		 * use the & if we code to BE IMPLEMENTED ON BOTH SIDES OF THE &
		 */
		System.out.println(a>20 & ++a<100);
		System.out.println("the value of a is now "+a);
		
		String str="Hello";
		System.out.println(str);
		/*
		 * if the string is not null and the string length is great than 0
		 * convernt to uppercase
		 * the atribute of a class if it is an object and not given a value
		 * will be given a default value of null
		 * i.e name of a dog is a string, which is a object, we did not
		 * give our dog a name so the name will be null
		 */
		if(str!=null && str.length()>0) {
			System.out.println(str.toUpperCase());
		}
		/*
		 * YOU CAN HAVE A STRING OF ZERO LENGTH
		 */
		str="";
		/*
		 * this is a local variable so has NO DEFAULT VALUE
		 * this is only a reference, and nothing, so if you attempt
		 * to do anything with this reference, you will get an errror
		 */
		String myString;
		//System.out.println(myString);//will not compile
		
		Dog spot=new Dog();
		/*
		 * spot has a name, which is a string, we have not given a 
		 * name to spot. so that means that the name atribute of the Dog
		 * spot is null
		 */
		System.out.println(spot.name);//print null
		/*
		 * if you attempt to do something with a null object (i.e call
		 * the lenght method for the null string name) you will get a 
		 * NullPointerException()
		 */
	//	System.out.println(spot.name.length());
		/*
		 * general rule is do all the incrementers/decrementers and method calls
		 * from left to right first
		 * there a method of the Math class, called pow() this
		 * takes a number and a power we want to raise it too
		 * for example here we have our num, which is 4, raised
		 * to the power of 2
		 */
		int num=4;
		System.out.println("pow");
		System.out.println(num + Math.pow(++num, 2)+ ++num /num);
		/*
		 * so the above will read without
		 * 4+16.0+5/5
		 * 4+16.0+1
		 * 21.0
		 */	
	}
	
	static void questions() {
		System.out.println("problem 1");
		int num=4,num2=10,num3=5;
		System.out.println(num+num2*++num/num);
		/*
		 * 4+10*5/5
		 * 14
		 */
		num=4;num2=10;num3=5;
		
		System.out.println("problem 2");
		System.out.println(num++*++num+(num2- --num));
		/*
		 * 4*6+(10-5)
		 * 29
		 */
		num=4;num2=10;num3=5;
		System.out.println("problem 3");
		System.out.println(++num + --num *(num++ + --num2)+(num3++ - 
				num3));
		/*
		 * 5+4*(4+9)+(5-6)
		 * 56
		 */
		num=4;num2=10;num3=5;
		System.out.println("problem 4");
		System.out.println(num + num2 *(++num%2)+(--num2 + num2--)+ 
				num2);
		/*
		 * 4+10*(5%2)+(9+9)+8
		 * 40
		 */
		num=4;num2=10;num3=5;
		System.out.println("Problem 5");
		System.out.println(num++ +num2*(num3-- +num++)+(num2%num)-num++
				+(--num * num2));
		/*
		 * 4+10*(5+5)+(10%6)-6+(6*10)
		 * 162
		 */
		num=4;num2=10;num3=5;
		System.out.println("Problem 6");
		System.out.println(num++ +method1(num)+ ++num);
		/*
		 * 4+20+6
		 * 30
		 */
		
		
	}
	
	static int method1(int num) {
		return num*4;
	}

}
