package com.noel;

public class One {

}
class Two extends One{
	
}
class Three extends Two{
	
}
class Four{
	Two getTwo(){
		return new Two();
	}
	
}
class Five extends Four{
	/*
	 * you can return a subclass 
	 * Three extends Two
	 */
/*	@Override
	protected Two getTwo(){
		return new Three();
	}*/
	/*
	 * Co variant return types are 
	 * allowed in an overriding method
	 */
/*	@Override
	Three getTwo(){
		return new Three();
	}*/
	/*
	 * an overriding method cannot return
	 * a superclass object
	 */
}
