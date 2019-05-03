package com.android;

public class Horse {
	/*
	 * subclasses of an object counts as overloading
	 */
	void gallop(Person p) {
		System.out.println("a horse with a person galloping");
	}
	
	void gallop(European e) {
		System.out.println("a horse with a European galloping");
	}
	//this is overloaded, as return type DOES NOT MATTER
	int gallop(int num) {
		System.out.println("calling gallop with a int");
		return 1;
	}

}
