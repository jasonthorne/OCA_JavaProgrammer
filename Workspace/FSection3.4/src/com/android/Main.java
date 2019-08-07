package com.android;

public class Main {

	public static void main(String[] args) {
		Animal andy=new Animal();
		/*
		 * these are our four overloaded methods from the Animal 
		 * class. we dont' have access to the private void eat(boolean
		 * myBool) methtod, becasue this is a private method and only
		 * available within the Animal class
		 */
		andy.eat();
		andy.eat(3);
		andy.eat(3.45, "hello");
		andy.eat("hello", 2.34);
		
		Dog spot=new Dog();
		//gets this method from the Animal class
		spot.drink();
		/*
		 * this is a overloaded method in the Dog class that 
		 * takes an int
		 */
		spot.drink(4);
		/*
		 * this is the drink method in the Animal class that takes
		 * nothing
		 */
		spot.drink();
		/*
		 * println() is an overloaded method that can take any 
		 * primitive data type and any object
		 */
		System.out.println(andy);
		System.out.println("hello");
		System.out.println(23);
		System.out.println(true);
		
		Phone samsung=new Phone();
		double dnum=3;
		int num=4;
		/*
		 * the dial method can take a double or any smaller numeric 
		 * data type. these four are all the same method
		 */
		samsung.dial(dnum);
		samsung.dial(num);
		samsung.dial(2);
		samsung.dial(2.3);
		//method that takes double and int
		samsung.call(dnum, num);
		//method that takes int and double
		samsung.call(num, dnum);
		/*
		 * both of the below method calls will NOT compile, as
		 * java can't determine which of the call methods to use
		 * will it be the call(double,int) or call(int, double) as
		 * both of these methods can take two ints
		 */
		//samsung.call(2, 3);
		//samsung.call(num, num);
		
		samsung.call(2.3, 3);
		
		Tablet myTablet=new Tablet();
		
		Message myMessage=new Message();
		/*
		 * these are five overloaded read methods, that take
		 * five different objects that can read messages.
		 * so this would be considered a real world programming
		 * example where we are trying to do the same task across
		 * multiple platfroms (i.e) an app that is avaiable across
		 * all platfroms, for instance facebook available for mobiles,
		 * pc, tablets and certain games consoles, smart tvs
		 */
		myMessage.read(samsung);
		myMessage.read(myTablet);
		myMessage.read(new Pc());
		myMessage.read(new GameConsole());
		myMessage.read(new Appliance());
		/*
		 * we have two overloaded takeAnimal methods, one takes
		 * an Animal, one takes a Dog
		 * The one that takes an Animal, could accept a Animal, A
		 * Dog or a Collie
		 * The one that takes a Dog, could accept a Dog or a Collie
		 * this method call, will use the 
		 * takeAnimal(Dog myDog) overloaded method, as when you
		 * have two overloaded methods that could be used, the one
		 * that is the closet match to the object being sent to the
		 * method is the one that will be used.
		 * here A collie is closer to a Dog
		 * than a collie is to Animal
		 * A collie directly inherits from a Dog Class
		 * 
		 */
		takeAnimal(new Collie());
	}//end of main method
	
	static void takeAnimal(Animal myAnimal) {
		myAnimal.identifyMe();
		System.out.println("Animal calling me");
	}
	
	static void takeAnimal(Dog myDog) {
		myDog.identifyMe();
		myDog.bark();
		System.out.println("Dog calling me");
	}

}
