package com.android;

public class Zebra {
	private int age;
	private double weight;
	private String name;
	private boolean sex;
	private int stripeCount;
	/*
	 * these are the getters and setters for all of the 
	 * private atributes of each of our zebras
	 */
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * convention is to use the word "is" instead of "get" with a 
	 * getter that returns a boolean
	 */
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getStripeCount() {
		return stripeCount;
	}
	public void setStripeCount(int stripeCount) {
		this.stripeCount = stripeCount;
	}
	
	

}
