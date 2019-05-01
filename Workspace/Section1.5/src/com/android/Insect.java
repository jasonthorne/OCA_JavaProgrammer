package com.android;


//ONLY concrete classes HAVE TO override the abstract methods of an interface. (which is why this doesnt!):
public abstract class Insect implements Behaviour {
	
	
	//Overriding the joy() method, but we DONT HAVE TO!
	public void joy() {
		System.out.println("Insect joy");
	}
	
	void crawl() {
		System.out.println("Insect crawling");
	}

}

//This DOSNT have to override the joy() method as its already overridden by Insect:
class Beetle extends Insect{
	
	//When overriding the overriding method can have the same access level (in this case package level) OR GREATER:
	//same access level:
	/*
	void crawl() {
		
	}*/
	
	//greater access level:
	@Override
	public void crawl() {
		
	}

	@Override
	public void jealous() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int anger(double aDouble, char myChar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void euphoria() {
		// TODO Auto-generated method stub
		
	}
	
}

//THis MUST implement the abstract methods of the interface as its not abstract:
class Horse implements Behaviour{

	@Override
	public void jealous() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int anger(double aDouble, char myChar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void joy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void euphoria() {
		// TODO Auto-generated method stub
		
	}
	
}