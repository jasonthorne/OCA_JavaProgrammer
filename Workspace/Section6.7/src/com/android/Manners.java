package com.android;

/*
 * This is the same structure as the Predicate interface, 
 * which is a built in interface in all installations of java, which we use for testing purposes.
 */

public interface Manners <T>{
	
	boolean test(T t);
}
