package com.building;
/*
 * the access levels are
 * private - only in same class
 * default/package - only in same package, no keyword for this, if
 * no access level defined then it is default level access
 * protected - available in same package or in a derived class
 * public - available to all packages - you still have to import or 
 * use the fully qualified name
 * only two access levels allowed for Top level classes (this is a class
 * that is not within another class). The access levels allowed are
 * public and default(there is NO KEYWORD for default leve access)
 */
public class Animal {
	/*
	 * this variable is only available within the Animal package.
	 * if we want to access this variable, outside of this class, we 
	 * create a public getter() method, which will return the value
	 * of age
	 */
	private int age;
	/*
	 * package level access which means only classes within the current
	 * package will have access to this variable.
	 * so only the Access class, the Cat class and the Zebra class
	 * will have access to this variable, as these classes are also
	 * in com.buidling
	 */
	double weight;
	/*
	 * this protected variable is available to all classes within the 
	 * same com.building package. So these variables are 
	 * available again to Access, Dog and Zebra. We are going to 
	 * extend the Dog class from Animal
	 * class Dog extends Animal
	 * which means that Dog also has access to the protected variable
	 * height, even though it is in the com.cannine package
	 */
	protected double height=5.2;
	/*
	 * is available to all classes regardless what package they are in.
	 * you still have to import the Animal class to be able to access
	 * the public variables of the Animal class
	 */
	public String name="spot";
	
	//only an inner class can be private
	private class Heart{
		
	}
	//only an inner class can be protected
	protected class Lungs{
		
	}
	/*
	 * if the only constructor in your class is private, its is 
	 * IMPOSSIBLE to create a member of this class i.e if the Animal
	 * class only has one private no argument constructor means 
	 * we can't create an Animal outside of the Animal class
	 */
	public Animal(){
		System.out.println("private constructor called");
	}
	/*
	 * this is a constructor that will be available to all other classes
	 * regardless of what package they are in. if you want to create
	 * a Animal outside of this package, you HAVE to have a public
	 * constructor
	 */
	public Animal(int age) {
		/*
		 * when we use the this() keyword inside a constructor it means
		 * we are calling another constructor in the same class.
		 * here this() means we're looking for a constructor in the
		 * Animal class, which takes no variables.
		 * you issue a call to one other constructor and it has to
		 * be the FIRST STATEMENT inside the constructor
		 */
		this();
		/*
		 * this second call is illegal, as we can only have one call
		 * to another constructor inside a constructor
		 */
	//	super();
		this.age=age;
		System.out.println("public  constuctor that takes an int");
	}
	/*
	 * this is a package level access constructor, this can only 
	 * be used by other classes inside the same package
	 */
	Animal(double weight){
		this.weight=weight;
		System.out.println("package level access constructor that takes "
				+ " a double");
	}
	/*
	 * this is a public instance method that can be accessed anywhere
	 * within our project
	 */
	public void run() {	
		/*
		 * we are using a public method to access a private variable
		 * a getter() is simply a public method that accesses a private
		 * variable
		 */
		System.out.println("Animal running and age is"+age);
		/*
		 * we create a Animal called andy inside the Animal class
		 * which means, we can access the private variable age
		 * so this Animal object, DOES HAVE an age, unlike ANY animal
		 * created outside of the Animal class
		 */
		Animal andy=new Animal();
		System.out.println(andy.age);
	}
	/*
	 * this is package level access instance method that can be 
	 * accessed only inside the same package of com.building
	 */
	void eat() {
	
		System.out.println("Animal eating default leve accesss");
	}
	/*
	 * this is a method that only be accessed inside the Animal
	 * class
	 */
	private void drink() {
		System.out.println("Animal drinking private level access");
	}
	/*
	 * this is a method that be accessed inside the same package or
	 * in derived classes, regardless of if the derivied class is
	 * in a different package
	 */
	protected void sleep() {
		System.out.println("Animal sleep protected level access");
	}
	/*
	 * you can make a static method private, but it does not make
	 * sense as you can't go
	 * Animal.herd()
	 */
/*	static private void herd() {
		
	}*/
	//static can have any access levels
}
/*
 * the whole class is only package level access, which means
 * you can't access this class in any way, outside of the com.building
 * package
 */
class Zebra extends Animal{
	
}
