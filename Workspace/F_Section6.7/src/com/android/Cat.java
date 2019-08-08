package com.android;

public class Cat implements Manners<String>{

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return false;
	}

	

}

class Butterfly implements Manners<Dog>{

	@Override
	public boolean test(Dog t) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
