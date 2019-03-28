package com.gretb;
/**
 * If Statements
 * if statements give us a choice to do something is some condition arises
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * defining an int called age, this is the age of customer in a 
		 * cinema
		 */
		int age=21;
		
		System.out.println(age>18);//true
		System.out.println(age<18);//false
		/*
		 * this is a program that will check if the customer is older than 18
		 * years of age, if they are they will gain admittance, otherwise they
		 * will not gain admittance. 
		 * if statemetn checks if some condition is true, what it checking
		 * is always inside the parenthesis()
		 */
		age =21;
		if(age<18) //if this is true do the first block of code
		{
			System.out.println("no admittance to cinema");
			System.out.println("you are under 18");
		}
		else //if the condition is false, do this block of code
		{
			System.out.println("you are admitted to the film");
			System.out.println("enjoy the film");		
		}
		/*
		 * you can't have an ELSE without an IF
		 * you can't have an ELSE IF without an IF
		 * you CAN have an IF all by itself
		 */
		/*
		 * Hairdressers
		 * getting a haircut, price depends on age
		 * if less than 18, price is 5 euro
		 * if less than 30, price is 10 euro
		 * if less than 65, price is 15 euro
		 * everyone else pays 3 euros
		 * we can use else if
		 * else if gives us more options
		 */
		double price;
		age=105;	
		if(age<18)
		{
			price=5.0;//anyone younger than 18 pays 5 euros
		}
		else if(age<=30) 
		{
			price=10.0;	//anyone 18 up to the age of 30 inclusive pays 10
		}
		else if(age<65) {
			price=15.00;
		//	anyone over the age of 30 up to the age of 65 pays 15 euros
		}
		else {//anyone 65 or over pays 3 euros
			price=3.00;
		}
		System.out.println("your pay "+price+" euro");
		/*
		 * this IF statement will only produce an output if the number is
		 * less than 40, if it's not, nothing is printed out
		 */
		age=45;
		if(age<40) {
			System.out.println("this number is less than 40");
		}
		/*
		 * this is a program for admittance to a nightclub
		 * if your name is Mary, you to the VIP section
		 * if your name is Pat, you go the general punters section
		 * if your name is John, you go to the peasants
		 * if you have any other name you are not allowed in
		 */
		/*
		 * this is the name of the person
		 */
		String name="Noel";
		//this is the message this is displayed when we know the name of our
		//customer
		String message;
		//if customer is mary
		if(name=="Mary") {
			message="Welcome to the VIP Area";
		}
		//if customer is pat
		else if(name=="Pat") {
			message="welcome to the general punters section";
		}
		//if customer is John
		else if(name=="John") {
			message="Welcome to the Peasants area";
		}
		else
			/*
			 * if anyone else this is the message
			 * if you only have one statement in an else, else if or an if then
			 * you do not need curly brackets
			 */
			message="you are not allowed in here";
	/*
	 * this print statement has four different elements printed out
	 * first is the text "hello"
	 * followed by the name of the punter, which is the variable 'name'
	 * followed by a space, which is " "
	 * followed by the message for each punter	
	 */
		System.out.println("hello "+name+" "+message);
		/*
		 * this is just a reference, values go on the right of the assignment
		 * (=)
		 * if you try to print off just a reference, that has not value, you 
		 * will get an error
		 */
		String surName;
		//this will produce an error
	//	System.out.println(surName);
		//here we have a reference on the left and a value on the right
		String town="Ennis";
		
		name="Mary";
		//this is the message this is displayed when we know the name of our
		//customer
		String message2;//="you are not allowed in here";
		//if customer is mary
		if(name=="Mary") {
			message2="Welcome to the VIP Area";
		}
		//if customer is pat
		else if(name=="Pat") {
			message2="welcome to the general punters section";
		}
		//if customer is John
		else if(name=="John") {
			message2="Welcome to the Peasants area";
		}
		else
			/*
			 * if anyone else this is the message
			 * if you only have one statement in an else, else if or an if then
			 * you do not need curly brackets
			 */
			message2="you are not allowed in here";
		
		System.out.println("hello "+name+" "+message2);

	}

}
