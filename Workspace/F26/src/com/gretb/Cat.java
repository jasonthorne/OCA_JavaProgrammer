package com.gretb;

public class Cat {
	/*
	 * this is encapsulation, which is making all of your atributes private
	 * and as many of your methods as you can private
	 */
	private int age;
	private String name;
	private double weight;
	private int id;
	/*
	 * public constructor for Cat class that takes an int, a String,
	 * a double and a double
	 */
	public Cat(int age, String name, double weight, int id) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.id = id;
	}
	/*to create getters() and setters() go to source - 
	 * generate getters and setters - choose which variables you want
	 * getters and setters for
	 * a public method to get the private int variable age
	 */

	public int getAge() {
		return age;
	}
	/*
	 * a public method to set the private int variable age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	/*
	 * Overriden toString() method which will be called automatically whenever
	 * we place a Cat object in a print statement
	 */
	@Override//this is NOT A COMMENT, this is an annotation, you do not have to include this
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + ", weight=" + weight + ", id=" + id + "]";
	}

}
