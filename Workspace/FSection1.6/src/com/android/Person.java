package com.android;

public class Person {
	
	/*
	 * when overriding a method the name and the parameter list have to
	 * be EXACTLY the same in the overriding method. The return type
	 * has to be the same class OR a sub class. So in this case
	 * if we want to override the buildIt() method the overriding
	 * method could be
	 * Building buildIt(Person builder)
	 * or
	 * Factory buildIt(Person builder)
	 * The return type here is a Factory, which is a sub class of Building
	 * So a method can return the same class or a sub class
	 */
	Building buildIt(Person builder) {
	System.out.println("person building a Building");
	return new Building();
	}

}

class European extends Person{
	/*
	 * this overrides the BuildIt() method and the name and the parameter
	 * list are exactly the same
	 * the return type is a sub class of Buiding, which is Factory
	 */
	@Override
	Factory buildIt(Person builder) {
		System.out.println("European building a factory");
		//returning a sub class of Building which is okay
		return new Factory();
	}
}
/*
 * if our method is returning a Building, that means we can still return
 * a Bungalow, as a Bungalow IS A BUILDING, bungalow is a sub class of
 * Buidling
 */
class Irish extends Person{
	@Override
	Building buildIt(Person builder) {
		System.out.println("Irish building a Bungalow");
		return new Bungalow();
	}
}
