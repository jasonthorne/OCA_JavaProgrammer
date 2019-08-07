package com.android;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/*
 * an arrayList is a List, implements the List interface
 * there are two major differences from arrays
 * 1 An arraylist can change size, arrays can't
 * 2 An arrayList can ONLY TAKE object, an array can take both
 * objects and primitives
 */
public class Examples {
	static void ex1() {
		ArrayList<String>strList=new ArrayList<String>();
	//you don't have to put in "String" on the right hand side
		ArrayList<String>strList2=new ArrayList<>();
	/*
	 * this creates an array of length four with our four numbers in
	 * it, but you CANNOT have any more than four numbers in this array
	 * it's length cannot change
	 */
		int[]myArray={34,56,78,99};
		myArray[0]=100;
		/*
		 * uncomment to see the runtime Exception 
		 * ArrayindexOutOfBoundsException
		 */
		//myArray[4]=9;
		
		ArrayList<String>names=new ArrayList<>();
	/*	names.addAll(Arrays.asList("noel","pat"));
		List<String>listStr=Arrays.asList("apple","orange");
		names.addAll(listStr);*/
		/*
		 * we add elements to an arrayList by using the add() method
		 */
		names.add("mary");
		names.add("Kathleen");
		names.add("sarah");
		names.add("pat");
		/*
		 * there is a toString() method in the arrayList class that
		 * will print out all the elements of the arraylist
		 */
		System.out.println(names);
		/*
		 * an arrayList can only take object, it cannot take
		 * primitives
		 */
		//ArrayList<int>intList=new ArrayList<>();
		/*
		 * it has to be WRAPPER objects
		 */
		ArrayList<Integer>integerList=new ArrayList<>();
		ArrayList<Double>doubleList=new ArrayList<>();
		ArrayList<Character>characterList=new ArrayList<>();
		//1 is autoboxed as an integer
		integerList.add(1);
		integerList.add(new Integer(4));
		integerList.add(100);
		integerList.add(1000);
		//2.34 is autoboxed to become a Double wrapper object
		doubleList.add(2.34);
		doubleList.add(new Double(45.78));
		doubleList.add(3.99);
		doubleList.add(123.77);
		double[]myDarray= {3.45,2,1};
		/*
		 * this is an arrayList of DOUBLE objects, so it cannot
		 * take an int, it can take a primitive double but not
		 * a primitive int
		 * this will not compile
		 */
	//	doubleList.add(2);
		//'e' is autoboxed to become a Character wrapper object
		characterList.add('e');
		characterList.add(new Character('a'));
		characterList.add('b');
		characterList.add('!');
		
		System.out.println(integerList);
		System.out.println(doubleList);
		System.out.println(characterList);
		
		for(Integer i:integerList) {
			System.out.println("number is "+i);
		}
		
		for(String s:names) {
			System.out.println("name is "+s);
		}
		/*
		 * for arrays we use the variable length to get the length
		 * of the array
		 * for arrayLists we use the METHOD size() to the size of
		 * the arrayList
		 * arraylist numbering starts at 0
		 */
		for(int i=0;i<names.size();i++) {
			names.get(i);
		}
		System.out.println(names.size());
		System.out.println(names.get(0));//mary
		System.out.println(names.get(1));//kathleen
		System.out.println(names.get(2));//sarah
		System.out.println(names.get(3));//pat
		/*
		 * this gives us IndexOutOfBoundsException
		 */
		//System.out.println(names.get(4));
		/*
		 * adding the  name "laura" at position 2
		 * and every name after this is moved an extra
		 * position, so our arraylist now has a new
		 * index position 4 and reads 
		 * mary,kathleen, laura, sarah,pat
		 */
		names.add(2, "laura");
		System.out.println("with laura added");
		System.out.println(names);
		
		Dog spot=new Dog();//uses blank Dog constructor
		Dog rex=new Dog(2,"rex");//uses dog consturctor that takes int, string
		Dog lassie=new Dog();//uses blank Dog consturctor
		//create an arrayList of Dogs
		ArrayList<Dog>dogList=new ArrayList<>();
		//adding our Dogs to the arrayList
		dogList.add(spot);
		dogList.add(rex);
		dogList.add(lassie);
		dogList.add(new Dog());
		/*
		 * this dog is already created, and has the default 
		 * name of null, so here we are changing the name of this
		 * Dog to Benji
		 */
		dogList.get(3).name="benji";
		//dogList.set(index, element)
		/*
		 * the ArrayList class has a toString method which
		 * takes the toString  method of the objects contained
		 * within the arrayList and attempts to print out that object
		 * the Dog class HAS NO toString method which  means its 
		 * takes the Object class toString method and prints out
		 * the address of the object
		 * so this prints out four addresses
		 */
		System.out.println(dogList);
		
		for(Dog d:dogList)
			System.out.println("dog address is "+d);
		
		Cat tibbles=new Cat(4,"tibbles");
		Cat fluffy=new Cat(2,"fluffy");
		Cat lucifer=new Cat();
		Cat tom=new Cat(12,"tom");
		
		ArrayList<Cat>catList=new ArrayList<Cat>();
		catList.add(tibbles);
		catList.add(fluffy);
		catList.add(lucifer);
		catList.add(tom);
		catList.add(new Cat());
		/*
		 * this takes the toString() method for each cat and prints
		 * out the details of the cat. The cat class DOES have a 
		 * toString method, so this will print out the four
		 * cats ages and names
		 */
		System.out.println(catList);
		/*
		 * same rule as arrays, we can access first cat through
		 * variable tibbles or catlist.get(0).
		 * if we change the name of tibbles, it's also changed
		 * for catList(0) as they the same cat
		 * if we assign a new cat to tibbles, that means that
		 * catList(0) still refers to the cat with the id of 1
		 * and tibbles now refers to the new cat with the id of
		 * 6
		 */
		tibbles.name="puss";
		System.out.println(tibbles.name);
		System.out.println(tibbles.id);
		System.out.println(catList);
		
		tibbles=new Cat();
		System.out.println("new cat has id of "+tibbles.id);//id of 6
		System.out.println(catList);//first cat has id of 1
		
		for(Cat c:catList) {
			System.out.println(c);
			c.eat();
		}
		/*
		 * if you don't specify a type for an arrayList, like below, 
		 * you are creating an arrayList of type OBJECT, and the same
		 * rules that apply to arrays of objects apply to arraylists
		 * of objects
		 * you can add ANY object to this arraylist, but it is limited
		 * what you can do with it as you can only work with methods
		 * of the object class
		 */
		ArrayList objList=new ArrayList<>();
		objList.add(2);
		objList.add(true);
		objList.add("apple");
		objList.add(23.4);
		objList.add(spot);
		objList.add(fluffy);
		System.out.println("printing out Objects");
		System.out.println(objList);
		
	}//end of ex1
	
	static void ex2() {
		/*
		 * when you create an arrayList, what is happening is that
		 * in the background an array is being created that is of size
		 * 16 and this is used to store you values if you arrayList has no
		 * more than 16 items in it.
		 * As soon as you are storing more than 16 items in an arraylist, 
		 * a new array is created in the background of size 17, if
		 * you add one more and arary of size 18 is created and so one
		 * for each item you add to list		 */
		//the array in the background is of size 16
		ArrayList<Double>dList=new ArrayList<>();
		/*
		 * you can set the size of the initial array in the 
		 * arraylist class, this means the initial array in the
		 * background will be of size 50
		 */
		ArrayList<Integer>intList=new ArrayList<>(50);
		
		Cat tibbles=new Cat(4,"tibbles");
		Cat fluffy=new Cat(3,"fluffy");
		Cat tom=new Cat(2,"tom");
		
		ArrayList<Cat>catList=new ArrayList<>();
		catList.add(tibbles);
		catList.add(fluffy);
		catList.add(tom);
		System.out.println("using loop to access cats in list");
		for(int i=0;i<catList.size();i++) {
			System.out.println(catList.get(i));
			//this will get the name of each cat in the list
			System.out.println("name of cat is "+catList.get(i).name);
			//call the eat method for each cat
			catList.get(i).eat();
		}
		//this loop performs exactly the same way as above
		for(Cat c:catList) {
			System.out.println(c);
			System.out.println("name of cat is "+c.name);
			c.eat();
		}	
	}//end of ex2
	
	static void ex3() {
		ArrayList<Integer>intList=new ArrayList<Integer>();
		intList.add(1);
		intList.add(new Integer(2));
		intList.add(3);
		intList.add(4);
		System.out.println("before set()");
		System.out.println(intList);
		/*
		 * in an arrayList if you want to reassign values you
		 * can use the set() method. the set() method takes two values
		 * the index position of the object you want to change and what
		 * you are changing the new object too.
		 * set does NOT add extra elements to an arraylist, IT
		 * REPLACES AND EXISTING ELEMENT
		 */
		intList.set(0, 1000);
		intList.set(1, 2000);
		intList.set(2, 3000);
		intList.set(3, 4000);
		System.out.println("after set()");
		System.out.println(intList);
		
		for(int i=0;i<intList.size();i++) {
			//intList.set(i, i+i);
			intList.set(i, intList.get(i)*2);
		}
		System.out.println(intList);
		
		ArrayList<Cat>catList=new ArrayList<>();
		Cat tibbles=new Cat(2,"tibbles");
		Cat puss=new Cat(3,"puss");
		catList.add(tibbles);
		catList.add(puss);
		catList.add(new Cat(7,"tom"));
		//first cat has been changed to a new cat
		for(Cat c:catList) {
			System.out.println("id of cat is "+c.id);
		}
		catList.set(0, new Cat());
		//second cat has been changed to the existing cat tibbles
		catList.set(1, tibbles);
		/*
		 * you can't use a enhanced for loop to change all the values
		 * in an arrayList directly
		 */
		for(Cat c:catList) {
			System.out.println("id of cat is "+c.id);
			//can't use set()
		//	c.set()
		}
		/*
		 * set() replaces an EXISTING object in the arrayList
		 * this gives indexOutOfBoundsException as this is trying
		 * to change a value, that does not yet exist
		 * will not compile
		 */
	//	catList.set(3, new Cat());
		intList.set(2, 79);
		System.out.println(intList);
		
		try {
			/*
			 * this produces IndexOutOfBoundsException and as it's
			 * in a try catch block, the catch block "catches" the
			 * exception generated and deals with it
			 */
			intList.set(10, 15);
		}
		catch(Exception e) {
			System.out.println("excetpion is "+e);
		}
		System.out.println("code continues");
		
		
	}//end of ex3
	
	static void ex4() {
		System.out.println("remove");
		String sb1="one";
		String sb2="two";
		String sb3="three";
		String sb4="four";
		
		ArrayList<String>strList=new ArrayList<>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		System.out.println("before remove");
		System.out.println(strList);
		/*
		 * remove command
		 * there are two overloaded remove() methods in the
		 * ArrayList class. One remove method takes an object to be
		 * removed, the other takes an index position
		 */
		strList.remove(sb2);
		System.out.println("after first remove");
		System.out.println(strList);
		//remove string at position 0
	//	System.out.println(strList.remove(0));
		strList.remove(0);
		System.out.println("after second remove");
		System.out.println(strList);
		/*
		 * if you try to remove from an index position that no 
		 * longer exists you will get an 
		 * IndexOutOfBoundsException
		 */
		//strList.remove(4);
		//this does nothing but does not generate exception
		strList.remove(sb2);
		System.out.println(strList);
		strList.remove(sb1);
		System.out.println(strList);
		
		
	}
	
	static void ex5() {
		String sb1="one";
		String sb2="two";
		String sb3="three";
		String sb4="four";
		
		ArrayList<String>strList=new ArrayList<String>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		ArrayList<String>nameList=new ArrayList<String>();
		String name1="enda";
		String name2="leo";
		String name3="Angela";
		String name4="justin";
		
		nameList.add(name1);
		nameList.add(name2);
		nameList.add(name3);
		nameList.add(name4);
		
		strList.addAll(nameList);
		System.out.println(strList);
		
		strList=new ArrayList<String>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		nameList=new ArrayList<String>();
		nameList.add(name1);
		nameList.add(name2);
		nameList.add(name3);
		nameList.add(name4);
		/*
		 * add all of an arraylist to another arraylist at a 
		 * particular location in the arraylist
		 */
		nameList.addAll(2,strList);
		System.out.println("namelist is now");
		System.out.println(nameList);
		
		strList=new ArrayList<String>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		nameList=new ArrayList<String>();
		nameList.add(name1);
		nameList.add(name2);
		nameList.add(name3);
		nameList.add(name4);
		
		String[]fruits= {"apple","orange","banana"};
		/*
		 * this method DOES NOT work for arrays
		 */
		//nameList.addAll(fruits);
		/*
		 * this method adds all of the fruits from the 
		 * fruits array to all of the names in the nameList
		 * arraylist. adds everything from an array to a
		 * arraylist
		 */
		Collections.addAll(nameList, fruits);
		System.out.println("nameList is now ");
		System.out.println(nameList);
		
		nameList=new ArrayList<String>();
		nameList.add(name1);
		nameList.add(name2);
		nameList.add(name3);
		nameList.add(name4);
		/*
		 * arrays as list convert arrays or a series values
		 * into a list object, you can can add a list object
		 * onto an arraylist
		 */
		List<String>copyFruit=Arrays.asList(fruits);
		
		List<Integer>numbers=Arrays.asList(2,5,89,1000);
		//nameList.addAll(c)
		/*
		 * this is copying the array to the arraylist nameList
		 * we first convert fruits to a list, which then can 
		 * be added to the arraylist nameList
		 */
		nameList.addAll(Arrays.asList(fruits));	
	}//end of ex5
	
	static void ex6() {
		String sb1=new String("one");
		String sb2=new String("two");
		String sb3=new String("three");
		String sb4=new String("four");
		
		ArrayList<String>strList=new ArrayList<>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		/*
		 * Deep copy and shallow copy
		 * Deep copy is two references to the same arraylist
		 * shallow copy is two arraylists with the same values, but
		 * are different arrayList
		 */
		System.out.println("Deep copy");
		ArrayList<String>strCopy=strList;
		System.out.println("same object");
		System.out.println(strCopy==strList);
		System.out.println("same values");
		System.out.println(strCopy.equals(strList));
		/*
		 * changing the value at postion 0, which was "one" to 
		 * "orange"
		 */
		strCopy.set(0, "orange");
		/*
		 * both print the same thing
		 * [orange, two, three, four]
		 * as both these are the same list, so change one you change
		 * the other
		 * multiple references to the same arraylist is a
		 * Deep copy
		 */
		System.out.println(strList);
		System.out.println(strCopy);
		
		strList=new ArrayList<>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		ArrayList<String>newStrings=new ArrayList<String>();
		System.out.println("shallow copy");
		/*
		 * adding all the contents of strList to the empty
		 * newStrings arraylist creates a SHALLOW copy.
		 * newString contains the same values as strList, but
		 * they are DIFFERENT arraylists
		 * shallow copy, copies the values, not the reference
		 */
		newStrings.addAll(strList);
		System.out.println("newStrings is ");
		System.out.println(newStrings);
		System.out.println(strList);
		System.out.println("strlist not same as newStrings");
		/*
		 * this returns false as NOT THE same arraylist object
		 */
		System.out.println(strList==newStrings);
		System.out.println("strList equals newStrings");
		/*
		 * this returns true as they both have the same 
		 * values
		 */
		System.out.println(strList.equals(newStrings));
		strList.set(1, "orange");
		/*
		 * this will return false as both 
		 */
		System.out.println(strList.equals(newStrings));	
	}
	
	static void ex7() {
		String sb1=new String("one");
		String sb2=new String("two");
		String sb3=new String("three");
		String sb4=new String("four");
		
		ArrayList<String>strList=new ArrayList<>();
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		System.out.println("clear");
		/*
		 * clear, this deletes all elements from an arrayList
		 */
		strList.clear();
		System.out.println("after clear");
		System.out.println(strList);//empty arraylist
		
		strList.add(sb1);
		strList.add(sb2);
		strList.add(sb3);
		strList.add(sb4);
		
		System.out.println("contains");
		/*
		 * this method retursn true if the list contains the
		 * specified element, false otherwise
		 */
		System.out.println(strList.contains("one"));//true
		System.out.println(strList.contains("car"));//false
		System.out.println(strList.contains(sb1));//true
		
		System.out.println("indexOf");
		/*
		 * this method returns the first index of the element
		 * if it exists in the arraylist and -1 if it does not
		 */
		strList.add("three");
		System.out.println("strList is "+strList);
		/*
		 * indexOf only finds where "three" FIRST EXISTS which is
		 * as index postion 2, it does not find the word "three"
		 * as position 4
		 */
		System.out.println(strList.indexOf("three"));
		System.out.println(strList.indexOf("Tomato"));//-1
		
	}//end of ex7
	
	
	static void ex8() {
		ArrayList<Integer>intList=new ArrayList<Integer>();
		intList.add(5);
		intList.add(150);
		intList.add(250);
		intList.add(350);
		intList.add(350);
		intList.add(350);
		Integer myInt=1500;
		intList.add(myInt);
		intList.add(myInt);
		System.out.println("before removal");
		System.out.println(intList);
	}
	
	static void ex9() {
		ArrayList<Cat>catList=new ArrayList<Cat>();
		Cat tom=new Cat(2,"tom");
		Cat tibbles=new Cat(4,"tibbles");
		Cat puss=new Cat(5,"puss");
		catList.add(tom);
		catList.add(tibbles);
		catList.add(puss);
		System.out.println("Deep copy of cats");
		ArrayList<Cat>copyCatList=catList;
		/*
		 * copyCatList and catList refer to the same list of CAts
		 */
		System.out.println(catList==copyCatList);
		/*
		 * both have same values
		 */
		System.out.println(catList.equals(copyCatList));
		System.out.println(catList);
		System.out.println(copyCatList);
		catList.set(0, new Cat());
		System.out.println(catList);
		System.out.println(copyCatList);
		
		ArrayList<Cat>shallowCatList=new ArrayList<Cat>();
		/*
		 * this creates a shallow copy in that it adds all of the
		 * contents catList to shallowCatList, it only adds
		 * a COPY of the values, which means you have two 
		 * different lists of cat with the same cats
		 */
		shallowCatList.addAll(catList);
		System.out.println("different Arraylists");
		System.out.println(shallowCatList==catList);
		System.out.println("but same cats");
		System.out.println(shallowCatList.equals(catList));
		System.out.println("shallowCat List");
		System.out.println(shallowCatList);
		System.out.println("CatList list");
		System.out.println(catList);
		
		
	/*	tibbles.name="sam";
		System.out.println(shallowCatList);
		System.out.println(catList);
		shallowCatList.set(2, new Cat());
		System.out.println(shallowCatList);
		System.out.println(catList);
		*/
		
		catList=new ArrayList<Cat>();
		catList.add(tom);
		catList.add(tibbles);
		catList.add(puss);
	//	catList.
		/*
		 * the clone method in the arraylist class
		 * returns a object reference to an arraylist object
		 * that is a shallow copy of the arraylist calling
		 * the clone method
		 */
		Object cloneCatList=catList.clone();
		/*
		 * only methods of the Object class are available to 
		 * this object as the reference is what determines what
		 * methods can be called. toString() is a method of the o
		 * object class and there is a toString method in the 
		 * arrayList class so all the cats are  printed out.
		 * but none of the other methods or arraylist such as 
		 * add(), set(),etc are available to this object as they
		 * were NOT defined in the Object class
		 */
		System.out.println("clonedCatList "+cloneCatList);
		//not available to this object
		//cloneCatList.set(1,new Cat());
		//clonCatList.add(new Cat())
		/*
		 * we can cast this object to be of type ArrayList<Cat> as
		 * this is a ArrayList<Cat> object, but it has a Object reference,
		 * so when we are casting something all we are doing is changing
		 * the reference, also you can't cast incompatible objects to
		 * each other
		 */
		ArrayList<Cat>clonedCat=(ArrayList<Cat>)cloneCatList;
		System.out.println(clonedCat.size());	
	}//end of ex9
	
	static void ex10() {
		ArrayList<String>nameList=new ArrayList<String>();
		nameList.add("pat");
		nameList.add("kate");
		nameList.add("shelly");
		nameList.add("kate");
		nameList.add("laura");
		nameList.add("kate");
		/*
		 * we are searching our list for the word "Kate"
		 * everywhere we find the word "Kate", we replace it with
		 * the word "Linda"
		 * 
		 */
		System.out.println("before removing ");
		System.out.println(nameList);
		for(int i=0;i<nameList.size();i++) {
			//check each entry for the word "kate"
			if(nameList.get(i).equals("kate")) {
				/*
				 * this will give the index line number "kate"
				 * is removed at (first line would be 0)
				 */
			//	System.out.println("removing on line "+i);
				/*
				 * this removes "kate"
				 */
			//	nameList.remove(i);
				/*
				 * this adds linda to where "kate" was
				 */
			//	nameList.add(i, "Linda");
				/*
				 * this is a much shorter and easier way than 
				 * all of the above
				 */
				nameList.set(i, "Linda");
			}
		}//end of for loop
		
		System.out.println("after remove");
		System.out.println(nameList);
		nameList.clear();
		nameList.add("pat");
		nameList.add("kate");
		nameList.add("shelly");
		nameList.add("kate");
		nameList.add("laura");
		nameList.add("kate");
		System.out.println("ListIterator");
		/*
		 * ListIterator is a class that is used specificially for 
		 * going through any type of list, used a lot in 
		 * databases
		 */
		ListIterator<String>strIterator=nameList.listIterator();
		System.out.println(strIterator);
		/*
		 * there are two methods of the Listiterator class that
		 * we use when accessing records from a database
		 * hasNext()
		 * this checks to see are you at the end of your list,
		 * this returns true, if there is another value after the
		 * current value
		 * and returns false if this is the last item on the list
		 * next() this is what causes your loop to advance to the
		 * next iteration
		 */
		while(strIterator.hasNext()) {
			//System.out.println(strIterator);
			//this is what increments and advances the loop
			System.out.println("before if");
			if(strIterator.next().equals("kate")) {
				strIterator.remove();
				strIterator.add("Linda");
			}
			
		}
		System.out.println(nameList);
	}
}
