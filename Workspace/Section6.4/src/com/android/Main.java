package com.android;

public class Main {
	
	/**
	 * 
	 * Determine when casting is necessary.
	 * Casting is changing the reference of a compatible object.
	 */

	public static void main(String[] args) {
		
		
		//PRIMITIVE CASTING: 
		
		byte bnum = 3;
		
		int num=bnum;
		
		//You can cast here, but DONT HAVE TO, because a byte csan fit inside an int.
		num=(int)bnum;
		
		int number = 689999;
		byte newB = (byte)number;
		
		System.out.println(newB);
		
		double dnum = 0.999999;
		number = (int)dnum;
		
		System.out.println(number);
		
		char myChar = (char)number;
		
		//cant cast a boolean to be anythin else.
		boolean myBool = true;
		
		//---------------------------------------------
		
		/*
		 * You cant cast incompatible data types. 
		 * There has to be some form of inheritence or implementation relationship.
		 * Dogs and Cats have no relationship so cant be cast to eachother.
		 */
		
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++
		
		//EXCEPTIONS:
		
		/*
		try {
			
		}
		catch() {
			
		}
		finally {
			
		}
		*/
		
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++
		
		//INSTANCE OF 
		
		Dog spot = new Dog();
		Animal angela = new Animal();
		Pig pippa = new Pig();
		
		/*
		 * We have a program where multiple different types of animals are prodced.
		 * We know spot and angela and pippa are animals.
		 * As an example we will say with this program that we dont know what type of Animals spot and pippa are.
		 * 
		 * instanceOf returns a boolean
		 * true if it is a particular object
		 * false if it is not a particular object
		 */
		
		System.out.println(spot instanceof Dog);
		System.out.println(pippa instanceof Pig);
		System.out.println(pippa instanceof Animal);
		
		
		//false, as instanceOf only checks the OBJECT not the reference:
		System.out.println(angela instanceof Pig); 
		
		//true, as instanceOf only checks the OBJECT not the reference:
		Animal animalPig = new Pig();
		System.out.println(animalPig instanceof Pig); 
		
		/*If we have an Animal reference to an Animal object and we go:
		 * angela instanceof Pig
		 * 
		 *  however if we change angela to angela = new Pig()
		 *  then angela instanceof Pig will return true.
		 *  it only checks the OBJECT not the reference.
		 *  
		 *  System.out.println(spot instanceof Animal); 
		 * 
		 */
		
		
		//-------------------------------------------
		
		//GETCLASS
		
		/*
		 * Returns a string which is the fully quaified name of the class, which inthis case is com.android.Dog
		 */
		
		System.out.println("spot's class is " + spot.getClass());
		System.out.println("spot's class is " + spot.getClass().getSimpleName()); //just gets the class name
		
		
		
		Animal[]farm = {new Cow(), new Sheep(), new Pig(), new Chicken(), new Fresian(), new Sheep(), new Animal()};
		
		int sheepCounter = 0;
		int cowCounter = 0;
		
		for(Animal a:farm) {
			
			boolean sheepCheck = a instanceof Sheep; //holds if a is a reference to a Sheep object
			boolean cowCheck = a instanceof Cow;
			
			if (sheepCheck) {
				sheepCounter++;
			}
			if (cowCheck) {
				cowCounter++;
			}
		}
		
		System.out.println("\nyou have " + sheepCounter + " sheep.");
		System.out.println("you have " + cowCounter + " cows.");
		
		//---------------------------
		
		Animal andy = new Animal();
		Cow daisy = new Cow();
		
		
		//TRYING TO CHANGE THE REFERENCE NOT THE OBJECT +++++++++++++++++++++++++++++++++++++++++++++++++
		/*
		 * Below wont compile a andy is an Animal object, which is a superclass object,
		 * and casting to a Cow only changes the reference, 
		 * so then you would have a subclass Cow reference to a superclass object, 
		 * which you cant have and you get a class cast exception. 
		 */
		//andy=(Cow)andy;
		
		//andy is an animal reference to an animal object
		
		/*
		 * This does NOT change daisy to an Animal object, this only means that the below object is an Animal reference to a Cow obj.
		 * casting only changes the reference. 
		 */
		andy = (Animal)daisy;
		
		
		
	}

}
