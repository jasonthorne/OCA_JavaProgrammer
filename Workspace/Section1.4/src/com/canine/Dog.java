package com.canine;

import com.building.Animal;

public class Dog extends Animal{

	/*
	 * Everything that is protected or public in the Animal class can be accessed
	 */
	
	void getValue() {
		
		//This Dog class which inherits from the Animal class has a 'name' (which is public). 
		System.out.println(name);
		//System.out.println(weight); //has no access to weight, as Dog is in a different package to Animal. and weight is package level access.
		System.out.println(height); //it has access to this as it's protected
		
	}

}
