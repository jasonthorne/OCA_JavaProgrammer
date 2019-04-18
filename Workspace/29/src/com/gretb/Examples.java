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
		
		//different methods of the same class:
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
		System.out.println(str4.substring(2, 9)); //prints out "mpty du". it doesnt include the 'm' as 'm' is at position 9.
		
		
	
	}
	
}
