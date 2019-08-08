package com.android;
/*
 * constructors can "throws" exceptions, however they work
 * the opposite way to overriding methods. A sub class
 * constructor can only throw the same level Exception or a 
 * SUPER CLASS of the exception.
 */

class LifeForm{
	/*
	 * any class that extends this can throw no Exception
	 * or a super class of this. throw no exception is 
	 * considered a sub class of Exception
	 */
	LifeForm(){
		System.out.println("LifeForm created");
	}
}

public class Person extends LifeForm {
	/*
	 * Person extends LifeForm, so Person is a subclass/inherits
	 * from LifeForm. The constructor in the LifeForm class threw
	 * no exception, which means the constructor in the Person
	 * class can choose to throw no exception, or a super class
	 * of this. Any exception is a super class of no exception
	 */
	Person()throws ArrayIndexOutOfBoundsException{
		System.out.println("Person created");
	}
}
/*
 * Employee is a subclass of Person and the Person class Constructor
 * throws a ArrayIndexOutOfBoundsException that means the
 * constructor in the Employee class can throw the same level
 * exception or a super class of this. IndexOutOfBoundsException is
 * a super class of ArrayIndexOutOfBounds so this will compile
 */
class Employee extends Person{
	Employee()throws IndexOutOfBoundsException{
		System.out.println("Employee created");
		/*
		 * this code will cause your program to crash, but your code 
		 * will still compile. your program will crash because of the 
		 * second Midwife was created outside a try/catch block and
		 * your main method had a a "throws Throwable" clause
		 */
	//	throw new IndexOutOfBoundsException();
	}
}
/*
 * Nurse is a subclass of Employee and the Employee class constructor throws a 
 * IndexOutOfBoundsException that means the constructor in the Nurse class
 * can throw a same level Exception (other exceptions at this level are
 * NullPointerException, ClassCastException, IllegalArgumentExceptionk,etc and 
 * are all RuntimeExceptions) or a super class of this exception.
 * RuntimeException is a super class exception of IndexOutOfBoundsException
 * so this will compile
 */
class Nurse extends Employee{
	Nurse()throws RuntimeException{
		System.out.println("Nurse created");
	}
}
/*
 * Maternity is a subclass of Nurse and the Nurse class constructor 
 * throws RuntimeException
 * which means that the constructor in the Maternity class can throw a 
 * same level constructor or a super class of RuntimeException. Exception
 * is a super class of RuntimeException so this code will compile
 */
class Maternity extends Nurse{
	Maternity()throws Exception{
		System.out.println("maternity nurse created");
	}
}
/*
 * Midwife is a sub class of Maternity and the Maternity class Construtor
 * throws Exception, which means that the constructor in the Midwife class
 * can throw an Exception or a super class of Exception. Throwable is a 
 * super class of ALL exceptions and Errors so this code will compile
 */
/*
 * when creating a midwife, the signature of the constuctor 
 * MidWife()throws Throwable
 * is read and a call to the super class Maternity. the rules
 * that govern overriding methods that throw a exception apply here
 * which means that the super constructor it calls has to throw a same
 * level constructor or a sub class of Throwable
 */
class Midwife extends Maternity{
	Midwife()throws Throwable{
		System.out.println("Midwife nurse created");
		//throw new Throwable();
	}
}
