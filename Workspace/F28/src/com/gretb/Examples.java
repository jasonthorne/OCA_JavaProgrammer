package com.gretb;

public class Examples {
	
	static void ex1() {
		/*
		 * Garbage Collection
		 * Garbage is when memory that was taken up by a particular variables
		 * is free and can be written too. In other word if something is 
		 * deleted, it frees up the memory, the process in Java is called
		 * Garbage Collection
		 */
		
		Dog spot = new Dog(3,"spot");
		Dog rex=new Dog(12,"rex");
		Dog lassie=new Dog(2,"lassie");
		//this will print out they're address
		System.out.println("spot lives in "+spot);
		System.out.println("rex lives in "+rex);
		System.out.println("lassie lives in  "+lassie);
		/*
		 * we can no longer access the Dog rex orignally referred too, as
		 * rex and spot refer now refer to the same dog, lassie refers to
		 * another Dog.
		 * The Dog that rex originally referred is LIABLE FOR GARBAGE
		 * COLLECTION, which means the automatic garbage collector, that
		 * java runs itself, may run and free up this memory.
		 * we can't explictly call the garbage collector. you can't explicity
		 * free up memory in java by running the garbage collector
		 */
		rex=spot;
		/*
		 * these two references have the same address, which means they are
		 * the same Dog
		 */
		System.out.println(rex);
		System.out.println(spot);
		/*
		 * benji refers to a  new Dog
		 */
		Dog benji=new Dog(3,"Benji");
		/*
		 * by doing this we are DEFERENCING BY REASSIGNMENT.
		 * We can no longer refer to the Dog benji originally was, so to
		 * all intents and purposes this dog is gone. Once you can't refer
		 * to something, the variable is liable for garbage collection and
		 * can't be used again
		 */
		benji=lassie;
		
	}//end of ex1() method
	
	static void ex2() {
		//local variables for creating cat
		int age=4;
		String name="tom";
		double weight=4.5;
		boolean sex=true;
		/*
		 * two different dogs with the same name and the same age.
		 * they're twins
		 */
		Dog spot=new Dog(age,name);
		Dog lassie=new Dog(age,name);
		/*
		 * to Dog class is taking the equals() method from the object class
		 * and that method will return true if they are the same object
		 * and false if they are not
		 */
		System.out.println("Are dogs the same dog "+(spot==lassie));
		/*
		 * the equals method in the Object class is the same as ==
		 */
		System.out.println("are dog equal "+(spot.equals(lassie)));
		
		Cat tibbles=new Cat(age,name,weight,sex);
		Cat tom=new Cat(age,name,weight,sex);
		
		Cat tabby=new Cat(5,"tabby",45.6,false);
		/*
		 * these are two different cats, with the same age, name, weight and
		 * sex. We have overriden the equals method in the Cat class to
		 * check the variables of each cat
		 */
		System.out.println("using equals in Cat class "+tibbles.equals(tom));
		System.out.println("using == with two cats "+(tibbles==tom));
		System.out.println(tibbles.equals(tabby));
		tom=tabby;
		System.out.println(tom.equals(tabby));
		//you can send any object you want to this method
		System.out.println(tom.equals(spot));
		//System.out.println("are both cats the same "+(tibbles.equals(tom)));
		
	}

}
