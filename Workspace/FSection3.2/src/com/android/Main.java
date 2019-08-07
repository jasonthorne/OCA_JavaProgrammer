package com.android;
/**
 * Exam objective 2.4 Explain an objects lifecycle (creation,
 * derefencie by reassignment and garbage collection)
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * declares a variable reference of type person. this
		 * DOES NOT CREATE A PERSON
		 */
		Person paul;//only a reference
		/*
		 * an object is only created when the NEW keyword is used
		 * this is Person x
		 */
		Person pauline=new Person();//Person x
		/*
		 * this is assigning pauline to paul, so person x is known
		 * as paul and pauline
		 * so paul and pauline refer to the same person, person x
		 */
		paul=pauline;
		/*
		 * patsy and paul are the same person, which means pauline
		 * paul and patsy are the same, which is person x
		 */
		Person patsy=paul;
		
		/*
		 * after this person is created, only paul and patsy refer
		 * to person X
		 */
		pauline=new Person();//person Y
		/*
		 * after this person is created, only paul now refers to 
		 * Person X
		 */
		patsy=new Person();//Person Z,3 people created at this point
		/*
		 * after this person is created, person X HAS no reference,
		 * so we we can't refer to this object. Person X is 
		 * not accessible, so this object is Liable for garbage 
		 * collection
		 */
		paul=new Person();//Person M
		/*
		 * after this we have four people created, but we can only
		 * reference 3 of them
		 */
	/*
	 * pauline refers to person y, now pauline refers to the Person
	 * M that means that person Y is inaccessible, so the person Y
	 * object is liable for garbage collection
	 */
		pauline=paul;
		/*
		 * Person M is still accessible through pauline
		 * so after this we have four objects created and only 
		 * two of them are accessible, so two person objects are
		 * liable for garbage collection
		 */
		paul=null;
		
		/*
		 * the four animals to create our zoo
		 */
		Monkey monty=new Monkey();
		Elephant nellie=new Elephant();
		Lion leo=new Lion();
		Zebra zed=new Zebra();
		
		System.out.println("id of monty is "+monty.id);
		/*
		 * create a zoo object that takes our four previously 
		 * created animals
		 */
		Zoo myZoo=new Zoo(monty,leo,nellie,zed);
		/*
		 * you now have two references to the one monkey, or two
		 * ways to get at the same monkey. we can get at it through 
		 * the name "monty" or myZoo.magilla, we can see they both
		 * have the same id as they are the same monkey
		 */
		System.out.println("id of the monkey in the zoo is "
				+ ""+myZoo.magilla.id);
		/*
		 * monty now refers to a new monkey and a different monkey
		 * to the monkey in the zoo
		 */
		monty = new Monkey();
		nellie=new Elephant();
		leo = new Lion();
		zed = new Zebra();
		System.out.println(monty.equals(myZoo.magilla));
		/*
		 * we now have two seperate monkeys with two seperate
		 * references
		 */
		System.out.println("id of monty is now "+monty.id);
		System.out.println("id of monkey in zoo "+myZoo.magilla.id);
		/*
		 * we are creating a new zoo with a new monty, which means
		 * the orginal monkey, with the id of 1 can no longer be
		 * referenced as is liable for garbabe collection
		 */
		myZoo=new Zoo(monty,leo,nellie,zed);
		System.out.println(monty.equals(myZoo.magilla));
		System.out.println("id of monty is now "+monty.id);
		System.out.println("id of monkey in zoo "+myZoo.magilla.id);
		
		
	}

}
