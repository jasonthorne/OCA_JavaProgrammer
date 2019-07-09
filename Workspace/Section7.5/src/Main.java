
public class Main {

	
	public static void main (String[] args) {
		
		
		try {
			ReThrow.rethrow1();
		} catch (Exception e) {
			e.printStackTrace();
		} //this needs to be in a try/catch as it throws a CHECKED exception, which HAS TO be dealt with.
		
		
		//doesnt need to be in a try/catch as its in its own outer try/catch 
		ReThrow.rethrow2();
		
		try {
			ReThrow.reThrow3();
		} catch (Exception e) {
			e.printStackTrace();
		} //this is in a try/catch as it throws a runtime exception. It doesnt NEED to be. but will crash the program if isnt.
		
		
		
		Nested.nested1();
	}
}
