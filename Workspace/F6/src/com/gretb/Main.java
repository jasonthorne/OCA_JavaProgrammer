package com.gretb;

public class Main {

	public static void main(String[] args) {
		/*
		 * Insurance Calculator
		 * if age>=25 and location is Galway or Dublin
		 * policy is 1000 euros
		 * if age<25 and location is Cork or Galway
		 * Policy is 1500
		 * all other situations
		 * policy is 2000
		 */
		String location="Galway";//where person lives
		int age=5;//age of person
		double policy=0;//price charged to person for policy
	
		/*
		 *  if age>=25 and location is Galway or Dublin
		 * policy is 1000 euros
		 */
		if(age>=25 && (location=="Galway" || location=="Dublin")) {
			policy=1000;
		}
		/*if age<25 and location is Cork or Galway
		 * Policy is 1500
		 */
		else if(age<25 && (location=="Galway" || location=="Cork")) {
			policy=1250;
		}
		else
			policy=2000;
		System.out.println("policy is "+policy);

	}

}
