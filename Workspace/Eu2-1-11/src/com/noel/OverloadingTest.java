package com.noel;

public class OverloadingTest {
	
	void method1(int num){
		System.out.println("method one called");
	}
	
	void method1(double dnum){
		System.out.println("method two called");
	}
	
	void method1(String str){
		System.out.println("method three called");
	} 

}
