
public class Main {
	
	/**
	 * 
	 *8.4 - Create and invoke a method that throws an exception
	 */

	public static void main(String[] args) {
	
		Thows throwMe = new Thows();
		
		try {
			
			/*
			 * This method call generates a FileNotFoundException which is checked and is a subclass of Exception
			 * so it HAS to be dealt with either in a try/catch or a throws exception.
			 */
			throwMe.readFile("myFile.txt");
		}
		catch(Exception e) {
			System.out.println("Exception for readFile in main is + e");
		}

		try {
			throwMe.throwRunTime();
		}catch(Exception e) {
			System.out.println("exception is: " + e);
		}
		
		
		throwMe.method1(); //no error produced here
		throwMe.method2(); //no error produced here
		
		
		try {
			throwMe.method3();
			throwMe.method6(); 
			throwMe.method7(); 
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
			
		try {
			throwMe.method8();
		} catch (Exception e) {
			//e.printStackTrace();
			
			//print full exception:
			System.out.println("full exception is: " + e.toString());
			
			//print exception messge:
			System.out.println("exception message is: " + e.getMessage());
			
		}
		
		
	}


}
