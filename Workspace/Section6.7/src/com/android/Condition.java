package com.android;

public interface Condition<T>{
	
	void eat(T t, T t2, int num);
	
	default void drink(T t) {
		System.out.println(t);
	}
	
	

}
