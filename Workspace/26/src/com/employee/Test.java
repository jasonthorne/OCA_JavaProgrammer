
 //The package statement HAS TO BE THE FIRST statement in a java file:
package com.employee; //package statement. telling you what package the file is in

//importing a class from another package:
//import com.gretb.Dog; //imports just the Dog class from package
import com.gretb.*; //imports all classes from package (all public classes)

public class Test{

	
	public void doTest() {
		
		//Dog myDog = new Dog(); //not allowed as constructor is default (package level only)
		
		//Dog myDog = new Dog(4); //not allowed as constructor is protected (package level or subclass only)
		
		//Dog myDog = new Dog("Rex"); //not allowed as constructor is private (class level only)
		
		Dog myDog = new Dog(3, "Rex", 2.3, 4.50); //only way to create a Dog in this class
		
		System.out.println("Can only access age: " + myDog.age);
		System.out.println("Can only access public methods of the dog class: ");
		myDog.getName();
		myDog.eat();
		myDog.getBark();
	}

}//end of Test

class Collie extends Dog{
	
	//A constructor can only call ONE other parent constructor ++++++++++++++++++
	
	//constructor that that has a call to the public constructor in the super class (Dog class). 
	Collie() {
		super(22,"Lassie",24,2.5); //calling the Dog classe's constructor that takes these args. 
	}
	
	//constructor that that has a call to the protected constructor in the super class (Dog class). 
	Collie(int age) { //CAN have other params, but MUST the super's param MUST be the first param here.
		
		super(age); //calling the Dog classe's constructor that takes this arg. 
	}
	
	public void accessVar() {
		System.out.println("age: " + age); //age can be accessed because age is public
		System.out.println("height: " + height); //height can be accessed because height is protected
		eat(); //public
		drink(); //protected
	}
	
}
























