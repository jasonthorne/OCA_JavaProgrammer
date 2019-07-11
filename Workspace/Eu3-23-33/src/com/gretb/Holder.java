package com.gretb;

public class Holder {
	int value = 1;
	/*
	 * this is just a reference,
	 * it is not assigned to any object
	 * so if we do not give it any value
	 * if we attempt to do anything with
	 * this variable we will get a
	 * null pointer exception
	 */
	Holder link;
	//constructor
	public Holder(int val)
	{ 
		this.value = val; 
		}
	
	 public static Holder setIt(final Holder x, final Holder y)
	 {
	       x.link = y.link;
	       return x;
	   }

}
