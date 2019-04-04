package com.gretb;

public class Person {
	
	int age;
	String name;
	boolean sex;
	String gender;
	
	Person(int age, String name, boolean sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;
		
		if(sex) {
			gender="female";
		}else {
			gender="male";
		}
	}

}
