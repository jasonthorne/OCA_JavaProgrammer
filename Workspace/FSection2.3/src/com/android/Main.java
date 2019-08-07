package com.android;
/**
 * Exam objective 2.1 Declare and initialize variables (including of 
 * casting of primitive data types)
 * Exam object 2.2 Differentiate between Object reference and variables
 * and primitive variables
 * @author noelf
 *
 */
public class Main {
	public static void main(String[]args) {
		/*
		 * every time we create a dog, we are incrementing the static
		 * counter variable by one.
		 * this counter variable is assigned to be the dogId of each Dog.
		 * this counter keeps track of how many dogs are created, so this
		 * means that our first dog created will have a dogId of 1, our
		 * second dog created, will have a dogId of 2, etc etc
		 * after four dogs are created, counter for all dogs will be set
		 * to 5
		 */
		Dog spot=new Dog();//dogId is 1
		Dog rex=new Dog();//dogId is 2
		Dog lassie=new Dog();//dogId is 3
		
		System.out.println("id of spot "+spot.dogId);
		System.out.println("id of rex "+rex.dogId);
		//counter is the amount of dogs created plus one
		//three dogs created at this point, so counter is 4
		System.out.println("counter of spot is now "+spot.counter);
		System.out.println("counter of rex is now "+rex.counter);
		System.out.println("id of lassie is "+lassie.dogId);
		
		System.out.println(spot.counter);
		System.out.println(rex.counter);
		System.out.println(lassie.counter);
		
		Collie hunter=new Collie();
		System.out.println("hunter has a dogId of "+hunter.dogId);
		
		System.out.println(spot.counter);
		System.out.println(rex.counter);
		System.out.println(lassie.counter);
		/*
		char myChar=65;
		for(int i=0;i<20;i++) {
			System.out.println(myChar++);
		}*/
		/*
		 * you can have as many references as you want for an object,
		 * So in this case benji, ruby and spot all refer to the same
		 * dog with the dogId of 1
		 */
		Dog benji=spot;
		Dog ruby=spot;
		System.out.println("id are all the same, as this is the same");
		System.out.println(spot.dogId);
		System.out.println(benji.dogId);
		System.out.println(ruby.dogId);
		//super class reference to a sub class object
		Dog dogCollie=hunter;
		//System.out.println(dogCollie.collieCounter);
		//Behaviour reference to a object that belongs to a class that
		//implements that interface
		Behaviour behaveDog=hunter;
		/*
		 * all of these dog references now refer to new Dogs.
		 * the original dogs with id's of 1,2,3,4 can no longer be 
		 * referenced (got at)
		 * so they are liable for garbage collection, but you cannot
		 * explicitly call a garbage collector (garbage collection frees up
		 * memory)
		 */
		spot=new Dog();//id is 5
		rex=new Dog();//id is 6
		lassie=new Dog();//id is 7
		benji=new Dog();//id is 8
		ruby=new Dog();//id is 9
		System.out.println("id of spot is now "+spot.dogId);
		
		Zebra zed=new Zebra();//an id of 1
		Zebra zelda=new Zebra();//an id of 2
		Zebra zoe=zed;//zoe and zed are the same zebra
		
		int num=45;
		int num2=45;
		System.out.println("testing if two numbers are same "+(num==num2));
		System.out.println("testing for Equalivance");
		System.out.println(zoe==zed);//true as zoe and zed are the same zebra
		System.out.println(zed==zelda);//false because two different Zebras
		/*
		 * for checking equalivance of objects in java we should use
		 * the equals() method
		 */
		zed.age=3;
		zelda.age=3;
		zed.weight=2.3;
		zelda.weight=2.3;
		/*
		 * if we don't override the equals() method, all this does is
		 * check if zed and zelda are the same zebra, however we want to
		 * check if they have the same age and weight.
		 * So we override the equals method that checks if the two zebras
		 * have the same age and wight, if they are, then this will
		 * return true 
		 */
		System.out.println(zed.equals(zelda));
		/*
		 * cat with same age, name and weight will return true
		 */
		Cat cat1=new Cat(2,"tom",2.3);
		Cat cat2=new Cat(2,"tom",2.3);
		System.out.println("two cats with same age,name,weight");
		System.out.println(cat1.equals(cat2));
		
		Animal andy=new Animal();
		Cow bessie=new Cow();
		Fresian fred=new Fresian();
		Sheep flossie=new Sheep();
		Pig babe=new Pig();
		/*
		 * when a method can take a superclass object, that means it 
		 * can also take a sub class of the superclass
		 * the method takeAnimal can take a Animal object Or any sub
		 * class of Animal
		 */
		takeAnimal(andy);
		takeAnimal(bessie);
		takeAnimal(fred);
		takeAnimal(flossie);
		takeAnimal(babe);
		
		lassie.age=2;
		lassie.weight=4.5;
		int changeNum=200;
		System.out.println("before method call");
		System.out.println("age of lassie is "+lassie.age);
		System.out.println("weight of lassie is "+lassie.weight);
		System.out.println("id of lassie is "+lassie.dogId);
		System.out.println("ChangeNum is "+changeNum);
		/*a object reference does NOT store the object itself, all it 
		 * stores is the address of the object.
		 * when you pass an object into a method it is passed by 
		 * reference. this means that if you change the atributes of an
		 * object in the method, the atributes are also changed outside of
		 * the method.
		 * In this case we change the age and weight of the dog inside the
		 * method, the age and weight is changed outside of the method.
		 * if we pass an object into a method, we cannot change what that
		 * object refers too, if we pass in lassie to a method and inside 
		 * the method reassign lassie to a new Dog, outside of the method
		 * lassie still refers to the original dog
		 */
		changeValue(lassie,changeNum);
		System.out.println("after method call");
		System.out.println("age of lassie is "+lassie.age);
		System.out.println("weight of lassie is "+lassie.weight);
		System.out.println("id of lassie is "+lassie.dogId);
		System.out.println("ChangeNum is "+changeNum);
		
	}
	
	static void takeAnimal(Animal myAnimal) {
		System.out.println("the type of Animal is ");
		/*
		 * getClass will get you the FULL name of the class
		 * which would be
		 * com.android.Animal
		 * so we call another method on get class, getSimpleName, which
		 * will just get us the name of the class, Animal
		 */
		System.out.println(myAnimal.getClass().getSimpleName());
	}
	
	static void changeValue(Dog lassie,int num) {
		lassie.age=9000;
		System.out.println("inside method age of lassie is "+lassie.age);
		lassie.weight=100.23;
		System.out.println("inside method weight of lassie is "+lassie.weight);
		num=7800;
		System.out.println("inside method num is "+num);
		System.out.println("id of the dog is "+lassie.dogId);
		lassie=new Dog();
		System.out.println("lassie inside method id is "+lassie.dogId);
	}

}
