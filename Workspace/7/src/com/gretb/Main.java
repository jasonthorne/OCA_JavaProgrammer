package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		
	 //switch statements:
	
		int choice = 2;
		
		int num1=4, num2=6, sum;
		
		switch(choice) {
		
		case 1:
			System.out.println("You have chosen 1");
			sum = num1 + num2;
			System.out.println("sum is " + sum);
			break;
		case 2:
			System.out.println("you chose 2");
			sum = num1 * num2;
			System.out.println("numbers multiplied is: " + sum);
			break;
		case 3:
			System.out.println("you chose 3");
			sum = num1 / num2;
			System.out.println("numbers divided are: " + sum);
			break;
		default:
			System.out.println("You have not chosen a number between 1 & 3");
			
		}
		
		
	
	}

}
