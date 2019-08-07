package com.android;

import java.util.ArrayList;

/**
 * Exam Objective 3.2 Test equality between Strings and other 
 * objects using == and the equals() method
 * @author noelf
 *
 */
public class Main {
	public static void main(String[]args) {
		String str="hank";
		String str2="hank";
		String str3="walter";
		String str4="skylar";
		/*
		 * both str and str2 are two references to the SAME
		 * string, 	when we create a string by directly assigning
		 * a string to a variable, that string is placed in the
		 * string pool. every time after that, when we are creating
		 * a string it first checks the string pool and if that
		 * string already exists it will assign the string in the
		 * pool to the other reference.
		 * "hank" is in the pool after line 10, so str2 is assigned
		 * to the same string "hank" that is in the pool
		 */
		System.out.println(str==str2);//true as same object
		/*
		 * the equals() method checks the value of the string
		 * and if they are the same value, this will return
		 * true
		 */
		System.out.println(str.equals(str2));
		
		str="mary";
		/*
		 * when you use the "new" keyword, the string is NOT 
		 * placed in the pool, so these are two different objects
		 * with the same text
		 */
		str2=new String("mary");
		System.out.println(str==str2);//false
		/*
		 * this will be true
		 * the string class has it's own overriden equals method
		 * which checks the value of the string and if the same
		 * value, this will return true.
		 * equals also returns true if they are referring to the
		 * same string
		 */
		System.out.println(str.equals(str2));//true
		/*
		 * this will also return true as they are the same
		 * object
		 */
		str="hello";
		str2="hello";
		System.out.println(str.equals(str2));//true
		//str3 is "walter" str4 is "skylar"
		System.out.println(str3.equals(str4));//false
		/*
		 * the equals() method of the object class, only checks
		 * to see if they are both the same object. this returns
		 * a boolean true if same, boolean false if not same
		 * object.
		 * if we create a class and it has not equals() method 
		 * of its own, it will use the object class equals()
		 */
		Object obj=new Object();
		//just checking to see if same object
		System.out.println(obj.equals(str));//false
		/*
		 * the Dog class DOES NOT OVERRIDE the equals() method,
		 * so that means it takes it's equals() method from
		 * the object class so it only returns true if they are the
		 * same object
		 */
		Dog myDog=new Dog("spot",2);
		Dog myDog2=new Dog("spot",2);
		Dog myDog3=myDog2;
		/*
		 * true as both myDog2 and myDog3 refer to the same Dog
		 * and this uses the equals() method from the Object class
		 * which returns true if same Dog
		 */
		System.out.println("myDog2 and myDog3 "+myDog2.equals(myDog3));
		/*
		 * this returns false as these are two DIFFERENT dogs, even
		 * though they have the same name and age, but they are using
		 * the equals() method from the object class, which returns
		 * false if they are different objects
		 */
		System.out.println("myDog and myDog2 "+myDog.equals(myDog2));
		
		/*
		 * this is what the object class equals() method looks like
		 * public boolean equals(object obj){
		 * 	return(this==obj)
		 * }
		 */
		
		Cat tom=new Cat("tibbles",3);
		Cat puss=new Cat("puss",4);
		
		
		
		System.out.println(tom.equals(puss));
		System.out.println("our twin cats");
		tom=new Cat("puss",2);
		puss=new Cat("puss",2);
		System.out.println(tom.equals(puss));
		/*
		 * we now have two references to one Cat object
		 */
		tom=puss;
		System.out.println("same cat");
		System.out.println(tom.equals(puss));
		/*
		 * we are comparing the Cat object tom, with the string
		 * "hello", equals() method can take ANY object
		 */
		System.out.println(tom.equals("hello"));
		
		Cat cat1=new Cat("tibbles",23);
		Cat cat2=new Cat("fluffy",5);
		Cat cat3=new Cat("beezer",2);//
		Cat cat4=new Cat("buster",3);
		Cat cat5=new Cat("beezer",2);//
		Cat cat6=new Cat("beezer",3);//
		Cat cat7=new Cat("harry",7);
		
		ArrayList<Cat>catList=new ArrayList<Cat>();
		catList.add(cat1);//tibbles 23
		catList.add(cat2);//fluffy 5
		catList.add(cat3);//beezer 2
		catList.add(cat4);//buster 3
		catList.add(cat5);//beezer 2
		catList.add(cat6);//beezer 3
		catList.add(cat7);//harry 7
		System.out.println("our list of cats");
		System.out.println(catList);
		
		System.out.println(catList.get(2).equals(catList.get(4)));
		catList.remove(6);//will remove cat harry
		catList.remove(cat1);//
		System.out.println("after remove");
		System.out.println(catList);
		/*
		 * this will remove the first instance of beezer with
		 * an age of 2 from the arrayList of Cats. 
		 * the remove() method uses the equals() method of the 
		 * Cat class to find a particular cat with certain
		 * atributes (name and age). In this case it is looking
		 * for a Cat called "beezer" that is 2 years old.
		 * if the Cat class had no equals() method, remove
		 * would use the equals method from the Object class
		 */
		catList.remove(new Cat("beezer",2));
		/*
		 * this is trimming the name of 3 cat from 
		 * "   freddie    "
		 * to "freddie"
		 */
		catList.set(2, new Cat(" freddie ",5));
		catList.get(2).name.trim();
		/*
		 * the overriden method in the person class only checks
		 * that both objects are Person objects and the names
		 * of each person
		 */
		Person person1=new Person("percy",34);
		Person person2=new Person("percy",56);
		//this returns true as both have the same name
		System.out.println("person equals");
		System.out.println(person1.equals(person2));
		
		}

}
