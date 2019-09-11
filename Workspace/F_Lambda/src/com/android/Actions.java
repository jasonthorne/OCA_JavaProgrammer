package com.android;
/*
 * an interface can also use a generic type just like any other class
 * the predicate interface we are examined on also has a generic type
 * T
 */
public interface Actions<T> {
	/*
	 * this is exactly how the test() method inside the predicate 
	 * interface looks. So when we are creating a predicate lambda, we
	 * are overriding a method that looks exactly like this
	 * the predicate interface looks EXACTLY LIKE THIS, except the
	 * interface is named predicate
	 */
	boolean test(T t);

}
