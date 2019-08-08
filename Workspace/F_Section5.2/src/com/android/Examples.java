package com.android;

public class Examples {
	static void ex1() {
		
		/*
		 * in a switch statement, and in the switch part of the statement
		 * you can only use the following data types 
		 * char
		 * byte
		 * int
		 * String
		 * Integer
		 * Short
		 * Byte
		 * Character
		 * enum
		 */
		int marks=7897;
		/*
		 * a switch begins with the keyword "switch" and some variable
		 * we are checking a value for, so here we are checking for the
		 * value of the variable "marks"
		 */
		switch(marks) {
		/*
		 * if marks is 10, do this
		 */
		case 10:
			System.out.println("mark is 10");
			/*
			 * after each case statement we usually have a break 
			 * statement, this breaks out of the switch statement 
			 * when it finds a match. In this case when marks==10, it
			 * will print out "mark is 10" then exits the switch statement
			 * The keyword case has to be followed by a value, followed
			 * by a colon :
			 * each case statement can have as many lines of code as you
			 * and there is no need for bracketing
			 */
			System.out.println("well done on your mark of 10");
			break;
		case 20:
			System.out.println("mark is 20");
			break;
		case 30:
			System.out.println("mark is 30");
			break;
			/*
			 * default is the same as else, if its any other number 
			 * than 10, 20, or 30, this is what will execute.
			 */
		default:
			System.out.println("invalid number");
			break;
				
		}//end of switch statement
		
		String days="SAT";
		switch(days) {
		case "SAT":
			System.out.println("today is saturday");
			System.out.println("its the weekend");
			break;
		case "SUN":
			System.out.println("today is sunday");
			break;
		case "MON":
			System.out.println("today is monday");
			break;
			/*
			 * you don't HAVE to put in a default
			 */
		default:
			System.out.println("some other day");
			break;
		
		}//end of switch statement	
	}//END OF EX1
	
	static void ex2() {
		int marks=10;
		/*
		 * If you have a switch statement without any breaks, the 
		 * switch statement will continue until it finds  breaks
		 * or simply finishes. So if marks are 10, it will trigger
		 * case 10: and continue onto case 20, case 30 and default as
		 * there are no breaks after any case statement. Similarily if
		 * marks is 20, it will hit case 20 and everything after than
		 */
		switch(marks) {
		case 10:
			System.out.println("mark is 10");
		case 20:
			System.out.println("mark is 20");
			System.out.println("some more lines of code for mark 20");
		case 30:
			System.out.println("mark is 30");
			default:
				System.out.println("some other number");
		}//end of switch statement
		
		System.out.println("another switch statement");
		String days="SAT";
		switch(days) {
		case "SAT"://You dont' have to put any code after case
		case "SUN":
			System.out.println("the weekend");
			break;
		case "MON":
			System.out.println("monday");
		case "TUE":
			System.out.println("tuesday");
		case "WED":
			System.out.println("wednesday");
		case "THUR":
			System.out.println("thursday ");
		case "FRI":
			System.out.println("friday");
			System.out.println("end of working week");
			break;
			default:
				System.out.println("invalid day");
				break;
			
		}//ENd of switch
	}//end of ex2
	
	static void ex3() {
		/*
		 * you can put in a mathematical calculation in the switch
		 * part of a switch statement
		 * the variables HAVE to be initialised
		 */
		int score=10,num=10;
		switch(score+num) {
		case 10:
			System.out.println("number is 10");
			break;
		case 30:
			System.out.println("number is 3");
			break;
			/*
			 * default has to come at the end, but is not
			 * compulsary, if i have no default here, nothing
			 * will be printed
			 */
			default:
				System.out.println("number unknown");
				break;	
		}//end of switch
		
		score=12;
		//this is checking for number 13
		switch(++score) {
		
		}
		//can't use a boolean in a switch statment
		//because this would only give you two choices
		boolean myBool=true;
	/*	switch(myBool) {
		
		}*/
		
		double dnum=1.2;
		/*
		 * can't have a double as there is an infinite amount of 
		 * numbers between two whole numbers i.e 1 and 2
		 */
	/*	switch(dnum) {
		
		}*/
		/*
		 * can't use an object other than a String
		 */
		Dog spot=new Dog();
	/*	switch(spot) {
		
		}*/
		
		String name=null;
		/*
		 * this will not generate a compiler error, this will generate a
		 * NullPointerException
		 */
		/*switch(name) {
		
		}*/
		
		int age=567,age2=40;
		switch(age) {
		case 12:
			//if age is 12, add 10 onto age, and 50 onto age2
			age+=10;
			age2+=50;
			System.out.println("age is "+age);
			System.out.println("age2 is "+age2);
			break;
		case 3:
			//if age is 3, age and age2 stay the same
			System.out.println("age is "+age);
			System.out.println("age2 is "+age2);
			break;
			default:
		//if age is any other number, age and age2 is multiplied by 2
			age*=2;
			age2*=2;
			break;
			
		}//end of switch
		System.out.println("final value of age is "+age);
		System.out.println("final value of age2 is "+age2);
		/*
		 * you can't use a variable in the case part of a switch
		 * statement, the case part has to be a definate value that
		 * cannot change. here we can't say what the definate value
		 * will be, as anywhere inside the switch statement itself
		 * you could change the variable choice. it's not because you
		 * have changed it, but YOU CAN CHANGE IT
		 */
	/*	int choice=5;
		switch(age) {
		case choice://will not compile can use a variable
			System.out.println();
			break;
		}*/
		/*
		 * can't do this for two reasons
		 * age>18 evaluates to a boolean, and booleans are not allowed
		 * in case statements
		 * also age can change, which means this could be true or
		 * could be false
		 */
	/*	switch(age) {
		case age>18:
			
		}*/
		/*
		 * final variables CANNOT change
		 * the data type does not matter, as long as it is one of
		 * the compatible types, this will work
		 */
		final int fNum=12;
		final int fNum2=30;
		final byte bNum=3;
		/*
		 * we cannot use this variable in the case statement, as you
		 * cannot use a final variable that is declared over two
		 * lines of code
		 * 
		 */
		final int finalNum;
		finalNum=100;
		
		switch(age) {
		case fNum://12 cannot change
			System.out.println("age cannot change "+fNum);
			break;
		case fNum2://30 cannot change
			System.out.println("age cannot change "+fNum2);
			break;
		case bNum://3 cannot change
			System.out.println("byte age cannot change "+bNum);
			break;
		case bNum+fNum://15 cannot change
			System.out.println("bnum +fNum added up");
		break;
		
		//this will not compile as created over two lines of code
	//	case finalNum:
		//will not compile as can't have a null case
		//and a primitive number can't be null
	/*	case null:
			break;*/
		//this will not compile as could be any number	
	//	case returnInt():	
		}//end of switch	
		/*
		 * you can have a method call in the switch part
		 */
		switch(returnInt()) {
		
		}
	}
	
	static int returnInt() {
		return 5;
	}

}
