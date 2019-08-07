package com.android;
/**
 * Exam objective 6.6 Determine the effect upon object references
 * and primitive values when they are passed into methods that 
 * change the values
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		int num=10;
		boolean myBool=false;
		System.out.println("before method call");
		System.out.println("num is "+num);//will print 10
		System.out.println("myBool is "+myBool);//will print false
		/*
		 * will print 100 and true, but this is INSIDE the 
		 * changePrimitive method, so these are only LOCAL 
		 * to the changePrimitive method
		 */
		changePrimitive(num,myBool);
		/*
		 * after method call, num is still 10 and myBool is still
		 * false
		 */
		System.out.println("after method call");
		System.out.println("num is "+num);//will print 10
		System.out.println("myBool is "+myBool);//will print false
		
		Dog spot=new Dog();
		System.out.println("before method call");
		System.out.println("spot id is "+spot.id);
		/*
		 * you can't change what an object refers too with a method.
		 * this dog was the dog with an id of 1 before the method
		 * class and is still the dog with id of 1 after the method
		 * call. Which means its the SAME dog, it was ONLY a new dog
		 * with an id of 2, inside the changeDog() method
		 */
		changeDog(spot);
		System.out.println("after method call");
		System.out.println("spot id is "+spot.id);
		
		System.out.println("before method call");
		System.out.println("age is "+spot.age+" name is "+spot.name);
		System.out.println("id is "+spot.id);
		/*
		 * you can't change what the dog spot refers too inside a method
		 * but YOU CAN change the atributes of spot. So Spot, after 
		 * the method call, has a different age and a different name (
		 * as it was changed in the changeAtribute method) but it has
		 * the same id, which shows it's the same Dog
		 */
		changeAtribute(spot);
		System.out.println("after method call");
		System.out.println("age is "+spot.age+" name is "+spot.name);
		System.out.println("id is "+spot.id);

	}//end of main method
	
	static void changeAtribute(Dog spot) {
		spot.age=100;
		spot.name="fido";
	}
	
	
	static void changeDog(Dog spot) {
		spot=new Dog();
		
		System.out.println("inside the method the id of the dog is "
				+ spot.id);
	}
	static void changePrimitive(int num,boolean myBool) {
		//this is the same as num=num*num
		num*=num;
		myBool=true;
		System.out.println("Inside method the values are "+num+" and "
				+ myBool);	
	}
	
	

}
