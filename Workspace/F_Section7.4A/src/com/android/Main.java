package com.android;

public class Main {

	public static void main(String[] args) {
		RiverRafting raft=new RiverRafting();
		/*
		 * this needs to be in a try/catch block as the method 
		 * crossRapid has a "throws FallInTheRiverException", which 
		 * is a checked exception, which means we HAVE TO deal with it
		 * eitehr by putting it in a try/catch block or having the main
		 * method "throws Exception"
		 */
		try
		{
			/*
			 * an exception is not generated as an exception is only
			 * thrown if it's more than 15 degrees
			 */
			raft.crossRapid(12);
		}
		catch(Exception e) {
			System.out.println("exception is "+e);
		}
		
		try
		{
			/*
			 *An exception IS generated as this is more than 15 degrees
			 */
			raft.crossRapid(17);
		}
		catch(Exception e) {
			System.out.println("exception is "+e.toString());
		}
		raft.row("happy");
		raft.row("nervous");
		
		System.out.println("using both custom exception classes");
		
		try {/*
			 * if either method generates an exception then the try block will
			 * exit at that point and the rest of the try block will not execute.
			 * so raft.crossRapid(17) produces a checked exception, so the rest
			 * of the try block does not execute
			 */
			
			raft.crossRapid(17);//generates FallInTheRiverException
			raft.row2("nervous");//generates a DropOarException
			/*
			 * this code will only be run if row2() or crossRapid() produce no
			 * checked exceptions
			 */
			System.out.println("enjoy river rafting");
		}
		/*
		 * this executes if crossRapid() produces a FallinRiverException
		 */
		catch(FallInTheRiverException f) {
			System.out.println(f);
			/*
			 * we previously only saw this when our program crashed, this 
			 * provides a map of what caused our exception
			 */
			f.printStackTrace();
			System.out.println("get back in the raft");
		}
		/*
		 * this executes if raft.row() produces a DropOarException
		 */
		catch(DropOarException d) {
			System.out.println(d);
			System.out.println("don't panic");
		}
		/*
		 * this will always execute regardless of whether any exceptions
		 * are produced, finally always runs, except it one particular case
		 * which we will show later
		 */
		finally {
			System.out.println("hope you had a nice day rafting");
		}
		

	}

}
