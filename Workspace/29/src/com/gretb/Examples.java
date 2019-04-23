package com.gretb;

public class Examples {
	
	static void ex1() {
		
		//Strings and the methods of the String class
		
		//three references to the same String object.
		//When a string obj is created, java checks string pool for pre existing string obj with same value. If found it adds a reference of new var to that obj.
		String str1="hello";
		String str2="hello";
		String str3="hello";
		
		System.out.println("are these objects the same, using '==': " + (str1==str3)); //BAD way of comparing ++++++++++

		System.out.println("are these objects the same, using '.equals()' : " + (str1.equals(str3))); 
		
		//if you use the NEW keyword when creating a string, it doesn't check the string pool and isnt added to the string pool:
		String str4= new String("hello");
		System.out.println("comparing one NEW string with string using '==': " + (str1==str4)); 
		
		System.out.println("comparing one NEW string with string using '.equals()' : " + (str1.equals(str4))); 
		
		//Always use '.equals' instead of creating 'new' for strings+++++++++++++++++++
		
		//=======================================different methods of the same class: ====================================
		
		System.out.println("\n***Trim***");
		str3 = "    pat    ";
		System.out.println(str3);
		
		//trim is a method that gets rid of any trailing spaces:
		str3 = str3.trim();
		System.out.println(str3);
		
		System.out.println("\n***Concat***");
		//concat (joins strings):
		System.out.println(str3.concat(str2));
		
		//Substring
		System.out.println("\n***Substring***");
		str4="humpty dumpty";
		
		//displays part of your string using numbering, so it starts at 0, and goes up to 8, BUT NOT INCLUDING 8.
		System.out.println(str4.substring(0, 8)); //prints out "humpty d". it doesnt include the 'u' as 'u' is at position 8.
		System.out.println(str4.substring(2, 13)); //prints out "mpty du". it doesnt include the 'm' as 'm' is at position 9.
		
		//this is an overloaded substring method that prints everything from position 3 onwards:
		System.out.println(str4.substring(3));
		
		//Length
		System.out.println("\n***Length***");
		System.out.println(str4.length()); //includes the space as space is a character.
	
		//ChatAt
		System.out.println("\n***ChatAt***");
		System.out.println(str4.charAt(2)); //shows the character at given position
		
		//indexOf
		System.out.println("\n***indexOf***");
		System.out.println(str4.indexOf('u')); //shows the character at given position
		
		String myString1 = "jason";
		String myString2 = "JASON";
		
		//System.out.println(myString1.equals(myString2)); //will be false due to case
		
		System.out.println("\n***equalsIgnoreCase***");
		System.out.println(myString1.equalsIgnoreCase(myString2));
		
		
		Cat tibbles = new Cat(2, "Tibbles", 2.5);
		System.out.println("name of cat: " + tibbles.name);
		System.out.println("age of cat: " + tibbles.age);
		System.out.println("weight of cat: " + tibbles.weight);
		
		tibbles.age = 500; //can change name
		//tibbles.name = "woo"; //CANT DO THIS as its 'final'. 
		

	}
	
	static void ex2() {
		//STRING BUILDERS (The methods of the stringBuilder class DO change the value of the String. They're not with a normal string, as normal string class is FINAL)
		
		System.out.println("String Builders");
		
		/*
		 * The string class is final, or can be said to be immutable. Once you create a String, any methods of the sgring class doesnt vhange the original string. 
		 * 'StringBuilder' is a type of string class that IS mutable. (not final)
		 * This means that the methods of the StringBuilder class can change the text inside a StringBuilder object.
		 * 
		 */
		
		StringBuilder sb = new StringBuilder("Yo dawg"); //this is the BEST way to create a StringBuilder.
		
		System.out.println("before change StringBuilder is: " + sb);
		
		sb.append(10);
		sb.append("top");
		sb.append(true);
		sb.append(2.88);
		System.out.println("after append() change StringBuilder is: " + sb);
		
		System.out.println(sb.reverse().append("hi"));
		
		
		
		
	}
	
	
	
	
}
