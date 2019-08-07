package com.android;

public class Monkey {
	/*
	 * keep a count of monkeys created
	 */
	static int counter=1;
	//id is a unique identifying number for each monkey
	int id;
	
	Monkey(){
		/*
		 * each monkey has it's own id, which will be set to whatever
		 * the counter is when the monkey is created
		 */
		id=counter;
		counter++;
	}

}
