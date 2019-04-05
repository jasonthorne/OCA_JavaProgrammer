package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		Cat tibbles = new Cat(2, 3.5, "Tibbles");
		tibbles.eat();
		
		Dog spot = new Dog(4, 5.6, "Spot");
		
		//different method calls
		spot.eat();
		spot.eat(3.4);
		spot.eat(3.5, 3);
		spot.eat(3, 3.5);

	}

}
