package com.android;

public class Employee implements Movement,Behaviour,Financial{
	private String name;//name of employee
	private int age;//age of employee
	enum Sex{//enum called sex to determine sex of emmployee
		MALE,FEMALE
	}
	private Sex gender;//sex of employee
	private double wages;//wages paid weekly
	/*
	 * when creating a bankaccount we start off with nothing 
	 * in our bankaccount
	 */
	private BankAccount account=new BankAccount(0.0);
	/*
	 * constructor that creates an employee
	 */
	Employee(String name, int age,Sex gender,double wages){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.wages=wages;
	
	}
	/*
	 * every other class does not need access to all other methods
	 */
	void eat() {
		
	}
	
	void drink() {
		
	}
	
	void breathe() {
		
	}
	
	void sleep() {
		
	}

	@Override
	public void happy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
/*
 * all of the remaining methods are to do with all financial details
 * for an employee.
 * so anything to do with money will only use the below methods
 */
	@Override
	public void wages() {
		/*
		 * our bank account is called account, which has a method called
		 * lodge, which just add's our wages amount for the week
		 * into our account and adjusts the balance
		 */
		account.lodge(wages);
		double balance=account.getBalance();
		System.out.println("you have "+balance+" euros in your account");
		
		
	}

	@Override
	public void tax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prsi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void usc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pension() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mortgage() {
		// TODO Auto-generated method stub
		
	}

}
