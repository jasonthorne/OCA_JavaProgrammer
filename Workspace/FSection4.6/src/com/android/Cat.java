package com.android;

import java.time.LocalTime;
import java.util.ArrayList;

public class Cat {
	int age;
	String name;
	double weight;
	private static ArrayList<Integer>listHash=new ArrayList<>();
	public Cat(int age, String name, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight)+LocalTime.now().getNano();
		result = prime * result + (int) (temp ^ (temp >>> 32));
		listHash.add(result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Cat)) {
			return false;
		}
		Cat other = (Cat) obj;
		Integer lnum=other.hashCode();
		if(listHash.contains(lnum)) {
			lnum=other.hashCode();
		}
		boolean value=lnum==hashCode();
		
		return value;
		
	}
	

}
