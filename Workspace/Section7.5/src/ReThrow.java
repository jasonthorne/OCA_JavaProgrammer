import java.io.FileInputStream;
import java.io.IOException;

public class ReThrow {
	
	static void rethrow1()throws Exception{ //throws allows for a throw
		
		FileInputStream throwMe;
		
		try {
			throwMe = new FileInputStream("myFile.txt");
		}
		catch(Exception e) {
			System.out.println("Exception in rethrow1 is: " + e);
			
			throw e; //this throw sends the exception created here to it's parent. Allowed by the "throws" declaration in the method
		}
	}
	
	
	static void rethrow2(){ 
		
		FileInputStream throwMe;
		
		try {
			
			try {
				throwMe = new FileInputStream("myFile.txt");
			}
			catch(Exception e) {
				System.out.println("Exception in rethrow1 is: " + e);
				
				throw e; //this throw sends the exception created here to the OUTER catch block below
			}
			
		}catch(Exception e) {
			System.out.println("caught the throw from the inner catch");
		}
	
		
	}
	
	//NO "throws Exception" clause is needed in this method as it is automatically thrown due to being a runtime exception
	static void reThrow3() {
		int[]myArray = {45,67,99};
		
		try {
			System.out.println(myArray[5]); //this will produce an ArrayIndexOutOfBoundsException
		}
		catch(Exception e) {
			throw e; //throw the Exception to parent.
		}
	}
	
	
	
	static void reThrow4() throws Exception {
	
		
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("exception is caught");
		}
		finally {
			throw new IOException(); //this produces its own checked exception, which HAS TO BE dealt with (which is in the "throws Exception" in the method sig).
		}
	}
	
	
	
	
	
	
	
	

}
