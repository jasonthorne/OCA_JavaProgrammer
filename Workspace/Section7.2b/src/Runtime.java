import java.io.FileInputStream;

public class Runtime {

	
	//this will generate an arrayIndexOutOfBoundsException
	void run1() {
		int[]numList = {67,45,34};
		System.out.println(numList[5]);
	}
	
	//same runtime error as above, but with with try/catch
	void run2() {
		
		try {
			int[]numList = {67,45,34};
			System.out.println(numList[5]);
		}catch(Exception e){
			System.out.println("Exception caught");
			e.printStackTrace();
		}
		
	}
	
	
	//Throws is optional. If an exception is a checked exception then it HAS TO have either a throws or a try/catch.
	void run3() throws RuntimeException{
		int[]numList = {67,45,34};
		System.out.println(numList[5]); //runtime is generated here, so code never gets to fis, as it's thrown
		//FileInputStream fis = new FileInputStream("myFile.txt"); //this is a CHECKED exception, so not caught by "throws RuntimeException"
	}
	
	
}
