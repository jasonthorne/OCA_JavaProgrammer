package com.noel;

public class TestClass {
	/*
	 * these are overloaded methods, so using which
	 * method that is called depends on the data
	 * type used.
	 * when we pass an int to this method it first
	 * looks for an int, there is none
	 * then it looks for a primitive data type
	 * compatible with an int, there is one
	 * that takes a long, next in order would
	 * be the Integer, and then a method that
	 * takes a variable length argument of type 
	 * int.
	 * it will never match with the method that
	 * takes the Wrapper Long as they are 
	 * incompatible data types
	 */
void probe(int... x) { System.out.println("In ..."); }  //1
    
    void probe(Integer x) { System.out.println("In Integer"); } //2
    
    void probe(long x) { System.out.println("In long"); } //3 
    
    void probe(Long x) { System.out.println("In LONG"); } //4

}
