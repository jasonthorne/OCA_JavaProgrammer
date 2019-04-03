package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * creating a dog, which is an object of type 'Dog'
		 * The 'new' keyword creates an object of type 'Dog'. 
		 * 'Dog' refers to the reference type (int, num)
		 * 'spot' refers to the name of this object, which refers to the reference name which the program will use to refer to this object
		 * 'new' creates a new object
		 * 'Dog()' refers to the type of new Object created
		 * 
		 */
		
		Dog spot = new Dog();
		
		spot.age=45;
		spot.name="Spot";
		spot.weight=78.9;
		spot.height=2.3;
		spot.isMale = true;
		
		Dog dog2 = new Dog();
		dog2.age=4;
		dog2.name="Rex";
		dog2.weight=8.9;
		dog2.height=1.3;
		dog2.isMale = false;
		
		Dog dog3 = new Dog();
		dog3.age=2;
		dog3.name="Benji";
		dog3.weight=5.6;
		dog3.height=1.1;
		dog3.isMale = true;
	
		System.out.println("Attributes of Spot:");
		System.out.println("Age of Spot is: " + spot.age);
		System.out.println("Name of Spot is: " + spot.name);
		System.out.println("Weight of Spot is: " + spot.weight);
		System.out.println("Height of Spot is: " + spot.height);
		System.out.println("Sex of Spot is: " + spot.isMale);
		
		System.out.println("\nAttributes of Dog2:");
		System.out.println("Age of Dog2 is: " + dog2.age);
		System.out.println("Name of Dog2 is: " + dog2.name);
		System.out.println("Weight of Dog2 is: " + dog2.weight);
		System.out.println("Height of Dog2 is: " + dog2.height);
		System.out.println("Sex of Dog2 is: " + dog2.isMale + "\n");
		
		/*
		 * the one Dog can have MANY references (many names)
		 */
		
		Dog dog4 = new Dog();
		/*
		 * We are asigning the Dog 'spot' to dog4 and dog3, this now means the one dog that was originally called spot is now called dog4 and dog3. 
		 */
		
		/*
		dog4=spot;
		dog3=spot;
		Dog dog5 = spot;
		
		System.out.println("\nName of spot: " + spot.name);
		System.out.println("Name of dog4: " + dog4.name);
		System.out.println("Name of dog3: " + dog3.name);
		System.out.println("Name of dog5: " + dog5.name);
		*/
		
		//One object can have many references (name). EG 'Bruce Wayne' is also 'Batman'.
		
		
		//populating an array of Dogs. THis contains 3 prexisting dogs and a new dog:
		Dog [] dogArray = {spot, dog2, dog3, new Dog()}; 
		
		System.out.println("Name of second dog: " + dogArray[1].name);
		
		System.out.println("Age of 3rd dog: " + dogArray[2].age);
		
		for(int i=0;i<dogArray.length;i++) {
			System.out.println("Name of dog is: " + dogArray[i].name + ". Age of dog is: " + dogArray[i].age + ". "
					+ "weight of dog is: " + dogArray[i].weight + ". Height of dog is: " + dogArray[i].height + ". Sex of dog is: " + dogArray[i].isMale + ".");
		}
		
		
		Dog noDog = new Dog();
		System.out.println("\n" + noDog.age); //0
		System.out.println(noDog.weight); //0.0
		System.out.println(noDog.isMale); //true
		System.out.println(noDog.name); //null - 'Name' is a string which is an object. The default for an object that is an attribute of another object is null. 
		
		//this is just a reference, it's not actually a dog. Its only the name that java uses to refer to some Dog. 
		Dog nullDog;
		//System.out.println(nullDog);
		
		
		//If you print out an object without an overridden toString() method. 
		System.out.println("spot is: " + spot);
		
	}

}
