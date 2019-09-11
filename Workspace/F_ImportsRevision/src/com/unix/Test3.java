package com.unix;

public class Test3 {
	static {
		System.out.println("test3 Initialiser");
	}

	public static int statInt3=789;
	public int test3Num=90;
	
	public int age=45;
	public static int statAge=123;
	
	public int num=45;
	
	public Test3() {
		
	}
	public static void test3StatMethod() {
		System.out.println("test3Stat printout");
	}
	
	public void test3ordMethod() {
		System.out.println("test3 ordMethod");
	
	}
}
