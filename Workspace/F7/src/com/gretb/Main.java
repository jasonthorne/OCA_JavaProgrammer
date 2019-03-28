package com.gretb;
/**
 * SWITCH statements, which are an alternative to IF statements
 *
 */
public class Main {

	public static void main(String[] args) {
	/*
	 * an alternaitve to if statements are SWITCH statements.
	 * Switch are mroe often used when designing Graphical User Interfaces (GUI).
	 */
	int choice=37;//this is our selection
	/*
	 * you can declare multiple variables of the same type on the same
	 * i.e have to be all INT or all DOUBLE
	 */
	int num=4,num2=6,sum;
	//a switch statement always starts with the keyword SWITCH
	switch(choice)//the variables that will determine which CASE we use
	{
	case 1://if choice is 1
		/*
		 * if the choice is set to 1 this code will run
		 */
		System.out.println("you have choosen 1");
		sum=num+num2;
		System.out.println("numbers added up is "+sum);
		/*
		 * when the code gets to the point the switch statement will exit the 
		 * switch statement, see second example to see what happens when we
		 * have no breaks included
		 */
		break;
	case 2://if choice is 2
		System.out.println("your have choosen 2");
		sum=num*num2;
		System.out.println("numbers multipled is "+sum);
		break;
	case 3://if choice is 3
		System.out.println("you have choosen 3");
		sum=num/num2;
		System.out.println("numbers divided is "+sum);
		break;
	default://this is the same as an else and is the default case
		System.out.println("you have not choosen a number between 1 and 3");
	
	}
	System.out.println("we are outside the Switch statement");
	/*
	 * if we have no breaks it will continue on after whatever case it first hits.
	 * in this situation the choice is 2, so it does not hit case 1, but it does
	 * hit case 2. it will then hit every case after case 2, so it will hit case 3
	 * and the default case also
	 */
	choice=2;
	System.out.println("second switch Statement");
	switch(choice)//the variables that will determine which CASE we use
	{
	case 1://if choice is 1
		System.out.println("you have choosen 1");
		sum=num+num2;
		System.out.println("numbers added up is "+sum);
	//	break;
	case 2://if choice is 2
		System.out.println("your have choosen 2");
		sum=num*num2;
		System.out.println("numbers multipled is "+sum);
	//	break;
	case 3://if choice is 3
		System.out.println("you have choosen 3");
		sum=num/num2;
		System.out.println("numbers divided is "+sum);
	//	break;
	default://this is the same as an else and is the default case
		System.out.println("you have not choosen a number between 1 and 3");
	
	}
	System.out.println("we are outside the Switch statement");
	}
	
	

}
