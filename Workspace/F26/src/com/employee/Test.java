/*
 * the package statement HAS TO BE THE first statement in a Java file
 * this is just telling your what package the file currently is in
 */
package com.employee;



/*
 * if we want to use other classes from other packages, we have to import these
 * classes or as in this case here, just importing the Dog class.
 * this is importing just the Dog class
 */
/*
 * this imports the Dog class, so now this file can use certain
 * constructors, methods and atributes of the Dog class
 * Only constructors, methods and atributes that are marked public can
 * be accessed by classes outside of the com.gretb package.
 * The Collie class which inherits from the the Dog class in the 
 * com.gretb package can access constructors, methods and atributes that
 * are marked "public" and "protected" as all members of a class that
 * are marked "protected" can be accessed inside the same package or
 * by classes that extend that class, regardless of location
 */
import com.gretb.Dog;
/*
 * this is importing all classes
 */
//import com.gretb.*;
/*
 * this class only has access to the public members of the Dog class
 */
public class Test {
	
	public void doTest() {
		
		/*
		 * the constructor in the Dog class that takes not arguements is a 
		 * package level default access looks like this
		 * Dog(){
		 * we are in a different package com.employee, so we have not access
		 * to this constructor
		 */
		//Dog myDog=new Dog();
		/*
		 * the constructor in the Dog thats a int is protected level access 
		 * which looks like this
		 * protected Dog(int age)
		 * we are in a different package and Test class DOES NOT inherit from 
		 * Dog class, so we do not have access to this constructor
		 */
	//	Dog myDog=new Dog(4);
		/*
		 * private constructor in the Dog class, can only be accessed inside the
		 * Dog class
		 */
		//Dog myDog=new Dog("rex");
		/*
		 * this is the only way to create a Dog in a class in a different package
		 * that does not extend the Dog class
		 */
		Dog myDog=new Dog(3,"rex",2.3,4.5);
		
		System.out.println("can only access age "+myDog.age);
		System.out.println("can only access public methods of the Dog class ");
		myDog.getName();//getName is a public method
		myDog.eat();//eat is a public method
		myDog.getBark();//getBark is a public method
	}//end of doTest method

}//end of Test class

class Collie extends Dog{
	/*
	 * a constructor can only call one constructor, so this is NOT ALLOWED
	 * Class Dog{
	 * 		Dog(){
	 * 			super();
	 * 			super(23,34.5)
	 * the call to another constructor HAS TO BE THE FIRST statement inside the
	 * constructOR
	 */
/*
 * has access to all public and protected members of the Dog class	
 */
	public Collie() {
		//can't have this as call to another constructor has to be first statement
		//inside constructor
	//	System.out.println("hello there");
		/*
		 * accessing the super class public Dog constructor that takes an 
		 * int, String, double, double
		 */
		super(22,"lassie",12.4,2.5);
	}
	
	//public Collie(String name) {
		/*
		 * this cannot work, as we are trying to access the package level
		 * Dog constructor that takes no arguments, which we can only access
		 * if this class is inside the same package as Dog
		 */
	//	super();
	//}
	
	public Collie(int age) {
		/*
		 * this will work as we are calling the PROTECTED constructor in the 
		 * Dog class that takes an int
		 */
		super(age);
	}
	
	public void accessVar() {
		//our Collie has an age, because age is public
		System.out.println("age is "+age);
		//our collie has a height, because height is protected
		System.out.println("height is "+height);
		//our collie does not have a weight, because weight is package level acces
	//	System.out.println("weight is "+weight);
		//our collie does not have a name, because name is private
		//System.out.println("name is "+name);
		eat();//public method
		drink();//protected
		//run();//package level default no acces to this
		//bark();//private method no access to this
		getName();//public method do have access
		getBark();//public method do have access
	}
	
}

