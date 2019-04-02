package com.gretb;

public class Main {

	public static void main(String[] args) {
		System.out.println("Yo");
		
		/*
		 * A ternary operator (a question mark: '?') is a replacement for a simple IF ELSE
		 */
		
		int age=16;
		String adm;
		
		/*
		 * If age > 18, they gain admittance
		 * ELSE they don't
		 */
		
		if(age<18) {
			adm="No admittence";
		}else {
			adm="You get in!";
		}
		System.out.println(adm);
		
		//TERNARY OPERATOR EQUIVILLENT: 
		
		//variable x = (expression) ? value if true: value if false
		
		adm=age<18? "No admittance": "You get admitted"; //admin string is asigned 
		
		System.out.println("Fromr ternary: " + adm);
		
		//OR as prinln:
		System.out.print("From ternary 'println()': ");
		System.out.println(age<18? "No admittance": "You get admitted");

	}

}
