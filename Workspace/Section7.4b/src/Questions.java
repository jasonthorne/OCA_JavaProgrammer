import java.io.FileInputStream;

public class Questions {
	
	static void q1() {
		
		/*
		 * This try with multiple catches will still onyl catch the FIRST exception generated. 
		 * Any exceptions generated after the first exception, the code will not be run, so none of the other catches will also not be run.
		 */
		
		//You CANT have multiple trys in the one try/catch block.
		//however you can have inner trys (inside other trys or catches or finally blocks).
		try {
			
			/*
			 * Any exception generated will look for it's closest match. 
			 */
			
			//throw new IndexOutOfBoundsException(); //this will be thrown to the IndexOutOfBoundsException catch.
			
			//this DOESNT have a catch block that deals explicitly with IllegalArgumentException, so its thrown to it's closest superclass. (RunTimeException in this case).
			throw new IllegalArgumentException(); 
			
			/*
			//inner try/catch/finally:
			try {
				
			}catch(Exception e) {
				
			}
			finally {
				
			}
			*/
		}
		
		/*
		 * When you have multiple catches,  you always have to put subclass before superclass.
		 * So ArrayIndexOutOfBounds is a subclass of IndexOutOfBoundsException so this has to go first.
		 * If they're at the same inheritence level though, then it doesng matter the order.
		 */
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("exception " + a + " is caught");
			a.printStackTrace();
		}
		catch(IndexOutOfBoundsException i) {
			System.out.println("exception " + i + " is caught");
			i.printStackTrace();
		}
		//the below exceptions are at the same inheritance level as IndexOutOfBoundsException, so their order doesnt matter.
		catch(NullPointerException n) {
			System.out.println("exception " + n + " is caught");
			n.printStackTrace();
		}
		catch(ClassCastException c) {
			System.out.println("exception " + c + " is caught");
			c.printStackTrace();
		}
		catch(RuntimeException r) {
			System.out.println("exception " + r + " is caught");
			r.printStackTrace();
		}
		catch(Throwable t) {
			System.out.println("exception " + t + " is caught");
			t.printStackTrace();
		}
		
	}
	
	
	static void q2() {
		try {
			System.out.println("inside try block");
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("exception in q2 is " + e);
			e.printStackTrace();
			return;
			
			//System.out.println("unreachable code"); //unreachable as not in the finally below
		}finally { //+++++++++++++++++++++++++++++++++++++++++++++This will reun EVEN after being booted from the try/catch/finally with a "return" ++++++++++++++
			System.out.println("finally block called");
		}
		
	}
	
	
	static int q3() {
		/*
		 * This method returns a number. If an exception is generated, this method will return an int value of 10.
		 * if NO exception is generated, this will return an int value of 20
		 */
		
		try {
			
			int[]numbers = {45,67,89};
			System.out.println(numbers[5]);
		}
		catch(Exception e) {
			/*
			 * if an exception is generated, the value returned wil be 10, and the method will exit at this point
			 */
			return 10;
		}
		
		/*
		 * if no exception is generated, the value returned will be 20, and the method will exit at this point
		 */
		
		return 20;
	}
	
	
	static int q4() {
		
		try {
			return 1;
		}catch(Exception e) {
			return 10;
		}
		//return 100;
	}
	
	static int q5() {
		try {
			System.out.println("inside try block, q5");
			FileInputStream fis = new FileInputStream("myText.txt");
			
		}catch(Exception e){
			System.out.println("exception in catch block caught");
			return 10; //++++++++++++++++++++++++++++++++++++++++++++++++++++++even though this catch triggers, the FINALLY is checked before this return triggers, returning 100 instead
		}
		finally {
			System.out.println("finally always runs");
			return 100;
		}
		
		//return 200; //unreachable code
	}
	
	static int q6() {
		int num=45;
		
		try {
			int[]numbers = {45, 67};
			System.out.println(numbers[5]);
		}
		catch(Exception e) {
			num++;
			System.out.println(e);
			System.out.println("inside catch, num is:  " + num);
			return num;
		}
		finally{
			num+=45;
			System.out.println("inside finally, num is: " + num);
			return num;
		}
		
	}
	
	static Dog q7(Dog spot) {
		
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("exception in q7 is: " + e);
			return spot;
		}
		finally {
			spot.age=100; //changes age of Dog before return
		}
	}
	
	
	static void q8() throws Exception{ //throws needed to deal with the checked exception in the try
		/*
		 * You can have a try block with JUST a finally.
		 * If an exception is generated in the try block, the finally does not deal with it.
		 * If we just have a try and a finally, any exception generated in the try block is NOT DEALT WITH. As finally cant catch an exception.
		 */
		
		try {
			FileInputStream fis = new FileInputStream("myText.txt");
		}
		/*
		 * a finally block CANT catch an exception.
		 */
		finally {
			System.out.println("finally always runs");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
