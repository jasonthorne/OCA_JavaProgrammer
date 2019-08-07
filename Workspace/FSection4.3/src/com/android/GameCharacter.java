package com.android;

public class GameCharacter {
	
	void fight() {
		System.out.println("general fighting");
	}

}

class Wizard extends GameCharacter{
	void fight() {
		System.out.println("I am a wizard fighting");
		doMagic();
	}
	
	private void doMagic() {
		System.out.println("I love magic");
	}
}

class Dragon extends GameCharacter{
	
	void fight() {
		System.out.println("i am a dragon fighting");
		fire();
	}
	
	private void fire() {
		System.out.println("i breathe fire");
	}
}

class Soldier extends GameCharacter{
	
	void fight() {
		System.out.println("I am a soldier fighting");
		shoot();
	}
	private void shoot() {
		System.out.println("I shoot guns");
	}
}
