package com.android;

public class Cat {
	String name;
	int age;
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	Cat(){
		
	}
	
	void eat() {
		System.out.println("cat eating");
	}
	@Override
	public String toString() {
		return "name is "+name+" age is "+age;
	}
	/*
	 * we are overriding the equals() method from the object class
	 * which means we have to create a method that returns 
	 * a boolean.
	 * has to be public(as the method in the Object class is public
	 * and you can't make a overriden method any less visible)
	 * has to be called equals
	 * and has to take an object
	 * if it is the same Cat this will return true
	 * or if they are the same name and same age, this will
	 * also return true
	 */
	public boolean equals(Object obj) {
		/*
		 * if they are the same object, return true
		 * "this" refers to the cat calling the equals() method
		 * "obj" refers to the cat being sent to the method
		 */
		if(this==obj) {
			return true;
		}
		/*
		 * instanceof checks if a object belongs to a certain class
		 * returns true if is is a cat
		 * false if it not a cat
		 * if it's not a cat, it can't be equal, this is only
		 * checking to see if the object sent to this method
		 * is a cat, if its not then we will return false
		 */
		if(obj instanceof Cat) {
			/*
			 * obj is a object reference to a Cat Object so it
			 * does not have direct access to the name, age or
			 * any method of the Cat class. We can cast obj to
			 * be of reference type Cat, as it is a Cat object, 
			 * then we will have a Cat reference to a Cat object
			 * and will have access to all atributes and methods
			 * of the Cat class
			 */
			//obj.eat();
			//System.out.println(obj.age);
			//System.out.println(obj.name);
			Cat newCat=(Cat)obj;
			/*
			 * we can now access the name and age of the Cat
			 * sent to the method, which was "puss"
			 */
			System.out.println("newCat  name is "+newCat.name);
			System.out.println("newCat age is "+newCat.age);
			/*
			 * name and age refers to the Cat that is calling
			 * the equals() method (tom_
			 */
			System.out.println("name is "+name);
			System.out.println("age is "+this.age);
			/*
			 * if the two cats have the same Name and the same
			 * age, then check is true
			 * otherwise check false
			 */
			boolean check=name.equals(newCat.name)&&
					age==newCat.age;
					
			/*
			 * this will return true if only the ages are the 
			 * same 
			 */
		//	boolean check=age==newCat.age;#
			/*
			 * this will return true if only the names are
			 * teh same
			 */
		//	boolean check=name.equals(newCat.name);
			return check;
		}
		//if its not a cat this will execute
		return false;
	}
	

}
