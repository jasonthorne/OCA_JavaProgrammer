package com.android;

public class Employee implements Behaviour{

	int age=100;
	String name="etna";
	@Override
	public void mad() {
		System.out.println("employee mad");
		
	}

	@Override
	public void happy() {
		System.out.println("employee happy");
		
	}

	@Override
	public void sad() {
		System.out.println("employee sad");
		
	}
	
	void doWork() {
		System.out.println("Employee working");
	}

}//end of employee class

class Fireman extends Employee{
	/*
	 * this class inherits ALL of the methods from the Employee
	 * class
	 */
	public void sad() {
		System.out.println("Fireman sad");
	}
	/*
	 * When you are overriding a method, you can't make the overridng
	 * method any LESS available
	 * in the Employee class mad is PUBLIC void mad(), that means
	 * the overriding mad() method can't be anything less that public
	 */
	public void mad() {
		System.out.println("fireman mad");
	}
	/*
	 * doWork is a package/default level access method, that means
	 * we can override it 
	 * protected void doWork() as this is not LESS AVAILABLE
	 * void doWork() as this is the same level as Employee
	 * public void doWork() will also work as this is NOT LESS AVAILABLE
	 */
	/*
	 * this will work as protected void doWork() is not
	 * less availabe than void doWork()
	 */
/*	protected void doWork() {
		
	}
	*
	*/
	void doWork() {
		
	}
	/*
	 * this will work as public void doWork() is not less
	 * available than void doWork()
	 */
/*	public void doWork() {
		
	}*/
	/*
	 * this will NOT WORK as 
	 * private void doWork() is less available than
	 * void doWork()
	 */
/*	private void doWork() {
		
	}*/
}
