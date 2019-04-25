package com.gretb;
/*
 * As there is no such thing as an object that is JUST AN ANIMAL, An animal
 * is ALWAYS some subclass of Animal i.e A dog is an Animal, which is sub
 * class of Animal, a Cat is an Animal which is a sub class of Animal. 
 * we can't say any object, we ever can create, is JUST AN ANIMAL, as no
 * such object exists.
 * when you mark a class as Abstract, that means you CAN'T create a object
 * of that class. So here we CAN'T create just an Animal object. you can't
 * use the NEW keyword with an abstract class
 * new Animal();
 * An Abstract method can ONLY APPEAR IN AN ABSTACT CLASS
 * however you can have a abstract class with no abstract methods in it
 */
public abstract class Animal {
	
	double weight;//every Animal will have a weight
	int age;//every Animal will have a age
	/*
	 * even though you can't create a Animal object, the Animal class
	 * still has a constructor inside, which Dog needs to access to create
	 * a Dog object
	 */
	Animal(){
		System.out.println("Animal constructor called");
	}
	/*
	 * abstract methods
	 * abstract have NO BODY, no curly brackets 
	 * has to have the keyword "abstract" before the return type
	 * can ONLY EXIST in An Abstract class
	 * YOU HAVE TO OVERRIDE an abstract method
	 */
	abstract void eat();//abstract method has no body
	//abstract method that returns an int and takes a double
	abstract int drink(double amt);
	/*
	 * any class inheriting from Animal can choose whether to override the
	 * sleep() method or not. this is NOT an abstract method
	 */
	void sleep() {
		System.out.println("Animal sleeping");
	}
	/*
	Animal(){
		System.out.println("Animal created");
	}
	*/

}

class Dog extends Animal{
	/*
	 * sniffRating is only available to objects that have a Dog reference or
	 * to classes that extends the Dog class. If you have an Animal reference
	 * to a Dog Object then this object will not have access to this Variable
	 */
	int sniffRating;
	
	Dog(){
		System.out.println("Dog constructor called");
	}
	/*
	 * this overrides the eat() method in the Animal abstract class
	 * Dog extends Animal, so it HAS TO OVERRIDE this method.(non-Javadoc)
	 * @see com.gretb.Animal#eat()
	 */
	void eat() {
		System.out.println("Dog eating");
	}

	@Override
	int drink(double amt) {
		System.out.println("Dog Drink method");
		return 0;
	}
	/*
	 * this method will be avaiable only to Dog references or sub classes
	 * of Dog. This method is unique to the Dog class so the only way to
	 * access this is throughh an object that has a Dog reference or 
	 * an object that has a sub class reference .ie Collie
	 */
	void pant() {
		System.out.println("Dog panting");
	}
	
}

class Cat extends Animal{
	/*
	 * evilRating is only availabe to objects that have a CAt reference or
	 * classes that extend this class will also have access to evilRating
	 */
	int evilRating;

	/*
	 * eat() an abstract method in the Animal class, so we HAVE TO
	 * override this in the Cat class(non-Javadoc)
	 * @see com.gretb.Animal#eat()
	 */
	@Override
	void eat() {
		System.out.println("cat Eating");
		
	}
/*
 * int drink(double) is an abstract method in the Animal class, so 
 * we have to override this in the Cat class(non-Javadoc)
 * @see com.gretb.Animal#drink(double)
 */
	@Override
	int drink(double amt) {
		System.out.println("Cat drink method");
		return 0;
	}
/*
 * Sleep() in the Animal class is a concrete method, so we can choose to 
 * override this or not. here we choose to override this method.	(non-Javadoc)
 * @see com.gretb.Animal#sleep()
 */
	void sleep() {
		System.out.println("cat Sleeping");
	}
	/*
	 * this method is unique to the Cat class, so this method is only availabe
	 * to objects that have a Cat reference or classes that extends the Cat class
	 */
	void purr() {
		System.out.println("Cat purring");
	}
	
}
