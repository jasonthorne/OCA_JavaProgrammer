package com.android;
/**
 * Exam objective 7.3 Determine when casting is necessary
 * Casting is changing the reference of a compatible object
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bnum=3;
		/*
		 * you can cast  here, but you DON'T HAVE TOO, as a byte can
		 * fit inside an int
		 */
		int num=bnum;
		num=(int)bnum;
		/*
		 * you can cast any type of  number to be any other type of
		 * number, but be careful as you could lose information
		 */
		int number=6_999_999;//
		byte newB=(byte)number;
		//you can do this, but don't know what this number is
		System.out.println(newB);//this becomes -65
		double dnum=0.999999;
		number=(int)dnum;
		System.out.println(number);//this becomes 0
		//this will be the space character
		char myChar=(char)number;
		System.out.println("does this print out anything"+myChar+"space");
		//can't cast a boolean to be anything else or vice vearsa
		boolean myBool=true;
	//	number=(int)myBool;
	//	myBool=(boolean)number;
		/*
		 * you can't cast incompatible data types, there has to be some form
		 * of inheritance relationshiop or implementation relationship
		 * Dog and Cats have no relationship, so can't be casted to 
		 * each other
		 */
		Cat tibbles=new Cat();
		//this WILL NOT COMPILE
		//Dog spot=(Dog)tibbles;
		//these two methods are the EXACT SAME
		//they both are Behaviour interface reference to a Cat object
		Behaviour behaveCat=(Behaviour)tibbles;
		Behaviour behaveCat2=tibbles;
		//both give the same outpot
		behaveCat.angry();
		behaveCat.sad();
		behaveCat2.angry();
		behaveCat2.sad();
		
		Cow bessie=new Cow();
		bessie.eat();//eat method in Animall class overriden in cow class
		bessie.run();//run method in Animal class not overriden
		bessie.drink();//drink method in Cow class and subclasses only
		
		
		Animal anCow=new Cow();
		/*
		 * has no access to drink() method as only Cow references have
		 * access to the drink()
		 */
		//anCow.drink();
		/*
		 * this will not compile as anCow is a ANIMAL reference to a 
		 * Cow object, it sees anCow as a super class reference
		 * you can't assign a super class reference to a sub class
		 * refrenced object
		 * or  you can't assign an Animal to a Cow
		 */
		//Cow myCow=anCow;
		Cow myCow=(Cow)anCow;
		/*
		 * this object is a Cow reference to a Cow object so this object now
		 * has access to all the methods and variables of the Cow class
		 */
		myCow.drink();
		
		Animal fCow=new Fresian();
		/*
		 * this does not compile as fCow is a super references object to
		 * a sub class reference. Fresian is a sub class of Animal
		 */
	//	Fresian myFresian=fCow;
		Fresian myFresian=(Fresian)fCow;
		
		Animal anCow2=new Cow();
		/******
		 * Explain tomorrow
		 */
	//	Fresian newFresian=(Fresian)anCow2;
	//	Cow myCow=(Cow)anCow;
		
		Animal andy=new Animal();
		//in this case Andy the Animal takes it age from the Animal
		//age of Animal is 2
		System.out.println("age of Animal is "+andy.age);
		//in this case bessie the Cow takes its age from the Cow class
		//age of cow is 200
		System.out.println("age of cow is "+bessie.age);
		
		Animal cowAnimal=new Cow();
		/*
		 * this object takes it's implmentation of the overriden methods
		 * from the subclass (cow class)
		 */
		cowAnimal.eat();//this takes it's implementation from Cow class
		cowAnimal.run();
		//cowAnimal.drink();//no access
		/*
		 * if two variables in two seperate but related classes have the
		 * same name (ie age in Animal, age in Cow) it will take the value
		 * of the age in the Super class (Animal class). Methods are
		 * OVERRIDEN variables are HIDDEN
		 * will print out the age of the Animal which is 2
		 */
		System.out.println("age of cowAnimal is "+cowAnimal.age);
		/*
		 * you can access the age of the Cow, which is 200, through this
		 * object
		 * this is casting the cowAnimal reference to be a Cow, and then
		 * we surround this with brackets which means its a cow reference
		 * to a cow object calling the age, which is 200
		 */
		System.out.println("age of Cow is "+
		 ((Cow)cowAnimal).age);
		Cow myCow3=(Cow)cowAnimal;
		System.out.println(myCow3.age);
		//Cow newCow=(Cow)new Animal();
		//Animal newCow=new Cow();
		try {
			Cow newCow=(Cow)new Animal();
			System.out.println("print me in try blocks");
		}
		catch(Exception e) {
			System.out.println("exception is "+e);
		}
		System.out.println("code after block");
		
		Dog spot=new Dog();
		Animal angela=new Animal();
		Pig pippa=new Pig();
		
		System.out.println("InstanceOf");
		/*
		 * we have a program where multiple different types
		 * of Animals are being produced
		 *As an example we will say with this program we do
		 *not know what type of Animals spot and pippa are
		 *instanceOf returns a boolean
		 *true if it is a particular object
		 *false if it is not a particular object
		 * 
		 */
		System.out.println(spot instanceof Dog);
		System.out.println("testing pippa");
		System.out.println(pippa instanceof Pig);
		System.out.println("testing if pippa an Animal");
		System.out.println(pippa instanceof Animal);
		/*
		 * comment out to see angela instanceof Pig return false
		 */
	//	angela=new Pig();
		//this will return false
		System.out.println("Animal reference to Pig objects");
		System.out.println(angela instanceof Pig);
		/*
		 * instanceof only works with classes that have some
		 * kind of relationship. The Dog class and the Animal
		 * class have no relationship, whereas Pig extends 
		 * Animal, which is why we can use instanceOf
		 * with Animals and Pigs
		 * if we have a Animal reference Angela to a Animal object
		 * and we go 
		 * angela instanceof Pig
		 * this will return false
		 * however if we change angela to
		 * angela=new Pig()
		 * then 
		 * angela instanceof Pig
		 * will return true, it only checks the OBJECT not the reference
		 * no relationship between Dog and Animal will not compile
		 * 
		 */
		//System.out.println(spot instanceof Animal);
		/*
		 * this also does not work as a cow is not a pig or a pig
		 * is not cow
		 */
		//System.out.println(new Cow()instanceof Pig);
		
		Fresian freddie=new Fresian();
		//this will return true
		System.out.println(freddie instanceof Animal);
		System.out.println("name of class");
		/*
		 * getClass() returns a string which is the full qualified name
		 * of the class, which in this case is com.android.Dog
		 */
		System.out.println("spots class is "+spot.getClass());
		System.out.println(freddie.getClass());
		System.out.println(freddie.getClass().getSimpleName());
		String name=freddie.getClass().getSimpleName();
		if(name.equals("Fresian")) {
			System.out.println("this is a Fresian");
		}
		
		Animal[]farm= {new Cow(),new Sheep(),new Pig(),new Chicken(),
				new Fresian(),new Sheep(),new Animal()};
		int sheepCounter=0;
		int cowCounter=0;
		for(Animal a:farm){
			
			boolean sheepCheck=a instanceof Sheep;
			boolean cowCheck=a instanceof Cow;
			
			if(sheepCheck) {
				sheepCounter++;
			}
			if(cowCheck) {
				cowCounter++;
			}
			
		}
		System.out.println("you have "+sheepCounter+" sheep on your farm");
		System.out.println("you have "+cowCounter+" cattle on your farm");
		
		andy=new Animal();
		Cow daisy=new Cow();
		andy.eat();
		/*
		 * this will not compile as andy is Animal object, which is a
		 * super class object and casting to Cow only changes the 
		 * reference, so then you would have a sub class Cow reference
		 * to a super class object, which  you can't have and you get
		 * a class cast exception
		 */
	//	andy=(Cow)andy;
		/*
		 * this does NOT CHANGE daisy to a Animal object, this only means
		 * that the below object is a Animal reference to a Cow Object
		 * casting only changes the refrence
		 */
		andy=(Animal)daisy;
		//is the exact same as 
		andy=daisy;
		
		spot.angry();
		tibbles=new Cat();
		tibbles.sad();
		/*
		 * this is asking is the object spot implementing the 
		 * Behaviour interface, this will return true as the Dog 
		 * class implements the Behaviour interface
		 */
		System.out.println(spot instanceof Behaviour);
		daisy=new Cow();
		/*
		 * we can check any object to see if it implements any 
		 * interface
		 */
		System.out.println(daisy instanceof Behaviour);//false
		/*
		 * you can't create an interface object
		 * you can create an interface reference to a Object that 
		 * implements the interface
		 */
		Behaviour behaveDog=spot;
		behaveCat=tibbles;
		/*
		 * these two objects only have acccss to the methods from the
		 * Dog and Cat class that they implement from the Behaviour 
		 * interface, whihc is angry() and sad()
		 */
		behaveDog.angry();
		behaveDog.sad();
		//behaveDog.pant()
		behaveCat.angry();
		behaveCat.sad();
		/*
		 * behaveDog is a Dog OBJECT SO WE can cast it to be a 
		 * Dog reference, so rex ends up being a Dog reference to a 
		 * Dog object, which a casted version of behaveDog
		 */
		Dog rex=(Dog)behaveDog;
		
		behaveDog=spot;
		/*
		 * this is still a behaviour reference to a Dog object but 
		 * this is a new Dog object, it's not spot
		 */
		behaveDog=new Dog();
		//can't access age, only has access ato angry() and sad()
		//System.out.println(behaveDog.age);
		rex=(Dog)behaveDog;
		System.out.println(rex.age);
		
		System.out.println("using casting to access age of Dog "+
				((Dog)behaveDog).age);
		
		((Dog)behaveDog).pants();
		/*
		 * anything that implements the Behaviour interface can
		 * go in this array, which in our case is Cats and Dogs
		 */
		Behaviour[]behaveArray= {
				spot,tibbles,new Dog(),new Cat()
		};
		
		
	}

}
