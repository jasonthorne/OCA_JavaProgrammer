

public class Main {
	
	/**
	 * 
	 * Differentiate between checked exceptions, unchecked exceptions (ie runtime exceptions) and errors.
	 */

	public static void main(String[] args) {
		
		/*
		 * There are 2 broad types of exception:
		 * Checked exception - These are exceptions that HAVE TO BE put in a try/catch block, or they have to be thrown.
		 * eg IOException - this is a subclas of FileNotFoundException, and when we are connecting to a file,
		 * the connection to the file HAS TO BE put into a try/catch, or the code wont compile.
		 * If you want to read,write or close a file, the code for this HAS TO BE put into a try/catch or thrown.
		 * This code MAY generate a checked exception, and anything that may generate a checked exception has to be put into a try/catch.
		 * 
		 * Errors are NOT a subclass of exception and should NOt be dealt with in a try/catch. 
		 * An error is something usually you cant do ANYTHING about. IE hardware error
		 */
		
		Checked check = new Checked();
		check.checked1();
		
		/*
		//try catch added here, due to the throws being checked2
		try {
			check.checked2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
			try {
				check.checked3();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
	}

}
