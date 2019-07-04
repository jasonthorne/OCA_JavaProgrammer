
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
		
		
		
	}


}
