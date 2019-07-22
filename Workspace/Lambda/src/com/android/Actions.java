package com.android;

//An interface can also use a generic type, just like any class.
public interface Actions<T> {
	
	//this is exactly how the Test method inside the predicate interfaxce llooks.
	//So when we are creating a predicate lambda, we are overriding a method that looks exactly like this:
	boolean test(T t);
	
	/*
	 * A predicate interface looks exaclty like this except the interface is named "Predicate"
	 */

}
