import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Thows {
	
	void readFile(String file) throws FileNotFoundException{
		
		boolean found=findFile(file);
		
		if(!found)
			
			/*
			 * This is how we explicitly create an exception. We "throw" a "new" "FileNotFoundException".
			 * This is a CHECK exception that either HAS to be in a try/catch or the method has to throw it out of the method.
			 */
			throw new FileNotFoundException("you are missing the file" + file);
			
			//error for this code below, as its after a potential throw. (The throw could trigger, making this code unreachable) ++++++++++++++++++++++++++++++
			//FileInputStream fis = new FileInputStream("myFile.txt");
	}
	
	boolean findFile(String file) {
		return false;
	}
	
	
	void throwRunTime() {
		throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
	}
	
	//An error is a runTimeException, so calling this method does not need to be in  try/catch block. 
	//You should NEVER deal with errors in this way. A sw developer doesnt deal with errors.
	
	void method1() throws Error{ //All this is saying is if an error is produced, throw this method
		System.out.println("method1 called");
	}
	
	
	void method2() throws RuntimeException{ 
		System.out.println("method2 called");
	}
	
	
	//void method3() throws Th

}
