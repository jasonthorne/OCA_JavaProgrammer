package com.gretb;

public class Main {

	
	public static void main(String[] args) {
		/*
		 * creating a dog, which is creating an object of type Dog
		 * the "new" keyword create an object of type Dog
		 * going left to right
		 * "Dog" refers to the refernce type (int num)
		 * "spot" refers to the name of this obejct, refers to 
		 * reference name which the program will use to refer to 
		 * this object.
		 * "new" creates a new object
		 * Dog() refers to the type of new Object created
		 */
		Dog spot=new Dog();
		
		spot.age=45;
		spot.name="spot";
		spot.weight=78.9;
		spot.height=2.3;
		spot.sex=true;
		//our second Dog
		Dog dog2=new Dog();
		dog2.age=4;
		dog2.name="rex";
		dog2.weight=8.9;
		dog2.height=1.3;
		dog2.sex=false;
		//our third Dog
		Dog dog3=new Dog();
		dog3.age=2;
		dog3.name="benji";
		dog3.weight=5.6;
		dog3.height=1.1;
		dog3.sex=true;
		
		System.out.println("print out atributes of Spot");
		System.out.println("age of spot is "+spot.age);
		System.out.println("name of spot is "+spot.name);
		System.out.println("weight of spot is "+spot.weight);
		System.out.println("height of spot is "+spot.height);
		System.out.println("sex of spot is "+spot.sex);
		
		System.out.println("print out atributes of Dog2");
		System.out.println("age of dog2 is "+dog2.age);
		System.out.println("name of dog2 is "+dog2.name);
		System.out.println("weight of dog2 is "+dog2.weight);
		System.out.println("height of dog2 is "+dog2.height);
		System.out.println("sex of dog2 is "+dog2.sex);
		/*
		 * the one Dog can have MANY references (many names)
		 */
		Dog dog4=new Dog();
		/*
		 * we are assigning the Dog spot to dog4 and dog3, this now
		 * means that the one, that was orginally called spot, is 
		 * now also called dog4 and dog3, the dog spot is not also
		 * referenced by dog3 and dog4
		 */
	/*dog4=spot;
		dog3=spot;
		Dog dog5=spot;
		//all the same name, as all the same dog
		System.out.println("name of spot "+spot.name);
		System.out.println("name of dog4 "+dog4.name);
		System.out.println("name of Dog3 "+dog3.name);*/
		/*
		 * one object can have many refenences (name)
		 * example Bruce Wayne is also Batman
		 
		//populating an array of Dogs
		/*
		 * this contains three pre existing and a new dog we created
		 * when populating the array
		 */
		Dog[]dogArray= {spot,dog2,dog3,new Dog()};
		//the name of the second dog
		System.out.println("name of second dog "+dogArray[1].name);
		//the age of the third Dog
		System.out.println("age of third dog is "+dogArray[2].age);
		
		System.out.println("age of dog 4 is "+dogArray[3].age);
		
		for(int i=0;i<dogArray.length;i++) {
			System.out.println("name of dog is "+dogArray[i].name);
			System.out.println("age of Dog is "+dogArray[i].age);
			System.out.println("weight of Dog is "+dogArray[i].weight);
			System.out.println("sex of Dog is "+dogArray[i].sex);
		}
		
		Dog[]dogArray2= {spot,dog3,spot,dog3};
		System.out.println("length of array");
		System.out.println(dogArray2.length);
		/*
		 * if no values are given to an object atributes it will 
		 * assume default value of 0 for all numbers, blank space for
		 * a char, false for a boolean, and null for objects including
		 * Strings
		 */
		Dog noDog=new Dog();
		System.out.println(noDog.age);//0
		System.out.println(noDog.weight);//0.0
		System.out.println(noDog.sex);//false
		/*
		 * name is a string, which is an object, the default for 
		 * an object that is a atribute of another object (an atribute 
		 * of a dog in this case) is null
		 */
		System.out.println(noDog.name);//null
		/*
		 * this is just a reference, this is not actually a Dog.
		 * it's only the name that the java uses to refer to some
		 * Dog. in this case nullDog is not referring to any Dog
		 */
		Dog nullDog;
		//this will generate an error, as null refers to no Dog
		//System.out.println(nullDog.age);
		/*
		 * if you print out an object, without an overriden 
		 * toString() method, it will just attempt to print out
		 * the address
		 * com.gretb.Dog@7852e922
		 */
		System.out.println("spot is "+spot);
		
	}

}
