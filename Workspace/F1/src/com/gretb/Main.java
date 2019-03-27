package com.gretb;
/**
 * you can put comments anywhere
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		//this is a single line comment, this text is ignored
		/*
		 * this is a multi line comment anything between the opening
		 * and closing slash * is considered a comment
		 * here is another line
		 */
		/**
		 * javadoc comment
		 * this is a multiline comment that can be used to produced 
		 * documents automatically
		 */
		/*
		 * this is how we print out a piece of text. All text has to be
		 * inside the opening and closing brackets, and all text has
		 * to be enclosed in double quotation marks.
		 * every line of code has to finish with a semi colon ;
		 * ctrl+s will save the file
		 * ctrl+f11 will run the file
		 * every time we use system.out.println, we are inserting
		 * a new line
		 */
		System.out.println("hello there this is me Noel");
		System.out.println("this is our second line of code");
		System.out.println("this is third line of code");
		System.out.println();
		System.out.println("here is some text for our fourth line");
		/*
		 * when you don't use quotation marks around numbers
		 * it treats them as numbers, so this will print out
		 * 5
		 */
		System.out.println(3+2);//5
		/*
		 * java knows the precedence of operators in maths, multipication and
		 * division before addition and subtraction
		 */
		System.out.println(2*12);//24
		System.out.println(2+30/2);//17
		/*
		 * when you put anything inside double quotes, it becomes a string,
		 * so this will print out 2*12. a String is a piece of text
		 */
		System.out.println("2*12");
		/*
		 * when we first declare variables we have to supply a name and a type.
		 * here we give a the variable a type of int, which is an integer which is a whole
		 * number (no decimal points) between -4 billion and plus 4 billion. the name
		 * of this variable is num.
		 */
		int num=12234;//initialising our variable, which is given it an initial value
		System.out.println(num);
		num=12;
		System.out.println(num);
		
		int x=45;
		int a=67;
		/*
		 *when you put a plus symbol '+' after a string, this is NOT the addition operator
		 *but is a concatenator, which JOINS the text with whatever is after the text
		 *so in this example we have the text 'our number is ' followed by the variable
		 *num which is 12
		 */
		System.out.println("our number is "+num);
		/*
		 * these 'numbers' are still all only text, so we can't add them
		 */
		System.out.println("our new number is "+45);//will print 45
		System.out.println("our two numbers added up is "+12+num);//1212
		System.out.println("our two numbers added up is "+x+num+a);//451267
		/*
		 * if you place your numbers and the calculation in another set of brackets
		 * this calculation will be treated as  numbers and then added to our text.
		 * rule of thumb across all java is do INNER brackets FIRST
		 * this is 12 + 45 which gives us 57
		 */
		System.out.println("our numbers added up in BRACKETS "+(num+x));
		/*
		 * num is 12
		 * x is 45
		 */
		int sum=num+x;
		System.out.println("sum is "+sum);//will print out 57
		num=200;
		sum=num+x;
		System.out.println("sum is new "+sum);
		sum=56+300;
		/*
		 * ints as already go from -2.14 billion to + 2.14 billion
		 */
		int big=-2100000000;
		/*
		 * double is for decimal places
		 */
		double dnum=3.45;
		dnum=5;
		/*
		 * plus or minus 256 whole numbers
		 */
		byte bnum=23;
		/*
		 * plus or minus 32000 whole numbers
		 */
		short snum=4567;
		/*
		 * every number with a decimal point in java is by default a double, and a
		 * double is BIGGER than a float, so this
		 * float fnum=3.45
		 * will not compile
		 * as we are trying to assign a double data type (3.45) to a varialbe that is
		 * a smaller float data type
		 */
		float fnum=(float)3.45;
		
		long lnum=5650;
		/*
		 * long goes to +-9.2 and 17 0's
		 * when its a long, you have to put an L at the end of the
		 * number
		 */
		/*
		 * characters are SINGLE characters, and you use single quotation marks with
		 * them
		 */
		char myChar='A';
		myChar='a';
		myChar='?';
		/*
		 * this is the ASCII keycode for 'C'
		 */
		myChar=67;
		System.out.println("this characters is "+myChar);
		/*
		 * a boolean is either only true or false
		 */
		boolean myBool=true;
		myBool=false;
		
		
		System.out.println("our boolean is "+myBool);
		
		
	
		
	//	num=3.45;
		//num=12000000000;
		
/*		double wages=234.56;
		
		System.out.println("ronaldis wages are "+wages);
		double wages2=678.90;
		System.out.println("alans wages are "+wages);
		*/
		
		
	

	}
	
	

}
