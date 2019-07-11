package com.noel;

public class Dog {
	static int counter=0;
	Dog(){
		System.out.println("Dog created");
		counter++;
		System.out.println("count is "+counter);
		try{
			throw new MyException();
		}
		catch(Exception e){
			counter++;
			System.out.println(e);
			System.out.println("count is "+counter);
		}
		
	}

}

class MyException extends Exception{
	
}
