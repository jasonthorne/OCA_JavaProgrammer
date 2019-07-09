package com.android;

public class Person {
	
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	if overriding a CONSTRUCTOR (not method - that's explained in Animal class) that throws an exception, 
	you can have that subclass throw the SAME LEVEL of exception, OR a SUPERclass of that exception.
	*/

	Person() throws ArrayIndexOutOfBoundsException{
		System.out.println("Person created");
	}
	
}

class Employee extends Person{
	Employee() throws IndexOutOfBoundsException{
		System.out.println("Employee created");
	}
}

class Nurse extends Employee{
	Nurse()  throws RuntimeException{
		System.out.println("Nurse created");
	}
}


class Maternity extends Nurse{
	
	
	Maternity() throws Exception{
		
		System.out.println("Maternity created");
	}
}

class Midwife extends Maternity{
	
	Midwife()throws Throwable{ //LIFO. so this has to be a higher level throw than it's parent ++++++++++++++++++++++++++++++
		System.out.println("Midwife created");
	}
}