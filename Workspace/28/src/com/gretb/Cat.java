package com.gretb;

public class Cat {
	
	int age;
	String name;
	double weight;
	boolean sex;
	String gender;
	
	public Cat(int age, String name, double weight, boolean sex) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.sex = sex;
	
		if(sex) gender="female"; else gender="male";
	}

	//overriding the ToString() method of the object class to return a string with the vars of the cat that calls this method
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + ", weight=" + weight + ", gender=" + gender + "]";
	}

	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (sex ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	*/

	//This is overriding the equals() method.
	@Override
	public boolean equals(Object obj) { //Object param here can be of ANY child object. ++++++++++++++++
		if (this == obj) //are both obj references pointing to the same obj
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
	

}


