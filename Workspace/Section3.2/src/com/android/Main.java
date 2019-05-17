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
		
		//=================================================
		
		//created 4 animals for our zoo:
		Monkey monty = new Monkey();
		Elephant nellie = new Elephant();
		Lion leo = new Lion();
		Zebra zed = new Zebra();
		
		System.out.println("id of monty is: " + monty.id);
		
		//create a zoo object that takes our previously created animals:
		Zoo myZoo = new Zoo(monty, leo, nellie, zed);
		
		//id of the monkey in the zoo is:
		System.out.println("id of the monkey in the zoo is: " + myZoo.monty.id); 
		
		//Monkey object now has TWO REFERENCES (monty.id & myZoo.monty.id) +++++++++++++++++++++++++++++++++++++++++
		
		//create new objects for all references
		monty = new Monkey();
		nellie = new Elephant();
		leo = new Lion();
		zed = new Zebra();
		
		System.out.println("\nid of monty is now: " + monty.id);
		System.out.println("id of monty IN ZOO is still: " +  myZoo.monty.id);
		
		//create a NEW zoo, adding the new animal objects
		myZoo = new Zoo(monty, leo, nellie, zed);
		System.out.println("\nid of monty is now: " + monty.id);
		System.out.println("id of monty in zoo is NOW: " +  myZoo.monty.id);
		
		
	}

}
