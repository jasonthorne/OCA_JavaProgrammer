package com.android;
/*
 * a abstract class implementing a Interface, does not HAVE TOO override
 * the abstract methods, but it can choose to do so
 */
public abstract class Insect implements Behaviour{
	/*
	 * we are overriding the Joy method, but we don't have too
	 * */
	public void joy() {
		System.out.println("insect Joy");
	}
	
	void crawl() {
		System.out.println("insect crawling");
	}
}//end of insect class
/*
 * this is a concrete class extending a abstract class that implements
 * an interface. So any methods that were not overriden in the Insect 
 * class will have to overriden in the Beetle class
 */
class Beetle extends Insect{
	/*
	 * when overriding the overriding method can have the same access
	 * level, in this case package level
	 * the rule is you can make a method more available when overriding,
	 * but NOT LESS available
	 */
	//this will compile
/*	@Override
	void crawl() {
		System.out.println();
	}
	//this will also compile
	*/
/*	@Override
	public void crawl() {
		
	}
	*/
	//this will not compile
//	private void crawl() {
		
//	}
	

	@Override
	public void jealous() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int anger(double dnum, char myChar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void euphoria() {
		// TODO Auto-generated method stub
		
	}
	
}

/*
 * only concrete classes have to override abstract methods of an
 * interface they are implementing
 */
class Horse implements Behaviour{

	@Override
	public void jealous() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int anger(double dnum, char myChar) {
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
