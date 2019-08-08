package com.android;
/*
 * this is the same structure as the Predicate interface, which 
 * is a bulit in interface in all installations of java which we use
 * for testing objects
 */
public interface Manners <T>{

	boolean test(T t);
}
