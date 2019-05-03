package com.android;

public interface InterfaceOne {
	
	void method1();
	void method2();

}

interface NewInterface{
	void aMethod();
}
/*
 * an interface can EXTEND another interface
 * an interface DOES NOT implment another interface
 * Any class that implments interface Two will have to implment four
 * methods method1() method2() from interface1
 * and Method3() and method()4 from int
 * you can extend from multiple interfaces, as interfaces are NOT
 * CONCRETE and can never be instantiated (can never create an object
 * of the class)
 */
interface InterfaceTwo extends InterfaceOne,NewInterface{
	void method3();
	void method4();
}
