package com.gretb;

import com.employee.Test;

/**
 * Access modifiers
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * this uses the constructor in the Dog class that has default level access
		 * which means package level access, all classes in the same package can
		 * access this constructor
		 */
		Dog spot=new Dog();
		//using the public constructor
		Dog rex=new Dog(2,"rex",2.3,4.5);
		//using the protected constructor
		Dog benji=new Dog(2);
		/*
		 * this does not compile as this constructor in the Dog class is private
		 * so we cannot create a dog like this, outside of the Dog class
		 */
		//Dog myDog=new Dog("lassie");
		//age is a public atribute which can be accessed in any other class
		System.out.println("age of rex is "+rex.age);
		//weight is default/package level access which can be accessed by classes
		//in the same package
		System.out.println("weight of rex is "+rex.weight);
		/*
		 * height is protected level access which can be accessed by classes in 
		 * same package and in sub classes regardless whether they are in the
		 * same class or not
		 */
		System.out.println("height of rex is "+rex.height);
		/*
		 * we have no acces to the name of the Dog as this is private, which 
		 * means it's only accessible inside of the Dog class and no where else
		 */
	//	System.out.println("name of rex is "+rex.name);
		
		rex.eat();//public level access
		rex.drink();//protected level access
		rex.run();//default level access
		/*
		 * rex. bark is not available as the bark() method is marked private
		 * and available only within the class.
		 * we can't directly access bark() or name, because both are private
		 * but we can access them via something called getters()
		 */
	//	rex.bark();
		/*
		 * this method is a getter, it gets the private atribute name (name of Dog)
		 * and it also calls teh private bark method. getName is a PUBLIC METHOD
		 * getters are usually public
		 */
		System.out.println("name of Dog is "+rex.getName());
		/*
		 * this is using a public method getBark() to access the private bark()
		 * method of the Dog class
		 */
		rex.getBark();
		
		Test myTest=new Test();
		/*
		 * testing a different class in a different package and how access levels
		 * affect it
		 */
		myTest.doTest();
		/*
		 * see Cat class for an explanation of Encapsulation
		 */
		Cat myCat=new Cat(23,"tibbles",2.34,6);
		/*
		 * this gets the private variable id
		 */
		System.out.println("id of cat is "+myCat.getId());
		/*
		 * this sets the private variable id, so this enables us to change the
		 * existing private id atributes outside of the Cat clas
		 */
		myCat.setId(123);
		//id is now changed to 123
		System.out.println("id of cat is "+myCat.getId());
		//calls the toString method of the Cat class
		System.out.println(myCat);
		

	}

}
