package com.android;
/*
 * As this interface only has one abstract method inside it, we can
 * use this interface to create lambdas.
 * So any lambda is going to provide a body for the 
 * boolean check(Employee emp) abstract method
 */
public interface Validate {
	
	boolean check(Employee emp);

}
