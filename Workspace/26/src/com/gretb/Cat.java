package com.gretb;

public class Cat {
	
	//this is encapsulation (making all of your attributes private, and as many methods as you can private).
	private int age;
	private String name;
	private double weight;
	private int id;
	
	//public constructor:
	public Cat(int age, String name, double weight, int id) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.id = id;
	}

	public int getAge() {
		return age;
	}

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

	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + ", weight=" + weight + ", id=" + id + "]";
	}
	
	

}
