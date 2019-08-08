package com.android;

import com.gretb.Accountant;

/**
 * Exam Objective 7.1 Describe inheritance and it's benefits
 * Exam Objective 7.5 use Abstract classes and interfaces
 * @author noelf
 * Benefit 1
 * With smaller derived classes (sub classes) we only need to 
 * concentrate on what is unique to a particular derived class
 * Benefit 2
 * ease of modification to common properties and behaviour
 * Benefit 3
 * Extensibility
 * code that works with the base class in some hierarchy tree can
 * work will all classes that are added using inheritance later.
 * Benefit 4
 * use tried and tested code from a base class. If something works in
 * a base class, its going to work in a sub class, promotes re use of
 * good code
 * i.e connecting to a database, finding a route in GPS software
 * Benefit 5
 * concentrate on specialised behaviour of your classes
 * Benefit 6
 * Logical structures and groupings
 *
 */
public class Main {

	public static void main(String[] args) {
		Employee eddie=new Employee();
		Employee etna=new Employee();
		Fireman sam=new Fireman();
		Secretary sean=new Secretary();
		OilRigFireman olivia=new OilRigFireman();
		Accountant andy=new Accountant();
		
		
		
		/*
		 * this is returing a Employee reference to a Fireman object
		 * as this is returning a Employee reference to a Fireman
		 * object, you can't assign this object to a fireman reference
		 */
		//Fireman fred=eddie.sendInvitation(sam);//fireman object sent to method
		Employee enda=eddie.sendInvitation(sam);
	//	enda.rescue();
	//	enda.extinguish();
		/*
		 * this method returns a Employee reference to a Fireman object
		 * so we can't assign the product of the method directly to
		 * the Fireman reference fred.
		 * you have to cast the product of the method to be a fireman,
		 * which you can do, as this is a Fireman object. if we did not
		 * cast this, you would have a object that could not access the
		 * fireman methods rescue() and extinguish(), by casting it 
		 * fred can now access rescue() and extinguish();
		 */
		Fireman fred=(Fireman)eddie.sendInvitation(sam);
		fred.rescue();
		fred.extinguish();
		/*
		 * this one method replaces 25 overloaded methods, if we 
		 * have no inherinace relationship of all types of Employee.
		 * you would need 5 overloaded sendInvitation() methods in 
		 * each of the Employee types, and we have five different
		 * types of employee, so 5*5 is 25.
		 * one SendInvitation method in the super Employee class, does
		 * the work of 25 seperate methods in un related classes
		 * see Animal class for example of unrelated classes
		 */
		
		eddie.sendInvitation(sam);//Fireman object sent to method
		eddie.sendInvitation(etna);//employee object sent to method
		eddie.sendInvitation(sean);//secretary object sent to method
		eddie.sendInvitation(olivia);//OilrigFirmena object sent to method
		eddie.sendInvitation(andy);//Accountant object sent to method
		/*
		 * you can have a superclass reference to a sub class object
		 * even if that superclass is a abstract class, as we have here
		 * Rose is an abstract class
		 */
		Rose myRose=new EnglishRose();
		/*
		 * you can't have a Rose object, as this class is abstract and
		 * you can't have a abstract object, so 
		 * new Rose() will not compile
		 */
		//Rose myRose2=new Rose();
		myRose.shed();//plant class
		myRose.grow();//plant class
		/*
		 * an abstract method in the Shrub class that the 
		 * EnglishRose class overrode, it had no choice, it had
		 * to override this method
		 */
		myRose.sniff();
		/*
		 * an abstract method in the Shrub class that the 
		 * EnglishRose class overrode, it had no choice, it had
		 * to override this method
		 */
		myRose.grow();
		/*
		 * does not have access to this as it's a Rose reference,
		 * so only access to methods defined in Rose or superclasses
		 * of Rose
		 */
	//	myRose.stiffUpperLip();
		/*
		 * this object only has access to two methods
		 * shed() and grow();
		 */
		Plant plantRose=new EnglishRose();
		plantRose.shed();
		plantRose.grow();
		//plantRose.pollinate();//no access to Pollinate
		
		Shrub shrubRose=new EnglishRose();
		shrubRose.shed();
		shrubRose.grow();
		/*
		 * abstract method in shrub class where it was first defined
		 */
		shrubRose.pollinate();
		//shrubRose.sniff();//first defined in rose class no access
		

	}

}
