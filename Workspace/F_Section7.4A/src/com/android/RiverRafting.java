package com.android;

public class RiverRafting {
	/*
	 * if the degree the boat is pitching at is greater than 10, then
	 * throw a new FallInTheRiverException, which means you have
	 * fallen into the water and the message tells you to get out of
	 * the water, otherwise if you are not in the water you are still
	 * in the boat
	 */
	/*
	 * this throws FallInTheRiverException which is a checked exception
	 * which means we don't have to have a try catch block inside this
	 * method but what is calling this method nees to have a try
	 * catch block
	 */
	void crossRapid(int degree)throws FallInTheRiverException{
		System.out.println("cross rapid");
		if(degree>15)
			throw new FallInTheRiverException();
		else
			System.out.println("you are still in the boat");
	}
	/*
	 * if a person is nervous, they will drop the oar, if not we 
	 * still have the oar in they're hand
	 */
	void row(String state) {
		System.out.println("row raft");
		
		try {
			if(state.equalsIgnoreCase("nervous")) {
				throw new DropOarException("Dropped Oar exception generated");
			}
			else
				System.out.println("you have the Oar in your hand");
		}
		catch(DropOarException d) {
			System.out.println("Exception is "+d);
		}
		}//end of method
	/*
	 * when we are calling this method, it has to be in a try/catch
	 * block or whatever is callign it has to have a throws Exception 
	 * as well in its method signature
	 */
	void row2(String state)throws DropOarException{
		System.out.println("row raft2");
		if(state.equalsIgnoreCase("nervous")) {
			throw new DropOarException("Dropped Oar exception generated");
		}
		else
			System.out.println("you have the Oar in your hand");
	}
		
	}


