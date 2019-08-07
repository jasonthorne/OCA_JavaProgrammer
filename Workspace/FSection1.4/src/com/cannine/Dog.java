package com.cannine;

import com.building.Animal;

public class Dog extends Animal{
	/*
	 * everything that is protected or public in the Animal class
	 * can be accessed
	 */
	void getValue() {
		/*
		 * name is public, so this means that our Dog class, which
		 * inherits from the Animal has a name. or every dog will will
		 * a name
		 */
		System.out.println(name);//public
		/*
		 * has no access to weight as Dog is in a different package to
		 * Animal and weight is package level access. So regardless of
		 * whether Dog extends Animal or not, it still has not access
		 * to package level members
		 */
		//System.out.println(weight);
		/*
		 * height is a protected variable in the Animal class, which means
		 * any class that inherits from Animal, will have access to 
		 * height. or every dog will have a height
		 */
		System.out.println(height);//protected level access
		//run is a public method in the Animal class
		run();
		//sleep is protected method in the Animal class
		sleep();
		
		Dog spot=new Dog();
		spot.run();//public
		spot.sleep();//protected
		System.out.println("name of spot is "+spot.name);//public
		System.out.println("height of spot is "+spot.height);//protected
		
		Animal dAnimal=new Animal();
		System.out.println("name of dAnimal is "+dAnimal.name);
		/*
		 *  * height is a protected variable from the Animal class which
		 * means we can't access this variable in this way by using
		 * a member of the class (we create an animal try to access
		 * the height of the Animal)
		 * the rule is you can't access a protected members of it's base
		 * class (Animal) using a member object of its class.
		 * In this case we have an animal referenced object and you can't
		 * access dAnimal.height as height is a protected variable 
		 */
		//System.out.println(dAnimal.height);
	}

	

}
