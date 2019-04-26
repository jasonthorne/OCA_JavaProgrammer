package com.animal.mammal;

public interface Behaviour {
	
	void mad();
	void sad();
	void happy();
}


interface Movement { //an interface is a class, so the rule that you can only have one Public class in the file still applies (this is default).
	
	void run();
	void walk();
	void swim();
}


//This is in the Behaviour.java file, it is NOT in the behavior INTERFACE.
class Mammal {
	
}