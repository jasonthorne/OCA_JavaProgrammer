import java.io.FileInputStream;

public class Checked {
	
	void checked1() {
		
		
		try {
			
			//FileInputStream fis = new FileInputStream("myFile.txt"); //this file doesnt exist, so this will generate an exception
			
			
			int[]numbers = {5,7,8};
			System.out.println(numbers[4]);
		}catch(Exception e) {
			
			/*
			 * This can catch ALL exceptions (both checked & unchecked) 
			 * because Exception is the superclass of all exceptions.
			 * 
			 * If this only catches runtime exceptions (RuntimeException e), then it CANNOT catch checked exceptions,
			 * which are the type of exceptions that can be generated when dealing with files.
			 */
			
			System.out.println("computer say's no!");
			
		}
		
		System.out.println("code after catch block runs");
		
	}

}
