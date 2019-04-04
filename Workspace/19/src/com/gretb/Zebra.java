package com.gretb;

public class Zebra {
	
	int age;
	String name;
	boolean sex;
	String gender;
	
	Zebra(int age, String name, boolean sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;
		getGender();
	}
	
	private void getGender() {
		if(sex) {
			gender="female";
		}else {
			gender="male";
		}
	
	}

}
