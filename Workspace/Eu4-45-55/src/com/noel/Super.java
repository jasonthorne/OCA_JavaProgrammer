package com.noel;

public class Super {
	public String toString(){
		return "4";
		}
}

class SubClass extends Super{
	public String toString(){
		return super.toString()+"3";
	}
	
}
