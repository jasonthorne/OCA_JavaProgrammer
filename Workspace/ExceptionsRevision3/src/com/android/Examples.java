package com.android;

import java.io.File;

public class Examples {
	
	static void ex1() {
		
		throwRuntime();
		
	}
	
	
	//runtime methods are by default thrown out of methods, you DONT have to have a "throws RuntimeException" in the signature (like below)
	static void throwRuntime() throws RuntimeException{
		System.out.println("throwRuntime method:");
		
	}
	
	

}
