package com.android;
/**
 * Exam Objective 1.1 Define the scope of variables
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		Local myLocal=new Local();
		Local myLocal2=new Local();
		myLocal.accessLocal(4);
		
		myLocal.address="Dublin";
		myLocal2.address="Cork";
		
		System.out.println("address for myLocal is "+myLocal.address);
		System.out.println("address of mylocal2 is "+myLocal2.address);
		
		/*
		 * accessing a static atribute in a non static way, which is through
		 * an object of the class 
		 * WHICH IS NOT RECOMMENDED
		 */
		System.out.println(myLocal.courseId);//78965
		System.out.println(myLocal2.courseId);//78965
		myLocal.courseId=5677;
		System.out.println(myLocal2.courseId);
		/*
		 * accessing a static variable in a static way
		 * which is name of the class followed by static variable name
		 */
		System.out.println("accessing in static way "+Local.courseId);
		//again calling a static method in a static way
		//static methods are also called class methods
		//static variables are also called class variables
		Pupil.takeCourse();
		
		Phone myPhone=new Phone();
		myPhone.dialUp();
		
		Phone.statMethod();
		

	}

}
