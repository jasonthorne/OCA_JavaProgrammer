package com.noel;

public class XXX {
	public void m() throws Exception{
		throw new Exception();
		}
}

class YYY extends XXX{
	/*
	 * a overriding method can throw a
	 * subclass of exception or no 
	 * exception, so this will compile
	 */
	@Override
	public void m(){
		System.out.println("m Y method");
		
	}
}
