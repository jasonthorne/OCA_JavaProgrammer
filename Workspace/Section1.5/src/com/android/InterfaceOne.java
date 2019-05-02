package com.android;

public interface InterfaceOne {
	
	void method1();
	void method2();
	
}


//An interface can extend another interface. An interface DOESNT implement another Interface.
//ANY class that implements interface2, will have to implement 4 methods (one and two above).
//An interface CAN EXTEND multiple interfaces. A it can't be instantiated.
interface InterfaceTwo extends InterfaceOne{
	void method3();
	void method4();
}


