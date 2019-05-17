package com.android;

public class Main {

	public static void main(String[] args) {
		
		//declare a var reference of type Person (ie not an instantiated object)
		Person paul; 
		
		//an obj is only created when the 'new' keyword is used. This is person x
		Person pauline = new Person(); //person x
		
		//assigning the paul reference to the pauline object. Now pauline and paul refer to the same person x.
		paul=pauline;
		
		Person patsy = paul; //patsy, paul and pauline are all now referencing the same object.
		
		pauline = new Person(); //person y. pauline reference now points to a new object. Paul and patsy are now the ONLY 2 references pointing to person x.
		
		patsy = new Person(); //person z. 3 people created at this point. 
		
		paul = new Person(); //person n. Now that paul is dereferenced, noone is pointing to person x. So it's ready for garbage collection.
		//4 people have been created, but only 3 can now be referenced.
		
		
		pauline=paul; //pauline now refers to person n
		paul=null; //paul now refers to nothing. (Remember Person n can still be reached through pauline).
		
		

	}

}
