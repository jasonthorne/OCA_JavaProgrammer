package com.android;

public class GameCharacter {

	
	void fight() {
		System.out.println("general fighting");
	}
}

class Wizard extends GameCharacter{
	
	void fight() {
		System.out.println("I fight with magic");
		doMagic();
	}
	
	//private prevents access from other classes
	private void doMagic() {
		System.out.println("zap!");
	}
	
}

class Dragon extends GameCharacter{
	
	void fight() {
		System.out.println("I fight with fire");
		makeFire();
	}
	
	private void makeFire() {
		System.out.println("flame on!");
	}
	
}

class Soldier extends GameCharacter{
	
	void fight() {
		System.out.println("Soldier fighting");
		shoot();
	}
	
	private void shoot() {
		System.out.println("shooting gun");
	}
}












