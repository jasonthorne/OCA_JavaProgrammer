package com.noel;

public class Supers {
	
	Animal returns(Animal myAnimal){
		return new Animal();
	}

}

class Subs extends Supers{
	@Override
	Cow returns(Animal myAnimal){
		return new Cow();
	}
	
}
