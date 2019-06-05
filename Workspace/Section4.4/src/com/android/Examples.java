package com.android;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
		
		
		//=========================================
		
		/*if you dont specify a type for the array (like below), you are creating an arrayList of type OBJECT
		 * and the same rules apply to arrays of objects apply to arraylists of objects.
		 * You can add ANY obj to this arraylist, but it is limited what you can do with it as you can only work with methods of the object class.
		 */
		
		ArrayList objList = new ArrayList<>();
		objList.add(2);
		objList.add(true);
		objList.add("apple");
		objList.add(23.4);
		objList.add(spot); //Dog's toString hasn;t been overridden, so prints out obj address
		objList.add(fluffy); //Cat's toString has been overridden
		System.out.println("printing out Objects");
		System.out.println(objList);
		
		
	}//ex1
	
	
	static void ex2() {
		/*
		 * When you create an arrayList, what is happening is that in the background, an array is being created that is of size 16, 
		 * and this is used to store your values, IF your arraylist has no more than 16 items in it.
		 * As soon as you are creating more than 16 items in an arraylist a new array is created in the background of size 17. 
		 * If you add one more, an array of size 18 is created, and so on for each item you add to the list.
		 */
		
		ArrayList<Double>dList = new ArrayList<>();
		
		//You can set the size of the initial array in the arrraylist Class. This means that the initial array in the background will be of size 50.
		ArrayList<Double>intList = new ArrayList<>(50); //adding a set size to the arayList
		
		//+++++++++++++++++++++++++++++++
		
		Cat tibbles = new Cat(4, "tibbles");
		Cat fluffy = new Cat(3, "fluffy");
		Cat tom = new Cat(2, "tom");
		
		ArrayList<Cat>catList = new ArrayList<>();
		catList.add(tibbles);
		catList.add(fluffy);
		catList.add(tom);
		
		//spinning through the method with a for 
		for(int i=0;i<catList.size();i++) {
			//System.out.println(catList.get(i)); //get each cat
			//System.out.println(catList.get(i).name); //get each cats name
			//catList.get(i).eat(); //call each cat's  eat method
		}
		
		//spin through with an enhanced for:
		for(Cat c:catList) {
			//System.out.println(c);
			//System.out.println(c.name);
			c.eat();
		}
		
	}
	
	static void ex3() {
		
		//SET for changing an element in an arrayList (CANT be used in an enhanced for loop)
		
		ArrayList<Integer>intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(new Integer(2));
		intList.add(3);
		intList.add(4);
		
		
		System.out.println("Before set method: ");
		System.out.println(intList);
		
		
		//SET METHOD +++++++++++++++++++++++++++++++++++++
		/*
		 * In an arrayList, if you want to reassign the values, you can use the set method()
		 * The set method takes 2 args, the index pos of where you want to change, and WHAT you want to change the elements value to.
		 * Set method does NOT add extra elements to an arrayList, it just REPLACES what was at that pos
		 */
		
		intList.set(0, 1000); //change pos 0 to hold 1000
		intList.set(1, 2000);
		intList.set(2, 3000);
		intList.set(3, 4000);
		
		System.out.println("After set method: ");
		System.out.println(intList);
		
		for(int i=0;i<intList.size();i++) {
			intList.set(i, intList.get(i)*2);
		}
		
		System.out.println(intList);
		
		//----------
		
		ArrayList<Cat>catList = new ArrayList<>();
		
		Cat tibbles = new Cat(2, "tiddles");
		Cat ginger = new Cat(3, "ginger");
		
		catList.add(tibbles);
		catList.add(ginger);
		catList.add(new Cat(7, "tom"));
		
		catList.set(0, new Cat()); //replace Cat at id with a new Cat
		catList.set(1, tibbles); //replace Cat at id with an existing Cat
		
		System.out.println(catList);
		
		catList.set(0, catList.get(2));
		
		System.out.println(catList.get(0));
		
		//-----------
		
		//EXCEPTIONS
		
		
		try {
			//This produces an 'indexOutOfBounds' exception. And as its in a try-catch, it's caught
			intList.set(10,15);
		}
		catch(Exception e) { //Exception is the superclass of all Exceptions
			System.out.println("Exception is: " + e);
			//e.printStackTrace();
		}
		
		System.out.println("code continues");
		
	}
	
	
	static void ex4() {
		
		
		//ARRAYLIST METHODS: +++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//REMOVE:
	
		System.out.println("Remove");
		String sb1 = "one";
		String sb2 = "two";
		String sb3 = "three";
		String sb4 = "four";
		
		
		ArrayList<String>strList = new ArrayList<>();
		
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		System.out.println("Before remove: ");
		System.out.println(strList);
		
		/*
		 * There are two overloaded remove() methods in the ArrayList class.
		 * One takes an obj to be removed, the other takes an index pos.
		 */
		
		strList.remove(sb2);
		System.out.println("After first remove: ");
		System.out.println(strList);
		
		strList.remove(0);
		System.out.println("After second remove: ");
		System.out.println(strList);
		
		//if you try to remove from an index pos that no longer exists, you will get an indexOutOfBOunds exception:
		//strList.remove(4);
		
		//if trying to remove an obj that doesnt exist, it just does nothing
		strList.remove(sb1);
		
		//this returns false if obj wasn't there:
		if (strList.remove(sb1) == false) {
			System.out.println("yo");
		}
		
		//================================================
		
		ArrayList<String>nameList = new ArrayList<>();
		
		nameList.add("test1");
		nameList.add("test2");
		
		//Add an array to an arraylist:
		
		String[] fruits = {"a", "b", "c"};
		
		//This DOESNT WORK for arrays:
		
		//nameList.addAll(fruits);
		
		
		//Use Collections instead
		//THis adds the elements from the fruit array into the nameList array.
		Collections.addAll(nameList, fruits);
		
		System.out.println(nameList);
		
		
		
	}
	
	
	static void ex6() {
		
		//DEEP COPY & SHALLOW COPY +++++++++++++++++++++++++++++
		
		/*
		 * Deep copy & shallow copy
		 * 
		 * Deep copy: two references to the same arrayList
		 * Shallow copy: two arraylists with the same values, but are different arraylists.
		 */
		
		String sb1 = new String("one");
		String sb2 = new String("two");
		String sb3 = new String("three");
		String sb4 = new String("four");
		
		ArrayList<String>strList =new ArrayList<>();
		
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		//---------------------
		//DEEP COPY (having two references to the same arraylist)
		System.out.println("DEEP COPY:");
		
		//two references to the same list:
		ArrayList<String>strCopy=strList;
		
		System.out.println("same reference? " + (strCopy==strList));
		System.out.println("same values? " + (strCopy.equals(strList)));
		
		
		//change the value at pos 0. from one to orange:
		strCopy.set(0, "orange");
		
		
		System.out.println("strCopy " + strCopy);
		System.out.println("strList " + strList);
		
		
		//----------------------------
		//SHALLOW COPY (two arrayLists with the same values)
		System.out.println("\nSHALLOW COPY:");
		
		strList =new ArrayList<>();
		
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		ArrayList<String>newStrings=new ArrayList<>(); //an empty arrayList
		newStrings.addAll(strList); //adding the values from one arrayList to the empty arrayList
		
		System.out.println("same reference? " + (newStrings==strList));
		System.out.println("same values? " + (newStrings.equals(strList)));
		
		System.out.println("newStrings " + newStrings);
		System.out.println("strList " + strList);
		
	}
	
	
	static void ex7() {
		
		//MORE ARRAYLIST METHODS ++++++++++++++++++++++
		
		String sb1 = new String("one");
		String sb2 = new String("two");
		String sb3 = new String("three");
		String sb4 = new String("four");
		
		ArrayList<String>strList =new ArrayList<>();
		
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		//CLEAR - deletes all elements from an arraylist
		
		strList.clear();
		System.out.println("empty strList: " + strList);
		
		//--------------------------------------
		
		//CONTAINS - returns true if the list contains the specified element
		
		strList =new ArrayList<>();
		
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		System.out.println(strList.contains("one")); //true
		System.out.println(strList.contains("car")); //false
		System.out.println(strList.contains(sb1)); //true (looking for object within the list)
		

		//--------------------------------------
		
		//INDEX OF  - returns returns the first index of the element if it exists in the arraylist and -1 if it doesn't
		
		strList.add("three"); //add another "three" to the list
		System.out.println("strList: " + strList);
		
		System.out.println(strList.indexOf("three")); //finds the FIRST instance of the target value. (doesnt find the one at the end of list)
		
		System.out.println(strList.indexOf("bob"));
		
	}
	
	static void ex8() {
		
		
		ArrayList<Integer>intList =new ArrayList<>();
		
		intList.add(5);
		intList.add(150);
		intList.add(250);
		intList.add(350);
		intList.add(350);
		intList.add(350);
		
		Integer myInt = 1500;
		
		intList.add(myInt);
		intList.add(myInt);
		
		System.out.println("Before removal: " +  intList);
		
	}
	
	
	static void ex9() {
		
		//SHALLOW COPY ARRAYLIST ++++++++++++++++++++++++++++++++
		
		ArrayList<Cat>catList =new ArrayList<Cat>();
		
		Cat tom = new Cat(2, "tom");
		Cat tibbles = new Cat(4, "tibbles");
		Cat mog = new Cat(5, "mog");
		
		catList.add(tom);
		catList.add(tibbles);
		catList.add(mog);
		
		System.out.println("Deep copy of Cats:");
		
		ArrayList<Cat>copyCatList = catList; //make another reference to catList
		
		System.out.println("same reference? " + (copyCatList==catList));
		System.out.println("same values? " + (copyCatList.equals(catList)));
		
		System.out.println("copyCatList " + copyCatList);
		System.out.println("catList " + catList);
		
		
		//change the first cat:
		catList.set(0, new Cat());
		
		System.out.println("copyCatList " + copyCatList.get(0));
		System.out.println("catList " + catList.get(0));
		
		//----------------------------------
		//MAKING A SHALLOW LIST: 
		
		//new list
		ArrayList<Cat>shallowCatList =new ArrayList<Cat>();
		
		//make shallow copy
		shallowCatList.addAll(catList);
		
		System.out.println("same reference? " + (shallowCatList==catList)); //not pointing to the same arrays
		System.out.println("same values? " + (shallowCatList.equals(catList))); //both lists are referencing the same cats ++++++++++++++++++++++++++++++
		
		
		//-----------------
		
		//CLONE - Another way of making a shallow copy ++++++++++++++++++++++++++++++++++MIGHT BE IN EXAM!!  
		
		catList =new ArrayList<Cat>();
		
		catList.add(tom);
		catList.add(tibbles);
		catList.add(mog);
		
		/*
		 * THe clone method in the arrayList class returns an object reference to an arraylist obj
		 * that is a shallow copy of the arraylist calling the clone method.
		 */
		
		Object clonedCatList = catList.clone(); //cloned returns an OBJECT REFERENCE to a returned arraylist object. (can ONLY call the methods of the object class)
		
		System.out.println(clonedCatList); //An arraylist of reference object
		
		//casting the 'clonedCatList'(an object reference) into 'castCloneCatList' (an arraylist reference) (giving access to arrayList methods)  ++++++++++++++++++++++++++++++++++++++
		ArrayList<Cat>castCloneCatList=(ArrayList<Cat>)clonedCatList;
		
		
		
		
	}
	
	
	
	
	
}
