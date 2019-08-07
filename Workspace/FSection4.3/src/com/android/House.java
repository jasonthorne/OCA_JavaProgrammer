package com.android;

public class House {
	double width;
	double height;
	int number;
	String address;
	static int counter=0;
	public House(double width,double height,String address) {
		counter++;
		this.width=width;
		this.height=height;
		this.address=address;
		this.number=counter;
	}
	@Override
	public String toString() {
		return "House [width=" + width + ", height=" + height + ", number=" + number + ", address=" + address + "]";
	}
	
	

}
