package com.noel;

public interface I1 {
	void setValue(String s);
	String getValue();
}
/*
 * interfaces EXTEND other interfaces
 */
interface I2 extends I1{
	void analyse();
	}

abstract class AbstractB implements I1{
	int getValue(int i) { 
		return 0; 
		} 
	}