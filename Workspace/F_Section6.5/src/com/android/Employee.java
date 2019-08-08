package com.android;

public class Employee {
	
	int age=23;
	String name="eddie";
	//blank constructor that takes no variables
	Employee(){
		/*call to the super class Object constructor is here 
		 * implicitly, so that means that the Object class is the
		 * super class for Employee. the super class is always the
		 * class you directly inherit from, next one up, directly
		 * above
		 * 
		 */
	//	super();
		System.out.println("blank employee constructor called");
	}
	
	Employee(int age,String name){
		super();
		this.age=age;
		this.name=name;
		System.out.println("Employee constructor that takes an "
				+ " int and a string called");
	}
	
	Employee(int age){
		/*
		 * this is calling a constructor in this class that takes
		 * an int and a string. When calling another constructor 
		 * from within a constructor, IT HAS TO BE THE FIRST 
		 * PIECE OF CODE
		 */
		//System.out.println();//If this code left in, we get error
		this(age,"patsy");
		System.out.println("Employee constructor that takes and Int called");
	}
	
	void earn() {
		System.out.println("Employee earn money");
	}
	
	void duties() {
		System.out.println("duties method called");
		/*
		 * when callign a method from inside the same calass, "this" is
		 * implicitly before every method call
		 */
		earn();
		this.earn();
		//same principle for variables
		System.out.println("age is "+age);
		System.out.println("age is "+this.age);
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Employee age is" + age + ", name is" + name;
	}
	
	

}

class Accountant extends Employee implements Behaviour{
//abstract method in Behaviour interface
	@Override
	public void sad() {
		System.out.println("Accountant sad");
		
	}
//abstract method in Behaviour interface
	@Override
	public void angry() {
		System.out.println("Accountant angry");
		/*
		 * you can access the variables of an interface in a class
		 * that is implementing the interface as you would any other
		 * variable of that class
		 * i.e in the accountant class we can access age and name
		 * and finalInt the exact same way
		 */
		System.out.println(finalInt);//34
		System.out.println(Behaviour.finalInt);//34
		
	}
	/*
	 * even if we have no constructor in this class, we still have
	 * a hidden DEFAULT CONSTRUCTOR, which is a no argument 
	 * constructor that calls a no argument constructor in the 
	 * super class
	 */
	/*
	Accountant(){
		super();
	}*/
	
}
