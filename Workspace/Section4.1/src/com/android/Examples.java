package com.android;

public class Examples {

	static void ex1(){
		
		/*when you create a string by assigning it a value, you place the text in what's called a string pool.
		 * So the name "pat" is put into a particular location in RAM. */
		String name1 = "pat";
		
		/*Every time ANOTHER new string is created by assigning a value directly to a variable, 
		 * it first checks the string pool to see if the string value already exists (case sensitive),
		 * If so, it assigns its reference to that string value */
		String name2 = "pat"; 
		
		System.out.println(name1==name2); //checks if they're the SAME OBJECT
		System.out.println(name1.equals(name2)); //checks if they've the same value
		
		//apple is added to sting pool
		String fruit = returnString();
		
		//======
		
		/*Using the 'NEW' keyword to create a string, that string is NOT added to the pool, 
		and also that variable doesn't check the pool to see if a string is already in the pool.*/
		String str1 = new String("bob");
		String str2 = "bob"; 
		
		String str3 = new String("bob");
		
		//++++++++++++++++++++++++++++++++++++++++++
		//if you want to check if 2 strings are the same, you should NOT use this method:
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		//use THIS METHOD to check the values of strings (case sensitive): //+++++++++++++++++++++++++++++++++++
		System.out.println("Using equals method with a String: " + str1.equals(str2)); //'true' as the equals method in the string class checks value
		System.out.println("Using equals method with a String: " + str1.equals(str3)); 
		
		
		str1 = "paddy";
		str2 = "Paddy";
		System.out.println("check paddies: " + str1.equals(str2)); //checks if they've the same values
		System.out.println("check paddies: " + str1.equalsIgnoreCase(str2)); //checks if they've the same values IGNORING CASE
		
		/*
		 * If you want to find out if two strings are the same you should ALWAYS use .equals, not ==
		 */
		
		char[]names1 = {'c', 'o','l','m'};
		char[]names2 = {'m', 'a','r','y'};
		String man= new String(names1); //calling the String classe's constructor, which can take an array of chars. +++++++++++++++++++++++++++
		String woman= new String(names2);
		
		
	}
	
	
	
	static String returnString() {
		return "apple";
	}
	
	
	static void ex2() {
		/*
		 * Methods of the string class. +++++++++++++++++++++++++++++++++NEED TO KNOW ALL OF THESE FOR THE EXAM!!
		 * 
		 * String class is an immutable class. An immutable class is a FINAL CLASS, so methods of a String class DO NOT CHANGE A STRING,
		 * they return a NEW STRING. 
		 */
		
		
		String str = "yo dawg!";
		
		//the REPLACE method takes 2 chars, firsts arg is what to replace, 2nd is what to replace it with:
		System.out.println(str.replace('!', '?')); //This DOESNT REPLACE the string you've called it on. just returns the result++++++++++
		
		/*
		 * Once you've created you can't change a String, you can assign a new value to it, but not change the string.
		 */
		
		
	}
	
	
	
	static void ex3() {
	
		//=======================================================charAt()
		
		
		String name = "paul";
		
		System.out.println("\ncharAt();");
		
	/*
	 * char() shows what character is at a particular index in a string. Numbering in a string is array numbering, so it starts at 0.
	 */
		System.out.println("at position 0: " + name.charAt(0)); 
		System.out.println("at position 3: " + name.charAt(3));
		
		//gives exception as it only has 4 characters, so numbering goes from 0 to 3.
		//name.charAt(4);
		
		//=======================================================length()
		
		System.out.println("\nlength();");
		
		//gives the length of a string:
		System.out.println("length of string: " + name.length()); 
		System.out.println(name.charAt(name.length()-1)); //-1 needed, as length is 4, but array is 0 indexed, giving out of bounds exception.
		
		//=======================================================indexOf()
		
		System.out.println("\nindexOf();");
		
		String nursery = "Mary had a little lamb, her fleese was white as snow, and everywhere that Mary went, her lamb was sure to go";
		
		//shows the first occurrence of char (or set of chars) in a string. 
		
		System.out.println(nursery.length()); //108 (including spaces) so indexing goes from 0 - 107
		
		System.out.println("first h in nursery: " + nursery.indexOf('h'));
		
		System.out.println("first occurance of 'lamb' is at pos: " + nursery.indexOf("lamb"));
		
		
		//this will start our search at pos 22:
		System.out.println("second occurance of 'lamb' is at pos: " + nursery.indexOf("lamb", 22));
		
		//search for second occurrence of 'lamb', using (first occurrence + 1) as the start point. 
		System.out.println("second occurance of 'lamb' is at pos: " + nursery.indexOf("lamb", nursery.indexOf("lamb")+1));
		
		//if index of() can't find a particular string, it will return -1.
		System.out.println("Search of Z" + nursery.indexOf('z'));
		
		//=======================================================substring()
		
		System.out.println("\nsubstring()");
		
		
		//There are a few overloaded substring() methods. The first type takes as an arg, the starting pos index:
		String exam="oracle";
		String cut=exam.substring(2);
		System.out.println(cut); //prints: acle
		
		
		String cut2=exam.substring(2, 4); //start at pos 2, go up to but NOT INCLUDING 4 /++++++++++++++++++++++++++++++++WILL PROBABLY BE IN EXAM!!! 
		System.out.println(cut2); //prints: ac
		
		//=======================================================trim()
		
		System.out.println("\ntrim()");
		
		//Gets rid of the trailing spaces in a string (any spaces at the beginning and end of a string. NOT spaces between words)
		
		name="  Tom Jones  ";
		
		System.out.println("****"+name+"****");
		System.out.println("****"+name.trim()+"****");
		
		
		//=======================================================replace()
		
		System.out.println("\nreplace()");
		
		//Replaces a character or string with another character or string
		
		name="tommy";
		cut=name.replace('m', 'z'); //replaces the m's with z's
		System.out.println(cut);
				
		String str="the quick brown fox jumped over the lazy fox";
		cut=str.replace("fox", "wolf");
		System.out.println(cut);
		
		//this doesnt change anything, just prints out the string:
		System.out.println(str.replace("yo", "jam"));
		
		//You CANT replace a string with a char or vice versa:
		//cut=str.replace("fox", 'f'); //doesnt compile
		
		
		//=======================================================endsWith() & startsWith()
		
		System.out.println("\nendsWith() & startsWith()");
				
		str="ABCAB";
		
		//startswith:
		
		//these methods return a boolean. ALWAYS take a string (NOT a char)
		System.out.println(str.startsWith("AB")); //true
		System.out.println(str.startsWith("a")); //false
		
		//checking the position as well (pos 3):
		System.out.println(str.startsWith("A", 3)); //true
		
		//endsWith:
		
		System.out.println(str.endsWith("AB")); //true
		System.out.println(str.endsWith("A")); //false
		
	}
	
	static void ex4() {
		
		//METHOD CHAINING ++++++++++++++++++++++++++++++
		
		String str1 = "hello";
		String str2 = "there";
		
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		
		System.out.println("METHOD CHAINING:");
		
		String myDay = ("    sunday    ");
		
		
		System.out.println("***"+myDay.trim().replace('d', 'z').concat("men")+"***");
		
		
		
		//'monday' - replace 'm' with 't', add 'day' to end. get a substring that starts  at pos 2, and up to pos 6.
		
		String day= "monday";
		//day=day.
		
		
		//'saturday' -get a substring that starts  at pos 3, and up to pos 7. replace u with o, then add 'day' to the end
		
		
	}
	
	
	static void ex5() {
		System.out.println("simple word character count:");
		
		String str=" the quick brown fox jumped over the lazy dog ";
		
		//count the characters (excluding spaces) in this sentence, count the words in the sentence.
		
		str = str.trim(); //remove spaces before or after the space
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)== ' ') {
				count++;
			}
		}
		
		System.out.println("count is: " + count);
		System.out.println("ammount of words is: " + ++count);
	}
	
	
	
		
	static void ex6() {
		
		String poet = "Wordsworth";
		
		/*
		 * Methods of the String class always produce a NEW String, 
		 * which means they are NOT added to the pool or they do NOT check the pool to see if string already exists. 
		 */
		
		
		String str1 = poet.substring(5); //produces NEW word 'worth' (so not added to string pool)
		System.out.println(str1);
		
		String str2 = poet.substring(5); //produces NEW word 'worth'  (so not added to string pool)
		
		System.out.println(str1.equals(str2)); //true, as they both contain the word 'worth'
		
		/*this will be false as subString() produces a NEW string. 
		 * It uses the NEW keyword to create a new string, and anytime the new keyword is used to create a string it is NOT placed in the pool.
		 */
		System.out.println(str1==str2);
		
		String str3 = "worth";
		
		/*
		 * This will be false as str1 was not placed in the pool, as it was created using a method of the string class.
		 */
		
		System.out.println(str1==str3);
		
		/*
		 * This will be true as str1 and str3 both contain the word "worth"
		 */
		
		System.out.println(str1.contentEquals(str3));
		
		String str4 = "worth";
		
		System.out.println("str3==str4: " + (str3==str4)); //true asstr3 added 'worth' to pool
		
	}
	
	static void ex7() {
		
		/*
		 * With strings you can only use certain operators, namely concatenation:
		 * +,+=
		 */
		
		String name="Mary"; 
		
		name +=" fahey"; //this is the same as name = name+"fahey"
		
		System.out.println(name);
		
		
		/*and equallity:
		 * ==,
		 * != checks to see if they are not the same object
		 */
		
		
		String str1 = "apple";
		String str2 = new String("apple");
		
		//this will return true as they are NOT the same object:
		System.out.println(str1!=str2);
		
		
		//===========================
		
		String aString = "santa " + "claus" + " is coming to town";
		System.out.println(aString);
		
		
		int num1 = 10;
		int num2 = 30;
		
		 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//When you encounter a string in a print statement, everything AFTER that is treated as a string. everything BEFORE that is treated as its original data type
		System.out.println(num1 + num2 +aString);
		
		System.out.println(aString+num1+num2); //this will treat the numbers AFTER the string as strings, so concatenates them.
		
		//how ot add the numbs after they follow the string;
		System.out.println(aString+(num1+num2));
		
		
		Dog spot = null;
		System.out.println(spot);
		
		//if you try to print a null object with a NON STRING data type, you will get an error:
		//System.out.println(spot+null);
		
		
		//When you use a null with a string in a print statement, it will convert the the null object to the string "null":
		
		//this will work
		System.out.println(spot + " yo dawg!");
		
		//as will this:
		System.out.println(null + " yo dawg!");
		
		//this wont, as you've other data types BEFORE the null. You have to have the null AFTER the string
		//System.out.println(10+20+null + "yo dawg!");
		
		//this is the right way:
		System.out.println(10+20+ "yo dawg!"+null);	
		
		
	}
	
	
}
