package com.noel;
public class A {
	public A() {} // A1
	  public A(String s) {
		  this();  
		  System.out.println("A :"+s);  
		  }}  // A2
class B extends A{
	//this is NOT a constructor
	  public int B(String s) {  
		  System.out.println("B :"+s);  
		  return 0; 
		  }} // B1	  
	class C extends B{
	    private C(){ 
	    	super(); } // C1
	    public C(String s){  this();  
	    System.out.println("C :"+s);  } // C2
	    public C(int i){} // C3
	}
