package com.android;

import java.util.ArrayList;
import java.util.Arrays;

/*
 *An arraylist is a list. It implements the list interface.
 *There are 2 major differences from arrays:
 *1. an arraylist can change size.
 *2. An arraylist can only take objects. An array can take both objects and primitives.  
 */

public class Examples {

	static void ex1() {
		
		System.out.println("yo");
		
		ArrayList<String>strList1 = new ArrayList<String>();
		
		//you dont NEED the 'string' on the right brackets (for now...)
		ArrayList<String>strList2 = new ArrayList<>(); 
		
		//an array of length 4 with 4 numbers in it. But you cant have any more than 4 numbers in this array. 
		int[]myArray = {34,56,78,99};
		
		myArray[0]=100;
		//myArray[4]=9; //runtime exception
		
		//ArrayList<String>names = Arrays.asList<String>("noel", "mary", "paddy", "bob", "frank");
		
		ArrayList<String>names = new ArrayList<>();
		
		//adding to an array, requires the use of the add method:
		names.add("mary");
		names.add("bob");
		names.add("frank");
		names.add("barney");
		
		//printing the elements of an arraylist. (the object's toString method has been overridden to print these)
		System.out.println(names);
		
		/*
		 * An arrayList can ONLY take objects. It cannot take primitives: 
		 * ArrayList<string>names = new ArrayList<>(); //wont Compile.
		 * 
		 * It has to be Wrapper Classes:
		 */
		
		ArrayList<Integer>integerList = new ArrayList<>();
		ArrayList<Double>doubleList = new ArrayList<>();
		ArrayList<Character>characterList = new ArrayList<>();
		
		//this int is autoboxed into an Intger:
		integerList.add(1);
		
		//adding other values to lists:
		integerList.add(new Integer(4));
		integerList.add(100);
		integerList.add(1000);
		
		//this double is autoboxed into a Double:
		doubleList.add(2.34);
		doubleList.add(new Double(45.78));
		doubleList.add(3.99);
		doubleList.add(123.77);
		
		//'e' is autoboxed into a Character wrapper obj:
		characterList.add('e');
		characterList.add(new Character('a'));
		characterList.add('b');
		characterList.add('!');
		
		
		//printing arrayLists:
		System.out.println(integerList);
		System.out.println(doubleList);
		System.out.println(characterList);
		
		
		//spinnig through list;
		for(Integer i:integerList) {
			System.out.println("number is " + i);
		}
		
		
		//for arrays we use the var length to hget the length of the array. For arrayLists we use the method size() to the size of the arraylist.
		
		//arraylist numbering starts at 0
		System.out.println("\nfor loop:");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		//Adding the name laura at pos 2, pushes every other element 1 pos (increasing the size of the array)
		names.add(2, "laura");
		System.out.println("with laura added:");
		System.out.println(names);
		
		
		//=========
		
		Dog spot = new Dog(); //uses blank constructor
		Dog rex = new Dog(3, "Rex");  //uses constructor that  takes int, string
		Dog lassie = new Dog();  //uses blank constructor
		
		//create a Dog arraylist:
		ArrayList<Dog>dogList = new ArrayList<>();
		
		//add Dogs to arraylist:
		dogList.add(spot); //spot npow has 2 references ('spot' & 'dogList.get(0)')
		dogList.add(rex);
		dogList.add(lassie);
		dogList.add(new Dog());
		
		dogList.get(3).name="benji";
		
		System.out.println(dogList.get(3).name);
		
		/*
		 * The arrayList class has a toString method 
		 * which takes the toString method of the objects contained within the arrayList  and attempts to print out that object
		 *The Dog class HAS NO toString method which means it takes the Object class toString method and prints out the address of the object, so this prints 4 addresses:
		 * 
		 */
		System.out.println(dogList);
		
		
		//========
		
		Cat tibbles = new Cat(4, "tibbles");
		Cat fluffy = new Cat(2, "fluffy");
		Cat ginger = new Cat();
		Cat tom = new Cat(12, "tom");
		
		ArrayList<Cat>catList = new ArrayList<Cat>();
		
		catList.add(tibbles);
		catList.add(fluffy);
		catList.add(ginger);
		catList.add(tom);
		catList.add(new Cat());
		
		//this takes the toString method for each Cat and prints out the details of the cat. 
		//The Cat class does have a toString method, so this will print out the 4 cat's ages & names:
		System.out.println("\n" + catList);
		
		
		//change tibbles name:
		tibbles.name = "puss";
		
		System.out.println(tibbles.name);
		System.out.println(catList.get(0));
		
		//assign a new name to tibbles, meaning catListList[0] still referss to the id of 1, and new Cat refers to itself with the id of 6:
		tibbles = new Cat(); //change tibbles to be a new obj
		System.out.println(catList);
		System.out.println(tibbles);
		
		
		System.out.println();
		//spin through the arrayList:
		for(Cat c:catList) {
			c.eat();
		}
		
	}
}
