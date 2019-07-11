package com.noel;

public class TestClass {
	static int si = 10;
	int num=45;
	//constructor
	public TestClass()
	{
		/*
		 * this calls the toString method
		 * for this class
		 */
		System.out.println(this);
		//same as 
		System.out.println(this.toString());
		}
	/*
	 * this Overrides the toString()method from
	 * the object class so whenever we print
	 * out a object of this class, this
	 * method will be called 
	 */
	public String toString()
	{
		System.out.println("non statics");
		System.out.println(num);
		System.out.println(this.num);
		//can't go
		//System.out.println(TestClass.num);
		System.out.println("statics");
		System.out.println(si);
		/*
		 * a static variable can be accessed
		 * in a static way (class name.variable name)
		 */
		System.out.println(TestClass.si);
		return "TestClass.si = "+this.si;		
		}

}
