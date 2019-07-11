package com.noel;

public class TestClass {
	/*
	 * null can be passed to any method that
	 * takes any object so all of these methods
	 * take a object in some format, as
	 * exceptions ARE objects.
	 * however FileNotFoundException extends
	 * IOException which extends Object. So 
	 * the null object will choose the most
	 * specific lowest option, which is in
	 * this case FileNotFoundException
	 */
	public void method(Object o){
	      System.out.println("Object Version");
	   }
	   public void method(java.io.FileNotFoundException s){
	      System.out.println("java.io.FileNotFoundException Version");
	   }
	   public void method(java.io.IOException s){
	      System.out.println("IOException Version");
	   }

}
