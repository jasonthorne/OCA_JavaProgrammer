package com.android;

import java.util.function.Predicate;

public class Donkey implements Predicate<String>{

	@Override
	public boolean test(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}

class Eagle implements Predicate<Dog>{

	@Override
	public boolean test(Dog t) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
