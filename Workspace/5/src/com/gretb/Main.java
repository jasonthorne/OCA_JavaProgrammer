package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Yo");
		
		/*
		 * Ths is going to demonstrate the OR opperator
		 * which is if eithero f them are true, it is all true
		 * the OR opperator looks like '||'. 
		 */
		
		
		boolean isFemale=false;
		String location="Cork";
		
		if(isFemale==true || location == "Dublin" ) {
			System.out.println("You are female. OR you dont live in Dublin");
		}else {
			System.out.println("You are not female. OR you dont live in Dublin");
		}
		
		
		
		
	}

}
