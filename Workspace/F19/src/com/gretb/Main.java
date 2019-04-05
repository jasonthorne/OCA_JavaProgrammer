package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		
		Dog lassie=new Dog();
		Dog benji=new Dog();
		/*
		 * so both dogs have the same age, name and weight
		 * but it is important to remember these are two DIFFERENT
		 * dogs
		 */
		System.out.println("lassies age is "+lassie.age);
		System.out.println("benji's age is "+benji.age);
		/*
		 * this is checking if lassie and benji are the SAME dog
		 * checking for equalivance, which means checking if they are both
		 * the same object (same dog)
		 */
		//will return false as lassie and benji are two different dogs
		System.out.println(lassie==benji);//will return false
		
		Dog rex=new Dog();
		/*
		 * we are assigning the dog lassie refers too, to rex. so this means
		 * that rex and lassie ARE the same dog
		 */
		rex=lassie;
		//rex and lassie are the same dog, so this will print true
		System.out.println("rex and lassie same ?"+(lassie==rex));
		/*
		 * is lassie NOT THE SAME DOG as rex
		 * will print false as they ARE THE SAME dog
		 */
		System.out.println(lassie!=rex);
		/*
		 * creating two cats
		 */
		Cat tibbles = new Cat();
		Cat tom= new Cat();
		
		//creating two swans
		Swan sinead=new Swan(2,2.5,2.5,"Sinead");
		Swan sean=new Swan(5,4.3,3.5,"Sean");
		//will print all atributes of sinead and sean the swan
		sinead.printSwan();
		sean.printSwan();
		
		int num=34;
		//will print true
		System.out.println(num>15);
		/*
		 * Zebra use the getGender() method to determine the gender
		 * of the zebra. the getGender method is called in the Zebra 
		 * constructor. if true female, if false male
		 */
		Zebra zed=new Zebra(12,"zed",true);
		System.out.println("the gender of zed is "+zed.gender);
		//this is a person who owns our pig
		Person pat=new Person(43,"pat",false);
		//this is creating our pig babe with owner person pat
		/*
		 * here we are using an existing person to create our pig
		 * babe
		 */
		Pig babe=new Pig(2,"babe",pat);
		
		//two ways of referencing pat:
		System.out.println("PAT: " + pat.name);
		System.out.println("ALSO PAT: " +babe.owner.name);
		
		/*
		 * here we are creating a brand new person when we are creating
		 * the pig. we can only access this person throught the pippa
		 * pig object
		 */
		Pig pippa=new Pig(3,"pippa",new Person(50,"patrica",true));
		
		System.out.println("owner of pippa is "+pippa.owner.name);
		
		babe.eat();
		pippa.eat();
		
		pippa.one();
		
		

	}

}
