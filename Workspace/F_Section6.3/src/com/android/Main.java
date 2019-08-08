package com.android;
/**
 * Exam objective 7.2 Develop code that demonstrates the use of 
 * polymorphism, including overriding and object type versus reference
 * type
 * @author noelf
 *
 */
public class Main {
	public static void main(String[]args) {
		Accountant andy=new Accountant();
		ForensicAccounant freddie=new ForensicAccounant();
		System.out.println(andy.age);
		System.out.println(freddie.age);
		freddie.fiddleTheBooks();//accountant
		freddie.investigate();//forensicAccountant
		freddie.doWork();//interface
		freddie.clockIn();//interface
		andy.clockOut();//interface
		freddie.holiday();//employee
		andy.earn();//employee
		//the accountant does not have access to the investigate method
		//andy.investigate();
		/*
		 * super class reference to a sub class object. Reference determines
		 * what methods and variables can be called, only methods that are
		 * common to all employees can be called. this is the Super class
		 * Employee reference to a sub class Accountant object. The other
		 * way around, sub class reference to a super class object, will 
		 * not compile
		 */
		Employee eddie=new Accountant();
		//this will not compile
		//Accountant angela=new Employee();
		/*
		 * this will compile but result in a ClassCastException which
		 * is a runtime exception, which is an exception that the compiler
		 * does not catch
		 */
	//	Accountant angela=(Accountant)new Employee();
		/*
		 * the only things eddie can do is earn() and holiday() as these
		 * are the only two methods that exist in the Employee class
		 */
		eddie.earn();
		eddie.holiday();
	//	eddie.doWork();//from interface no access
	//	eddie.fiddleTheBooks();//only Accountant references have access
		/*
		 * only has access to variables first declared in Employee class
		 */
		System.out.println("age is "+eddie.age);
		System.out.println("name is "+eddie.name);
		System.out.println("pps is "+eddie.pps);
		/*
		 * only Accountant references have access to the variables of
		 * the Accountant class, will not compile
		 */
		//System.out.println("eddie qualification 1 is "+qualifications[0]);
		Animal anHuman=new Human();
		anHuman.drink();
		anHuman.eat();
		anHuman.sleep();
		/*
		 * we can have a Interface reference to a object whose class
		 * implements that interface
		 * this will not compile as the Employee class DOES NOT implement
		 * the Work interface
		 */
	//	Work workEmp=new Employee();
		/*
		 * this will compile as Accountant class implements the Work
		 * interface
		 */
		Work workAccount=new Accountant();
		Work workFireman=new Fireman();
		/*
		 * if a super class implements an interface, all of its sub classes
		 * also implement the interface
		 */
		Work workForensic=new ForensicAccounant();
		/*
		 * an interface reference to a object of a class that implements
		 * that interface only has access to the methods of the interface
		 * in this case the workAccount, the workFireman and the 
		 * workForensic object only have access to 
		 * clockIn()
		 * clockOut()
		 * doWork();
		 */
		workForensic.clockIn();//gets implmentation from Accountant
		workForensic.clockOut();//gets implmentation from Accountant
		workForensic.doWork();//gets implmentation from ForensicAccountant
	/*
	 * no access to methods of the ForensicAccountant class
	 * no access to method of Employee class
	 * no access to methods unique to Accountant class
	 */
		//workForensic.investigate();//ForensicAccountant class
		//workForensic.fiddleTheBooks();//Accountant class
		//workForensic.holday()//Employee class
		/*
		 * this is an interface  reference to an existing object
		 * freddie
		 */
		Work workFreddie=freddie;
		/*
		 * this is creating an array that takes objects that implments
		 * the Work interface. THIS IS NOT AN ARRAY OF WORK OBJECTS
		 * this array can take a Accountant, ForensicAccounant and
		 * a Fireman, because all of these classes implement the
		 * Work interface
		 * all of these objects in this array only have access to
		 * clockIn()
		 * doWork()
		 * clockOut();
		 */
		Work[]workEmployees=new Work[4];
		workEmployees[0]=new Accountant();
		workEmployees[1]=freddie;
		workEmployees[2]=new Fireman();
		workEmployees[3]=new ForensicAccounant();
		
		System.out.println("a day of work");
		for(Work w:workEmployees) {
			w.clockIn();
			w.doWork();
			w.clockOut();
			//do not have access to earn as this is in the super class
			//employee 
		//	w.earn();
		}
		/*
		 * this is an array of super class type Employee, which means
		 * it can take Employee objects or any sub class of Employee
		 * each of these objects only has access to the methods and
		 * variables first defined in the Employee class
		 * so each of these objects only has access to the earn() and
		 * holiday() method and the age,name pps number variables
		 */
		Employee[]empList= {
			new Employee(),new Accountant(),new ForensicAccounant(),
			new Fireman(),new Nurse(),new Teacher(),new Farmer()
		};
		
		for(Employee e:empList) {
			System.out.println(e.getClass().getSimpleName());
			/*
			 * these are the only methods and variables these objects
			 * have access too
			 */
			e.earn();
			e.holiday();
			System.out.println("age is "+e.age);
			System.out.println("name is "+e.name);
			System.out.println("pps is "+e.pps);
		}
		
	}

}
