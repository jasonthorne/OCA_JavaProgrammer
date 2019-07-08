
public class RiverRafting {
	
	/*
	 * If the degree of the boat is > 10, then you throw a new FallInTheRiverException, which means you have fallen in the water.
	 * a message then tells you to get out of the water.
	 */
	
	
	//this throws a fallintheRiverException, which is a checked exception. 
	//Which means you dont have to have a try/catch inside this method, but what is calling this method needs to have a try/catch.
	void crossRapid(int degree) throws FallInRiverException{
		System.out.println("cross rapid");
		
		if(degree>15)
			throw new FallInRiverException();
		else
			System.out.println("you are still in the boat");
	}
	
	//if a person is nervous, they will drop the oar:
	void row(String state) {
		System.out.println("row raft");
		
		try {
			if(state.equalsIgnoreCase("nervous")) {
				throw new DropOarException("Dropped Oar exception generated"); //this is thrown to the catch below +++++++++++++++++++++
			}
			else
				System.out.println("all good here");
		} catch (DropOarException e) {

			//e.printStackTrace();
			System.out.println("Exception is: " + e);
		}
	}
	
	
	
	/*
	 * when calling this method, it has to be in a try/catch block or whatever is calling it has to have a throws
	 */
	void row2(String state) throws DropOarException{
		if(state.equalsIgnoreCase("nervous")) {
			throw new DropOarException("Dropped Oar exception generated"); 
		}
		else
			System.out.println("all good here");
	}

}
