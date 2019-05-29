package com.android;

public class House {

	double width;
	double height;
	String address;
	static int counter = 0;
	int number = counter;
	
	
	public House(double width, double height, String address) {
		counter++;
		this.width = width;
		this.height = height;
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "House [width=" + width + ", height=" + height + ", number=" + number + ", address=" + address + "]";
	}
	
	
	
}
