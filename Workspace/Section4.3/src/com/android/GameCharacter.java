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
	
	private void doMagic() {
		System.out.println("zap!");
	}
	
}

class Dragon extends GameCharacter{
	
	void fight() {
		System.out.println("I fight with fire");
		doFire();
	}
	
	void doFire() {
		System.out.println("flame on!");
	}
	
}