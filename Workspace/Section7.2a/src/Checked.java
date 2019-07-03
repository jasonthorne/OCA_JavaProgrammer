import java.io.FileInputStream;

public class Checked {
	
	void checked1() {
		
		
		try {
			
			//FileInputStream fis = new FileInputStream("myFile.txt"); //this file doesnt exist, so this will generate an exception
			
			
			int[]numbers = {5,7,8};
			//System.out.println(numbers[4]);
		}catch(Exception e) { //catch(RuntimeException e) - this ONLY catches runtimes
			
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
	
	//++++++++++++++++++++++++++++++++++++++
	/*The THrows below tells the compiler that if an exception is generated, we are NOT dealing with it inside this method, 
	*but whatever is calling this method has to deal with it.
	*/
	void checked2() throws Exception{
		FileInputStream fis = new FileInputStream("myFile.txt");
	}
	
	void checked3()throws Exception{
		System.out.println("checked 3 method");
		checked4();
		/*
		 * this doesnt deal with any exception that may be created in checked4,
		 * instead it throws the exception to whatever called this method.
		 */
	}
	
	
	void checked4()throws Exception{
		System.out.println("checked 4 method");
		FileInputStream fis = new FileInputStream("myFile.txt");
	}
	

}
