package com.android;

import com.android.Employee.Sex;

/**
 * Overriding
 * @author noelf
 *
 */
public class Main {
	public static void main(String[]args) {
		System.out.println("**Abstraction");
		/*
		 * abstraction is only certain aspects or features of a object
		 * are shown in certain cases. here we create an interface
		 * reference to an object that implements that interface.
		 * so we only have access to the Behaviour of Animals with the
		 * first object
		 */
		Behaviour behaveAnimal=new Animal();
		behaveAnimal.happy();
		/*
		 * the second object only has access to the Movement of Animals
		 */
		Movement moveAnimal=new Animal();
		
		Employee tom=new Employee("tom",45,Sex.MALE,1800);
		/*
		 * we are just concerned with the financial details of employees
		 * so we acccess a employee object with only details pertaining
		 * to his Financial status, all of which are contained in the 
		 * Financial interface. So this object will tell use everything
		 * about the financial state of tom
		 */
		Financial finEmployee=tom;
		finEmployee.wages();//shows 1800 in account
		/*
		 * each time we call this method our wages are lodged to our
		 * account
		 */
		finEmployee.wages();//shows 3600
		/*
		 * this will only tell us about how the employee moves, so this
		 * will tell us how tom moves
		 */
		Movement moveEmployee=tom;
		/*
		 * this will tell use about the emotions of tom
		 */
		Behaviour behaveEmployee=tom;
		
		System.out.println("Overriding");
		Building myBuilding=new Building();
		System.out.println("***using build method with a Person");
		/*
		 * the build() method can take Person, which means it can
		 * also take a sub class of Person. So it can take a 
		 * Person or a European or a Irish
		 */
		myBuilding.build(new Person());
		System.out.println("***using build method with a European");
		myBuilding.build(new European());
		System.out.println("**using build method with a Irish person");
		myBuilding.build(new Irish());
		/*
		 * there are fewer restrictions with overloading as with overloading
		 * it is a DIFFERENT method.
		 * As long as it's the same method name and different parameter list
		 * or order of parameters in the list then the methods are 
		 * overloaded
		 * return type DOES NOT matter
		 */
		Person pete=new Person();
		European ed=new European();
		
		Horse harry=new Horse();
		harry.gallop(pete);
		harry.gallop(ed);
		//overloaded method that takes and returns an int
		harry.gallop(4);
		System.out.println("***Type safety");
		System.out.println("in java 8 you have to give your variable a type"
				+ " when you declare it");
		int num;
		double dNum;
		Employee myEmployee;
		System.out.println("this has changed slightly in Java 9 where if you "
				+ "infer the data type you can use the VAR data type");
		/*
		 * declaring a var in this file will not compile, as we are using
		 * java 8 JRE
		 */
		
		
		
	}

}
