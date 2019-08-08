package com.android;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Exam Objective 9.5 write a simple lambda expression that consumes a
 * lambda predicate expression
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer>intList=new ArrayList<>();
		ArrayList<Bird>birdList=new ArrayList<>();
		ArrayList<Dog>dogList;
		/*
		 * this is creating a Box with the generic type Dog
		 * this means that the variable T myVar becomes 
		 * Dog myVar
		 */
		Box<Dog>dogBox=new Box<>();
	
		/*
		 * this is creating a Box with the generic type Cat
		 * this means the variable T myVAr becomes
		 * Cat myVar
		 */
		Box<Cat>catBox=new Box<>();
		/*
		 * this is creating a Box with the generic type String
		 * this means variable T myVar becomes
		 * String myVar
		 */
		Box<String>strBox=new Box<>();
		
		Box<ArrayList>arraylistBox=new Box<>();
		
		Box<Object>objList=new Box<>();
		
		Dog spot=new Dog();
		spot.bark();//own method from Dog class
		spot.lambda1(12, 56);//abstract method from behaviour interface
		spot.method1();//default method from behaviour interface
		/*
		 * Dog implements behavout so that means that all abstract 
		 * methods in the Behaviour interface, have to be overriden
		 * in the Dog class. So object only has access to the abstract
		 * and default methods of the interface Behaviour (but we don't
		 * care about the default methods)
		 */
		Behaviour myBehave=spot;
		Behaviour myBehave2=new Dog();
		myBehave.lambda1(34,78);
		System.out.println("Lambdas");
		/*
		 * Lambdas can only be created from interfaces that have ONLY ONE
		 * ABSTRACT METHOD INSIDE THEM, they can have as many default and 
		 * static methods as you like, these will not affect the lambda
		 * lambdas always starts with a interface reference (left hand
		 * side). On the right hand side of the assignment operator (=) we
		 * have to put a parameter list enclosed in parenthesis, which 
		 * will match the variables in the parameter in the abstract method
		 * in the interface,
		 * the abstract method in the behaviour interface is called lambda1
		 * whihc takes two ints.
		 * the structure is reference type on left followed by assignment
		 * followed by parameter list which has to be the same as the 
		 * only abstract method in the Behaviour, which is the method
		 * int lambda1(int a,int b);
		 * followed by a ->
		 * followed by curly brackets, which will be the body of the 
		 * lambda1 one method
		 * 
		 */
		Behaviour b1=(int num,int num2)->{
			System.out.println("b1 behaviour lambda1 called");
			int sum=num*num2;
			return sum;
		};
		System.out.println("b1.lambda1(45,20) "+b1.lambda1(45,20));
		/*
		 * this is the long form of lambda syntax
		 */
		Behaviour b2=(int num,int num2)->{
			System.out.println("b2 behaviour lambda1 called ");
			int sum=num+num2;
			return sum;
		};
		
		System.out.println("b2.lambda1(45,20) "+b2.lambda1(45,20));
		
		System.out.println("Short form of lambda syntax");
		/*
		 * we are implementing the lambda1 abstract method in the Behaviour
		 * interface, that takes two ints and returns an int. if your 
		 * lambda only has ONE line of code, you do need to put in curly
		 * brackets
		 * this lambda is taking two ints (we do not have to put in the
		 * type as java knows the type as there is only one abstract
		 * method in Behaviour), you do HAVE To have two variables in
		 * the parameter list in this case, because lambda1 has two
		 * variables in it's parameter list, these varialbes can be
		 * given ANY name.
		 * We only have one line of code in this lambda, so the line of
		 * code has to return an int in this case, as the method lambda1
		 * defines a retrun type of an int
		 */
		Behaviour b3=(num,num2)->num+num2*num-num2;
		System.out.println("b3.lambda1(4,5) is "+b3.lambda1(4, 5));
		//the body of the lambda does not return an int, so not compile
		//Behaviour b4=(a,b)->System.out.println("does not compile");
		/*
		 * will not compile as if you have a curly brackets, and this
		 * method is returning something, you have to have a return
		 * 
		 */
		//Behaviour noB=(num,num2)->{num+num2*num-num2;};
		/*
		 * here we have curly brackets and this method returns an int,
		 * so we need a return statement and also we need a semi colong
		 * after each line of code inside the curly(remove semi colon after
		 * a++ to see error
		 */
		Behaviour b6=(a,b)->{return a+b/a*a++;};
		/*
		 * this does not compile as lambd1 one method takes two variables
		 * this lambda only take ONE variable, a
		 * will not compile
		 */
		//Behaviour b4=(a)->a+a;
		/*
		 * if you have more than one line of code in your lambda body
		 * you need curly brackets
		 */
		Behaviour b4=(a, b)->{
			System.out.println("more than one line of code");
			int sum=a*b;
			return sum;
		};
		System.out.println(b4.lambda1(77, 99));
		/*
		 * can also use this object to access the default methods of the
		 * Behaviour interface (but not really recommended)
		 */
		b4.method1();
		b4.method2();
		//cannot access static methods through a lambda
	//	b4.statMethod();
		//only way to access a static method of a interface
		
		Behaviour.statMethod();
		System.out.println("*******takeLam called");
		takeLam(2,"hello there",b1);
		takeLam(4,"oranges",b3);
		takeLam(6,"Apples",new Dog());
		Behaviour behaveDog=new Dog();
		takeLam(99,"astronaut",behaveDog);
		
		//ed has an atribute called myBehave, which we access by ed.myBehave
		Employee ed=new Employee(40,"ed",4,b1);
		//edel has an atribute called myBehave, which we acces by edel.myBehave
		Employee edel=new Employee(52,"edel",8,new Dog());
	//	ed.myBehave.lambda1(7,8);
		/*
		 * this  uses the b1 lambda which multiples our two numbers
		 * by each other
		 */
		System.out.println("ed.myBeahve.lambda1(7,8) "+ed.myBehave.lambda1(7,8));
		/*
		 * this uses a Behaviour reference to a Dog object and calls
		 * the Lambda1 method in the Dog class, which will print out
		 * lambda1 dog method called and return the number 0
		 */
		System.out.println("edel.myBehave.lamba1(7,8) "+edel.myBehave.lambda1(7,8));
		/*
		 * each one of these lambdas is in effect overriding the 
		 * sad() method from the Behaviour interface
		 */
		Emotion e1=()->{//sad method
			System.out.println("Sad Emotion e1 lambda called");
		};
		
		Emotion e2=()->{//sad method
			System.out.println("Sad Emotion e2 lambda called");
		};
		
		Emotion e3=()->{//sad method
			System.out.println("Sad Emotion e3 lambda called");
		};
		e1.sad();
		e2.sad();
		e3.sad();
		
		System.out.println("long form validatePerformance");
		/*
		 * based on the Validate interface which has one abstract metho
		 * called check which looks like this
		 * boolean check(Employee emp);
		 * check takes an Employee and returns a boolean
		 */
		Validate validatePerformance=(Employee emp)->{
			/*
			 * each employee has a rating, but this is a private variable
			 * so we use the public getter getRating to get the rating of
			 * the employee and return true if greater than 5 false
			 * if not
			 */
			if(emp.getRating()>5)
				return true;
			else
				return false;
		};
		System.out.println("does ed make the standard ");
		System.out.println(validatePerformance.check(ed));
		System.out.println("does edel make the standard");
		System.out.println(validatePerformance.check(edel));
		
		
		System.out.println("short form validatePerformance");
		/*
		 * emp is a Employee object
		 * this is exactly the same as the above. if your abstract method
		 * has only one variable, you do not need to put that one variable
		 * in closing braces, we dont' need brackets around emp like so
		 * (emp)->emp.getRating()>5, but it's not an error to do so
		 */
		validatePerformance=emp->emp.getRating()>5;
		System.out.println("does ed make the standard short ");
		System.out.println(validatePerformance.check(ed));
		System.out.println("does edel make the standard short");
		System.out.println(validatePerformance.check(edel));
		/*
		 * this is implmenting the Test method in the manners interface
		 * which has a method signature of
		 * boolean test(T t)
		 * T is a generic data type that is defined when we create the 
		 * Manners interface by going interface Manners<T>{
		 * when creating a lambda for the test method, we supply a data
		 * type (Employee) so that T becomes an Employee in the parameter
		 * list and the implementation. T can be ANY data type
		 */
		System.out.println("Manners interface");
		//<Employee> tells java what type T will be
		Manners<Employee>myMood=(Employee emp)->{
			System.out.println("lambda of the test method in Manners");
			System.out.println("in the Manners interface that has a generic "
					+ " type T");
			return emp.getRating()>5;
		};
		
		System.out.println(myMood.test(ed));
		System.out.println(myMood.test(edel));
		/*
		 * this is lambda that uses a String to implement the Test method
		 * in the Manners interface, this is the shortened version and
		 * only one variable in the parameter list so don't need braces
		 * around str
		 */
		Manners<String>myMood2=str->str.length()>6;
		String myStr="supercalifragilisticexpalidiious";
		System.out.println("String longer than 6 chars "+myMood2.test(myStr));
		myStr="hello";
		System.out.println("is string longer than 6 "+myMood2.test(myStr));
		/*
		 * there is a built in interface called Predicate, which looks 
		 * like this
		 * public interface Predicate<T>{
		 * 		boolean test(T t);
		 * }
		 * this takes ANY DATA TYPE (except primitives) type and 
		 * returns a boolean HAS TO BE BOOLEAN
		 * (exact same structure as the test method
		 * in the Manners interface we have, BUT IT IS NOT THE SAME METHOD)
		 * we have to import this interface (like we import the 
		 * classes to do with Dates and Arraylists, see top of file
		 * 
		 */
		Predicate<Employee>predEmployee=(Employee emp)->{
			System.out.println("Predicate with Employee data type");
			return emp.getRating()>5;
		};
		System.out.println(predEmployee.test(ed));
		System.out.println(predEmployee.test(edel));
		
		
		
	}//end of main method
	/*
	 * this is a method that takes an int, String and an object with 
	 * a Behavior reference. Which can be:
	 * a Object of a class that implements the Behaviour reference (A dog)
	 * a lambda that implements the directly implements the abstract method
	 * in the Behavior (b1,b2,b3,b4,b6)
	 * or a behavior reference to a object that imeplements the Behaviour
	 * interface
	 */
	static void takeLam(int num,String str,Behaviour myB) {
		System.out.println("string is "+str);
		System.out.println("number is "+num);
		System.out.println("product of lamdba is "+myB.lambda1(num, num));
	}
	
	

}
