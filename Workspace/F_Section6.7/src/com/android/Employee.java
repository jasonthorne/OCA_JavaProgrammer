package com.android;
/*
 * Employee does not have to implement Behaviour interface to access
 * a Behaviour referenced object
 */
public class Employee {
	private int age;
	private String name;
	private int rating;
	/*
	 * this object is default level access but it can be any access level
	 * you want (private,protected,public)
	 */
	Behaviour myBehave;
	private Dog myDog;
	
	public Employee(int age,String name,int rating, Behaviour myBehave) {
		this.age=age;
		this.name=name;
		this.rating=rating;
		this.myBehave=myBehave;
	}
	/*
	 * this method gains use access to the private int rating
	 */
	int getRating() {
		return rating;
	}

}
