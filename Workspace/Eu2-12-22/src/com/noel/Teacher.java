package com.noel;

public class Teacher {
	
	void teach(String str){
		System.out.println("teach me");
	}

}

class National extends Teacher{
	//overloaded
	public void teach() throws Exception{
		
	}
	//overloaded
	private void teach(int i) throws Exception{
		
	}
	/*
	 Protected is less restrictive than default level 
	 access, so this is allowed
	 */
	@Override
	protected void teach(String s){
		
	}
}

class Secondary extends Teacher{
	/*
	 * a Overriden method can be final
	 */
	@Override
	public final void teach(String s){
		
	}
	/*
	 * can't have an abstract class in a 
	 * concrete class
	 */
}
