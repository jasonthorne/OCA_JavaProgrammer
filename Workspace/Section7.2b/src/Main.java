
public class Main {
	
	/*
	 * In these examples, we are going to be placing code that generates runtime exceptions
	 * inside try/catches. Howeve in reallife, you should never do this.
	 * As if you are producing runtime exceptions you have done something wrong.
	 * eg an indexOutofBounds exception.
	 */

	public static void main(String[] args) {
		
		Runtime runner = new Runtime();
		
		try {
			runner.run1();
		}
		catch(Exception e) {
			System.out.println("Exception "+e+" has been caught");
		}
		
		runner.run2();
		
		
		//this will compile, but will crash as 
		runner.run3();
	}

}
