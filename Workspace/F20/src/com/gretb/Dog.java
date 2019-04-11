package com.gretb;

public class Dog {
	int age;//age of dog
	double weight;//weight of dog
	String name;//name of dog
	
	//Dog constructor that takes an int, double and string
	Dog(int age,double weight,String name){
		this.age=age;
		this.weight=weight;
		this.name=name;
		System.out.println("Dog constructor called");
		
	}//end of Dog constructor
	
	/*
	 * Polymorphism
	 * A method CAN DO DIFFERENT things depending on what calls it and 
	 * what is sent to it
	 * Different Animals say a fish, a eagle and a dog all have a method
	 * called move()
	 * how they move is totally different
	 * A fish will move by swimming
	 * A eagle will move by flying
	 * a dog will move by running
	 * same method, but different implementation
	 * similarly if we have a method called eat, if we OVERLOAD IT one version
	 * of the method takes a double, another version takes an int, another
	 * verson takes a string. all behave differently but HAVE THE SAME name
	 */
	void eat() {
		System.out.println(name+" dog is eating");
		//this calls the digest method for whatever dog calls the eat() method
		digest();
	}
	/*
	 * overloading 
	 * what uniquely identifies a method is NOT THE NAME. What uniquely 
	 * identifies a method is it's name PLUS the list of parameter types
	 * (int double, String name, Dog spot)
	 * Also order of parameters matters, different order of parameters
	 * are also overloaded. return type is not considered and does NOT matter
	 * for overloading
	 * RETURN TYPE DOES NOT MATTER
	 */
	//combination of name "eat" plus double in parameter
	//THE INT  RETURN PART is not taken into account for overloading
	int eat(double amount) {
		System.out.println("eat method with double");
		return 1;	
	}
	/*
	 * this method is exactly the same method signature as the above
	 * so this will not compile
	 */
/*	void eat(double dNum) {
		
	}*/
	//combination of name "eat" plus double and int in parameter list
	void eat(double amou, int num2) {
		System.out.println("eat method with double and int");
	}
	/*
	 * different order as this is name "eat" and int and double in 
	 * parameter list
	 */
	void eat(int num1, double amt) {
		System.out.println("eat method with int and double");
	}
	void digest() {
		System.out.println(name+" digesting");
	}
	
}//end of Dog class
