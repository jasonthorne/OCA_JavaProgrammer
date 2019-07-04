import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
	//You should NEVER deal with errors in this way. A sw developer doesnt deal with errors. An error is something that's usually out of our controll.
	
	void method1() throws Error{ //All this is saying is if an error is produced, throw this method
		System.out.println("method1 called");
		
		/*
		 * If we uncomment this line, we still dont have to have method1 throws error, because 
		 * an error is a runtime exception that is automatically throws out the method it is declared in. 
		 */
		//throw new StackOverflowError();
	}
	
	
	void method2() throws RuntimeException{ 
		System.out.println("method2 called");
	}
	
	
	void method3() throws Throwable{
		System.out.println("method3 called");
		throw new Exception();
	}
	
	
	/*
	 * This is a subvclass of exception, so it is a checked exception,
	 *  and is basically a superclass for all exception classes that deal with file handling.
	 *  It is basically a superclass for all exceptions classes that deal withfile handling.
	 *  All sub exception classes of this are also checked exceptions.
	 *  So when calling this you either have to put it in a try/catch or what is calling it has to have a "throws"
	 */
	void method6() throws IOException {
		System.out.println("method6 called. throws IOException");
	}
	
	
	void method7()throws FileNotFoundException{
		System.out.println("method 7 called. throws FileNotFoundException ");
	}
	
	
	void method8() throws Exception{
		
		/*
		 * This will generate a checked exception.
		 */
		
		//FileInputStream fis = new FileInputStream("myFile.txt");
		
		throw new Exception("our new exception message in method 8");
	}
	
	

}
