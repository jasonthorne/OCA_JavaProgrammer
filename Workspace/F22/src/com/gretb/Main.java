package com.gretb;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hello";
		//all of the method from andy take they're implementation from the
		//animal class
		Animal andy=new Animal();
		andy.move();
		andy.eat();
		andy.reproduce();
		andy.breathe("harry", 14);
		Cow bessie=new Cow();
		//all these methods are taken from the Animal, implementation as well
		bessie.move();//takes implementation for move() from Animal
		bessie.reproduce();//takes implementation for reproduce() from Animal
		bessie.breathe("harry", 12);//takes implementation from Animal
		/*
		 * this is overriden, as the void eat() method exists in the Animal class
		 * and we are overriding the eat() method in the Cow class. so this
		 * method takes it's implementation from the Cow class
		 */
		bessie.eat();
		//this is a overloaded drink method, one which takes no
		//variables and the other that takes an int
		bessie.drink();
		bessie.drink(4);
		System.out.println("age of bessie is "+bessie.age);
		
		Zebra zoe=new Zebra();
		/*
		 * all of these methods are taken from the Animal class, as none of
		 * them are overriden in the Zebra
		 */
		zoe.eat();//animal class eat method
		zoe.move();//animal move method
		zoe.reproduce();//animal class reproduce method
		zoe.breathe("patsy", 4);//Animal class breathe method
		/*
		 * only a shark has access to a attack() method, because only a shark
		 * has a attack method int it. it's not overriden from the base Animal
		 * class
		 */
		Shark bruce=new Shark();
		//this is a method unique to only sharks
		bruce.attack();
		//this is a overriden eat method, the shark class has it's own eat method
		bruce.eat();
		
		Fly freddie=new Fly();
		freddie.eat();
		/*
		 * a fly
		 * a shark 
		 * and a cow all eat in different ways
		 */
		Pig pippa=new Pig();
		Fresian francis=new Fresian();
		/*
		 * pippa the pig
		 * francis the fresian
		 * freddie the fly
		 * bruce the shark
		 * zoe the zebra
		 * bessie the cow
		 * only methods first created and defined in the Animal class can be
		 * used by the objects in this array
		 */
		Animal[]zoo= {pippa,francis,freddie,bruce,zoe,bessie,andy};
		
		zoo[0].eat();
		zoo[1].eat();
		/*
		 * even though francis is a Cow (it's a fresian) it does not have access
		 * to the drink method in this array. As this is an array of Animals
		 * and each of these objects in this array only has access to methods
		 * FIRST created and defined in the Animal class
		 */
	//	zoo[1].drink();
		System.out.println("call each eat method for each Animal in the zoo");
		for(int i=0;i<zoo.length;i++) {
			zoo[i].eat();
			//neither of the below
			//only cows can drink
		//	zoo[i].drink();
			//only sharks can attack
		//	zoo[i].attack()
		}
	//	Fly freddie=new Fly();
		/*
		 * An animal reference to a shark object
		 * you can have a super class reference to a sub class object
		 * when you have a super class reference to a sub class object you can
		 * only call methods that were first defined in the super class.
		 * so this object has only a eat() move() reproduce() and breathe()
		 * method. So when it determines it has these four methods, it will then
		 * check it's own class to see if it has a implementation for any of these
		 * methods
		 */
		Animal anShark=new Shark();
		/*
		 * eat() method first defined in Animal class
		 * the shark class has it's own eat method
		 * call eat() method from shark class
		 */
		anShark.eat();
		//only shark references, or a sub class of shark can attack()
	//	anShark.attack();
		/*
		 * An animal reference to a Cow object
		 * super class reference to a sub class object
		 * checks Animal for eat() method
		 * checks own class for it's own eat() method
		 * calls eat method in cow class
		 * 
		 */
		Animal anCow=new Cow();
		anCow.eat();
		/*
		 * there is a drink() method in the Cow class. however what determines if
		 * a method can be called is the REFERENCE (data type on the left hand side)
		 * not the object. however theres is NO DRINK method in the Animal class
		 * so only objects with a cow reference can call the Drink() method.
		 * so this will not compile
		 */
		//anCow.drink();
		/*
		 * Francis is a fresian, which is a cow, and only cows have the drink
		 * method
		 */
		francis.drink();
		/*
		 * you can't have a sub class reference to a super class object
		 * or in other words An animal is not just a cow, 
		 * A COW IS AN ANIMAL
		 * however
		 * A ANIMAL IS NOT ONLY A COW
		 */
		//Cow cAnimal=new Animal();//will not compile
		
	//	Fresian cFres=new Cow();//will not comple
	
		
		
	

	}

}
