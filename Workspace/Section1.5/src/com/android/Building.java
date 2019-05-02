package com.android;

public class Building implements InterfaceTwo {

	//this is from Interface 1:
	@Override
	public void method1() {
		
	}

	//this is from Interface 1:
	@Override
	public void method2() {
	
	}

	//this is from Interface 2:
	@Override
	public void method3() {
	
	}

	//this is from Interface 2:
	@Override
	public void method4() {
	
	}
	
	//European is in the Person class
	void buildIt(European ed) { //Takes a European object OR any object that extends a European
		//System.out.println("Name of European");
		ed.talk();
	}
	
	

}

class Bungalow extends Building{
	
	void buildIt(Irish pat) {
		
	}
}
