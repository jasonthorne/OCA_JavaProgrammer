package com.android;
/*
 * this class is all about overriding
 * 
 */
public class Ape {
	/*
	 * When overriding a method, you can't make it LESS AVAILABLE
	 * but you can make it MORE AVAILABLE
	 */
	public void eat() {
		System.out.println("Ape eating");
	}
	/*
	 * overriding methods have to protected or public
	 */
	protected void drink() {
		System.out.println("Ape drinking");
	}
	/*
	 * overridding methods have to package level, protected or 
	 * public
	 */
	void breed() {
		System.out.println("Ape breeding");
	}
	/*
	 * can't override this in a derived class as its only available 
	 * inside the Ape class. can't inherits a private method or
	 * variable
	 */
	private void sleep() {
		System.out.println("Ape sleeping");
	}

}

class Human extends Ape{
	/*
	 * this sleep method has NO RELATIONSHIP with the sleep() method in
	 * the Ape class, as the sleep() method in the Ape class is private
	 * so the Human class cannot inherit it. these are two methods
	 * that just happen to have the same name but in different classes
	 */
//	@Override//this annotation will give an error if this method is
	//not overriding a method
	protected void sleep() {
		System.out.println("human sleep");
	}
	/*eat() method in Ape class is 
	 * public void eat() so cannot be less available
	 * so will not compile
	 */
//	void eat() {}
//	protected void eat() {};
//	private void eat() {};
	@Override
	public void eat() {//can only be public
		System.out.println("human eating");
	}
	/*
	 * both protected and public will work for drink() as drink
	 * in Ape class was protected void drink()
	 */
	/*@Override
	protected void drink() {
		
	}*/
	@Override
	public void drink() {
		System.out.println("Human drinking");
	}
	/*
	 * this will not work as cannot make a overriden method less
	 * available
	 */
/*	void drink() {
		System.out.println("will not work");
	}
	*/
	/*
	 * breed() is package level access in Ape, so this overriden method
	 * can be public,protected or package level
	 */
	@Override
	protected void breed() {
		System.out.println("Human Breed");
	}
	
	
}
