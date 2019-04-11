package com.gretb;

public class Cat {
	int age;//age of cat
	double weight;//weight of cat
	String name;//name of cat
	/*
	 * Cat Constructor
	 * uses the 'this' keyword, which refers to THIS cat
	 * so this.age, means the age of THE CAT WE JUST CREATED 
	 */
	//Cat(int cAge,double cWeight, String cName)
	Cat(int age,double weight,String name){
		this.age=age;
		this.weight=weight;
		this.name=name;
		System.out.println("cat constructor called");
	}
	
	void eat() {
		/*
		 * the 'this' keyword is implicitly there in every place you use
		 * an atribute name inside the cat class
		 */
		System.out.println(this.name+" cat eating");
		//is the exact same in the method as
		System.out.println(name+" cat eating");
	}
	
	

}//end of Cat clas
