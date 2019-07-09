import java.io.FileInputStream;

public class Nested {

	static void nested1() {
		FileInputStream throwMe;
		
		try {
			System.out.println("in outer try");
			throwMe=new FileInputStream("myFile.txt"); //this generates an exception
		}
		catch(Exception e) { //this catches the exception
			
			try {
				
				System.out.println("in inner try");
				throw e; 
				
			}catch(Exception f) {
				System.out.println("exception caught in inner catch: " + f);
			}
			
		}
	}
	
}
