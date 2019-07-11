package com.gretb;

public class Test {
	public int luckyNumber(int seed){
		if(seed > 10)
			return seed%10;
		int x = 0;
		/*
		 * if seed is less than 10
		 * then the following will always
		 * execute and finally is always 
		 * executed so it will always return
		 * 7 if it gets to this point
		 */
		try{
			if(seed%2 == 0) 
				throw new Exception("No Even no.");
			else return x;
			}
		catch(Exception e){
			return 3;
			}
		finally{
			return 7;
			}
		}

}
