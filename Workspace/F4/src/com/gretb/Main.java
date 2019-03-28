package com.gretb;

public class Main {

	public static void main(String[] args) {
		/*
		 * Insurance policy calculator
		 * if you are female and live in Galway
		 * Policy is 500 a year
		 * if you are female and live in Dublin
		 * policy is 1000 a year
		 * if you are female and live anywhere else
		 * policy is 2000
		 * if male and live in galway
		 * policy is 750
		 * if male and live in Dublin 
		 * policy is 1250
		 * if male and live anywhere else
		 * Policy is 3000
		 */
		/*
		 * if true sex is female
		 * if false sex is male
		 */
		boolean sex=false;
		String location="Shannon";
		//if we dont' give it a value, the policy will be zero
		double policy=0;
		//if the person is female
		if(sex==true) {//start of female if statement
			//nested if statement for our choice of location for females
			if(location=="Galway") {//if female lives in galway
				policy=500;
			}
			else if(location=="Dublin") {//if female lives in Dublin
				policy=1000;
			}
			else {//if female lives anywhere else
				policy=2000;
			}
		}//end of female if statement
		else {//start of the Male else statement
			//nested if statement for our choice of location for male
			if(location=="Galway") {//if male lives in galway
				policy=750;
			}
			else if(location=="Dublin") {//if male lives in Dublin
				policy=1250;
			}
			else {//if male lives anywhere else
				policy=3000;
			}
		}//end of male else statement
		
		System.out.println("your policy is €"+policy+" euros");

	}

}
