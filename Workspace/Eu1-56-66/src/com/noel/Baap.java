package com.noel;

public class Baap {
	public int h = 4;
	public int getH() {
			System.out.println("Baap " + h);
			return h;
			}
}
class Beta extends Baap{
	public int h = 44;
	public int getH() {
		System.out.println("Beta " + h);
		return h;
				}	
}


