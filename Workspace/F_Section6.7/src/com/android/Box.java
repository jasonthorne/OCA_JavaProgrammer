package com.android;
/*
 * this generic variable type means that we can only create a Box the following
 * way 
 * Box<some object type>myBox=new Box<>();
 * i.e
 * Box<Cat>catBox=new Box<>();
 */
public class Box<T> {
	T myVar;
	int age;
	String name;
	
	Box(){
	//	System.out.println(myVar.getClass().getSimpleName());
	}
	
	void packBox(T var) {
		System.out.println("packBox called");
	}
	
/*	
	Box(T myVar){
		this.myVar=myVar;
	}
	*/
	

}
