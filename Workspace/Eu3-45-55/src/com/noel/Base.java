package com.noel;

public class Base {
	
	void methodA(){
	      System.out.println("base - MethodA");
	   }
}

class Sub extends Base{
	
	public void methodA(){
	      System.out.println("sub - MethodA");
	   }
	   public void methodB(){
	      System.out.println("sub - MethodB");
	   }
}
