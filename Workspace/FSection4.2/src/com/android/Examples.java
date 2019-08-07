package com.android;

public class Examples {
	
	static void ex1() {
		/*
		 * A string is an immutable object that once created 
		 * CANNOT be changed, as it is a final class.
		 * So with all string methods of the string calss we
		 * are creating a NEW string object.
		 * A StringBuilder object is a mutable string that 
		 * CAN be changed. The methods of the StringBuilder class
		 * can change the object (a lot of methods of the String
		 * also exist in the StringBuilder class and are called the
		 * same name and have the same function)
		 */
		//this is the only way you can create a StringBuilder
		StringBuilder sb1=new StringBuilder("Some text");
		//can't assign a string to a stringbuilder object
		//sb1="some more text";//will not compile
		//StringBuilder sb2="will not comipile";//will not compile
		String str="some more text";
		//sb=str;//will not compile
		/*
		 * this is assigning an existing StringBuilder to a new #
		 * StringBuilder reference
		 */
		StringBuilder sb2=sb1;
		System.out.println();
		/*
		 * StringBuilder, like String, is an array of chars. 
		 * with StringBuilder the initial length of all StringBuilder
		 * objects is 16
		 * that means by default we have a string of size 16 chars
		 * storing out stringbuider object, so every time we go one
		 * over 16 a new string object is being created IN THE background
		 */
		/*
		 * this starts off our initial char array inside the StringBuilder
		 * class to be of length 50
		 */
		StringBuilder sb3=new StringBuilder(50);
		sb3=new StringBuilder("that right");
		
		System.out.println("our string builder sb is "+sb1);
		System.out.println("sb3 is "+sb3);
		/*
		 * this is creating a stringBuilder object by using the
		 * constructor in the StringBuilder class that takes a
		 * StringBuilder object
		 * you can create a stringBuilder object by passing a string
		 * or another stringbuilder object
		 */
		StringBuilder sb4=new StringBuilder(sb1);
		System.out.println(sb4);
		//you can create a blank stringBuilder
		StringBuilder sBlank=new StringBuilder();
		//just like you can create a blank string
		String myStr="";
	}//end of ex1
	
	static void ex2() {
		System.out.println("append");
		/*
		 * append() adds to the end of the StringBuilder object.
		 * this method CHANGES the stringbuilder object calling it
		 * append() is not available to the String class
		 */
		StringBuilder sb1=new StringBuilder("Toy ");
		System.out.println(sb1);
		sb1.append("Story");
		System.out.println("sb1 is now "+sb1);
		/*you can append any type of data to a StringBuidler object
		 */
		sb1.append(true);//appending a boolean
		System.out.println(sb1);
		sb1.append('!');//appending a char
		System.out.println(sb1);
		sb1.append(234);//appending an int
		System.out.println(sb1);
		sb1.append(2.34);//appending a double
		System.out.println(sb1);
		
		sb1=new StringBuilder("my StringBuilder ");
		
		Dog spot=new Dog();
		/*
		 * this takes the toString() method from the Object
		 * class (superclass) and just prints out the address
		 * of this object, which in my case is 
		 * com.android.Dog@7852e922
		 */
		System.out.println("spot is "+spot);
		/*
		 * this takes the toString() method from cat class, that
		 * overrides the Object class toString() method, and 
		 * prints out the name and age of the cat
		 */
		Cat tibbles=new Cat(10,"tibbles");
		System.out.println("tibbles is "+tibbles);
		//this appends the address of spot onto sb1
		System.out.println(sb1.append(spot));
		/*
		 * this appends the string that is returned from the
		 * toString() method of the Cat class, when tibbles is
		 * placed in a print statement. which will be the name
		 * and age of the cat. SB1 IS CHANGED 
		 */
		System.out.println(sb1.append(tibbles));
		
		String greeting="hello there ";
		//greeting is NOT CHANGED
		//but prints out "hello there cat age is 10 name is tibbles"
		System.out.println(greeting+tibbles);
		
		StringBuilder sb5=new StringBuilder("hi");
		StringBuilder sb6=new StringBuilder();
		/*
		 * you can append an array of chars to a 
		 * stringbuilder object
		 */
		char[]name= {'j','a','v','a'};
		System.out.println(sb5.append(name));
		sb5=new StringBuilder("hi");
		/*
		 * this will append from the name array from index position
		 * 1 to index position 3, which is the word "ava"
		 * sb5 is hi, append "ava" we get
		 * "hiava"
		 */
		System.out.println(sb5.append(name,1,3));
		/*
		 * sb5 is now changed to "hiava"
		 */
		System.out.println(sb5);
		/*
		 * if you want to add anything to a stringBuilder you
		 * have append it
		 */
		//sb5=sb5+sb6;//will not compile
		sb5=sb5.append(sb6);
		/*
		 * however you can add a stringbuilder to a string
		 * (as anything after a string in print statement
		 * is considered to be a string unless in brackets)
		 */
		String str="hello "+sb6;
	}
	
	static void ex3() {
		StringBuilder sb1=new StringBuilder("hello");
		/*
		 * Insert
		 * inserts text or any other primitive data type or object
		 * into certain locations in your StringBuilder object
		 */
		System.out.println("insert");
		sb1.insert(2, "NO");
		System.out.println(sb1);//produces heNOllo
		sb1.insert(3, 34);//will produce heN34Ollo
		System.out.println(sb1);
		//sb1.append(sb1.insert(3, 34));
		//System.out.println(sb1);
		Cat newCat=new Cat(4,"tom");
		sb1.insert(4, newCat);
		System.out.println(sb1);
		
		sb1=new StringBuilder("hello");
		//this is exactly the same as append, even though index
		//positions go from 0 to 4
		sb1.insert(5, "there");//"hellothere"
		/*
		 * this will insert at the beggining of your stringBuilder
		 */
		sb1.insert(0, "nice");//"nicehellothere"
		System.out.println(sb1);
		sb1=new StringBuilder("hello");
		/*
		 * this will produce a StringIndexOutOfBoundsException
		 * as there is not position 6
		 */
	//	sb1.insert(6, "not right");
	}
	
	static void ex4() {
		StringBuilder numSb=new StringBuilder("0123456789");
		System.out.println("delete");
		/*
		 * delete
		 * delete removes the characters in a substring of the 
		 * specified StringBuilder object
		 * this deletes 2,3, BUT NOT 4 from position 2 UP TO 
		 * POSITION 4 BUT NOT INCLUDING IT
		 * 
		 */
		numSb.delete(2, 4);
		System.out.println(numSb);
		
		numSb=new StringBuilder("0123456789");
		/*
		 * you can have your "endpoint" after the last index
		 * here we only have 10 characters and we have an end point
		 * of 1000, this will delete everything from index position
		 * 4 onwards
		 */
		System.out.println(numSb.delete(4, 1000));
		/*
		 * if the start point is greater than the amount of elements
		 * in our stringbuilder, you will get StringIndexOutOfBoundsException
		 * we only have 10 chars in our stringBuilder and our start point
		 * is 12 here
		 */
		//System.out.println(numSb.delete(12, 67));
	//	numSb.append("mary had a little lamb").delete(3,12);
	//	System.out.println(numSb);
		
		String myStr="noel";
		/*
		 * this gives StringIndexOutOfBoundsException
		 */
		//System.out.println(myStr.charAt(5));
		
		numSb=new StringBuilder("0123456789");
		System.out.println("deleteCharAt");
		/*
		 * deleteCharAT removes a single character at a 
		 * specified location
		 */
		numSb.deleteCharAt(1);
		System.out.println(numSb);
		/*
		 * there is no trim method with StringBuilder
		 * there is no concat method with StringBuilder
		 */
		numSb=new StringBuilder("0123456789");
		System.out.println("reverse");
		numSb.reverse();//this reverses the text
		System.out.println(numSb);//9876543210
		
		System.out.println("replace");
		/*
		 * replaces a String in our StringBuilder object at a 
		 * specified locatoin
		 */
		numSb=new StringBuilder("0123456789");
		numSb.replace(0, 1, "ABCD");
		System.out.println(numSb);//ABCD123456789
		numSb=new StringBuilder("0123456789");
		/*
		 * starts at index position 2 and goes UPTO position 7 but 
		 * does not include position 7
		 */
		numSb.replace(2, 7, "hello");
		System.out.println(numSb);//01hello789	
	}
	
	

}
