
/*
 * This class now INHERITS from the exception class, which this class is a CHECKED exception.
 * If you create an object of this class, you are creating a checked exception.
 * 
 * 
 */


//When someone falls in the water, this exception is generated.
public class FallInRiverException extends Exception{
	
	//constructor:
	public FallInRiverException() {
		System.out.println("get out of the water, you fool!");
	}

}


//this class extends Exception, which means this is a checked Exception. When an oar is dropped, this exception is generated.
class DropOarException extends Exception{
	
	//when this exception is generated, this message is displayed:
	public DropOarException() {
		System.out.println("pick up your oar");
	}
	
	
	//Creating a DropOarException that takes a string that wil be the mesage that is generated when this exception is created.. 
	//This in turn calls the constructor in the Exception class that takes a string . There is a constructor in the Exception class that takes a string
	public DropOarException(String message) {
		
		//calling the superclass that takes a string:
		super(message);
	}
	
	
}
