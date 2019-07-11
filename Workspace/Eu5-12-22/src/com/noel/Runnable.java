package com.noel;

public interface Runnable {
	void myRun();

}

interface Observer{
	
}

class A implements Runnable{

	@Override
	public void myRun() {
		// TODO Auto-generated method stub
		
	}
	
} 
class B extends A implements Observer {
	
}
