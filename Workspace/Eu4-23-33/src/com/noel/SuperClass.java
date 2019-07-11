package com.noel;
/*
 * to create a subclass object a SuperClass constructor
 * has to be first called, even if none is 
 * defined in a class there is still a default
 * hidden no args constructor
 */
public class SuperClass {
	public SuperClass(int a){
		/*
		 * when you define a constructor in
		 * a class you no longer have access
		 * to the default no args constructor
		 * so if you want to use a no args 
		 * constructor in this class you HAVE 
		 * to define it
		 */
		System.out.println("super constructor that "
				+ "calls an int called");
	}
	
	public SuperClass(){
		System.out.println("super constructor that "
				+ "takes no arguments called");
	}

}

class SubClass extends SuperClass{
	int i, j, k;
	
    public SubClass( int m, int n ) {
    	/*
    	 * the call to the super no args
    	 * constructor is implicitly here
    	 */
    	System.out.println("subclass constructors"
    			+ " that takes two ints called");
    	i = m ;  j = m ; 
    	} //1
    
    public SubClass( int m )  {
    	/*
    	 * this calls a constructor in
    	 * the superclass that takes
    	 * an int
    	 */
    	super(m); 
    	System.out.println("subclass constructors "
    			+ " that takes one int");
    	} //2
}
