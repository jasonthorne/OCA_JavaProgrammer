
/*
 * This class now inherits from the exception class, which this class is a CHECKED exception.
 * If you create an object of this class, you are creating a checked exception.
 */

public class FallInRiverException extends Exception{
	
	//constructor:
	public FallInRiverException() {
		System.out.println("get out of the water, you fool!");
	}

}
