package com.jay;

public class Soldier {
	
	static int counter = 0;
	int id;
	
	Soldier(){
		counter++;
		id=counter;
	}
	
	void fight() {
		System.out.println("Soldier"+id + " is fighting");
	}

}
