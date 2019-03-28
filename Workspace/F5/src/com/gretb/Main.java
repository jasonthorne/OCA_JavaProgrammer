package com.gretb;
/*
 * lesson 5 OR || AND &&
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * this is going to demonstrate the OR operator
		 * which is if either is true, it all is true
		 * the OR operator looks like || (called pipes)
		 */
		//if true female, false male
		boolean sex=true;
		String location="Dublin";
		if(sex==true || location=="Dublin") {
			System.out.println("you are a female OR you live in Dublin");
		}
		else {
			System.out.println("you are not female or you don't live in Dublihn");
		}
		
		/*
		 * if age < 18 or female of any age
		 * print out
		 * "welcome to our business "
		 * otherwise
		 * print out
		 * "sorry no entry"
		 */
		int age=56;
		sex=false;
		if(sex==true || age<18) {
			System.out.println("Welcome to our business");
		}
		else {
			System.out.println("Sorry no entry");
		}
		/*
		 * The AND operator &&, if both are true, it is all true
		 * if they are male and living in Dublin then it print out
		 * "you are male and living in Dublin"
		 */
		sex=false;
		location="Dublin";
		
		if(sex==false && location=="Dublin") {
			System.out.println("you are male and you live in Dublin");
		}
		else {
			System.out.println("you are eitehr female or you don't "
					+ "live in Dublin");
		}
		
		/*
		 * change this code so that if you enter a minus age, it will print out
		 * "sorry not entery
		 */
		age=-10;
		sex=false;
		if(sex==true || age<18) {
			System.out.println("Welcome to our business");
		}
		else {
			System.out.println("Sorry no entry");
		}

	}

}
