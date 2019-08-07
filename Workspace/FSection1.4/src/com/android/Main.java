package com.android;

import com.building.Animal;

/**
 * Exam Object 6.4 Apply access Modifiers
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * See Animal class first
		 * then Access class
		 * then main class
		 * then Dog class
		 * then Cat class
		 */
		/*
		 * this object is an Animal, which is a class in a different
		 * package, Animal is in com.building
		 * this means we only have access to the public members of
		 * this class(methods, variables, constructors)
		 * there is NO INHERITANCE relationship between the Main class
		 * and the Animal class
		 */
		/*
		 * there is a constructor in the Animal class that takes no
		 * variables and is PUBLIC
		 */
		Animal andy=new Animal();
		/*
		 * this is calling the public constructor in the Animal class
		 * that takes an int
		 */
		Animal angela=new Animal(3);
		/*
		 * this is attempting to call the package level constructor in
		 * the Animal class that takes a double, however we are in a 
		 * different package, so we have no access to this
		 */
	//	Animal agatha=new Animal(3.4);
		System.out.println("name is "+andy.name);//public variable
		/*
		 * run is the only public method in the Animal class
		 */
		andy.run();
		//drink is private, has not acces
		//andy.drink();
		//eat is package leve access, so no access
		//andy.eat()';
		//sleep is protected level access, so no access
		//andy.sleep()
		/*
		 * we have no access to the Zebra class. Main is in the com.android
		 * package and the Zebra class is in the com.building package
		 * The Zebra class is a class with package leve access, so we cannot
		 * access this class outside of it's own package, so we can't create
		 * a Zebra object here
		 */
		//Zebra zelda=new Zebra();
		/*
		 * again this is package level access class so we cannot access
		 * the Siamese class
		 */
	//	Siamese sam=new Siamese();
		//cannot access static variables of a class you cannot access
	//	System.out.println(Siamese.siamStat);
	}

}
