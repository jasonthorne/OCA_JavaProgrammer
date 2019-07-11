package com.noel;

public class Main {
	public static void main(String[]args){
	//	Questions.q40();
		Questions.q41();
		Main fwa = new Main(); 
		//for question 42
		String[][] newargs = {args}; 
		/*
		 *looking for a method called Main
		 * that takes a two dimensional array
		 */
		//fwa.main(newargs);
		/* this compiles the 
		 * javac Main.java
		 *  if we run the program with the strings
		 * "a" "b" and "c"
		 * and passes this array to the other
		 * overloaded main method and
		 * prints out the [0][1]
		 * which is "b"
		 * java FunWithArgs a b c
		 */
	}
	public static void main(String[][] args) { 
		System.out.println(args[0][1]);
		}

}
