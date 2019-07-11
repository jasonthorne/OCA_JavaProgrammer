package com.noel;

public interface Flyer {
	/*
	 * abstract method each class that
	 * implements the implements the interface
	 * has to provide implementation for this
	 * method
	 */
	String getName();
}

class Bird implements Flyer
{//variables
	public String name;
	//constructor of Bird class
	public Bird(String name)
	{
		this.name = name;
		}
	/*
	 * overriding the getName()method from the
	 * Flyer interface
	 */
	@Override
	public String getName()
	{ 
		return name; 
	}
}  
/*
 * Eagle extends bird so it also implments
 * the Flyer interface and has access to the
 * getName()method, it has no getName() itself
 * so it takes the getName()from the bird class
 */
class Eagle extends Bird 
{
	//constructor
	public Eagle(String name)
	{
		/*
		 * calls the Bird classe's constructor
		 * that takes a string
		 */
		super(name);
	}
}
