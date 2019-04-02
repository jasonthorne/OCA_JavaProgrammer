package com.gretb;
/**
 * TERNARY OPERATOR
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * given two int numbers, write a program that will tell you
		 * which number is bigger. make sure both numbers are 
		 * different
		 */
		int num=12;
		int num2=56;
		 //bigger is going to the bigger number
		int bigger;
		//if num is bigger than num2
		if(num>num2) {
			//num is larger and assigned to int bigger
			bigger=num;
			//prints out largest number
			System.out.println("num "+bigger+" is bigger");
		}
		//else if num2 is bigger than num
		else {
			//num2 is larger number and assigned to int bigger
			bigger=num2;
			System.out.println("num2 "+bigger+" is bigger");
		}
		/*
		 * a ternary operator is a replacment for a simple 
		 * IF ELSE
		 * the question mark (?) is the teranary operator
		 */
		int age=16;
		String adm;
		/*
		 * if age is greater than 18, they gain admittance
		 * else they don't get admittance
		 */
		if(age<18) {
			adm="No Admittance";
		}
		else
			adm="you get Admitted";
		System.out.println(adm);
		/*
		 * a ternary operator is made up of three parts
		 * the first part is what we are checking for (just like in
		 * a if statement)
		 * followed by the question mark '?'
		 * then followed by if our check is true, ie if age is less
		 * than 18. the string adm is assigned the text 'no admittance'
		 * followed by a colon, if our check is false, i.e the string
		 * adm is assigned the text 'you get admitted'
		 * in short first part check, second part if true, third part
		 * if false
		 */
		adm=age<18?"No Admittance":"You get Admitted";
		
		System.out.println("for ternary "+adm);
		/*
		 * if the first number is bigger than the second number
		 * the first number is assigned to bigger otherwise the 
		 * second number is assigned to bigger
		 */
		bigger=num>num2 ? num:num2;
		/*
		 * this will work, this will print out 'No Admittance' if 
		 * younger than 18 is true
		 * else will print out 'you get admitted'
		 */
		System.out.println(age<18?"No Admittance":"You get Admitted");
		
		/*
		 * if the customer is a female, price for haircut is 15.50
		 * otherwise price for haircut is 10.50
		 */
		boolean sex;//true is female, false is male
		double price;//price of a haircut
		sex=true;
		/*
		 * if the sex is false (which we mean male) then the price
		 * of the haircut is 10.00 otherwise it's 15.00
		 */
		price = sex==false?10.00:15.00;
		System.out.println("price is "+price);
		
		sex=false;
		price= sex ?15.00:10.00;
		
		System.out.println("price is "+price);
		

	}

}
