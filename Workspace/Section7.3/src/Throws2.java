import java.io.FileInputStream;
import java.io.IOException;

public class Throws2 {
	
	static void trys() {
		
		
		try {
			System.out.println("first try");
		}catch(Exception e) {
			System.out.println("first catch");
		}
		
		
		try {
			System.out.println("try catch, no error");
		}catch(Error e) {
			System.out.println("second catch");
		}
		
		
		try {
			System.out.println("try block on runtime");
		}catch(RuntimeException r) {
			System.out.println("third catch");
		}
	
		
		try {
			System.out.println("try block on nullPointer");
		}catch(NullPointerException n) {
			System.out.println("forth catch");
		}
		
		
		try {
			System.out.println("try block on Throwable");
		}catch(Throwable t) {
			System.out.println("fith catch");
		}
		
		
		/*
		 * A try block can define a catch block for runtime exceptions 
		 * that are not thrown or cannot be created in the try block.
		 * i.e 
		 * try(){
		 * }
		 * catch(RuntimeException r)
		 * catch(Exception e)
		 * catch(Throwable t)
		 * catch (Error er)
		 * catch (all subclasses of RuntimeException)
		 */
		
		try {
			System.out.println("yo");
			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			/*
			 * this code may or may not produce a checked exception. 
			what is important is that it may produce an IO Exception.
			This code will not run unless the code in the try block is capable of producing an IO exception.
			As when we catch a particular named checked Exception, as we have done here,
			the code in the try block has to be capable of producing the exception type mentioned in the catch.
			This code has to be capable of producing an IOException.
			*/
			
			FileInputStream fis = new FileInputStream("myFile.txt"); //this is NEEDED for IO Exception to be valid. As it allows for the potential of it's triggering
			
		}catch(IOException i) {
			System.out.println("exception is:"+i);
		}
	
	
	}

}
