package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		
		
		Dog dog = new Dog();
		
		//this is calling the Cat constructor:
		Cat tibbles = new Cat(12, "tibbles", 2.3);
		
		System.out.println(tibbles.name);
		System.out.println(tibbles.age);
		
		
		//this is the default constructor in the printer class. An invisible, no arguement constructor that every class has.
		Printer printer = new Printer();
		
		int myArray1[] = {3,5,78};
		int myArray2[] = {10,100,100};
		
		printer.printAll(myArray1);
		printer.printAll(myArray2);
		
		
		System.out.println("sum of array is: " + printer.sumAll(myArray1));
		
		int sum=printer.sumAll(myArray1);
		System.out.println(sum);
		
		
		
	}

}
