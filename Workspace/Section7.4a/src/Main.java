
public class Main {

	public static void main(String[] args) {
		
		/*
		int[]numbers = {45,67,89};
		System.out.println(numbers[5]);
		*/
		
		RiverRafting raft = new RiverRafting();
		
		//this method needs to be in a try/catch block due to the "throws FallInRiverException" in the crossRapid method:
	
		try {
			
			 //An exception is not generated here as an exception is only thrown if its more than 15 degrees:
			raft.crossRapid(12);
			
		} catch (FallInRiverException e) {
			//e.printStackTrace();
			System.out.println("Exception is: " + e);
		}
		
		
		
		try {
			 //An exception is generated here as an exception is only thrown if its more than 15 degrees:
			raft.crossRapid(18);
			
		} catch (FallInRiverException e) {
			//System.out.println("Exception is: " + e); //calling the toStringMethod NOT printing the "get out of the water" msg. That's in the "FallInRiverException" constructor.
		}
		
		
		//testing the row method:
		raft.row("happy");
		raft.row("nervous");
		
		
		//-------------
		
		System.out.println("using both custom exception classes:");
		
		try {
			raft.crossRapid(12); //prevents "FallInRiverException" error as this COULD cause that exception 
			raft.row2("happy"); //prevents "DropOarException" error as this COULD cause that exception 
		}
		catch(FallInRiverException e) { 
			e.printStackTrace();
			System.out.println("get back in the raft");
		}
		catch(DropOarException f) {
			f.printStackTrace();
			System.out.println("dont panic");
		}
		finally { //this will always execute regardless of whether any exceptions are produced. Finally always runs except in one particular case.
			System.out.println("hope you had a nice day rafting");
		}
		
	}

}
